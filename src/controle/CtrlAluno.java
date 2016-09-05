package controle;

import com.itextpdf.text.BadElementException;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import entidade.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;


import javax.swing.JComboBox;

import javax.swing.JOptionPane;


public class CtrlAluno {

    private Vector vetAlunos = new Vector();

    //Metodo para editar um cadastrado em Alunos
    public int editaCadastroAluno(String nomeAntigo, String nomeNovo, String sexo, String dataN,
            String naturalidade, String responsavel, String nomeMae, String dataNMae,
            String cpf, String rg, String orgaoEmissor, String endereco,
            String complemento, String bairro, String cidade, String uf, String cep,
            String telefone, String celular, String email, String emailAluno, String documentoAluno) throws Exception {

        recuperaAlunoArquivo();
        
        EntAluno objAluno = new EntAluno(nomeNovo.toUpperCase(), sexo, dataN, naturalidade,
                responsavel, nomeMae, dataNMae, cpf, rg, orgaoEmissor, endereco,
                complemento, bairro, cidade, uf, cep, telefone, celular, email, emailAluno, documentoAluno);

        EntAluno objCompara;
        
        for (int i = 0; i < vetAlunos.size(); i++) {
            objCompara = (EntAluno) vetAlunos.elementAt(i);
            if (nomeAntigo.equals(objCompara.getNome())) {
                vetAlunos.remove(i);
                vetAlunos.add(i, objAluno);
                salvaAlunoArquivo();
                return 0;
            }
        }
        return 1;
    }
    
    //--------------------------------------------------------------//
    
    //Metodo para cadastrar Alunos
    public int cadastraAluno(String nome, String sexo, String dataN,
            String naturalidade, String responsavel, String nomeMae, String dataNMae,
            String cpf, String rg, String orgaoEmissor, String endereco,
            String complemento, String bairro, String cidade, String uf, String cep,
            String telefone, String celular, String email, String emailAluno, String documentoAluno) throws Exception {

        recuperaAlunoArquivo();

        EntAluno objAluno = new EntAluno(nome.toUpperCase(), sexo, dataN, naturalidade,
                responsavel, nomeMae, dataNMae, cpf, rg, orgaoEmissor, endereco,
                complemento, bairro, cidade, uf, cep, telefone, celular, email, emailAluno, documentoAluno);

        EntAluno objCompara;
        boolean cadastrar = true;

        for (int i = 0; i < vetAlunos.size(); i++) {
            objCompara = (EntAluno) vetAlunos.elementAt(i);
            if (objCompara.getNome().equals(objAluno.getNome())) {
                cadastrar = false;
            }
        }

        if (cadastrar == true) {
            int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar como aluno, '" + objAluno.getNome() + "' ?");
            if (op == 0) {
                vetAlunos.add(objAluno);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                salvaAlunoArquivo();
                return 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aluno já cadastrado!");
            return 1;
        }
        return 0;
    }

    //Metodo para buscar um Aluno, retorna um vector de strings
    public Vector buscarAluno(String nomeBuscado) throws Exception {
        Vector vetStringAluno = new Vector();
        recuperaAlunoArquivo();
        EntAluno objCompara;
        for (int i = 0; i < vetAlunos.size(); i++) {
            objCompara = (EntAluno) vetAlunos.elementAt(i);
            if (objCompara.getNome().equals(nomeBuscado)) {
                vetStringAluno.add(objCompara.getNome());
                vetStringAluno.add(objCompara.getSexo());
                vetStringAluno.add(objCompara.getDataN());
                vetStringAluno.add(objCompara.getNaturalidade());
                vetStringAluno.add(objCompara.getResponsavel());
                vetStringAluno.add(objCompara.getNomeMae());
                vetStringAluno.add(objCompara.getDataNMae());
                vetStringAluno.add(objCompara.getCpf());
                vetStringAluno.add(objCompara.getRg());
                vetStringAluno.add(objCompara.getOrgaoEmissor());
                vetStringAluno.add(objCompara.getEndereco());
                vetStringAluno.add(objCompara.getComplemento());
                vetStringAluno.add(objCompara.getBairro());
                vetStringAluno.add(objCompara.getCidade());
                vetStringAluno.add(objCompara.getUf());
                vetStringAluno.add(objCompara.getCep());
                vetStringAluno.add(objCompara.getTelefone());
                vetStringAluno.add(objCompara.getCelular());
                vetStringAluno.add(objCompara.getEmail());
                vetStringAluno.add(objCompara.getEmailAluno());
                vetStringAluno.add(objCompara.getDocumentoAluno());
            }
        }
        return vetStringAluno;
    }

    //Metodo para excluir um nivel
    public void excluiAluno(String nome) throws Exception {

        recuperaAlunoArquivo();

        EntAluno objCompara;

        for (int i = 0; i < vetAlunos.size(); i++) {
            objCompara = (EntAluno) vetAlunos.elementAt(i);
            if (objCompara.getNome().equals(nome)) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir '" + nome + "' ?");
                if (op == 0) {
                    vetAlunos.removeElementAt(i);
                    salvaAlunoArquivo();
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                }
            }
        }
    }

    //Metodo para preencher o combobox de nomes
    public JComboBox preencheComboAluno(JComboBox jComboBoxNomes) throws Exception {

        recuperaAlunoArquivo();

        EntAluno objAluno;

        String[] nomes = new String[vetAlunos.size()];

        for (int i = 0; i < vetAlunos.size(); i++) {
            objAluno = (EntAluno) vetAlunos.elementAt(i);
            nomes[i] = objAluno.getNome();
        }

        Arrays.sort(nomes);

        for (int i = 0; i < nomes.length; i++) {
            jComboBoxNomes.addItem(nomes[i]);
        }

        return jComboBoxNomes;
    }

    //Metodo para emitir o recibo avulso
    public void emiteReciboAvulso(String nomeAluno,
            String data,
            String valor,
            String desc,
            String telefone) throws FileNotFoundException, BadElementException, IOException {

        //String para impressão
        String imprimir1
                = "\n\n       Cliente: " + nomeAluno
                + "\n\n       Telefone: " + telefone
                + "\n\n\n"
                + "                        Data:   " + data
                + "                                                     Valor: R$ " + valor
                + "\n\n Descrição: " + desc;
                
        

        String imprimir2
                = "\n\n\n\n\n\n\n       Cliente: " + nomeAluno
                + "\n\n       Telefone: " + telefone
                + "\n\n\n"
                + "                     Data:   " + data
                + "                                                     Valor: R$ " + valor
                + "\n\n Descrição: " + desc;

        // criação do documento Document
        Document document = new Document();

        // criação da imagem
        Image image1 = Image.getInstance("ReciboAvulso.jpg");
        image1.setAbsolutePosition(10f, 330f); //1 parametro HORIZONTAL, 2 parametro VERTICAL

        try {
            PdfWriter.getInstance(document, new FileOutputStream("ReciboAvulso.pdf"));
            document.open();

            //O que realmente sera impresso
            document.add(image1);
            document.add(new Paragraph(imprimir1));
            document.add(new Paragraph(imprimir2));

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }

    //Metodo para ver se é aniversariante no mes
    public boolean isAniversariante(String dataN) {

        Date date = new Date();
        DateFormat mes = new SimpleDateFormat("MM");
        final String formattedmes = mes.format(date);

        if (dataN.contains("/" + formattedmes + "/")) {
            return true;
        }

        return false;
    }

    //Metodo para imprimir os aniversariantes do mes
    public void emitirAniversariantesDoMes() throws Exception {

        recuperaAlunoArquivo();

        EntAluno objCompara;
        Vector vetStringAniversariantes = new Vector();
        //Vector diaAniversarios = new Vector();
        for (int i = 0; i < vetAlunos.size(); i++) {
            objCompara = (EntAluno) vetAlunos.elementAt(i);
            if (isAniversariante(objCompara.getDataN())) { 
               //diaAniversarios.add(objCompara.getDataN().substring(objCompara.getDataN().indexOf(0)+1, 5));
                vetStringAniversariantes.add(
"                     " + objCompara.getDataN().substring(objCompara.getDataN().indexOf(0)+1, 5) + 
"    -    " + objCompara.getNome() + "\n");
            }
        }
        Collections.sort(vetStringAniversariantes);
        String imprimir = "";
        if (vetStringAniversariantes.size() == 0) {
            imprimir = "\n\n\n\n\n\n\n\n\n\n\n\nSem aniversariantes neste mês!";
        } else {
            //String para impressão
            imprimir = "\n\n\n\n\n\n\n\n\n\n\n";
            
            for (int i = 0; i < vetStringAniversariantes.size(); i++) {
                imprimir += "\n         " + vetStringAniversariantes.elementAt(i);
            }
            
        }

        // criação do documento Document
        Document document = new Document();

        // criação da imagem
        Image image1 = Image.getInstance("Aniversariantes.jpg");
        image1.setAbsolutePosition(10f, 100f); //1 parametro HORIZONTAL, 2 parametro VERTICAL

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Aniversariantes.pdf"));
            document.open();

            //O que realmente sera impresso
            document.add(image1);
            document.add(new Paragraph(imprimir));

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        }
        document.close();

        //Abre o documento PDF recem criado
        Desktop.getDesktop().open(new File("Aniversariantes.pdf"));

    }

    //Metodo para retornar 0 responsavel de um determinado aluno
    public String[] informacoesParaContratoPeloNomeAluno(String nomeAluno) {
        String informacoesContrato[] = new String[7];

        EntAluno objCompara;
        try {
            recuperaAlunoArquivo();
            for (int i = 0; i < vetAlunos.size(); i++) {
                objCompara = (EntAluno) vetAlunos.elementAt(i);
                if (objCompara.getNome().equals(nomeAluno)) {
                    informacoesContrato[0] = objCompara.getResponsavel();
                    informacoesContrato[1] = objCompara.getEndereco();
                    informacoesContrato[2] = objCompara.getBairro();
                    informacoesContrato[3] = objCompara.getCidade();
                    informacoesContrato[4] = objCompara.getUf();
                    informacoesContrato[5] = objCompara.getCpf();
                    informacoesContrato[6] = objCompara.getRg();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return informacoesContrato;
    }

    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaAlunoArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("alunos.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetAlunos);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaAlunoArquivo() throws Exception {
        File objFile = new File("alunos.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("alunos.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetAlunos = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//
}
