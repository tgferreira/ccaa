package visao;

import controle.CtrlAluno;
import controle.CtrlMatricula;
import controle.CtrlModulo;
import controle.CtrlTurma;
import java.awt.Desktop;
import java.io.File;
import java.util.Vector;
import javax.swing.JOptionPane;

public class MatricularAluno extends javax.swing.JFrame {

    CtrlAluno controlAluno = new CtrlAluno();
    CtrlTurma controlTurma = new CtrlTurma();
    CtrlModulo controlModulo = new CtrlModulo();
    CtrlMatricula controlMatricula = new CtrlMatricula();

    public MatricularAluno() {
        initComponents();

        try {
            controlAluno.preencheComboAluno(jComboBoxNomes);
            controlTurma.preencheData(jTextFieldData);
            controlTurma.preencheComboTurmas(jComboBoxTurma);
            controlModulo.preencheComboModulos(jComboBoxModulo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxNomes = new javax.swing.JComboBox();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCHSemanal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldObservasoes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTurma = new javax.swing.JComboBox();
        jComboBoxModulo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBoxIdioma = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonEmiteContrato = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MATRICULAR");
        setResizable(false);
        getContentPane().setLayout(null);

        jComboBoxNomes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        jComboBoxNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomes);
        jComboBoxNomes.setBounds(20, 20, 230, 40);

        jTextFieldnome.setEditable(false);
        getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(430, 20, 340, 30);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 30, 50, 14);

        jTextFieldCPF.setEditable(false);
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(430, 70, 200, 30);

        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 80, 50, 14);

        jTextFieldData.setEditable(false);
        getContentPane().add(jTextFieldData);
        jTextFieldData.setBounds(430, 180, 130, 30);

        jLabel3.setText("CH/Módulo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 190, 80, 20);
        getContentPane().add(jTextFieldCHSemanal);
        jTextFieldCHSemanal.setBounds(650, 180, 70, 30);

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(330, 120, 480, 10);
        getContentPane().add(jTextFieldObservasoes);
        jTextFieldObservasoes.setBounds(430, 230, 340, 60);

        jLabel4.setText("Data:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 190, 60, 20);

        jComboBoxTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione a turma" }));
        jComboBoxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTurma);
        jComboBoxTurma.setBounds(650, 350, 140, 40);

        jComboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o módulo" }));
        getContentPane().add(jComboBoxModulo);
        jComboBoxModulo.setBounds(500, 350, 140, 40);

        jLabel5.setText("Observações:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 270, 90, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(320, -10, 10, 480);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Matricular.png"))); // NOI18N
        jButton1.setText("Matricular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 370, 180, 70);

        jCheckBox1.setText("Alterar a data");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(430, 150, 140, 23);

        jComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o idioma", "Inglês", "Espanhol", "Francês", "Alemão", "Mandarim" }));
        getContentPane().add(jComboBoxIdioma);
        jComboBoxIdioma.setBounds(350, 350, 140, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turma");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 320, 140, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Idioma");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 320, 140, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Módulo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 320, 140, 20);

        jButtonEmiteContrato.setText("Contrato");
        jButtonEmiteContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmiteContratoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmiteContrato);
        jButtonEmiteContrato.setBounds(70, 310, 180, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel10.setText("2.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 390, 30, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel11.setText("1.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 320, 30, 30);

        setSize(new java.awt.Dimension(816, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomesActionPerformed
        String nome = "";
        Vector vetStringAluno = new Vector();
        if (jComboBoxNomes.getSelectedItem() == "selecione o aluno") {
            jTextFieldCPF.setText("");
            jTextFieldnome.setText("");
        } else {
            nome = (String) jComboBoxNomes.getSelectedItem();
            try {
                vetStringAluno = controlAluno.buscarAluno(nome);
                jTextFieldnome.setText((String) vetStringAluno.get(0));
                jTextFieldCPF.setText((String) vetStringAluno.get(7));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_jComboBoxNomesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextFieldnome.getText().equals("") || jTextFieldCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecione o aluno!");

        } else if (jTextFieldCHSemanal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha a Carga Horária Semanal!");

        } else if (jComboBoxModulo.getSelectedItem().equals("selecione o módulo")
                || jComboBoxIdioma.getSelectedItem().equals("selecione o idioma")
                || jComboBoxTurma.getSelectedItem().equals("selecione a turma")) {
            JOptionPane.showMessageDialog(this, "Selecione o 'Módulo / Turma / Idioma' corretamente!");

        } else if (jTextFieldData.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preenha a Data!");

        } else {
            try {
                String nome = jTextFieldnome.getText();
                String cpf = jTextFieldCPF.getText();
                String data = jTextFieldData.getText();
                String chSemanal = jTextFieldCHSemanal.getText();
                String observacoes = jTextFieldObservasoes.getText();
                String modulo = (String) jComboBoxModulo.getSelectedItem();
                String turma = (String) jComboBoxTurma.getSelectedItem();
                String idioma = (String) jComboBoxIdioma.getSelectedItem();
                controlMatricula.matricularAluno(nome, cpf, data, chSemanal, observacoes,modulo, turma, idioma);
                dispose();   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaActionPerformed
        //ERRRRRRROOOOOOOOOOOO!!!! :(
    }//GEN-LAST:event_jComboBoxTurmaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTextFieldData.setEditable(true);
        } else {
            jTextFieldData.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonEmiteContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmiteContratoActionPerformed
        String nome = jTextFieldnome.getText();

        String informacoesContrato[] = new String[7];
        informacoesContrato = controlAluno.informacoesParaContratoPeloNomeAluno(nome);

        String responsavel = informacoesContrato[0];
        String end = informacoesContrato[1];
        String bairro = informacoesContrato[2];
        String cidade = informacoesContrato[3];
        String uf = informacoesContrato[4];
        String cpf = informacoesContrato[5];
        String rg = informacoesContrato[6];
        String chModulo = jTextFieldCHSemanal.getText();
        String idioma = (String) jComboBoxIdioma.getSelectedItem();

        try {
            if (jTextFieldnome.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Selecione o aluno!");
            } else if (jTextFieldCHSemanal.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Preencha corretamente CH/Modulo!");
            } else if (jComboBoxIdioma.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione o Idioma!");
            } else if (jComboBoxModulo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione o Módulo!");
            } else if (jComboBoxTurma.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione a Turma!");
            } else {

                controlMatricula.emitirContrato(nome, responsavel, end, bairro, cidade, uf, cpf, rg, chModulo, idioma);

                JOptionPane.showOptionDialog(null, "Emitido com sucesso!", "SUCESSO",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null,
                        new String[]{"Abrir / Imprimir"}, null);

                //Abre o documento PDF recem criado
                Desktop.getDesktop().open(new File("Contrato.pdf"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButtonEmiteContratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEmiteContrato;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBoxIdioma;
    private javax.swing.JComboBox jComboBoxModulo;
    private javax.swing.JComboBox jComboBoxNomes;
    private javax.swing.JComboBox jComboBoxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCHSemanal;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldObservasoes;
    private javax.swing.JTextField jTextFieldnome;
    // End of variables declaration//GEN-END:variables
}
