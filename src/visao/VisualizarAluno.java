
package visao;

import controle.CtrlAluno;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;

public class VisualizarAluno extends javax.swing.JFrame {

    CtrlAluno control = new CtrlAluno(); 
    
    public VisualizarAluno() {
        initComponents();
        try{
        control.preencheComboAluno(jComboBoxNomes);
        jButtonSalvar.setVisible(false);
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDataN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNaturalidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnomeMae = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFielddataNMae = new javax.swing.JTextField();
        jTextFieldOrgaoEmissor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldcelular = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldtelefone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxNomes = new javax.swing.JComboBox();
        jTextFieldUf = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldDocumento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldEmailAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VISUALIZAR ALUNO");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 30, 50, 14);

        jTextFieldnome.setEditable(false);
        getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(340, 20, 320, 30);

        jLabel2.setText("Data de Nasc.:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 70, 100, 14);

        jTextFieldDataN.setEditable(false);
        getContentPane().add(jTextFieldDataN);
        jTextFieldDataN.setBounds(340, 60, 170, 30);

        jLabel3.setText("Naturalidade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 70, 80, 14);

        jTextFieldNaturalidade.setEditable(false);
        getContentPane().add(jTextFieldNaturalidade);
        jTextFieldNaturalidade.setBounds(610, 60, 260, 30);

        jLabel4.setText("Responsável:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 150, 80, 14);

        jTextFieldResponsavel.setEditable(false);
        getContentPane().add(jTextFieldResponsavel);
        jTextFieldResponsavel.setBounds(340, 140, 320, 30);

        jLabel5.setText("Mãe:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 190, 40, 14);

        jTextFieldnomeMae.setEditable(false);
        getContentPane().add(jTextFieldnomeMae);
        jTextFieldnomeMae.setBounds(340, 180, 320, 30);

        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 230, 50, 14);

        jTextFieldCPF.setEditable(false);
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(340, 220, 130, 30);

        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(780, 30, 50, 14);

        jTextFieldRG.setEditable(false);
        getContentPane().add(jTextFieldRG);
        jTextFieldRG.setBounds(510, 220, 130, 30);

        jLabel8.setText("RG:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 230, 50, 14);

        jLabel9.setText("UF");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(670, 350, 50, 14);

        jLabel10.setText("Data de Nasc.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(680, 190, 100, 14);

        jTextFielddataNMae.setEditable(false);
        getContentPane().add(jTextFielddataNMae);
        jTextFielddataNMae.setBounds(770, 180, 100, 30);

        jTextFieldOrgaoEmissor.setEditable(false);
        getContentPane().add(jTextFieldOrgaoEmissor);
        jTextFieldOrgaoEmissor.setBounds(740, 220, 130, 30);

        jLabel11.setText("Orgão Emissor:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(650, 230, 110, 14);

        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(270, 270, 80, 14);

        jTextFieldEndereco.setEditable(false);
        getContentPane().add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(340, 260, 530, 30);

        jTextFieldComplemento.setEditable(false);
        getContentPane().add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(340, 300, 240, 30);

        jLabel13.setText("Complemento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(250, 310, 90, 14);

        jTextFieldBairro.setEditable(false);
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(630, 300, 240, 30);

        jLabel14.setText("Bairro:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 310, 100, 14);

        jTextFieldCidade.setEditable(false);
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(340, 340, 240, 30);

        jLabel15.setText("Cidade:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(280, 350, 120, 14);

        jTextFieldCEP.setEditable(false);
        getContentPane().add(jTextFieldCEP);
        jTextFieldCEP.setBounds(340, 380, 190, 30);

        jLabel16.setText("CEP:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(290, 390, 50, 14);

        jTextFieldcelular.setEditable(false);
        getContentPane().add(jTextFieldcelular);
        jTextFieldcelular.setBounds(340, 420, 240, 30);

        jLabel17.setText("Celular:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(280, 430, 120, 14);

        jTextFieldtelefone.setEditable(false);
        getContentPane().add(jTextFieldtelefone);
        jTextFieldtelefone.setBounds(630, 380, 240, 30);

        jLabel18.setText("Telefone:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(570, 390, 60, 14);

        jTextFieldemail.setEditable(false);
        getContentPane().add(jTextFieldemail);
        jTextFieldemail.setBounds(630, 420, 240, 30);

        jLabel19.setText("Email:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(590, 430, 100, 14);

        jComboBoxNomes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione o aluno" }));
        jComboBoxNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomes);
        jComboBoxNomes.setBounds(10, 10, 230, 40);

        jTextFieldUf.setEditable(false);
        getContentPane().add(jTextFieldUf);
        jTextFieldUf.setBounds(700, 340, 50, 30);

        jTextFieldSexo.setEditable(false);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(820, 20, 40, 30);

        jButtonEditar.setText("Editar Aluno");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(50, 290, 140, 50);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(70, 360, 100, 40);

        jLabel20.setText("Documento:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(260, 110, 90, 14);

        jTextFieldDocumento.setEditable(false);
        getContentPane().add(jTextFieldDocumento);
        jTextFieldDocumento.setBounds(340, 100, 170, 30);

        jLabel21.setText("Email:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(570, 110, 40, 14);

        jTextFieldEmailAluno.setEditable(false);
        getContentPane().add(jTextFieldEmailAluno);
        jTextFieldEmailAluno.setBounds(610, 100, 260, 30);

        setSize(new java.awt.Dimension(898, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomesActionPerformed
        String nome = "";
        Vector vetStringAluno = new Vector();
        if(jComboBoxNomes.getSelectedItem() == "selecione o aluno"){
            jTextFieldUf.setText("");
            jTextFieldSexo.setText("");
            jTextFieldBairro.setText("");
            jTextFieldCEP.setText("");
            jTextFieldCPF.setText("");
            jTextFieldCidade.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldDataN.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNaturalidade.setText("");
            jTextFieldOrgaoEmissor.setText("");
            jTextFieldRG.setText("");
            jTextFieldResponsavel.setText("");
            jTextFieldcelular.setText("");
            jTextFielddataNMae.setText("");
            jTextFieldemail.setText("");
            jTextFieldnome.setText("");
            jTextFieldnomeMae.setText("");
            jTextFieldtelefone.setText("");
            jTextFieldDocumento.setText("");
            jTextFieldEmailAluno.setText("");
        }else{
            nome = (String)jComboBoxNomes.getSelectedItem();
            try{
            vetStringAluno = control.buscarAluno(nome);
            jTextFieldnome.setText((String)vetStringAluno.get(0));
            jTextFieldSexo.setText((String)vetStringAluno.get(1));
            jTextFieldDataN.setText((String)vetStringAluno.get(2));
            jTextFieldNaturalidade.setText((String)vetStringAluno.get(3));
            jTextFieldResponsavel.setText((String)vetStringAluno.get(4));
            jTextFieldnomeMae.setText((String)vetStringAluno.get(5));
            jTextFielddataNMae.setText((String)vetStringAluno.get(6));
            jTextFieldCPF.setText((String)vetStringAluno.get(7));
            jTextFieldRG.setText((String)vetStringAluno.get(8));
            jTextFieldOrgaoEmissor.setText((String)vetStringAluno.get(9));
            jTextFieldEndereco.setText((String)vetStringAluno.get(10));
            jTextFieldComplemento.setText((String)vetStringAluno.get(11));
            jTextFieldBairro.setText((String)vetStringAluno.get(12));
            jTextFieldCidade.setText((String)vetStringAluno.get(13));
            jTextFieldUf.setText((String)vetStringAluno.get(14));
            jTextFieldCEP.setText((String)vetStringAluno.get(15));
            jTextFieldtelefone.setText((String)vetStringAluno.get(16));
            jTextFieldcelular.setText((String)vetStringAluno.get(17));
            jTextFieldemail.setText((String)vetStringAluno.get(18));
            jTextFieldEmailAluno.setText((String)vetStringAluno.get(19));
            jTextFieldDocumento.setText((String)vetStringAluno.get(20));
            }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
        }
    }//GEN-LAST:event_jComboBoxNomesActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
            if(jComboBoxNomes.getSelectedItem() != "selecione o aluno"){
            jTextFieldnome.setEditable(true);
            jTextFieldSexo.setEditable(true);
            jTextFieldDataN.setEditable(true);
            jTextFieldNaturalidade.setEditable(true);
            jTextFieldResponsavel.setEditable(true);
            jTextFieldnomeMae.setEditable(true);
            jTextFielddataNMae.setEditable(true);
            jTextFieldCPF.setEditable(true);
            jTextFieldRG.setEditable(true);
            jTextFieldOrgaoEmissor.setEditable(true);
            jTextFieldEndereco.setEditable(true);
            jTextFieldComplemento.setEditable(true);
            jTextFieldBairro.setEditable(true);
            jTextFieldCidade.setEditable(true);
            jTextFieldUf.setEditable(true);
            jTextFieldCEP.setEditable(true);
            jTextFieldtelefone.setEditable(true);
            jTextFieldcelular.setEditable(true);
            jTextFieldemail.setEditable(true);
            jTextFieldDocumento.setEditable(true);
            jTextFieldEmailAluno.setEditable(true);
            jButtonSalvar.setVisible(true);
            }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //jTextFields
        if (jTextFieldnome.getText().isEmpty()
                || jTextFieldCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos Obrigatórios em vermelho!");
            jLabel1.setForeground(Color.RED);
            jLabel6.setForeground(Color.RED);
        } else {
            String nomeAntigo = ""+jComboBoxNomes.getSelectedItem();
            String nomeNovo = jTextFieldnome.getText();
            String uf = jTextFieldUf.getText();
            String sexo = jTextFieldSexo.getText();
            String dataN = jTextFieldDataN.getText();
            String naturalidade = jTextFieldNaturalidade.getText();
            String responsavel = jTextFieldResponsavel.getText();
            String nomeMae = jTextFieldnomeMae.getText();
            String dataNMae = jTextFielddataNMae.getText();
            String cpf = jTextFieldCPF.getText();
            String rg = jTextFieldRG.getText();
            String orgaoEmissor = jTextFieldOrgaoEmissor.getText();
            String endereco = jTextFieldEndereco.getText();
            String complemento = jTextFieldComplemento.getText();
            String bairro = jTextFieldBairro.getText();
            String cidade = jTextFieldCidade.getText();
            String cep = jTextFieldCEP.getText();
            String telefone = jTextFieldtelefone.getText();
            String celular = jTextFieldcelular.getText();
            String email = jTextFieldemail.getText();
            String emailAluno = jTextFieldEmailAluno.getText();
            String documentoAluno = jTextFieldDocumento.getText();
            //int para caso de falha no cadastro
            int falhaOunao;
            try {
                falhaOunao = control.editaCadastroAluno(nomeAntigo,nomeNovo, sexo, dataN, naturalidade,
                        responsavel, nomeMae, dataNMae, cpf, rg, orgaoEmissor,
                        endereco, complemento, bairro, cidade, uf, cep, telefone, celular, email, emailAluno, documentoAluno);
                if (falhaOunao == 0) {
                    JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
                    dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxNomes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataN;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldEmailAluno;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNaturalidade;
    private javax.swing.JTextField jTextFieldOrgaoEmissor;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldUf;
    private javax.swing.JTextField jTextFieldcelular;
    private javax.swing.JTextField jTextFielddataNMae;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldnomeMae;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables
}
