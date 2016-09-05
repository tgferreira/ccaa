package visao;

import controle.CtrlAluno;
import controle.CtrlCaixa;
import controle.CtrlReciboAvulso;
import controle.DataHora;
import controle.LimitaNroCaracteres;
import java.awt.Desktop;
import java.io.File;
import java.util.Vector;
import javax.swing.JOptionPane;

public class EmitirReciboAvulso extends javax.swing.JFrame {

    CtrlReciboAvulso controlRecibo = new CtrlReciboAvulso();
    CtrlAluno control = new CtrlAluno();
    DataHora dataHora = new DataHora();
    CtrlCaixa controlCaixa = new CtrlCaixa();

    public EmitirReciboAvulso() {
        initComponents();
        try {
            control.preencheComboAluno(jComboBoxNomes);
            dataHora.setData(jTextFieldData);
            jTextFieldDescricao.setDocument(new LimitaNroCaracteres(75));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxNomes = new javax.swing.JComboBox();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMITIR RECIBO AVULSO");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 30, 50, 14);
        getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(340, 20, 320, 30);
        getContentPane().add(jTextFieldtelefone);
        jTextFieldtelefone.setBounds(340, 70, 320, 30);

        jLabel18.setText("Telefone:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(280, 80, 60, 14);

        jComboBoxNomes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        jComboBoxNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomes);
        jComboBoxNomes.setBounds(10, 10, 230, 40);
        getContentPane().add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(340, 120, 320, 30);

        jLabel20.setText("Descrição:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(270, 130, 70, 14);
        getContentPane().add(jTextFieldValor);
        jTextFieldValor.setBounds(340, 170, 160, 30);

        jLabel21.setText("Valor:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(290, 180, 50, 14);

        jTextFieldData.setEditable(false);
        getContentPane().add(jTextFieldData);
        jTextFieldData.setBounds(340, 220, 160, 30);

        jLabel22.setText("Data:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(290, 230, 50, 14);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReciboAvulso.png"))); // NOI18N
        jButton1.setText("       Emitir Recibo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 190, 230, 70);

        setSize(new java.awt.Dimension(694, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomesActionPerformed
        String nome = "";
        Vector vetStringAluno = new Vector();
        if (jComboBoxNomes.getSelectedItem() == "selecione o aluno") {
            jTextFieldnome.setText("");
            jTextFieldtelefone.setText("");
        } else {
            nome = (String) jComboBoxNomes.getSelectedItem();
            try {
                vetStringAluno = control.buscarAluno(nome);
                jTextFieldnome.setText((String) vetStringAluno.get(0));

                jTextFieldtelefone.setText((String) vetStringAluno.get(16));
                jTextFieldtelefone.setText(jTextFieldtelefone.getText() + "    /    " + (String) vetStringAluno.get(17));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_jComboBoxNomesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomeAluno = jTextFieldnome.getText();
        String telefone = jTextFieldtelefone.getText();
        String data = jTextFieldData.getText();
        String desc = jTextFieldDescricao.getText();
        String valor = jTextFieldValor.getText();
        String descCaixa = jTextFieldnome.getText() + "  -  " + jTextFieldDescricao.getText();
        
        if(!valor.contains(",") && !valor.contains(".")){
            valor += ",00";
        }
        
        double valorDbl = Double.parseDouble(valor.replace(",", "."));
        
        try {
            if (jTextFieldnome.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Preencha o nome do aluno!");
            } else if (jTextFieldValor.getText().equals("") || jTextFieldDescricao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Preencha corretamente os campos: 'Descrição', 'Valor'.");
            }  
            else {
                
                controlRecibo.salvarRecibo(nomeAluno, data, valor, desc, telefone);
                control.emiteReciboAvulso(nomeAluno, data, valor, desc, telefone);
                controlCaixa.entradaCaixa(valorDbl, descCaixa,data,null);
                
                JOptionPane.showOptionDialog(null, "Emitido com sucesso!", "SUCESSO",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null,
                        new String[]{"Abrir / Imprimir"}, null);
                JOptionPane.showMessageDialog(this, "Entrada no caixa efetuada com sucesso!");
                dispose();

                //Abre o documento PDF recem criado
                Desktop.getDesktop().open(new File("ReciboAvulso.pdf"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxNomes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables
}
