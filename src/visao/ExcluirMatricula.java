package visao;

import controle.CtrlAluno;
import controle.CtrlMatricula;
import javax.swing.JOptionPane;

public class ExcluirMatricula extends javax.swing.JFrame {

    CtrlMatricula controlMatricula = new CtrlMatricula();

    public ExcluirMatricula() {
        initComponents();

        try {
            controlMatricula.preencheComboMatricula(jComboBoxMatriculas);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBoxMatriculas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXCLUIR ALUNO");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 20, 160, 100);

        jComboBoxMatriculas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        getContentPane().add(jComboBoxMatriculas);
        jComboBoxMatriculas.setBounds(10, 20, 200, 30);

        setSize(new java.awt.Dimension(433, 196));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = (String)jComboBoxMatriculas.getSelectedItem();
        try {
            controlMatricula.excluiMatricula(nome);
            dispose();
            new ExcluirMatricula().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxMatriculas;
    // End of variables declaration//GEN-END:variables
}
