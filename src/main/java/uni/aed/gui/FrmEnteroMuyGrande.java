
package uni.aed.gui;

import javax.swing.DefaultListModel;
import uni.aed.enteromuygrande.EnteroMuyGrande;
import javax.swing.JOptionPane;

public class FrmEnteroMuyGrande extends javax.swing.JFrame {

    private final DefaultListModel Resultado = new DefaultListModel();
    public EnteroMuyGrande entero1; 
    public EnteroMuyGrande entero2;
    
    public FrmEnteroMuyGrande() {
        initComponents();
        Resultados.setModel(Resultado);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ent1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JList<>();
        ent2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bSumar = new javax.swing.JButton();
        bRestar = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bIncr = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bDecr = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bImprimir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();

        ent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ent1ActionPerformed(evt);
            }
        });

        Resultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jScrollPane1.setViewportView(Resultados);
        Resultados.getAccessibleContext().setAccessibleDescription("Resultado");

        ent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ent2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese numero 1:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese numero 2:");

        bSumar.setText("Sumar");
        bSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumarActionPerformed(evt);
            }
        });

        bRestar.setText("Restar");
        bRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarActionPerformed(evt);
            }
        });

        bMult.setText("Multiplicar");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });

        bIncr.setText("Incr");
        bIncr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncrActionPerformed(evt);
            }
        });

        bDiv.setText("Dividir");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bDecr.setText("Decr");
        bDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecrActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel3.setText("Opciones:");

        bImprimir.setText("Imprimir");
        bImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4.setText("Enteros Muy Grandes");

        bReset.setText("Resetear");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ent2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ent1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bReset)))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(bSumar)
                    .addComponent(bRestar)
                    .addComponent(bMult)
                    .addComponent(bIncr)
                    .addComponent(bDiv)
                    .addComponent(bDecr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bLimpiar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bLimpiar)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bSumar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bRestar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bMult)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bDiv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bIncr)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bDecr)
                            .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bImprimir)
                                .addComponent(bReset))
                            .addGap(79, 79, 79)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ent1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ent1ActionPerformed

    private void ent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ent2ActionPerformed

    private void bSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumarActionPerformed
        // TODO add your handling code here:
        entero1 = new EnteroMuyGrande(ent1.getText());
        entero2 = new EnteroMuyGrande(ent2.getText());
        
        Resultado.addElement("Suma: " + entero1.suma(entero2).toString(","));
    }//GEN-LAST:event_bSumarActionPerformed

    private void bRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarActionPerformed
     // TODO add your handling code here:
        entero1 = new EnteroMuyGrande(ent1.getText());
        entero2 = new EnteroMuyGrande(ent2.getText());
        
        Resultado.addElement("Resta: " + entero1.resta(entero2).toString(","));
    }//GEN-LAST:event_bRestarActionPerformed

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed

        // TODO add your handling code here:
        entero1 = new EnteroMuyGrande(ent1.getText());
        entero2 = new EnteroMuyGrande(ent2.getText());
        
        Resultado.addElement("Multiplicación1: " + entero1.multOriginal(entero2).toString(","));
        Resultado.addElement("Multiplicación2: " + entero1.multEficiente(entero2).toString(","));
    }//GEN-LAST:event_bMultActionPerformed

    private void bIncrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncrActionPerformed
        // TODO add your handling code here:
        if(entero1 == null) entero1 = new EnteroMuyGrande(ent1.getText());
        if(entero2 == null) entero2 = new EnteroMuyGrande(ent2.getText());
        entero1.incr();
        entero2.incr();
        
        Resultado.addElement("Incremento: 1: " + entero1.toString() + "    2: " + entero2.toString(","));
    }//GEN-LAST:event_bIncrActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        entero1 = new EnteroMuyGrande(ent1.getText());
        entero2 = new EnteroMuyGrande(ent2.getText());
        
        Resultado.addElement("División: " + entero1.div(entero2).toString(","));
    }//GEN-LAST:event_bDivActionPerformed

    private void bDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecrActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(entero1 == null) entero1 = new EnteroMuyGrande(ent1.getText());
        if(entero2 == null) entero2 = new EnteroMuyGrande(ent2.getText());
        entero1.decr();
        entero2.decr();
        
        Resultado.addElement("Decremento: 1: " + entero1.toString(",") + "    2: " + entero2.toString(","));
    }//GEN-LAST:event_bDecrActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        // TODO add your handling code here:
        Resultado.removeAllElements();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirActionPerformed
        // TODO add your handling code here:
        try{
            entero1 = new EnteroMuyGrande(ent1.getText());
            entero2 = new EnteroMuyGrande(ent2.getText());

            Resultado.addElement("Entero 1: " + entero1.toString(","));
            Resultado.addElement("Entero 2: " + entero2.toString(","));
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e,"ERROR", JOptionPane.WARNING_MESSAGE);
       
        }
        
        
    }//GEN-LAST:event_bImprimirActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        ent1.setText("");
        ent2.setText("");
    }//GEN-LAST:event_bResetActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEnteroMuyGrande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEnteroMuyGrande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEnteroMuyGrande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnteroMuyGrande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnteroMuyGrande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Resultados;
    private javax.swing.JButton bDecr;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bImprimir;
    private javax.swing.JButton bIncr;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bRestar;
    private javax.swing.JButton bSumar;
    private javax.swing.JTextField ent1;
    private javax.swing.JTextField ent2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
