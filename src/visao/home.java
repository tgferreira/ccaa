package visao;

import controle.*;
import java.awt.Desktop;
import java.io.File;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    CtrlAluno controlAluno = new CtrlAluno();
    CtrlModulo controlModulo = new CtrlModulo();
    CtrlTurma controlTurma = new CtrlTurma();
    CtrlCaixa controlCaixa = new CtrlCaixa();

    public home() {
        initComponents();
        String dataHoje = new DataHora().dataDeHoje();
        try {
            if (controlCaixa.daEntrada()) {
                controlCaixa.entradaCaixaInicial(controlCaixa.getFundo(), "Fundo de Caixa", dataHoje, "ENTRADA");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDataHora = new javax.swing.JLabel();
        jLabelDiaSemana = new javax.swing.JLabel();
        Fundo_________________ = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemCadastrarAluno = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GestaoEduc");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelDataHora.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 18)); // NOI18N
        jLabelDataHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDataHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelDataHora);
        jLabelDataHora.setBounds(430, 340, 369, 50);

        jLabelDiaSemana.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 18)); // NOI18N
        jLabelDiaSemana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDiaSemana.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelDiaSemana);
        jLabelDiaSemana.setBounds(40, 340, 369, 50);

        Fundo_________________.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGO Principal.jpg"))); // NOI18N
        getContentPane().add(Fundo_________________);
        Fundo_________________.setBounds(-30, -10, 890, 500);

        jMenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar.setBorderPainted(false);
        jMenuBar.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N

        jMenuAlunos.setText("Alunos    ");
        jMenuAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlunosActionPerformed(evt);
            }
        });

        jMenuItemCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Confirmar.png"))); // NOI18N
        jMenuItemCadastrarAluno.setText("Cadastrar Aluno");
        jMenuItemCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarAlunoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemCadastrarAluno);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Localizar.png"))); // NOI18N
        jMenuItem1.setText("Visualizar Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jMenuItem2.setText("Excluir Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItem2);

        jMenuBar.add(jMenuAlunos);

        jMenu7.setText("Matriculas    ");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Matricular.png"))); // NOI18N
        jMenuItem5.setText("Matricular Aluno");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Localizar.png"))); // NOI18N
        jMenuItem14.setText("Visualizar Matrículas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jMenuItem13.setText("Excluir Matrículas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuBar.add(jMenu7);

        jMenu9.setText("|");
        jMenuBar.add(jMenu9);

        jMenu1.setText("Módulos    ");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Confirmar.png"))); // NOI18N
        jMenuItem6.setText("Cadastrar Módulo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Localizar.png"))); // NOI18N
        jMenuItem7.setText("Visualizar Módulos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jMenuItem10.setText("Excluir Módulos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar.add(jMenu1);

        jMenu5.setText("Turmas    ");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Confirmar.png"))); // NOI18N
        jMenuItem8.setText("Cadastrar Turma");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Localizar.png"))); // NOI18N
        jMenuItem9.setText("Visualizar Turmas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        jMenuItem11.setText("Excluir Turma");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar.add(jMenu5);

        jMenu12.setText("|");
        jMenuBar.add(jMenu12);

        jMenu2.setText("Imprimir    ");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReciboAvulso.png"))); // NOI18N
        jMenuItem3.setText("Recibo Avulso");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Aniversariantes.png"))); // NOI18N
        jMenuItem4.setText("Aniversariantes do mês");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar.add(jMenu2);

        jMenu13.setText("|");
        jMenuBar.add(jMenu13);

        jMenu3.setText("Relatórios    ");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReciboAvulso.png"))); // NOI18N
        jMenuItem12.setText("Recibos Avulsos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoCaixa.png"))); // NOI18N
        jMenuItem17.setText("Caixa Diário");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuBar.add(jMenu3);

        jMenu14.setText("|");
        jMenuBar.add(jMenu14);

        jMenu4.setText("Caixa");

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dinheiro.png"))); // NOI18N
        jMenuItem15.setText("Entrada / Saida");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoCaixa.png"))); // NOI18N
        jMenuItem16.setText("Total no Caixa");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuBar.add(jMenu4);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(849, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarAlunoActionPerformed
        new CadastrarAluno().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarAlunoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new VisualizarAluno().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            new ExcluirAluno().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String modulo = JOptionPane.showInputDialog("Entre com o nome de um novo módulo:");
        if (modulo == null) {
            JOptionPane.showMessageDialog(this, "Cancelado!");
        } else {
            try {
                controlModulo.cadastraModulo(modulo);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            controlModulo.retornaModulos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlunosActionPerformed

    }//GEN-LAST:event_jMenuAlunosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            new EmitirReciboAvulso().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            controlAluno.emitirAniversariantesDoMes();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String turma = JOptionPane.showInputDialog("Entre com o nome da nova turma:");
        if (turma == null) {
            JOptionPane.showMessageDialog(this, "Cancelado!");
        } else {
            try {
                controlTurma.cadastraTurma(turma);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            controlTurma.retornaTurmas();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            new MatricularAluno().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            new ExcluirModulo().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            new ExcluirTurma().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            new VisualizarMatriculas().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int op = JOptionPane.showConfirmDialog(this, "Finalizar a aplicação?");
        if (op == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // ERRRRRRRRRRRRRoOoOooOooO :(
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            new ExcluirMatricula().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        try {
            new VisualizarRecibosAvulsos().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            new CaixaEntradaSaida().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "R$ " + new DecimalFormat("0.00").format(controlCaixa.getFundo()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try {
            controlCaixa.emiteRelatorio();

            //Abre o documento PDF recem criado
            Desktop.getDesktop().open(new File("caixaDiario.pdf"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sem Entradas / Saidas, na data atual!");
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    //-----------------------MAIN-----------------------//
    public static void main(String args[]) {
        home h = new home();
        h.setVisible(true);
        DataHora dh = new DataHora();     //Seta a hora na tela inicial
        dh.setDataHora(h.jLabelDataHora, h.jLabelDiaSemana); //Seta a hora na tela inicial
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo_________________;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelDiaSemana;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadastrarAluno;
    // End of variables declaration//GEN-END:variables
}
