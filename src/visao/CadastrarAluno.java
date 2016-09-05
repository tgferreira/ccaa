package visao;

import controle.*;
import java.awt.Color;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastrarAluno extends javax.swing.JFrame {

    CtrlAluno control = new CtrlAluno();

    public CadastrarAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmailAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnomeMae = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        try{     
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###.###.###-##");
            jTextFieldCPF = 
            new javax.swing.JFormattedTextField(data);  
        }catch (Exception e){  }
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldUf = new javax.swing.JTextField();
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
        jButtonIncluir = new javax.swing.JButton();
        jTextFielddataNMae = new javax.swing.JTextField();
        try{     javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");     jTextFielddataNMae = new javax.swing.JFormattedTextField(data);  }     catch (Exception e){  }
        jTextFieldSexo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldDataN = new javax.swing.JTextField();
        try{     
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");     jTextFieldDataN = new javax.swing.JFormattedTextField(data);  }     catch (Exception e){  }
        jLabel21 = new javax.swing.JLabel();
        jTextFieldNaturalidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADASTRAR NOVO ALUNO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(480, 490, 150, 60);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 50, 14);
        getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(100, 20, 320, 30);

        jLabel2.setText("Documento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 90, 14);
        getContentPane().add(jTextFieldDocumento);
        jTextFieldDocumento.setBounds(100, 100, 170, 30);

        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 110, 40, 14);
        getContentPane().add(jTextFieldEmailAluno);
        jTextFieldEmailAluno.setBounds(370, 100, 260, 30);

        jLabel4.setText("Responsável:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 80, 14);
        getContentPane().add(jTextFieldResponsavel);
        jTextFieldResponsavel.setBounds(100, 140, 320, 30);

        jLabel5.setText("Mãe:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 190, 40, 14);
        getContentPane().add(jTextFieldnomeMae);
        jTextFieldnomeMae.setBounds(100, 180, 320, 30);

        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 230, 50, 14);
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(100, 220, 130, 30);

        jLabel7.setText("Sexo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 30, 50, 14);

        jTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRG);
        jTextFieldRG.setBounds(270, 220, 130, 30);

        jLabel8.setText("RG:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 230, 50, 14);

        jLabel9.setText("UF");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(440, 350, 50, 14);

        jLabel10.setText("Data de Nasc.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 190, 100, 14);
        getContentPane().add(jTextFieldUf);
        jTextFieldUf.setBounds(470, 340, 50, 30);
        getContentPane().add(jTextFieldOrgaoEmissor);
        jTextFieldOrgaoEmissor.setBounds(500, 220, 130, 30);

        jLabel11.setText("Orgão Emissor:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 230, 110, 14);

        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 270, 80, 14);
        getContentPane().add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(100, 260, 530, 30);
        getContentPane().add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(100, 300, 240, 30);

        jLabel13.setText("Complemento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 310, 90, 14);
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(390, 300, 240, 30);

        jLabel14.setText("Bairro:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 310, 100, 14);
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(100, 340, 240, 30);

        jLabel15.setText("Cidade:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 350, 120, 14);
        getContentPane().add(jTextFieldCEP);
        jTextFieldCEP.setBounds(100, 380, 190, 30);

        jLabel16.setText("CEP:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 390, 50, 14);
        getContentPane().add(jTextFieldcelular);
        jTextFieldcelular.setBounds(100, 420, 240, 30);

        jLabel17.setText("Celular:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 430, 120, 14);
        getContentPane().add(jTextFieldtelefone);
        jTextFieldtelefone.setBounds(390, 380, 240, 30);

        jLabel18.setText("Telefone:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(330, 390, 60, 14);
        getContentPane().add(jTextFieldemail);
        jTextFieldemail.setBounds(390, 420, 240, 30);

        jLabel19.setText("Email:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(350, 430, 100, 14);

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Confirmar.png"))); // NOI18N
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIncluir);
        jButtonIncluir.setBounds(20, 490, 150, 60);
        getContentPane().add(jTextFielddataNMae);
        jTextFielddataNMae.setBounds(530, 180, 100, 30);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(590, 20, 40, 30);

        jLabel20.setText("Data de Nasc.:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 70, 100, 14);
        getContentPane().add(jTextFieldDataN);
        jTextFieldDataN.setBounds(100, 60, 170, 30);

        jLabel21.setText("Naturalidade:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(290, 70, 80, 14);
        getContentPane().add(jTextFieldNaturalidade);
        jTextFieldNaturalidade.setBounds(370, 60, 260, 30);

        setSize(new java.awt.Dimension(671, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?");
        if (op == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        //jTextFields
        if (jTextFieldnome.getText().isEmpty()
                || jTextFieldCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos Obrigatórios em vermelho!");
            jLabel1.setForeground(Color.RED);
            jLabel6.setForeground(Color.RED);
        } else {
            String nome = jTextFieldnome.getText();
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
                falhaOunao = control.cadastraAluno(nome, sexo, dataN, naturalidade,
                        responsavel, nomeMae, dataNMae, cpf, rg, orgaoEmissor,
                        endereco, complemento, bairro, cidade, uf, cep, telefone, celular, email, emailAluno, documentoAluno);
                if (falhaOunao == 0) {
                    dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro no cadastro.");
            }
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?");
        if (op == 0) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIncluir;
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
