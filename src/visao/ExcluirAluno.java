package visao;

import controle.CtrlAluno;
import javax.swing.JOptionPane;

public class ExcluirAluno extends javax.swing.JFrame {

    CtrlAluno controlAluno = new CtrlAluno();

    public ExcluirAluno() {
        initComponents();

        try {
            controlAluno.preencheComboAluno(jComboBoxAlunos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBoxAlunos = new javax.swing.JComboBox();

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

        jComboBoxAlunos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        getContentPane().add(jComboBoxAlunos);
        jComboBoxAlunos.setBounds(10, 20, 200, 30);

        setSize(new java.awt.Dimension(433, 196));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = (String)jComboBoxAlunos.getSelectedItem();
        try {
            controlAluno.excluiAluno(nome);
            dispose();
            new ExcluirAluno().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxAlunos;
    // End of variables declaration//GEN-END:variables
}
