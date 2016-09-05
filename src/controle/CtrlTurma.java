package controle;

import entidade.EntTurma;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CtrlTurma {

    Vector vetTurmas = new Vector();

    //Metodo para cadastrar uma nova turma
    public void cadastraTurma(String nomeTurma) throws Exception {

        recuperaTurmaArquivo();

        EntTurma objTurma = new EntTurma(nomeTurma);
        EntTurma objCompara;

        boolean cadastrar = true;

        for (int i = 0; i < vetTurmas.size(); i++) {
            objCompara = (EntTurma) vetTurmas.elementAt(i);
            if (objCompara.getNomeTurma().equals(objTurma.getNomeTurma())) {
                cadastrar = false;
            }
        }

        if (cadastrar == true) {
            int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar como Turma, '" + nomeTurma + "' ?");
            if (op == 0) {
                vetTurmas.add(objTurma);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                salvaTurmaArquivo();
            }
        }
    }

    //Metodo para retornar todas as turmas
    public void retornaTurmas() throws Exception{
        recuperaTurmaArquivo();
        EntTurma objTurma;
        String turmas = "Turmas Cadastradas:";
        if(vetTurmas.size() == 0){
                turmas = "Sem turmas cadastradas.";
            }
        
        String[] nomes = new String[vetTurmas.size()];
        
        for (int i = 0; i < vetTurmas.size(); i++) {
            objTurma = (EntTurma) vetTurmas.elementAt(i);
            nomes[i] = objTurma.getNomeTurma();
        }
        Arrays.sort(nomes);
        
        for (int i = 0; i < vetTurmas.size(); i++) {
            objTurma = (EntTurma) vetTurmas.elementAt(i);
            turmas += "\n" + nomes[i];
        }
        
        JOptionPane.showMessageDialog(null, turmas);
    }
    
    //Metodo para retornar todas as turmas em ARRAY de String
    public String[] retornaTurmasString() throws Exception {
        recuperaTurmaArquivo();
        EntTurma objTurma;
        String turmas[] = new String[vetTurmas.size()];
        
        for (int i = 0; i < vetTurmas.size(); i++) {
            objTurma = (EntTurma) vetTurmas.elementAt(i);
            turmas[i]= objTurma.getNomeTurma();
        }
        Arrays.sort(turmas);
        return turmas;
    }

    //Metodo para preencher o combobox de turmas
    public JComboBox preencheComboTurmas(JComboBox jComboBoxTurmas) throws Exception {
        recuperaTurmaArquivo();
        EntTurma objTurma;
        String[] nomes = new String[vetTurmas.size()];
        for (int i = 0; i < vetTurmas.size(); i++) {
            objTurma = (EntTurma) vetTurmas.elementAt(i);
            nomes[i] = objTurma.getNomeTurma();
        }
        Arrays.sort(nomes);
        for (int i = 0; i < nomes.length; i++) {
            jComboBoxTurmas.addItem(nomes[i]);
        }
        return jComboBoxTurmas;
    }

    //Metodo para preencher a Data
    public void preencheData(JTextField jTextFieldData) {
        new DataHora().setData(jTextFieldData);
    }

    //Metodo para excluir um nivel
    public void excluiTurma(String turma) throws Exception {

        recuperaTurmaArquivo();

        EntTurma objCompara;

        for (int i = 0; i < vetTurmas.size(); i++) {
            objCompara = (EntTurma) vetTurmas.elementAt(i);
            if (objCompara.getNomeTurma().equals(turma)) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir '" + turma + "' ?");
                if (op == 0) {
                    vetTurmas.removeElementAt(i);
                    salvaTurmaArquivo();
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                }
            }
        }
    }

    //----------------------ARQUIVO--------------------------//
    //Metodo para serializar em arquivo
    public void salvaTurmaArquivo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("turmas.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vetTurmas);
        objOS.flush();
        objOS.close();
    }

    //Metodo para desserializar do arquivo
    public void recuperaTurmaArquivo() throws Exception {
        File objFile = new File("turmas.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("turmas.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vetTurmas = (Vector) objIS.readObject();
            objIS.close();
        }
    }
    //----------------------ARQUIVO--------------------------//

}
