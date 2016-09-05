
package visao;

import controle.CtrlReciboAvulso;
import javax.swing.JOptionPane;

public class VisualizarRecibosAvulsos extends javax.swing.JFrame {

    CtrlReciboAvulso controlRecibos = new CtrlReciboAvulso();
    
    public VisualizarRecibosAvulsos() {
        initComponents();
        try{
        controlRecibos.mostraRecibos(jTextAreaRecibos);
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecibos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VISUALIZAR RECIBOS");
        setResizable(false);
        getContentPane().setLayout(null);

        jTextAreaRecibos.setEditable(false);
        jTextAreaRecibos.setColumns(20);
        jTextAreaRecibos.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jTextAreaRecibos.setRows(5);
        jTextAreaRecibos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextAreaRecibos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 830, 480);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESCRIÇÃO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 10, 80, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 60, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 10, 60, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VALOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 10, 60, 30);

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(300, 120, 13, 2);

        setSize(new java.awt.Dimension(870, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRecibos;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
