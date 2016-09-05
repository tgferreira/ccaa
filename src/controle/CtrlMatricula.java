package controle;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import entidade.EntAluno;
import entidade.EntMatricula;
import entidade.EntModulo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CtrlMatricula {

    Vector vetMatriculas = new Vector();
    Vector vetAlunos = new Vector();
    CtrlModulo controlModulo = new CtrlModulo();
    CtrlTurma controlTurma = new CtrlTurma();
    CtrlAluno controlAluno = new CtrlAluno();

    //Metodo para realizar a matricula de um aluno
    public void matricularAluno(String nome, String cpf, String data, String chSemanal, String observacoes,
            String modulo, String turma, String idioma) throws Exception {
        recuperaMatriculaArquivo();

        EntMatricula matricula = new EntMatricula(nome, cpf, data, chSemanal, observacoes, modulo, turma, idioma);

        EntMatricula objCompara;
        int localOndeEsta = -1;
        String moduloAntigo = "", turmaAntiga = "", idiomaAntigo = "";
        boolean achou = false;

        for (int i = 0; i < vetMatriculas.size(); i++) {
            objCompara = (EntMatricula) vetMatriculas.elementAt(i);
            if (objCompara.getNome().equals(nome)) {
                localOndeEsta = i;
                moduloAntigo = objCompara.getModulo();
                turmaAntiga = objCompara.getTurma();
                idiomaAntigo = objCompara.getIdioma();
                achou = true;
            }
        }

        if (achou == true) {
            int op = JOptionPane.showConfirmDialog(null, "Remove a matricula de "
                    + "'" + nome + "' / '" + moduloAntigo + "' / '" + turmaAntiga + "' / '" + idiomaAntigo + "\n\n"
                    + "Para '" + modulo + "' / '" + turma + "' / " + idioma + "' ?");

            if (op == 0) {
                vetMatriculas.removeElementAt(localOndeEsta);
                vetMatriculas.add(localOndeEsta, matricula);
                JOptionPane.showMessageDialog(null, "Nova matricula realizada com sucesso!\n"
                        + "'" + modulo + "' / '" + turma + "' / " + idioma + "'");
            }
        } else {
            vetMatriculas.add(matricula);
            JOptionPane.showMessageDialog(null, "Matriculado com sucesso!\n"
                    + "'" + modulo + "' / '" + turma + "' / " + idioma + "'");
        }

        salvaMatriculaArquivo();
    }

    //Metodo para listar por modulos as matriculas feitas
    public String preenchePorModulo() throws Exception {
        String result = "";
        String modulos[] = controlModulo.retornaModulosString();

        recuperaMatriculaArquivo();

        EntMatricula objMatricula;

        for (int i = 0; i < modulos.length; i++) {
            result += modulos[i] + ":";
            for (int j = 0; j < vetMatriculas.size(); j++) {
                objMatricula = (EntMatricula) vetMatriculas.elementAt(j);
                if (objMatricula.getModulo().equals(modulos[i])) {
                    result += "\n" + objMatricula.getNome()
                            + "    -    Iniciado em: " + objMatricula.getData();
                }
            }
            result += "\n\n\n";
        }
        return result;
    }

    //Metodo para listar por turmas as matriculas feitas
    public String preenchePorTurma() throws Exception {
        String result = "";
        String turmas[] = controlTurma.retornaTurmasString();

        recuperaMatriculaArquivo();

        EntMatricula objMatricula;

        for (int i = 0; i < turmas.length; i++) {
            result += "Turma " + turmas[i] + ":";
            for (int j = 0; j < vetMatriculas.size(); j++) {
                objMatricula = (EntMatricula) vetMatriculas.elementAt(j);
                if (objMatricula.getTurma().equals(turmas[i])) {
                    result += "\n" + objMatricula.getNome()
                            + "    -    Iniciado em: " + objMatricula.getData();
                }
            }
            result += "\n\n\n";
        }
        return result;
    }

    //Metodo para buscar um Aluno, retorna um vector de strings
    public Vector buscarMatriculaAluno(String nomeBuscado) throws Exception {
        Vector vetStringMatricula = new Vector();
        recuperaMatriculaArquivo();
        EntMatricula objCompara;
        for (int i = 0; i < vetMatriculas.size(); i++) {
            objCompara = (EntMatricula) vetMatriculas.elementAt(i);
            if (objCompara.getNome().equals(nomeBuscado)) {
                vetStringMatricula.add(objCompara.getNome());
                vetStringMatricula.add(objCompara.getCpf());
                vetStringMatricula.add(objCompara.getData());
                vetStringMatricula.add(objCompara.getChSemanal());
                vetStringMatricula.add(objCompara.getObservacoes());
                vetStringMatricula.add(objCompara.getModulo());
                vetStringMatricula.add(objCompara.getTurma());
                vetStringMatricula.add(objCompara.getIdioma());
            }
        }
        return vetStringMatricula;
    }

    //Metodo para preencher o combobox de nomes
    public JComboBox preencheComboMatricula(JComboBox jComboBoxNomes) throws Exception {

        recuperaMatriculaArquivo();

        EntMatricula objMatricula;

        String[] nomes = new String[vetMatriculas.size()];

        for (int i = 0; i < vetMatriculas.size(); i++) {
            objMatricula = (EntMatricula) vetMatriculas.elementAt(i);
            nomes[i] = objMatricula.getNome();
        }

        Arrays.sort(nomes);

        for (int i = 0; i < nomes.length; i++) {
            jComboBoxNomes.addItem(nomes[i]);
        }

        return jComboBoxNomes;
    }

    //Metodo para escrever a quantidade de horas
    public String escreveHoras(int num) {
        String numEscrito = "";

        switch (num) {
            case 20:
                numEscrito = "vinte horas";
                break;
            case 21:
                numEscrito = "vinte e uma horas";
                break;
            case 22:
                numEscrito = "vinte e duas horas";
                break;
            case 23:
                numEscrito = "vinte e três horas";
                break;
            case 24:
                numEscrito = "vinte e quatro horas";
                break;
            case 25:
                numEscrito = "vinte e cinco horas";
                break;
            case 26:
                numEscrito = "vinte e seis horas";
                break;
            case 27:
                numEscrito = "vinte e sete horas";
                break;
            case 28:
                numEscrito = "vinte e oito horas";
                break;
            case 29:
                numEscrito = "vinte e nove horas";
                break;
            case 30:
                numEscrito = "trinta horas";
                break;
            case 31:
                numEscrito = "trinta e uma horas";
                break;
            case 32:
                numEscrito = "trinta e duas horas";
                break;
            case 33:
                numEscrito = "trinta e três horas";
                break;
            case 34:
                numEscrito = "trinta e quatro horas";
                break;
            case 35:
                numEscrito = "trinta e cinco horas";
                break;
            case 36:
                numEscrito = "trinta e seis horas";
                break;
            case 37:
                numEscrito = "trinta e sete horas";
                break;
            case 38:
                numEscrito = "trinta e oito horas";
                break;
            case 39:
                numEscrito = "trinta e nove horas";
                break;
            case 40:
                numEscrito = "quarenta horas";
                break;
            case 41:
                numEscrito = "quarenta e uma horas";
                break;
            case 42:
                numEscrito = "quarenta e duas horas";
                break;
            case 43:
                numEscrito = "quarenta e três horas";
                break;
            case 44:
                numEscrito = "quarenta e quatro horas";
                break;
            case 45:
                numEscrito = "quarenta e cinco horas";
                break;
            case 46:
                numEscrito = "quarenta e seis horas";
                break;
            case 47:
                numEscrito = "quarenta e sete horas";
                break;
            case 48:
                numEscrito = "quarenta e oito horas";
                break;
            case 49:
                numEscrito = "quarenta e nove horas";
                break;
            case 50:
                numEscrito = "cinquenta horas";
                break;
            case 51:
                numEscrito = "cinquenta e uma horas";
                break;
            case 52:
                numEscrito = "cinquenta e duas horas";
                break;
            case 53:
                numEscrito = "cinquenta e três horas";
                break;
            case 54:
                numEscrito = "cinquenta e quatro horas";
                break;
            case 55:
                numEscrito = "cinquenta e cinco horas";
                break;
            case 56:
                numEscrito = "cinquenta e seis horas";
                break;
            case 57:
                numEscrito = "cinquenta e sete horas";
                break;
            case 58:
                numEscrito = "cinquenta e oito horas";
                break;
            case 59:
                numEscrito = "cinquenta e nove horas";
                break;
            case 60:
                numEscrito = "sessenta horas";
                break;
            case 61:
                numEscrito = "sessenta e uma horas";
                break;
            case 62:
                numEscrito = "sessenta e duas horas";
                break;
            case 63:
                numEscrito = "sessenta e três horas";
                break;
            case 64:
                numEscrito = "sessenta e quatro horas";
                break;
            case 65:
                numEscrito = "sessenta e cinco horas";   
                break;
            case 66:
                numEscrito = "sessenta e seis horas";
                break;
            case 67:
                numEscrito = "sessenta e sete horas";
                break;
            case 68:
                numEscrito = "sessenta e oito horas";
                break;
            case 69:
                numEscrito = "sessenta e nove horas";
                break;
            case 70:
                numEscrito = "setenta horas";
                break;
            default:
                break;
        }
        return numEscrito;
    }

    //Metodo para emitir o contrato
    public void emitirContrato(
            String nome,
            String responsavel,
            String end,
            String bairro,
            String cidade,
            String uf,
            String cpf,
            String rg,
            String chModulo,
            String idioma
    ) throws FileNotFoundException, BadElementException, IOException {

        //Fontes
        Font fonte1 = FontFactory.getFont("Times-Roman", 12);
        Font fonte2 = FontFactory.getFont("Times-Roman", 10);

        //String para impressão
        String imprimir1 = "      " + nome + ", aqui representado por, " + responsavel + ", "
                + "residente na " + end + ", bairro " + bairro + ", na cidade de "
                + cidade + ", estado de " + uf + ", portador do CPF " + cpf + ", e RG " + rg + ".\n";
        String imprimir2
                = "      ACE - Instituto de Ensino Ltda, localizado na avenida João Antônio Pereira, 93, "
                + "CNPJ no. 86.554.136/0001-69 e Instituição Municipal no. 54.011.393-59, neste ato representado por"
                + " Pedro Inácio Ribeiro, diretor financeiro.\n";
        String imprimir3
                = "Por este instrumento celebram as partes acima identificadas [cliente/escola] contrato de prestação"
                + "dos seguintes serviços:\n"
                + "Serão ministrados ao cliente, pela escola, " + chModulo + "h (" + escreveHoras(Integer.parseInt(chModulo)) + ")"
                + " de aulas de " + idioma + " por módulo, com direito a um plantão de dúvidas por mês.";

        // criação do documento Document
        Document document = new Document();

        // criação da imagem
        Image image = Image.getInstance("Contrato.jpg");
        image.setAbsolutePosition(15f, 27f); //1 parametro HORIZONTAL, 2 parametro VERTICAL
        image.scalePercent(85f); //Escala de tamnho = 85% do do tamanho

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Contrato.pdf"));
            document.open();

            //O que realmente sera impresso
            document.add(image);
            document.add(new Paragraph(imprimir1, fonte1));
            document.add(new Paragraph(imprimir2, fonte2));
            document.add(new Paragraph(imprimir3, fonte1));

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }

    //Metodo para excluir uma matricula
    public void excluiMatricula(String nome) throws Exception{
        recuperaMatriculaArquivo();
        
        EntMatricula objCompara;
       
        for (int i = 0; i < vetMatriculas.size(); i++) {
            objCompara = (EntMatricula) vetMatriculas.elementAt(i);
            if (objCompara.getNome().equals(objCompara.getNome())) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja excluir a matrícula de '"+nome+"' ?");
                if(op == 0){
                vetMatriculas.removeElementAt(i);
                JOptionPane.showMessageDialog(null, "Matricula excluída com sucesso!");
                }
            }
        }
        
        salvaMatriculaArquivo();
    }
    
    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaMatriculaArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("mat.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetMatriculas);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaMatriculaArquivo() throws Exception {
        File objFile = new File("mat.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("mat.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetMatriculas = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//

}
