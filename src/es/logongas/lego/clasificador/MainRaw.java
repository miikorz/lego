/*
 * MainRaw.java
 *
 * Created on 20 de marzo de 2009, 19:54
 */
package es.logongas.lego.clasificador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import es.logongas.lego.Microcontroller;
import es.logongas.lego.MotorDirection;

/**
 *
 * @author Administrador
 */
public class MainRaw extends javax.swing.JFrame {

    Microcontroller mc;

    /**
     * Creates new form MainRaw
     */
    public MainRaw() {
        initComponents();
        mc = new Microcontroller("COM1");
        readAnalog();
        readDigital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelMotor0 = new javax.swing.JLabel();
        jLabelMotor1 = new javax.swing.JLabel();
        jLabelMotor2 = new javax.swing.JLabel();
        jLabelMotor3 = new javax.swing.JLabel();
        jLabelSensorPresion7 = new javax.swing.JLabel();
        jLabelSensorPresion6 = new javax.swing.JLabel();
        jLabelSensorPresion5 = new javax.swing.JLabel();
        jLabelSensorPresion4 = new javax.swing.JLabel();
        jLabelSensorPresion3 = new javax.swing.JLabel();
        jLabelSensorPresion2 = new javax.swing.JLabel();
        jLabelSensorLuz0 = new javax.swing.JLabel();
        jLabelSensorLuz1 = new javax.swing.JLabel();
        jLabelSensorLuz2 = new javax.swing.JLabel();
        jLabelSensorLuz3 = new javax.swing.JLabel();
        jLabelSensorLuz4 = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();
        jToggleButtonMotor0 = new javax.swing.JToggleButton();
        jToggleButtonMotor1 = new javax.swing.JToggleButton();
        jToggleButtonMotor2 = new javax.swing.JToggleButton();
        jToggleButtonMotor3 = new javax.swing.JToggleButton();
        jCheckBoxMotor1Atras = new javax.swing.JCheckBox();
        jCheckBoxMotor3Atras = new javax.swing.JCheckBox();
        jCheckBoxMotor2Atras = new javax.swing.JCheckBox();
        jCheckBoxMotor0Atras = new javax.swing.JCheckBox();
        jLabelRefrescando = new javax.swing.JLabel();
        jRadioButtonAnalogico0 = new javax.swing.JRadioButton();
        jRadioButtonAnalogico1 = new javax.swing.JRadioButton();
        jRadioButtonAnalogico2 = new javax.swing.JRadioButton();
        jRadioButtonAnalogico3 = new javax.swing.JRadioButton();
        jRadioButtonAnalogico4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMotor0.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMotor0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelMotor0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/motorM.png"))); // NOI18N
        jLabelMotor0.setText("0");
        jLabelMotor0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelMotor0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMotor0.setOpaque(true);
        jLabelMotor0.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelMotor1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMotor1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelMotor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/motorM.png"))); // NOI18N
        jLabelMotor1.setText("1");
        jLabelMotor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelMotor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMotor1.setOpaque(true);
        jLabelMotor1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelMotor2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMotor2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelMotor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/motorM.png"))); // NOI18N
        jLabelMotor2.setText("2");
        jLabelMotor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelMotor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMotor2.setOpaque(true);
        jLabelMotor2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelMotor3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMotor3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelMotor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/motorM.png"))); // NOI18N
        jLabelMotor3.setText("3");
        jLabelMotor3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelMotor3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMotor3.setOpaque(true);
        jLabelMotor3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion7.setText("ON");
        jLabelSensorPresion7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion7.setOpaque(true);
        jLabelSensorPresion7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion6.setText("ON");
        jLabelSensorPresion6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion6.setOpaque(true);
        jLabelSensorPresion6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion5.setText("ON");
        jLabelSensorPresion5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion5.setOpaque(true);
        jLabelSensorPresion5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion4.setText("ON");
        jLabelSensorPresion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion4.setOpaque(true);
        jLabelSensorPresion4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion3.setText("ON");
        jLabelSensorPresion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion3.setOpaque(true);
        jLabelSensorPresion3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorPresion2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorPresion2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorPresion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorPresion.png"))); // NOI18N
        jLabelSensorPresion2.setText("ON");
        jLabelSensorPresion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorPresion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorPresion2.setOpaque(true);
        jLabelSensorPresion2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorLuz0.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorLuz0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorLuz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorluz.png"))); // NOI18N
        jLabelSensorLuz0.setText("0->");
        jLabelSensorLuz0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jLabelSensorLuz0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorLuz0.setOpaque(true);
        jLabelSensorLuz0.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorLuz1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorLuz1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorLuz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorluz.png"))); // NOI18N
        jLabelSensorLuz1.setText("1->");
        jLabelSensorLuz1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorLuz1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorLuz1.setOpaque(true);
        jLabelSensorLuz1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorLuz2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorLuz2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorLuz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorluz.png"))); // NOI18N
        jLabelSensorLuz2.setText("2->");
        jLabelSensorLuz2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorLuz2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorLuz2.setOpaque(true);
        jLabelSensorLuz2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorLuz3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorLuz3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorLuz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorluz.png"))); // NOI18N
        jLabelSensorLuz3.setText("3->");
        jLabelSensorLuz3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorLuz3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorLuz3.setOpaque(true);
        jLabelSensorLuz3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelSensorLuz4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSensorLuz4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSensorLuz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/logongas/lego/clasificador/img/sensorluz.png"))); // NOI18N
        jLabelSensorLuz4.setText("4->");
        jLabelSensorLuz4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelSensorLuz4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSensorLuz4.setOpaque(true);
        jLabelSensorLuz4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jToggleButtonMotor0.setText("Marcha");
        jToggleButtonMotor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMotor0ActionPerformed(evt);
            }
        });

        jToggleButtonMotor1.setText("Marcha");
        jToggleButtonMotor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMotor1ActionPerformed(evt);
            }
        });

        jToggleButtonMotor2.setText("Marcha");
        jToggleButtonMotor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMotor2ActionPerformed(evt);
            }
        });

        jToggleButtonMotor3.setText("Marcha");
        jToggleButtonMotor3.setToolTipText("");
        jToggleButtonMotor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMotor3ActionPerformed(evt);
            }
        });

        jCheckBoxMotor1Atras.setText("Atras");
        jCheckBoxMotor1Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMotor1AtrasActionPerformed(evt);
            }
        });

        jCheckBoxMotor3Atras.setText("Atras");
        jCheckBoxMotor3Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMotor3AtrasActionPerformed(evt);
            }
        });

        jCheckBoxMotor2Atras.setText("Atras");
        jCheckBoxMotor2Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMotor2AtrasActionPerformed(evt);
            }
        });

        jCheckBoxMotor0Atras.setText("Atras");
        jCheckBoxMotor0Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMotor0AtrasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAnalogico0);
        jRadioButtonAnalogico0.setSelected(true);
        jRadioButtonAnalogico0.setText("Sensor Luz 0");

        buttonGroup1.add(jRadioButtonAnalogico1);
        jRadioButtonAnalogico1.setText("Anal�gico 1");

        buttonGroup1.add(jRadioButtonAnalogico2);
        jRadioButtonAnalogico2.setText("Anal�gico 2");

        buttonGroup1.add(jRadioButtonAnalogico3);
        jRadioButtonAnalogico3.setText("Anal�gico 3");

        buttonGroup1.add(jRadioButtonAnalogico4);
        jRadioButtonAnalogico4.setText("Anal�gico 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelSensorPresion7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSensorPresion6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSensorPresion5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSensorPresion4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSensorPresion3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSensorPresion2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jLabelRefrescando)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRefresh)
                            .addGap(240, 240, 240)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMotor0)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonMotor0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxMotor0Atras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMotor1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonMotor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxMotor1Atras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMotor2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonMotor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxMotor2Atras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMotor3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonMotor3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxMotor3Atras))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSensorLuz0)
                            .addComponent(jRadioButtonAnalogico0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSensorLuz1)
                            .addComponent(jRadioButtonAnalogico1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSensorLuz2)
                            .addComponent(jRadioButtonAnalogico2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSensorLuz3)
                            .addComponent(jRadioButtonAnalogico3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonAnalogico4)
                            .addComponent(jLabelSensorLuz4))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMotor0)
                    .addComponent(jLabelMotor1)
                    .addComponent(jLabelMotor2)
                    .addComponent(jLabelMotor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButtonMotor0)
                        .addComponent(jToggleButtonMotor1)
                        .addComponent(jToggleButtonMotor2)
                        .addComponent(jToggleButtonMotor3)
                        .addComponent(jCheckBoxMotor1Atras)
                        .addComponent(jCheckBoxMotor2Atras)
                        .addComponent(jCheckBoxMotor0Atras))
                    .addComponent(jCheckBoxMotor3Atras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAnalogico0)
                    .addComponent(jRadioButtonAnalogico1)
                    .addComponent(jRadioButtonAnalogico2)
                    .addComponent(jRadioButtonAnalogico3)
                    .addComponent(jRadioButtonAnalogico4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSensorLuz0)
                    .addComponent(jLabelSensorLuz1)
                    .addComponent(jLabelSensorLuz2)
                    .addComponent(jLabelSensorLuz3)
                    .addComponent(jLabelSensorLuz4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSensorPresion4)
                    .addComponent(jLabelSensorPresion3)
                    .addComponent(jLabelSensorPresion2)
                    .addComponent(jLabelSensorPresion5)
                    .addComponent(jLabelSensorPresion6)
                    .addComponent(jLabelSensorPresion7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRefresh)
                    .addComponent(jLabelRefrescando)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        readAnalog();
        readDigital();

    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jToggleButtonMotor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMotor0ActionPerformed
        if (jToggleButtonMotor0.isSelected()) {
            jToggleButtonMotor0.setText("Parar");
            mc.motorOn(0, getDirectionFromBoolean(jCheckBoxMotor0Atras.isSelected()), 255);
        } else {
            jToggleButtonMotor0.setText("Marchar");
            mc.motorOff(0);
            jCheckBoxMotor0Atras.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButtonMotor0ActionPerformed

    private MotorDirection getDirectionFromBoolean(boolean b) {
        if (b) {
            return MotorDirection.Forward;
        } else {
            return MotorDirection.Reverse;
        }
    }

    private void jCheckBoxMotor1AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMotor1AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMotor1AtrasActionPerformed

    private void jCheckBoxMotor3AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMotor3AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMotor3AtrasActionPerformed

    private void jCheckBoxMotor2AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMotor2AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMotor2AtrasActionPerformed

    private void jCheckBoxMotor0AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMotor0AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMotor0AtrasActionPerformed

    private void jToggleButtonMotor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMotor1ActionPerformed
        if (jToggleButtonMotor1.isSelected()) {
            jToggleButtonMotor1.setText("Parar");
            mc.motorOn(1, getDirectionFromBoolean(!jCheckBoxMotor1Atras.isSelected()), 255);
        } else {
            jToggleButtonMotor1.setText("Marchar");
            mc.motorOff(1);
            jCheckBoxMotor1Atras.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButtonMotor1ActionPerformed

    private void jToggleButtonMotor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMotor2ActionPerformed
        if (jToggleButtonMotor2.isSelected()) {
            jToggleButtonMotor2.setText("Parar");
            mc.motorOn(2, getDirectionFromBoolean(!jCheckBoxMotor2Atras.isSelected()), 255);
        } else {
            jToggleButtonMotor2.setText("Marchar");
            mc.motorOff(2);
            jCheckBoxMotor2Atras.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButtonMotor2ActionPerformed

    private void jToggleButtonMotor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMotor3ActionPerformed
        if (jToggleButtonMotor3.isSelected()) {
            jToggleButtonMotor3.setText("Parar");
            mc.motorOn(3, getDirectionFromBoolean(!jCheckBoxMotor3Atras.isSelected()), 255);
        } else {
            jToggleButtonMotor3.setText("Marchar");
            mc.motorOff(3);
            jCheckBoxMotor3Atras.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButtonMotor3ActionPerformed

    private void readAnalog() {
        jLabelSensorLuz0.setText("0->" + mc.ligthSensorRead(0));
        jLabelSensorLuz1.setText("1->" + mc.analogRead(1));
        jLabelSensorLuz2.setText("2->" + mc.analogRead(2));
        jLabelSensorLuz3.setText("3->" + mc.analogRead(3));
        jLabelSensorLuz4.setText("4->" + mc.analogRead(4));


    }

    private void readDigital() {
        jLabelSensorPresion2.setText("2->" + booleanToText(mc.digitalRead(2)));
        jLabelSensorPresion3.setText("3->" + booleanToText(mc.digitalRead(3)));
        jLabelSensorPresion4.setText("4->" + booleanToText(mc.digitalRead(4)));
        jLabelSensorPresion5.setText("5->" + booleanToText(mc.digitalRead(5)));
        jLabelSensorPresion6.setText("6->" + booleanToText(mc.digitalRead(6)));
        jLabelSensorPresion7.setText("7->" + booleanToText(mc.digitalRead(7)));

    }

    private String booleanToText(boolean b) {
        if (b) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainRaw().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JCheckBox jCheckBoxMotor0Atras;
    private javax.swing.JCheckBox jCheckBoxMotor1Atras;
    private javax.swing.JCheckBox jCheckBoxMotor2Atras;
    private javax.swing.JCheckBox jCheckBoxMotor3Atras;
    private javax.swing.JLabel jLabelMotor0;
    private javax.swing.JLabel jLabelMotor1;
    private javax.swing.JLabel jLabelMotor2;
    private javax.swing.JLabel jLabelMotor3;
    private javax.swing.JLabel jLabelRefrescando;
    private javax.swing.JLabel jLabelSensorLuz0;
    private javax.swing.JLabel jLabelSensorLuz1;
    private javax.swing.JLabel jLabelSensorLuz2;
    private javax.swing.JLabel jLabelSensorLuz3;
    private javax.swing.JLabel jLabelSensorLuz4;
    private javax.swing.JLabel jLabelSensorPresion2;
    private javax.swing.JLabel jLabelSensorPresion3;
    private javax.swing.JLabel jLabelSensorPresion4;
    private javax.swing.JLabel jLabelSensorPresion5;
    private javax.swing.JLabel jLabelSensorPresion6;
    private javax.swing.JLabel jLabelSensorPresion7;
    private javax.swing.JRadioButton jRadioButtonAnalogico0;
    private javax.swing.JRadioButton jRadioButtonAnalogico1;
    private javax.swing.JRadioButton jRadioButtonAnalogico2;
    private javax.swing.JRadioButton jRadioButtonAnalogico3;
    private javax.swing.JRadioButton jRadioButtonAnalogico4;
    private javax.swing.JToggleButton jToggleButtonMotor0;
    private javax.swing.JToggleButton jToggleButtonMotor1;
    private javax.swing.JToggleButton jToggleButtonMotor2;
    private javax.swing.JToggleButton jToggleButtonMotor3;
    // End of variables declaration//GEN-END:variables
}