package controle;

import entidade.EntModulo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CtrlModulo {

    Vector vetModulo = new Vector();

    //Metodo para cadastrar um novo modulo
    public void cadastraModulo(String modulo) throws Exception {

        recuperaModuloArquivo();

        EntModulo objModulo = new EntModulo(modulo);
        EntModulo objCompara;

        boolean cadastrar = true;

        for (int i = 0; i < vetModulo.size(); i++) {
            objCompara = (EntModulo) vetModulo.elementAt(i);
            if (objCompara.getModulo().equals(objModulo.getModulo())) {
                cadastrar = false;
            }
        }

        if (cadastrar == true) {
            int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar como módulo, '" + modulo + "' ?");
            if (op == 0) {
                vetModulo.add(objModulo);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                salvaModuloArquivo();
            }
        }
    }
    
    //Metodo para retornar todos os modulos em JOPTIONPANE
    public void retornaModulos() throws Exception{
        recuperaModuloArquivo();
        EntModulo objModulo;
        String modulos = "Modulos Cadastrados:";
        if(vetModulo.size() == 0){
                modulos = "Sem módulos cadastrados.";
            }
        
        String[] nomes = new String[vetModulo.size()];
        
        for (int i = 0; i < vetModulo.size(); i++) {
            objModulo = (EntModulo) vetModulo.elementAt(i);
            nomes[i] = objModulo.getModulo();
        }
        Arrays.sort(nomes);
        
        for (int i = 0; i < vetModulo.size(); i++) {
            objModulo = (EntModulo) vetModulo.elementAt(i);
            modulos += "\n" + nomes[i];
        }
        
        JOptionPane.showMessageDialog(null, modulos);
    }

    //Metodo para retornar todos os modulos em ARRAY String[]
    public String[] retornaModulosString() throws Exception{
        recuperaModuloArquivo();
        EntModulo objModulo;
        String modulos[] = new String[vetModulo.size()];
        
        for (int i = 0; i < vetModulo.size(); i++) {
            objModulo = (EntModulo) vetModulo.elementAt(i);
            modulos[i]= objModulo.getModulo();
        }
        Arrays.sort(modulos);
        
        return modulos;
    }
    
    //Metodo para preencher o combobox de modulos
    public JComboBox preencheComboModulos(JComboBox jComboBoxModulos) throws Exception {
        recuperaModuloArquivo();
        EntModulo objModulo;
        String[] nomes = new String[vetModulo.size()];
        for (int i = 0; i < vetModulo.size(); i++) {
            objModulo = (EntModulo) vetModulo.elementAt(i);
            nomes[i] = objModulo.getModulo();
        }
        Arrays.sort(nomes);
        
        for (int i = 0; i < nomes.length; i++) {
            jComboBoxModulos.addItem(nomes[i]);
        }
        return jComboBoxModulos;
    }
    
    //Metodo para excluir um modulo
    public void excluiModulo(String modulo) throws Exception {
        
        recuperaModuloArquivo();
        
        EntModulo objCompara;
        
        for (int i = 0; i < vetModulo.size(); i++) {
            objCompara = (EntModulo) vetModulo.elementAt(i);
            if (objCompara.getModulo().equals(modulo)) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir '"+modulo+"' ?");
                if (op == 0) {
                    vetModulo.removeElementAt(i);
                    salvaModuloArquivo();
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                }
            }
        }
    }
    
    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaModuloArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("modulos.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetModulo);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaModuloArquivo() throws Exception {
        File objFile = new File("modulos.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("modulos.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetModulo = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//

}
