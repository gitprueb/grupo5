import java.awt.Color;
import java.awt.List;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Procesar extends javax.swing.JFrame {

    
    int Contador;//Contador del total de procesos que se van ingresando
    int NProceso;//Carga el número de procesos ejecutándose
    int Rafaga=0;//Carga la ráfaga en ejecución
    int Llegada=0;
    int Quantum=0;//Carga el quantum en ejecución
    int ResiduoRafaga=0;//Carga el residuo en ejecución
    int TiempoProceso=0;//Carga el tiempo que se dura procesando
    int ValorBarra;//Carga el progreso de la Barra
    int CantidadProcesos;//Número de procesos terminados
    int contadordellegada;
    int contadorfin;
    int contadorfin1;
    int totalTiempoRespuesta = 0;
    double TiempoInicio=0;
    double sumaTotal = 0;
    int tiempoActual = 0;  // Variable para llevar el control del tiempo en el sistema

int tiempoTotalEspera=0;
double TME=0;


    public Procesar() {
        initComponents();
        jTIngreso.setBackground(Color.CYAN);
        jTIngreso.setForeground(Color.blue);
        jTFinal.setBackground(Color.GREEN);
        //jTFinal.setBackground(Color.red);
        jTFCapturaQuantum.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTIngreso = new javax.swing.JTable();
        jTFCapturaQuantum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCapturaRafaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPBEstado = new javax.swing.JProgressBar();
        jBIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLNumeroProceso = new javax.swing.JTextField();
        jLPorcentajeProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCantidadProcesos = new javax.swing.JTextField();
        jLCantidadTiempo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTFinal = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFCapturaRafaga1 = new javax.swing.JTextField();
        jLCantidadProcesos1 = new javax.swing.JTextField();
        jLCantidadProcesos2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Reinicio = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTFinal1 = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantum");

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jTIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "ResiduoRafaga", "Estado", "tiempo de llegada"
            }
        ));
        jScrollPane3.setViewportView(jTIngreso);

        jTFCapturaQuantum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaQuantumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Rafaga");

        jTFCapturaRafaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaRafagaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("        LISTA DE PROCESOS");

        jPBEstado.setBackground(java.awt.SystemColor.textHighlight);
        jPBEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPBEstado.setForeground(new java.awt.Color(0, 51, 255));
        jPBEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jBIniciar.setText("Iniciar");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("        HISTORICO PROCESOS");

        jLNumeroProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNumeroProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNumeroProcesoActionPerformed(evt);
            }
        });

        jLPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPorcentajeProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLPorcentajeProcesoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CANTIDAD PROCESO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("TIEMPO TOTAL");

        jLCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesosActionPerformed(evt);
            }
        });

        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadTiempoActionPerformed(evt);
            }
        });

        jTFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "Tiempo Final", "tiempo de llegada"
            }
        ));
        jScrollPane4.setViewportView(jTFinal);
        if (jTFinal.getColumnModel().getColumnCount() > 0) {
            jTFinal.getColumnModel().getColumn(0).setResizable(false);
            jTFinal.getColumnModel().getColumn(1).setResizable(false);
            jTFinal.getColumnModel().getColumn(2).setResizable(false);
            jTFinal.getColumnModel().getColumn(3).setResizable(false);
            jTFinal.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel7.setText("Proceso");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tiempo de llegada");

        jTFCapturaRafaga1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaRafaga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaRafaga1ActionPerformed(evt);
            }
        });

        jLCantidadProcesos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesos1ActionPerformed(evt);
            }
        });

        jLCantidadProcesos2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesos2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TMR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("TME");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Reinicio.setText("Reiniciar");
        Reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinicioActionPerformed(evt);
            }
        });

        jTFinal1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "proceso", "tiempo de inicio", "tiempo final"
            }
        ));
        jScrollPane5.setViewportView(jTFinal1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCapturaRafaga1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLCantidadProcesos)
                                                            .addComponent(jLCantidadTiempo))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLCantidadProcesos2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLCantidadProcesos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel7))
                                .addGap(0, 83, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reinicio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBAgregar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIniciar)
                    .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCapturaRafaga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCantidadProcesos1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLCantidadProcesos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Reinicio)
                        .addGap(18, 18, 18)
                        .addComponent(Salir)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
      String llegadaInput = jTFCapturaRafaga1.getText();
    String rafagaInput = jTFCapturaRafaga.getText();

    if (llegadaInput.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el tiempo de llegada.");
        return;  // No permite agregar el proceso si el tiempo de llegada está vacío
    }

    if (rafagaInput.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la ráfaga.");
        return;  // No permite agregar el proceso si la ráfaga está vacía
    }

    int llegada = Integer.parseInt(llegadaInput);
    int rafaga = Integer.parseInt(rafagaInput);

    if (llegada < 0|| llegada > 100) {
        JOptionPane.showMessageDialog(null, "El tiempo de llegada debe ser mayor que 0 y menos a 100.");
        jTFCapturaRafaga1.setText(null);
        jTFCapturaRafaga1.grabFocus();
        return;
    }

    if (rafaga <= 0 || rafaga > 100) {
        JOptionPane.showMessageDialog(null, "La ráfaga debe estar entre 1 y 100.");
        jTFCapturaRafaga.setText(null);
        jTFCapturaRafaga.grabFocus();
        return;
    }

    Ingresar();
    jTFCapturaQuantum.setEditable(false);
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jTFCapturaRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaRafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaRafagaActionPerformed

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        // TODO add your handling code here:
        new Thread(new Hilo()).start(); //Crea un nuevo hilo
        Iniciar();
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jTFCapturaQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaQuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaQuantumActionPerformed

    private void jLCantidadProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesosActionPerformed

    private void jLCantidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadTiempoActionPerformed

    private void jLNumeroProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNumeroProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNumeroProcesoActionPerformed

    private void jLPorcentajeProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLPorcentajeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPorcentajeProcesoActionPerformed

    private void jTFCapturaRafaga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaRafaga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaRafaga1ActionPerformed

    private void jLCantidadProcesos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesos1ActionPerformed

    private void jLCantidadProcesos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesos2ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinicioActionPerformed
       reiniciarTodo();
    }//GEN-LAST:event_ReinicioActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Procesar().setVisible(true);
        }
    });
}

     private class Hilo implements Runnable {
    @Override
    public void run() {
        ordenarPorLlegada(); // Ordenar los procesos por el tiempo de llegada
        boolean procesoPendiente = true; // Variable para verificar si quedan procesos por procesar
        int tiempoFinalProcesoAnterior = 0;  // Lleva el control del tiempo final del proceso anterior

        // Mientras haya procesos que no han terminado
        while (procesoPendiente) {
            procesoPendiente = false;  // Asumimos que no hay procesos pendientes inicialmente

            for (int i = 0; i < Contador; i++) { // Recorrer todas las filas de procesos
                Cargar(i); // Cargar el proceso actual

                // Si el proceso ya está marcado como "TERMINADO", no realizar más acciones sobre él
                if (jTIngreso.getValueAt(i, 4).equals("TERMINADO")) {
                    continue; // Saltar al siguiente proceso
                }

                // Si encontramos un proceso que no está terminado, hay proceso pendiente
                procesoPendiente = true;

                // Ajustamos el tiempo de inicio en función del proceso anterior
                int tiempoInicio = Math.max(tiempoFinalProcesoAnterior, Llegada);

                // Ejecutando Procesos
                if (ResiduoRafaga > Quantum) {
                    // Si la ráfaga es mayor al quantum, ejecutar un ciclo completo
                    for (int c = 1; c <= Quantum; c++) {
                        jTIngreso.setValueAt("Procesando", i, 4); // Estado "Procesando"
                        ResiduoRafaga--;
                        Barra(Rafaga, ResiduoRafaga); // Actualizar la barra de progreso
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga), i, 3); // Actualizar el residuo de ráfaga
                        TiempoProceso++;
                        Dormir(); // Simular el tiempo de ejecución
                    }

                    // Registrar los tiempos de cada ciclo de quantum
                    int tiempoFinal = tiempoInicio + Quantum;  // Calcular tiempo final del ciclo

                    // Aquí usas el nuevo método para verificar duplicados antes de agregar
                    agregarCicloFinal1((int) jTIngreso.getValueAt(i, 0), tiempoInicio, tiempoFinal);
                    jTIngreso.setValueAt("Espera", i, 4); // Cambiar el estado del proceso a "Espera"

                    // Guardar el tiempo final del proceso para el siguiente
                    tiempoFinalProcesoAnterior = tiempoFinal;

                } else if (ResiduoRafaga > 0) {
                    // Si la ráfaga es menor o igual al quantum, procesar todo el residuo de una vez
                    int tiempoParaEjecutar = ResiduoRafaga;  // Aquí usamos el residuo en lugar del quantum
                    for (int c = 1; c <= tiempoParaEjecutar; c++) {
                        jTIngreso.setValueAt("Procesando", i, 4);
                        ResiduoRafaga--;
                        Barra(Rafaga, ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                        TiempoProceso++;
                        Dormir();
                    }

                    // Si el proceso ha finalizado, registrar el tiempo final
                    if (ResiduoRafaga == 0) {
                        int tiempoFinal = tiempoInicio + tiempoParaEjecutar;  // Sumar solo el residuo de ráfaga

                        // Usar el método para verificar duplicados
                        agregarCicloFinal1((int) jTIngreso.getValueAt(i, 0), tiempoInicio, tiempoFinal);
                        jTIngreso.setValueAt("Terminado", i, 4); // Cambiar el estado del proceso a "Terminado"
                        Pintar();
                        Informe(i);  // Generar el informe del proceso
                        Borrar(i);  // Borrar el proceso de la tabla de entrada
                        jPBEstado.setValue(0);  // Resetear la barra de progreso

                        // Guardar el tiempo final del proceso para el siguiente
                        tiempoFinalProcesoAnterior = tiempoFinal;
                    }
                }

                // Limpiar los campos del proceso en ejecución en la interfaz
                jLNumeroProceso.setText(""); 
                jLPorcentajeProceso.setText("");
            }

            // Reiniciar el bucle desde el primer proceso si aún hay procesos pendientes
            int i = 0;
        }
    }
}



public void agregarCicloFinal1(int proceso, int tiempoInicioCiclo, int tiempoFinalCiclo) {
    DefaultTableModel modeloFinal1 = (DefaultTableModel) jTFinal1.getModel();

    // Verificar si el ciclo ya existe en la tabla jTFinal1
    boolean cicloExiste = false;
    for (int i = 0; i < modeloFinal1.getRowCount(); i++) {
        if (modeloFinal1.getValueAt(i, 0).equals(proceso)
                && modeloFinal1.getValueAt(i, 1).equals(tiempoInicioCiclo)
                && modeloFinal1.getValueAt(i, 2).equals(tiempoFinalCiclo)) {
            cicloExiste = true;
            break;
        }
    }

    // Solo agregar el ciclo si no existe ya en la tabla
    if (!cicloExiste) {
        Object[] miTablaFinal1 = {proceso, tiempoInicioCiclo, tiempoFinalCiclo};
        modeloFinal1.addRow(miTablaFinal1);
    }

    // Actualizar la tabla
    jTFinal1.setModel(modeloFinal1);
}


public void agregarAFinal(int proceso, int tiempoEjecucion) {
    DefaultTableModel modeloFinal1 = (DefaultTableModel) jTFinal1.getModel();
    
    // Agregar el proceso con el número y el tiempo de llegada basado en la ráfaga
    Object[] infoProceso = new Object[2];
    infoProceso[0] = "Proceso: " + (proceso + 1);
    infoProceso[1] = tiempoEjecucion + " ut";
    modeloFinal1.addRow(infoProceso);
    
    // Actualizar la tabla jTFinal1
    jTFinal1.setModel(modeloFinal1);
}

public void Dormir(){
    try{
        Thread.sleep(700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(Procesar.class.getName()).log(Level.SEVERE,null,ex);
    }

}


public void ordenarPorLlegada() {
    DefaultTableModel dtm = (DefaultTableModel) jTIngreso.getModel();
    Vector<Vector> data = dtm.getDataVector();

    // Ordenar solo por tiempo de llegada, sin modificar el número de proceso original
    Collections.sort(data, new Comparator<Vector>() {
        public int compare(Vector o1, Vector o2) {
            Integer llegada1 = Integer.parseInt(o1.get(5).toString());  // Tiempo de llegada del primer proceso
            Integer llegada2 = Integer.parseInt(o2.get(5).toString());  // Tiempo de llegada del segundo proceso
            return llegada1.compareTo(llegada2);  // Ordenar por el tiempo de llegada
        }
    });

    dtm.fireTableDataChanged();  // Actualizar la tabla después de ordenar
}




 public void Informe(int c) {
    DefaultTableModel modelo2 = (DefaultTableModel) jTFinal.getModel();
    

    // Datos básicos del proceso
    Object[] miTabla = new Object[6];
    miTabla[0] = jTIngreso.getValueAt(c, 0);  // Número del proceso original
    miTabla[1] = Rafaga;  // Ráfaga del proceso
    miTabla[2] = Quantum;  // Quantum del proceso
    miTabla[3] = TiempoProceso + " Segundos";  // Tiempo total del proceso
    miTabla[4] = jTIngreso.getValueAt(c, 5);  // Tiempo de llegada del proceso

    // Comprobar si ya existe el proceso en jTFinal
    boolean existe = false;
    for (int i = 0; i < modelo2.getRowCount(); i++) {
        if (modelo2.getValueAt(i, 0).equals(miTabla[0])) {
            existe = true;
            break;  // Si el proceso ya está registrado, no se añade de nuevo
        }
    }

    // Añadir a la tabla principal de historial de procesos (jTFinal) si no existe
    if (!existe) {
        modelo2.addRow(miTabla);
        jTFinal.setModel(modelo2);
    }

    // Actualizamos la cantidad de procesos terminados
    CantidadProcesos++;
    jLCantidadProcesos.setText(String.valueOf(CantidadProcesos + " Terminados"));
    jLCantidadTiempo.setText(String.valueOf(TiempoProceso + " Segundos"));

    // Cálculo de TMR y TME
    String valorActual = (String) miTabla[3];
    String[] partes = valorActual.split(" ");
    try {
        int tiempoActual = Integer.parseInt(partes[0]);
        sumaTotal += tiempoActual;
        TiempoInicio = (double) sumaTotal / CantidadProcesos;

        // Calculamos el tiempo de espera (tiempo de inicio menos tiempo de llegada)
        int tiempoInicioProceso = TiempoProceso - (ResiduoRafaga == 0 ? Rafaga : ResiduoRafaga);
        int tiempoEspera = tiempoInicioProceso - Llegada;
        tiempoTotalEspera += tiempoEspera;
        TME = (double) tiempoTotalEspera / CantidadProcesos;

    } catch (NumberFormatException e) {
        System.out.println("Error al convertir: " + valorActual);
    }

    jLCantidadProcesos1.setText(String.format("%.2f ut", TME));  // Mostrar TME
    jLCantidadProcesos2.setText(String.format("%.2f ut", TiempoInicio));  // Mostrar TMR

    
}





public void Cargar(int i){ //Carga los valores de la Tabla
    NProceso=(int)jTIngreso.getValueAt(i,0);
    Rafaga=parseInt((String)(jTIngreso.getValueAt(i,1)));
    Quantum=parseInt((String)(jTIngreso.getValueAt(i,2)));
    ResiduoRafaga=parseInt((String)(jTIngreso.getValueAt(i,3)));
     Llegada=parseInt((String)(jTIngreso.getValueAt(i,5)));
    if(NProceso>0){
        jLNumeroProceso.setText(String.valueOf(NProceso));
    }
}
public void Ingresar() { 
    String rafagaText = jTFCapturaRafaga.getText();
    String quantumText = jTFCapturaQuantum.getText();
    String llegadaText = jTFCapturaRafaga1.getText();

    // Verificar que ninguno de los campos esté vacío antes de agregar el proceso
    if (rafagaText.isEmpty() || quantumText.isEmpty() || llegadaText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Convertir los valores ingresados a enteros
    int tiempoLlegada = Integer.parseInt(llegadaText);
    contadordellegada += tiempoLlegada;

    // Incrementar el contador de procesos
    Contador++;

    // Crear un nuevo objeto para la fila del proceso
    Object[] miTabla = new Object[6];
    miTabla[0] = Contador;                 // Número de proceso
    miTabla[1] = rafagaText;               // Ráfaga
    miTabla[2] = quantumText;              // Quantum
    miTabla[3] = rafagaText;               // Residuo de ráfaga (inicialmente igual a la ráfaga)
    miTabla[4] = "Listo";                  // Estado del proceso
    miTabla[5] = llegadaText;              // Tiempo de llegada

    // Agregar el proceso al modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTIngreso.getModel();
    modelo.addRow(miTabla);

    // Actualizar la tabla
    jTIngreso.setModel(modelo);

    // Limpiar los campos de entrada
    jTFCapturaRafaga.setText(null);
    jTFCapturaRafaga1.setText(null);

    // Poner el foco de nuevo en los campos de entrada para facilitar la entrada de nuevos procesos
    jTFCapturaRafaga.grabFocus();
    jTFCapturaRafaga1.grabFocus();
}




public void Borrar(int c){ //Elimina los registros de la tabla procesos
    jTIngreso.setValueAt(0,c,0);
    jTIngreso.setValueAt("0",c,1);
    jTIngreso.setValueAt("0",c,2);
    jTIngreso.setValueAt("0",c,3);
    jTIngreso.setValueAt("TERMINADO",c,4);
    jTIngreso.setValueAt("0",c,5);
}

   public void Barra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga=rafaga;
        int valor=100/rafaga;
        
        int porcentaje=100-(valor*residuo);
        ValorBarra=porcentaje;
        jLPorcentajeProceso.setText(String.valueOf(ValorBarra+"%"));
}

   public void Pintar(){
    if(ValorBarra > 90) {
        jPBEstado.setForeground(Color.BLUE);  // Cambiar el color de la barra a rojo
    } else {
        jPBEstado.setForeground(Color.GREEN);  // Cambiar el color de la barra a verde
    }
    jPBEstado.setValue(ValorBarra);
    jPBEstado.repaint();
}

    public void Iniciar(){ //Inicia la secuencia de procesos
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jTFCapturaRafaga.setVisible(false);
        jTFCapturaQuantum.setVisible(false);
        jBAgregar.setVisible(false);
        jBIniciar.setVisible(false);
        jTFCapturaRafaga1.setVisible(false);

}
    
 public void reiniciarTodo(){ 
    // Reiniciando variables
    Contador = 0;
    TiempoProceso = 0;
    CantidadProcesos = 0;
    sumaTotal = 0;
    tiempoTotalEspera = 0;
    TME = 0;
    TiempoInicio = 0;
    contadordellegada = 0;
    Rafaga = 0;
    Quantum = 0;
    ResiduoRafaga = 0;
    Llegada = 0;
    ValorBarra = 0;

    // Reiniciando controles
    DefaultTableModel modeloIngreso = (DefaultTableModel) jTIngreso.getModel();
    DefaultTableModel modeloFinal = (DefaultTableModel) jTFinal.getModel();
    DefaultTableModel modelo = (DefaultTableModel) jTFinal1.getModel();
    
    // Elimina todas las filas del modelo actual
    modelo.setRowCount(0);
    
    // Refresca la tabla
    jTFinal1.setModel(modelo);
    modeloIngreso.setRowCount(0); // Limpia la tabla de ingreso
    modeloFinal.setRowCount(0);   // Limpia la tabla final

    jPBEstado.setValue(0);  // Barra de progreso a 0
    jLCantidadProcesos.setText("");
    jLCantidadTiempo.setText("");
    jLCantidadProcesos1.setText("");
    jLCantidadProcesos2.setText("");
    jTFCapturaRafaga.setText("");
    jTFCapturaQuantum.setText("");
    jTFCapturaRafaga1.setText("");
    
    jLabel2.setVisible(true);
    jLabel1.setVisible(true);
    jTFCapturaRafaga.setVisible(true);
    jTFCapturaQuantum.setVisible(true);
    jBAgregar.setVisible(true);
    jBIniciar.setVisible(true);
    jTFCapturaRafaga1.setVisible(true);
    jTFCapturaQuantum.setEditable(true);
}
   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reinicio;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JTextField jLCantidadProcesos;
    private javax.swing.JTextField jLCantidadProcesos1;
    private javax.swing.JTextField jLCantidadProcesos2;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JTextField jLNumeroProceso;
    private javax.swing.JTextField jLPorcentajeProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jPBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTFCapturaQuantum;
    private javax.swing.JTextField jTFCapturaRafaga;
    private javax.swing.JTextField jTFCapturaRafaga1;
    private javax.swing.JTable jTFinal;
    private javax.swing.JTable jTFinal1;
    private javax.swing.JTable jTIngreso;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
