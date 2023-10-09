package uni.aed.gui;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import uni.aed.ordenamiento.Complejidad;
import uni.aed.ordenamiento.Ordenamiento;
import uni.aed.search.Search;

public class FrmDataSimple extends javax.swing.JFrame {
    
    private final DefaultListModel modeloList1 = new DefaultListModel();
    private final DefaultListModel modeloList2 = new DefaultListModel();
    private final String CADENA_VACIA="";
    private final long FACTOR_CONVERSION_NS_TO_MS=100000;
    
    public FrmDataSimple() {
        initComponents();
        ListaInicial.setModel(modeloList1);
        ListaOrdenada.setModel(modeloList2);
        jpIntervalo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSearchAlgoritmo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        BtnCerrar = new javax.swing.JButton();
        cbMetodo = new javax.swing.JComboBox<>();
        lblMetodo = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        cbCarga = new javax.swing.JComboBox<>();
        jpIntervalo = new javax.swing.JPanel();
        jsIni = new javax.swing.JSpinner();
        jsFin = new javax.swing.JSpinner();
        btnGenerar = new javax.swing.JButton();
        lblIni = new javax.swing.JLabel();
        lblFin = new javax.swing.JLabel();
        rbUnico = new javax.swing.JRadioButton();
        rbDuplicado = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbSearchLineal = new javax.swing.JRadioButton();
        rbSearchBinaria = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaInicial = new javax.swing.JList<>();
        BtnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaOrdenada = new javax.swing.JList<>();
        BtnLimpiar = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblIntercambios = new javax.swing.JLabel();
        lblCompraciones = new javax.swing.JLabel();
        lblTEjecucion = new javax.swing.JLabel();
        lblComplejidad = new javax.swing.JLabel();
        txtComplejidad = new javax.swing.JTextField();
        txtTiempoEjecucion = new javax.swing.JTextField();
        txtComparaciones = new javax.swing.JTextField();
        txtIntercambios = new javax.swing.JTextField();
        lblFIntercambios = new javax.swing.JLabel();
        lblFComparaciones = new javax.swing.JLabel();
        lblMsTEjecucion = new javax.swing.JLabel();

        setTitle("Algoritmos Sort && Search");

        lblValor.setText("Ingrese los Valores a Ordenar:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Insercion", "Insercion Binaria", "Seleccion4c", "Shell", "QuickSort", "MergeSort", "HeapSort" }));
        cbMetodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMetodoItemStateChanged(evt);
            }
        });
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });

        lblMetodo.setText("Metodo Ordenamiento:");

        lblCarga.setText("Tipo de Carga:");

        cbCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Aleatoria" }));
        cbCarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCargaItemStateChanged(evt);
            }
        });
        cbCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargaActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblIni.setText("Int.Ini:");

        lblFin.setText("Int.Fin:");

        javax.swing.GroupLayout jpIntervaloLayout = new javax.swing.GroupLayout(jpIntervalo);
        jpIntervalo.setLayout(jpIntervaloLayout);
        jpIntervaloLayout.setHorizontalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntervaloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsIni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsFin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );
        jpIntervaloLayout.setVerticalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntervaloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(lblIni)
                    .addComponent(lblFin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup2.add(rbUnico);
        rbUnico.setSelected(true);
        rbUnico.setText("Valores Unicos");

        buttonGroup2.add(rbDuplicado);
        rbDuplicado.setText("Valores Duplicados");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon20.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar-icon18.png"))); // NOI18N

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar-icon20.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Algoritmo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 8))); // NOI18N

        rbgSearchAlgoritmo.add(rbSearchLineal);
        rbSearchLineal.setSelected(true);
        rbSearchLineal.setText("Lineal");

        rbgSearchAlgoritmo.add(rbSearchBinaria);
        rbSearchBinaria.setText("Binaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbSearchBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(rbSearchLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSearchLineal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSearchBinaria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ListaInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jScrollPane1.setViewportView(ListaInicial);

        BtnOrdenar.setText("Ordenar");
        BtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrdenarActionPerformed(evt);
            }
        });

        ListaOrdenada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Ordenada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 8))); // NOI18N
        jScrollPane2.setViewportView(ListaOrdenada);

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        lblMsg.setText(".");

        lblIntercambios.setText("#Intercambios:");

        lblCompraciones.setText("#Comparaciones:");

        lblTEjecucion.setText("Tiempo Ejecucion (ns):");

        lblComplejidad.setText("Complejidad Asintotica:");

        txtComplejidad.setEditable(false);

        txtTiempoEjecucion.setEditable(false);

        txtComparaciones.setEditable(false);

        txtIntercambios.setEditable(false);

        lblFIntercambios.setText(".");

        lblFComparaciones.setText(".");

        lblMsTEjecucion.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTEjecucion)
                            .addComponent(lblCompraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplejidad))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIntercambios)
                    .addComponent(txtComparaciones)
                    .addComponent(txtTiempoEjecucion)
                    .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsTEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblFComparaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFIntercambios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIntercambios)
                    .addComponent(txtIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFIntercambios))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFComparaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTEjecucion)
                    .addComponent(lblMsTEjecucion))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplejidad)
                    .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnOrdenar)
                            .addComponent(BtnLimpiar))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(232, 232, 232))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BtnOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbCarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(rbUnico)
                .addGap(29, 29, 29)
                .addComponent(rbDuplicado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCerrar)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarga)
                    .addComponent(cbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodo))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUnico)
                    .addComponent(rbDuplicado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar))
                            .addComponent(btnInsertar)
                            .addComponent(btnEliminar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCerrar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
        modeloList1.addElement(txtValor.getText());
        txtValor.setText("");
    }//GEN-LAST:event_txtValorActionPerformed

    private void BtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrdenarActionPerformed
        Integer N=modeloList1.size();//aquie esta los elementos a ordenar
        if(N<=1) return;
        Integer[] X =Arrays.stream(modeloList1.toArray())
                .map(obj->Integer.valueOf(obj.toString())).toArray(Integer[]::new);        
        Ordenamiento o=new Ordenamiento();
        Integer[] Y=null;
        switch(cbMetodo.getSelectedIndex()){
            case 0->{//burbuja
                //Realizar el ordenamiento
                o.burbuja(X); 
                lblFIntercambios.setText(Complejidad.BURBUJA_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.BURBUJA_NCOMPARACIONES);
                txtComplejidad.setText(Complejidad.BURBUJA_COMPLEJIDAD_WORSTCASE);
            }
            case 1->{//insercion
                o.insercion(X);                
                lblFIntercambios.setText(Complejidad.INSERCION_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.INSERCION_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCION_COMPLEJIDAD_WORSTCASE);
            }
            case 2->{//insercionBinaria
                o.insercionBinaria(X);                
                lblFIntercambios.setText(Complejidad.INSERCIONBINARIA_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.INSERCIONBINARIA_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCIONBINARIA_COMPLEJIDAD_WORSTCASE);
            }
            case 3->{//seleccion4c
                o.seleccion4c(X);                
                lblFIntercambios.setText(Complejidad.SELECCION_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.SELECCION_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.SELECCION_COMPLEJIDAD_WORSTCASE);
            }
            case 4->{//shell
                o.ShellSort(X);
                lblFIntercambios.setText(Complejidad.SHELL_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.SHELL_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.SHELL_COMPLEJIDAD_WORSTCASE);                
            }        
            case 5->{//QuickSort
                o.CallQuickSort(X);
                lblFIntercambios.setText(Complejidad.QUICKSORT_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.QUICKSORT_NCOMPARACIONES);
                txtComplejidad.setText(Complejidad.QUICKSORT_COMPLEJIDAD_WORSTCASE);                
            }
            case 6->{//MergeSort
                o.CallMergeSort(X);
                lblFIntercambios.setText(Complejidad.MERGESORT_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.MERGESORT_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.MERGESORT_COMPLEJIDAD_WORSTCASE);                                
            }
            case 7->{//HeapSort
                Y=new Integer[N];
                Y=o.HeapSort(X);                
                lblFComparaciones.setText(Complejidad.HEAPSORT_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.HEAPSORT_COMPLEJIDAD_WORSTCASE);                
            }            
        }//end switch                  
        txtComparaciones.setText(Integer.toString(o.getnComparaciones()));
        txtIntercambios.setText(Integer.toString(o.getnIntercambios()));
        txtTiempoEjecucion.setText(Long.toString(o.gettEjecucion()));
        if(o.gettEjecucion()>0)
            lblMsTEjecucion.setText(Double.toString(o.gettEjecucion()/FACTOR_CONVERSION_NS_TO_MS)+ " (ms)");
        modeloList2.removeAllElements();
        if (cbMetodo.getSelectedIndex()==7)
            for(Integer i: Y)        
                modeloList2.addElement(i); 
        else
            for(Integer i: X)        
                modeloList2.addElement(i); 
        
    }//GEN-LAST:event_BtnOrdenarActionPerformed
    private static int random(int low,int high){
        return (int) Math.floor(Math.random()*(high-low+1)) + low;
    }
    private void ClearResult(){        
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMsTEjecucion.setText(CADENA_VACIA);
    }
     
    private void ClearAll(){
        modeloList1.removeAllElements();    
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        txtValor.setText(CADENA_VACIA);
        jsIni.setValue(0);
        jsFin.setValue(0);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMsTEjecucion.setText(CADENA_VACIA);
    }
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
       ClearAll();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:        
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero)
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void cbMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMetodoItemStateChanged
        // TODO add your handling code here:
        ClearResult();
    }//GEN-LAST:event_cbMetodoItemStateChanged

    private void cbCargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCargaItemStateChanged
        // TODO add your handling code here:
        switch(cbCarga.getSelectedIndex()){
            case 0->{//manual
                lblValor.setText("Ingrese los Valores a Ordenar:");
                jpIntervalo.setVisible(false);
            }
            case 1->{//aleatoria
                lblValor.setText("Ingrese la cantidad de numeros a Generar:");
                jpIntervalo.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbCargaItemStateChanged

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        
        switch(cbCarga.getSelectedIndex()){
            case 1->{//aleatoria
                if(txtValor.getText().length() == 0) return;
                
                int N = Integer.parseInt(txtValor.getText());
                if(N <= 1) return;
                
                Object valueIni = jsIni.getValue();
                Object valueFin = jsFin.getValue();
                if (("0".equals(valueIni.toString())) || ("0".equals(valueFin.toString()))) return;
                if (Integer.parseInt(valueFin.toString()) <= (Integer.parseInt(valueIni.toString())+N)) return;
                
                int valor;
                
                for(int i=0;i<N;i++){
                    valor = random(Integer.parseInt(valueIni.toString()),
                            Integer.parseInt(valueFin.toString()));
                    if(rbUnico.isSelected())
                        if(!modeloList1.contains(valor))
                            modeloList1.addElement(valor);
                    if(rbDuplicado.isSelected())
                        modeloList1.addElement(valor);
                }
                lblMsg.setText("Se generaron " + modeloList1.size()+ " valores");
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        ListaInicial.clearSelection();//para limpiar el resaltado de la busqueda anterior
        ListaOrdenada.clearSelection();//para limpiar el resaltado de la busqueda anterior
        if(rbSearchLineal.isSelected()){
            if(modeloList1.size()<1){
                JOptionPane.showMessageDialog(this, "La lista se encuentra vacia",
                        "ERROR",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(txtValor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe consignar el valor que desea buscar",
                        "ERROR",JOptionPane.WARNING_MESSAGE);
                return;
            }
            Integer[] X =Arrays.stream(modeloList1.toArray())
                .map(obj->Integer.valueOf(obj.toString())).toArray(Integer[]::new);
            Search s=new Search();
            int result=s.Lineal(X, Integer.parseInt(txtValor.getText()));
            if(result==s.NO_ENCONTRADO)
                JOptionPane.showMessageDialog(this, "El valor buscado no se encontro en la lista",
                        "RESULTADO",JOptionPane.WARNING_MESSAGE);
            else{
                JOptionPane.showMessageDialog(this, "El valor buscado se encontro en la lista en el registro: " + (result + 1),
                        "RESULTADO",JOptionPane.WARNING_MESSAGE);
                ListaInicial.setSelectedIndex(result);//Selecciona el row con el valor
                ListaInicial.requestFocusInWindow();//Coloca el foco en la lista
                ListaInicial.requestFocus();//Enfoca la lista
        }   }
        //Binaria
        if(rbSearchBinaria.isSelected()){
            if(modeloList2.size()<1){
                JOptionPane.showMessageDialog(this, "La lista se encuentra vacia",
                        "ERROR",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(txtValor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe consignar el valor que desea buscar",
                        "ERROR",JOptionPane.WARNING_MESSAGE);
                return;
            }
            Integer[] X =Arrays.stream(modeloList2.toArray())
                .map(obj->Integer.valueOf(obj.toString())).toArray(Integer[]::new);
            Search s=new Search();
            int result=s.Binaria(X, Integer.parseInt(txtValor.getText()));
            if(result==s.NO_ENCONTRADO)
                JOptionPane.showMessageDialog(this, "El valor buscado no se encontro en la lista",
                        "RESULTADO",JOptionPane.WARNING_MESSAGE);
            else{
                JOptionPane.showMessageDialog(this, "El valor buscado se encontro en la lista en el registro: " + (result + 1),
                        "RESULTADO",JOptionPane.WARNING_MESSAGE);
                ListaOrdenada.setSelectedIndex(result);//Selecciona el row con el valor
                ListaOrdenada.requestFocusInWindow();//Coloca el foco en la lista
                ListaOrdenada.requestFocus();//Enfoca la lista
        }   }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCargaActionPerformed

    private void cbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMetodoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDataSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDataSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDataSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDataSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDataSimple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnOrdenar;
    private javax.swing.JList<String> ListaInicial;
    private javax.swing.JList<String> ListaOrdenada;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbCarga;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpIntervalo;
    private javax.swing.JSpinner jsFin;
    private javax.swing.JSpinner jsIni;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblComplejidad;
    private javax.swing.JLabel lblCompraciones;
    private javax.swing.JLabel lblFComparaciones;
    private javax.swing.JLabel lblFIntercambios;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblIni;
    private javax.swing.JLabel lblIntercambios;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblMsTEjecucion;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTEjecucion;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbDuplicado;
    private javax.swing.JRadioButton rbSearchBinaria;
    private javax.swing.JRadioButton rbSearchLineal;
    private javax.swing.JRadioButton rbUnico;
    private javax.swing.ButtonGroup rbgSearchAlgoritmo;
    private javax.swing.JTextField txtComparaciones;
    private javax.swing.JTextField txtComplejidad;
    private javax.swing.JTextField txtIntercambios;
    private javax.swing.JTextField txtTiempoEjecucion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
