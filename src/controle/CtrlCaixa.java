package controle;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import entidade.EntCaixa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;

public class CtrlCaixa {

    Vector vetCaixa = new Vector();
    double fundoCaixa;

    //Esta entrada somente contabiliza no vetor, mas nao altera o fundo
    public void entradaCaixaInicial(double valorEntrada, String desc, String data, String isEntradaSaida) throws Exception {
        recuperaCaixaArquivo(); //recupera o vetor do caixa para fins de relatorio
        isEntradaSaida = "ENTRADA";
        EntCaixa objCaixa = new EntCaixa(valorEntrada, desc, data, isEntradaSaida); //cria o objeto para adcionar no vetor
        vetCaixa.add(objCaixa);  // adciona no vetor o obj criado
        salvaCaixaArquivo(); // salva o vetor
    }

    public void entradaCaixa(double valorEntrada, String desc, String data, String isEntradaSaida) throws Exception {
        recuperaCaixaArquivo(); //recupera o vetor do caixa para fins de relatorio
        recuperaFundoArquivo(); //recupera o fundo de caixa para somar o valor desejado
        EntCaixa objCaixa = new EntCaixa(valorEntrada, desc, data, "ENTRADA"); //cria o objeto para adcionar no vetor
        fundoCaixa += valorEntrada; //da entrada no caixa ja recuperado somando o valor
        vetCaixa.add(objCaixa);  // adciona no vetor o obj criado
        salvaCaixaArquivo(); // salva o vetor
        salvaFundoArquivo(); // salva o fundo de caixa
    }

    public void saidaCaixa(double valorSaida, String desc, String data, String isEntradaSaida) throws Exception {
        recuperaCaixaArquivo();
        recuperaFundoArquivo();
        EntCaixa objCaixa = new EntCaixa(valorSaida, desc, data, "SAIDA");
        fundoCaixa -= valorSaida;
        vetCaixa.add(objCaixa);
        salvaCaixaArquivo();
        salvaFundoArquivo();
    }

    public double getFundo() throws Exception {
        recuperaFundoArquivo();
        return fundoCaixa;
    }

    //Dar entrada no caixa na view HOME
    //Só da entrada / saida no caixa se a data for diferente da ultima data salva
    public boolean daEntrada() throws Exception {
        recuperaCaixaArquivo();
        EntCaixa objCaixa;
        String dataHoje = new DataHora().dataDeHoje();
        boolean darEntrada = true;

        for (int i = 0; i < vetCaixa.size(); i++) {
            objCaixa = (EntCaixa) vetCaixa.elementAt(i);
            if (objCaixa.getData().equals(dataHoje) && objCaixa.getDesc().equals("Fundo de Caixa")) {
                darEntrada = false;
            }
        }

        return darEntrada;
    }

    public void emiteRelatorio() throws Exception {
        recuperaCaixaArquivo();
        recuperaFundoArquivo();
        EntCaixa objCaixa;

        String dataHoje = new DataHora().dataDeHoje();
        String titulo = "                                     RELATÓRIO DE CAIXA - " + dataHoje;
        String imprimirEntrada = "    - Entrada: \n";
        String imprimirSaida = "    - Saída: \n";
        String totalCaixaSTR = "    - Total no Caixa: R$" + new DecimalFormat("0.00").format(fundoCaixa);

        for (int i = 0; i < vetCaixa.size(); i++) {
            objCaixa = (EntCaixa) vetCaixa.elementAt(i);
            if (objCaixa.getData().equals(dataHoje) && objCaixa.getIsEntradaSaida().equals("ENTRADA")) {
                imprimirEntrada += objCaixa.getDesc() + "   -   R$" + new DecimalFormat("0.00").format(objCaixa.getFundoDeCaixa()) + "\n";

            } else if (objCaixa.getData().equals(dataHoje) && objCaixa.getIsEntradaSaida().equals("SAIDA")) {
                imprimirSaida += objCaixa.getDesc() + "   -   R$" + new DecimalFormat("0.00").format(objCaixa.getFundoDeCaixa()) + "\n";
            }

        }

        //Fontes
        Font fonte1 = FontFactory.getFont("Times-Roman", 15);
        Font fonte2 = FontFactory.getFont("Times-Roman", 15);

        // criação do documento Document
        Document document = new Document();

        // criação da imagem
        Image image = Image.getInstance("linha.jpg");
        //image.setAbsolutePosition(10f,10f); //1 parametro HORIZONTAL, 2 parametro VERTICAL

        try {
            PdfWriter.getInstance(document, new FileOutputStream("caixaDiario.pdf"));
            document.open();

            Paragraph p1 = new Paragraph();
            p1.setAlignment(Element.ALIGN_RIGHT);
            p1.add(imprimirEntrada);

            Paragraph p2 = new Paragraph();
            p2.setAlignment(Element.ALIGN_RIGHT);
            p2.add(imprimirSaida);

            Paragraph p3 = new Paragraph();
            p3.setAlignment(Element.ALIGN_RIGHT);
            p3.add(totalCaixaSTR);

            //O que realmente sera impresso 
            document.add(new Paragraph(titulo, fonte1));
            document.add(image);
            document.add(new Paragraph(p1));
            document.add(image);
            document.add(new Paragraph(p2));
            document.add(image);
            document.add(p3);

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }

    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaCaixaArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("axiac.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetCaixa);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaCaixaArquivo() throws Exception {
        File objFile = new File("axiac.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("axiac.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetCaixa = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//

    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaFundoArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("fdo.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(fundoCaixa);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaFundoArquivo() throws Exception {
        File objFile = new File("fdo.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("fdo.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            fundoCaixa = (double) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//
}
