package uni.aed.gui;

public class FrmPrincipal extends javax.swing.JFrame {

 
    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMetodo = new javax.swing.JComboBox<>();
        cbMetodo1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mDataSimple = new javax.swing.JMenuItem();
        mDataObject = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mSimpleLinkedList = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setText("BIENVENIDOS AL TRABAJO DEL CURSO DE");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel2.setText("Algoritmos y Estructura de Datos");

        cbMetodo.setBackground(new java.awt.Color(51, 51, 51));
        cbMetodo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cbMetodo.setForeground(new java.awt.Color(255, 255, 255));
        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort Methods Simple", "Sort Methods Objects" }));
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });

        cbMetodo1.setBackground(new java.awt.Color(51, 51, 51));
        cbMetodo1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cbMetodo1.setForeground(new java.awt.Color(255, 255, 255));
        cbMetodo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listas Enlazadas", "Entero Muy Grande" }));
        cbMetodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodo1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Search & Sort Methods");

        mDataSimple.setText("Data Simple");
        mDataSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDataSimpleActionPerformed(evt);
            }
        });
        jMenu1.add(mDataSimple);

        mDataObject.setText("Data Object");
        mDataObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDataObjectActionPerformed(evt);
            }
        });
        jMenu1.add(mDataObject);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("LinkedList");

        mSimpleLinkedList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSimpleLinkedList.setText("Simple LinkedList");
        mSimpleLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSimpleLinkedListActionPerformed(evt);
            }
        });
        jMenu2.add(mSimpleLinkedList);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cbMetodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMetodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mDataObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDataObjectActionPerformed
        // TODO add your handling code here:
        FrmDirectorio v=new FrmDirectorio();
        v.setVisible(true);
    }//GEN-LAST:event_mDataObjectActionPerformed

    private void mDataSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDataSimpleActionPerformed
        // TODO add your handling code here:
        FrmDataSimple v=new FrmDataSimple();
        v.setVisible(true);
    }//GEN-LAST:event_mDataSimpleActionPerformed

    private void mSimpleLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSimpleLinkedListActionPerformed
        // TODO add your handling code here:
        FrmLinkedList v=new FrmLinkedList();
        v.setVisible(true);
    }//GEN-LAST:event_mSimpleLinkedListActionPerformed

    private void cbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodoActionPerformed
        // TODO add your handling code here:
        switch(cbMetodo.getSelectedIndex()){
            case 0->{
                FrmDataSimple v=new FrmDataSimple();
                v.setVisible(true);       
            }case 1->{
                FrmDirectorio v=new FrmDirectorio();
                v.setVisible(true);
            }
                      
        }//end switch     
    }//GEN-LAST:event_cbMetodoActionPerformed

    private void cbMetodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodo1ActionPerformed
        switch(cbMetodo1.getSelectedIndex()){
            case 0->{
                FrmLinkedList v=new FrmLinkedList();
                v.setVisible(true);       
            }case 1->{
                FrmEnteroMuyGrande v=new FrmEnteroMuyGrande();
                v.setVisible(true);
            }
                      
        }//end switch  
    }//GEN-LAST:event_cbMetodo1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JComboBox<String> cbMetodo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mDataObject;
    private javax.swing.JMenuItem mDataSimple;
    private javax.swing.JMenuItem mSimpleLinkedList;
    // End of variables declaration//GEN-END:variables
}
