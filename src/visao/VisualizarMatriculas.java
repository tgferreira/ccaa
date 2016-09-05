package visao;

import controle.CtrlAluno;
import controle.CtrlMatricula;
import java.util.Vector;
import javax.swing.JOptionPane;

public class VisualizarMatriculas extends javax.swing.JFrame {

    CtrlMatricula controlMatricula = new CtrlMatricula();
    CtrlAluno controlAluno = new CtrlAluno();

    public VisualizarMatriculas() {
        initComponents();
        try {
            controlMatricula.preencheComboMatricula(jComboBoxNome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        jTextAreaVisualizando.setText("\n\n\n\n\n\n\n\n\n\n"
                + "                                                                          Selecione uma opção...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxPorModulo = new javax.swing.JCheckBox();
        jCheckBoxPorTurma = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVisualizando = new javax.swing.JTextArea();
        jComboBoxNome = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VISUALIZAR MATRICULAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jCheckBoxPorModulo.setText("Visualizar por Módulos");
        jCheckBoxPorModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPorModuloActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPorModulo);
        jCheckBoxPorModulo.setBounds(400, 30, 170, 23);

        jCheckBoxPorTurma.setText("Visualizar por Turmas");
        jCheckBoxPorTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPorTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPorTurma);
        jCheckBoxPorTurma.setBounds(230, 30, 150, 23);

        jTextAreaVisualizando.setEditable(false);
        jTextAreaVisualizando.setColumns(20);
        jTextAreaVisualizando.setRows(5);
        jScrollPane1.setViewportView(jTextAreaVisualizando);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 590, 480);

        jComboBoxNome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        jComboBoxNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxNomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxNomeMouseEntered(evt);
            }
        });
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNome);
        jComboBoxNome.setBounds(10, 20, 170, 40);

        setSize(new java.awt.Dimension(619, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxPorTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPorTurmaActionPerformed
        try {
            if (jCheckBoxPorTurma.isSelected()) {
                jCheckBoxPorModulo.setSelected(false);
                jComboBoxNome.setSelectedIndex(0);
                jTextAreaVisualizando.setText(controlMatricula.preenchePorTurma());
            } else {
                jTextAreaVisualizando.setText("\n\n\n\n\n\n\n\n\n\n"
                        + "                                                                          Selecione uma opção...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jCheckBoxPorTurmaActionPerformed

    private void jCheckBoxPorModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPorModuloActionPerformed
        try {
            if (jCheckBoxPorModulo.isSelected()) {
                jCheckBoxPorTurma.setSelected(false);
                jComboBoxNome.setSelectedIndex(0);
                jTextAreaVisualizando.setText(controlMatricula.preenchePorModulo());
            } else {
                jTextAreaVisualizando.setText("\n\n\n\n\n\n\n\n\n\n"
                        + "                                                                          Selecione uma opção...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jCheckBoxPorModuloActionPerformed

    private void jComboBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeActionPerformed
        String nome = "";
        Vector vetStringMatricula = new Vector();
        if (jComboBoxNome.getSelectedItem() == "selecione o aluno") {
            jTextAreaVisualizando.setText("\n\n\n\n\n\n\n\n\n\n"
                    + "                                                                          Selecione uma opção...");
        } else {

            nome = (String) jComboBoxNome.getSelectedItem();
            try {
                jCheckBoxPorModulo.setSelected(false);
                jCheckBoxPorTurma.setSelected(false);
                vetStringMatricula = controlMatricula.buscarMatriculaAluno(nome);
                jTextAreaVisualizando.setText("\n    Nome: " + (String) vetStringMatricula.get(0) + "\n"
                        + "    CPF: ......." + (String) vetStringMatricula.get(1) + "\n"
                        + "\n    Matriculado em: ......." + (String) vetStringMatricula.get(2) + "\n"
                        + "\n    CH/Semanal: ......." + (String) vetStringMatricula.get(3) + "\n"
                        + "\n    Observasões: ......." + (String) vetStringMatricula.get(4) + "\n"
                        + "\n    Idioma: ......." + (String) vetStringMatricula.get(7) + "\n"
                        + "\n    Nível: ......." + (String) vetStringMatricula.get(5) + "\n"
                        + "\n    Turma: ......." + (String) vetStringMatricula.get(6) + "\n");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_jComboBoxNomeActionPerformed

    private void jComboBoxNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNomeMouseClicked
    }//GEN-LAST:event_jComboBoxNomeMouseClicked

    private void jComboBoxNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNomeMouseEntered
        jCheckBoxPorTurma.setSelected(false);
        jCheckBoxPorModulo.setSelected(false);
    }//GEN-LAST:event_jComboBoxNomeMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxPorModulo;
    private javax.swing.JCheckBox jCheckBoxPorTurma;
    private javax.swing.JComboBox jComboBoxNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaVisualizando;
    // End of variables declaration//GEN-END:variables
}
