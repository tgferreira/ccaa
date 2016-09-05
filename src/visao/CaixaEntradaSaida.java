package visao;

import controle.CtrlCaixa;
import controle.DataHora;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CaixaEntradaSaida extends javax.swing.JFrame {

    CtrlCaixa controlCaixa = new CtrlCaixa();
    DataHora data = new DataHora();

    public CaixaEntradaSaida() {
        initComponents();
        data.setData(dataEntrada);
        data.setData(dataSaida);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSaida = new javax.swing.JButton();
        jTextFieldDesc2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSaida = new javax.swing.JTextField();
        dataSaida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonEntrada = new javax.swing.JButton();
        jTextFieldDesc = new javax.swing.JTextField();
        jTextFieldEntrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dataEntrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAIXA");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SAIDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Caslon Pro", 0, 24), java.awt.Color.black)); // NOI18N
        jPanel1.setLayout(null);

        jButtonSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jButtonSaida.setText("   Realizar SAIDA");
        jButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaidaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSaida);
        jButtonSaida.setBounds(70, 180, 200, 40);
        jPanel1.add(jTextFieldDesc2);
        jTextFieldDesc2.setBounds(120, 70, 170, 30);

        jLabel4.setText("Data:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 120, 60, 30);

        jLabel3.setText("Valor: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 30, 60, 30);
        jPanel1.add(jTextFieldSaida);
        jTextFieldSaida.setBounds(120, 30, 170, 30);

        dataSaida.setEditable(false);
        dataSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(dataSaida);
        dataSaida.setBounds(120, 120, 170, 30);

        jLabel5.setText("Descrição:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 70, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 20, 350, 240);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTRADA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Caslon Pro", 0, 24), java.awt.Color.black)); // NOI18N
        jPanel3.setLayout(null);

        jButtonEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Confirmar.png"))); // NOI18N
        jButtonEntrada.setText("   Realizar ENTRADA");
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEntrada);
        jButtonEntrada.setBounds(70, 180, 200, 40);
        jPanel3.add(jTextFieldDesc);
        jTextFieldDesc.setBounds(110, 70, 170, 30);
        jPanel3.add(jTextFieldEntrada);
        jTextFieldEntrada.setBounds(110, 30, 170, 30);

        jLabel2.setText("Valor: ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(50, 30, 60, 30);

        jLabel1.setText("Descrição:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 70, 80, 30);

        dataEntrada.setEditable(false);
        dataEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(dataEntrada);
        dataEntrada.setBounds(110, 120, 170, 30);

        jLabel6.setText("Data:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(50, 120, 60, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 20, 330, 240);

        setSize(new java.awt.Dimension(726, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaidaActionPerformed

        double saida = Double.parseDouble(jTextFieldSaida.getText().replace(",", "."));
        String desc = jTextFieldDesc2.getText();
        String data = dataSaida.getText();

        try {
            int op = JOptionPane.showConfirmDialog(this, "Confirma a saída no caixa?");
            if (op == 0) {
                controlCaixa.saidaCaixa(saida, desc, data, null);
                JOptionPane.showMessageDialog(this, "Saida Realizada!\n");
                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButtonSaidaActionPerformed

    private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed

        double entrada = Double.parseDouble(jTextFieldEntrada.getText().replace(",", "."));
        String desc = jTextFieldDesc.getText();
        String data = dataEntrada.getText();

        try {
            int op = JOptionPane.showConfirmDialog(this, "Confirma a entrada no caixa?");
            if (op == 0) {
                controlCaixa.entradaCaixa(entrada, desc, data, null);
                JOptionPane.showMessageDialog(this, "Entrada Realizada!");
                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButtonEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataEntrada;
    private javax.swing.JTextField dataSaida;
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldDesc2;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldSaida;
    // End of variables declaration//GEN-END:variables
}
