/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento_Bahia;

import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;

public class FormAtendimento extends javax.swing.JFrame {
    
    private Fila fila = new Fila();
    private int codigosGerados = 0;
    private int codigosAtendidos = 0;
    int buntonausente=0;
    int naoAtend=0;
    public FormAtendimento() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoGerarCodigo = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        botaoAtender = new javax.swing.JButton();
        labelAtendido = new javax.swing.JLabel();
        labelCodigosGerados = new javax.swing.JLabel();
        labelCodigosAtendidos = new javax.swing.JLabel();
        listaScroll = new javax.swing.JScrollPane();
        listaFrame = new javax.swing.JTextArea();
        labelNaoatendidos = new javax.swing.JLabel();
        labelnaoAtendido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelausente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelausente1 = new javax.swing.JLabel();
        labelNaoatendidos1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoGerarCodigo.setText("GERAR CÓDIGO");
        botaoGerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarCodigoActionPerformed(evt);
            }
        });

        labelCodigo.setText("---");

        botaoAtender.setText("ATENDER");
        botaoAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtenderActionPerformed(evt);
            }
        });

        labelAtendido.setText("---");

        labelCodigosGerados.setText("Codigos gerados");

        labelCodigosAtendidos.setText("Codigos atendidos");

        listaFrame.setColumns(20);
        listaFrame.setRows(5);
        listaFrame.setEditable(false);
        DefaultCaret caret = (DefaultCaret)listaFrame.getCaret();
        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        listaScroll.setViewportView(listaFrame);

        labelNaoatendidos.setText("Codigos não atendidos");

        labelnaoAtendido.setText("---");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Atendimento");

        labelausente.setText("---");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Ausente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelausente1.setText("---");

        labelNaoatendidos1.setText("Codigos Ausentes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoGerarCodigo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(labelausente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAtendido, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNaoatendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelnaoAtendido, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCodigosAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCodigosGerados, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelausente1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNaoatendidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCodigosGerados)
                        .addGap(18, 18, 18)
                        .addComponent(labelCodigosAtendidos)
                        .addGap(18, 18, 18)
                        .addComponent(labelNaoatendidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelnaoAtendido)
                        .addGap(13, 13, 13)
                        .addComponent(labelNaoatendidos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelausente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoGerarCodigo)
                            .addComponent(jButton1))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtendido)
                    .addComponent(labelCodigo)
                    .addComponent(labelausente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarCodigoActionPerformed
       
        String codigo = fila.adicionar();
        labelCodigo.setText(codigo);
        labelCodigosGerados.setText("Codigos gerados: " + (++codigosGerados));
        atualizarLista();
       
        naoAtend = ++naoAtend;
        labelnaoAtendido.setText("Não chamadas: " +naoAtend);
    }//GEN-LAST:event_botaoGerarCodigoActionPerformed

    private void botaoAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtenderActionPerformed
        	
      
        
         String codigo = fila.atender();

        if (codigo == null){
            labelAtendido.setText("Ninguém para atender!");
            return;
        }
        labelAtendido.setText(codigo + " foi atendido!");
        labelCodigosAtendidos.setText("Codigos atendidos: " + (++codigosAtendidos));
        atualizarLista();
        
        naoAtend = --naoAtend;
        labelnaoAtendido.setText("Não chamadas: " + naoAtend);
    }//GEN-LAST:event_botaoAtenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String codigo = fila.atender();
        atualizarLista();
        buntonausente=++buntonausente;
        labelausente1.setText(Integer.toString(buntonausente));
        labelausente.setText("Senha Ausente: "+codigo);
        naoAtend = --naoAtend;
        labelnaoAtendido.setText("Não chamadas: " + naoAtend);
        
        if (naoAtend <= 0){
            labelausente.setText("Não há mais senhas!");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atualizarLista() {
        StringBuilder sb = new StringBuilder();
        for (String codigo : fila){
            sb.append(codigo);
            sb.append(System.lineSeparator());
        }
        listaFrame.setText(sb.toString());
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtender;
    private javax.swing.JButton botaoGerarCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAtendido;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigosAtendidos;
    private javax.swing.JLabel labelCodigosGerados;
    private javax.swing.JLabel labelNaoatendidos;
    private javax.swing.JLabel labelNaoatendidos1;
    private javax.swing.JLabel labelausente;
    private javax.swing.JLabel labelausente1;
    private javax.swing.JLabel labelnaoAtendido;
    private javax.swing.JTextArea listaFrame;
    private javax.swing.JScrollPane listaScroll;
    // End of variables declaration//GEN-END:variables
}
