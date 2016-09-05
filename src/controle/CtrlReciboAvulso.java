package controle;

import entidade.EntReciboAvulso;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JTextArea;

public class CtrlReciboAvulso {

    Vector vetRecibos = new Vector();

    
    
    

    //Metodo para salvar um recibo
    public void salvarRecibo(String nomeAluno, String data, String valor, String desc, String telefone) throws Exception {
        recuperaReciboArquivo();
        EntReciboAvulso recibo = new EntReciboAvulso(nomeAluno, data, valor, desc, telefone);
        vetRecibos.add(recibo);
        salvaReciboArquivo();
    }

    //Metodo para mostrar todos os recibos emitidos
    public void mostraRecibos(JTextArea Recibos) throws Exception {
        recuperaReciboArquivo();
        EntReciboAvulso objReciboAvulso;
        for (int i = 0; i < vetRecibos.size(); i++) {
            objReciboAvulso = (EntReciboAvulso) vetRecibos.elementAt(i);
            Recibos.setText(Recibos.getText() + "      " + objReciboAvulso.getData() + "   -   " + objReciboAvulso.getNomeAluno()
                    + "   -   R$" + objReciboAvulso.getValor() + "   -   " + objReciboAvulso.getDesc() + "\n");
        }

    }

    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaReciboArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("reci.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetRecibos);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaReciboArquivo() throws Exception {
        File objFile = new File("reci.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("reci.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetRecibos = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//
}
