package GUI;

public class createSystems extends javax.swing.JFrame {

    public createSystems() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDualThreshold = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        parameterTypeLabel = new javax.swing.JLabel();
        parameterTypeValue = new javax.swing.JComboBox<>();
        labelMean = new javax.swing.JLabel();
        valueMean = new javax.swing.JTextField();
        labelSdLow = new javax.swing.JLabel();
        valueSdHigh = new javax.swing.JTextField();
        labelHighMean = new javax.swing.JLabel();
        valueMeanLow = new javax.swing.JTextField();
        labelSd = new javax.swing.JLabel();
        valueSd = new javax.swing.JTextField();
        labelLowMean = new javax.swing.JLabel();
        labelSdHigh = new javax.swing.JLabel();
        valueMeanHigh = new javax.swing.JTextField();
        valueSdLow = new javax.swing.JTextField();
        LabelHighThreshold = new javax.swing.JLabel();
        LabelLowThreshold = new javax.swing.JLabel();
        valueHighTreshold = new javax.swing.JTextField();
        valueLowThreshold = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelSingleThreshold = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        parameterTypeLabel1 = new javax.swing.JLabel();
        parameterTypeValue1 = new javax.swing.JComboBox<>();
        labelMean1 = new javax.swing.JLabel();
        valueMean1 = new javax.swing.JTextField();
        labelHighMean1 = new javax.swing.JLabel();
        labelSd1 = new javax.swing.JLabel();
        valueSd1 = new javax.swing.JTextField();
        labelSdHigh1 = new javax.swing.JLabel();
        valueMeanHigh1 = new javax.swing.JTextField();
        LabelHighThreshold1 = new javax.swing.JLabel();
        valueHighTreshold1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        valueSdHigh1 = new javax.swing.JTextField();

        Title.setFont(new java.awt.Font("Geoform", 1, 20)); // NOI18N
        Title.setText("Добавление двухпорогового параметра");

        parameterTypeLabel.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        parameterTypeLabel.setText("Категория");

        parameterTypeValue.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        parameterTypeValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelMean.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelMean.setText("mean штатное");

        valueMean.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueMean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMeanActionPerformed(evt);
            }
        });

        labelSdLow.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdLow.setText("sd нештатное нижнее");

        valueSdHigh.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelHighMean.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelHighMean.setText("mean нештатное верхнее");

        valueMeanLow.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueMeanLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMeanLowActionPerformed(evt);
            }
        });

        labelSd.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSd.setText("sd штатное");

        valueSd.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelLowMean.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelLowMean.setText("mean нештатное нижнее");

        labelSdHigh.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdHigh.setText("sd нештатное верхнее");

        valueMeanHigh.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueMeanHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMeanHighActionPerformed(evt);
            }
        });

        valueSdLow.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        LabelHighThreshold.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelHighThreshold.setText("верхний порог");

        LabelLowThreshold.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelLowThreshold.setText("нижний порог");

        valueHighTreshold.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueHighTreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueHighTresholdActionPerformed(evt);
            }
        });

        valueLowThreshold.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueLowThreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueLowThresholdActionPerformed(evt);
            }
        });

        jButton1.setText("Добавить параметр");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDualThresholdLayout = new javax.swing.GroupLayout(panelDualThreshold);
        panelDualThreshold.setLayout(panelDualThresholdLayout);
        panelDualThresholdLayout.setHorizontalGroup(
            panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMean)
                                            .addComponent(labelSd))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(valueSd, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(valueMean)))
                                    .addComponent(labelSdHigh)
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addComponent(LabelHighThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueHighTreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelHighMean))
                                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(LabelLowThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueLowThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(valueMeanHigh, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(valueSdHigh))
                                        .addGap(64, 64, 64)
                                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelLowMean)
                                            .addComponent(labelSdLow))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(valueMeanLow, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(valueSdLow)))
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                .addComponent(parameterTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parameterTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Title)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        panelDualThresholdLayout.setVerticalGroup(
            panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parameterTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parameterTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMean)
                    .addComponent(valueMean, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSd)
                    .addComponent(valueSd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueMeanLow, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLowMean)
                    .addComponent(valueMeanHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHighMean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueSdHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSdHigh)
                    .addComponent(labelSdLow)
                    .addComponent(valueSdLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHighThreshold)
                    .addComponent(LabelLowThreshold)
                    .addComponent(valueHighTreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLowThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        Title1.setFont(new java.awt.Font("Geoform", 1, 20)); // NOI18N
        Title1.setText("Добавление однопорогового параметра");

        parameterTypeLabel1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        parameterTypeLabel1.setText("Категория");

        parameterTypeValue1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        parameterTypeValue1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelMean1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelMean1.setText("mean штатное");

        valueMean1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueMean1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMean1ActionPerformed(evt);
            }
        });

        labelHighMean1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelHighMean1.setText("mean нештатное верхнее");

        labelSd1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSd1.setText("sd штатное");

        valueSd1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelSdHigh1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdHigh1.setText("sd нештатное верхнее");

        valueMeanHigh1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueMeanHigh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMeanHigh1ActionPerformed(evt);
            }
        });

        LabelHighThreshold1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelHighThreshold1.setText("верхний порог");

        valueHighTreshold1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N
        valueHighTreshold1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueHighTreshold1ActionPerformed(evt);
            }
        });

        jButton2.setText("Добавить параметр");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        valueSdHigh1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelSingleThresholdLayout = new javax.swing.GroupLayout(panelSingleThreshold);
        panelSingleThreshold.setLayout(panelSingleThresholdLayout);
        panelSingleThresholdLayout.setHorizontalGroup(
            panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Title1))
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(parameterTypeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parameterTypeValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMean1)
                                    .addComponent(labelSd1))
                                .addGap(18, 18, 18)
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valueSd1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(valueMean1)))
                            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                        .addComponent(labelSdHigh1)
                                        .addGap(29, 29, 29))
                                    .addComponent(labelHighMean1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(valueMeanHigh1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSingleThresholdLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(valueSdHigh1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                .addComponent(LabelHighThreshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueHighTreshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSingleThresholdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        panelSingleThresholdLayout.setVerticalGroup(
            panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSingleThresholdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(18, 18, 18)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parameterTypeLabel1)
                    .addComponent(parameterTypeValue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMean1)
                    .addComponent(valueMean1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSd1)
                    .addComponent(valueSd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHighMean1)
                    .addComponent(valueMeanHigh1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueSdHigh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSdHigh1))
                .addGap(18, 18, 18)
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHighThreshold1)
                    .addComponent(valueHighTreshold1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valueMeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMeanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMeanActionPerformed

    private void valueMeanLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMeanLowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMeanLowActionPerformed

    private void valueMeanHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMeanHighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMeanHighActionPerformed

    private void valueHighTresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueHighTresholdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueHighTresholdActionPerformed

    private void valueLowThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueLowThresholdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueLowThresholdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void valueMean1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMean1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMean1ActionPerformed

    private void valueMeanHigh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMeanHigh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMeanHigh1ActionPerformed

    private void valueHighTreshold1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueHighTreshold1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueHighTreshold1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHighThreshold;
    private javax.swing.JLabel LabelHighThreshold1;
    private javax.swing.JLabel LabelLowThreshold;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelHighMean;
    private javax.swing.JLabel labelHighMean1;
    private javax.swing.JLabel labelLowMean;
    private javax.swing.JLabel labelMean;
    private javax.swing.JLabel labelMean1;
    private javax.swing.JLabel labelSd;
    private javax.swing.JLabel labelSd1;
    private javax.swing.JLabel labelSdHigh;
    private javax.swing.JLabel labelSdHigh1;
    private javax.swing.JLabel labelSdLow;
    private javax.swing.JPanel panelDualThreshold;
    private javax.swing.JPanel panelSingleThreshold;
    private javax.swing.JLabel parameterTypeLabel;
    private javax.swing.JLabel parameterTypeLabel1;
    private javax.swing.JComboBox<String> parameterTypeValue;
    private javax.swing.JComboBox<String> parameterTypeValue1;
    private javax.swing.JTextField valueHighTreshold;
    private javax.swing.JTextField valueHighTreshold1;
    private javax.swing.JTextField valueLowThreshold;
    private javax.swing.JTextField valueMean;
    private javax.swing.JTextField valueMean1;
    private javax.swing.JTextField valueMeanHigh;
    private javax.swing.JTextField valueMeanHigh1;
    private javax.swing.JTextField valueMeanLow;
    private javax.swing.JTextField valueSd;
    private javax.swing.JTextField valueSd1;
    private javax.swing.JTextField valueSdHigh;
    private javax.swing.JTextField valueSdHigh1;
    private javax.swing.JTextField valueSdLow;
    // End of variables declaration//GEN-END:variables
}
