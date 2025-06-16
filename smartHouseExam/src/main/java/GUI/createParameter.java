package GUI;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class createParameter extends javax.swing.JFrame {
    EngineeringSystem system;
   
    public createParameter(boolean isSingle, EngineeringSystem system) {
        if (isSingle) {
            this.getContentPane().add(panelSingleThreshold);
        } else {
            this.getContentPane().add(panelDualThreshold);
        }
        initComponents();
        this.system = system;
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
        create = new javax.swing.JButton();
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
        create1 = new javax.swing.JButton();
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

        labelSdLow.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdLow.setText("sd нештатное нижнее");

        valueSdHigh.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelHighMean.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelHighMean.setText("mean нештатное верхнее");

        valueMeanLow.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelSd.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSd.setText("sd штатное");

        valueSd.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelLowMean.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelLowMean.setText("mean нештатное нижнее");

        labelSdHigh.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdHigh.setText("sd нештатное верхнее");

        valueMeanHigh.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        valueSdLow.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        LabelHighThreshold.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelHighThreshold.setText("верхний порог");

        LabelLowThreshold.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelLowThreshold.setText("нижний порог");

        valueHighTreshold.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        valueLowThreshold.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        create.setFont(new java.awt.Font("Geoform", 0, 14)); // NOI18N
        create.setText("Добавить параметр");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
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
                                        .addComponent(valueHighTreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelHighMean))
                                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(LabelLowThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueLowThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
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
                                        .addGap(9, 9, 9)
                                        .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                .addComponent(parameterTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parameterTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDualThresholdLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Title)))
                .addGap(0, 29, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        labelHighMean1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelHighMean1.setText("mean нештатное верхнее");

        labelSd1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSd1.setText("sd штатное");

        valueSd1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        labelSdHigh1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        labelSdHigh1.setText("sd нештатное верхнее");

        valueMeanHigh1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        LabelHighThreshold1.setFont(new java.awt.Font("Geoform", 0, 18)); // NOI18N
        LabelHighThreshold1.setText("верхний порог");

        valueHighTreshold1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        create1.setFont(new java.awt.Font("Geoform", 0, 14)); // NOI18N
        create1.setText("Добавить параметр");

        valueSdHigh1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelSingleThresholdLayout = new javax.swing.GroupLayout(panelSingleThreshold);
        panelSingleThreshold.setLayout(panelSingleThresholdLayout);
        panelSingleThresholdLayout.setHorizontalGroup(
            panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(parameterTypeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parameterTypeValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMean1)
                                    .addComponent(labelSd1))
                                .addGap(18, 18, 18)
                                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valueSd1)
                                    .addComponent(valueMean1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(valueHighTreshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(create1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)))
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Title1)))
                .addContainerGap(210, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(create1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        
    }//GEN-LAST:event_createActionPerformed

    private void initComboBoxes() {
        ParametersTypes[] types = ParametersTypes.values();
        String[] formattedTypes = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            String typeName = types[i].toString();
            formattedTypes[i] = typeName.substring(0, 1).toUpperCase() + 
                              typeName.substring(1).toLowerCase();
        }

        parameterTypeValue.setModel(new DefaultComboBoxModel<>(formattedTypes));
        parameterTypeValue1.setModel(new DefaultComboBoxModel<>(formattedTypes));
    }

    
    public SystemParameter createParameter() {
        if (panelSingleThreshold.isVisible()) {
            return createSingleThresholdParameter();
        } else {
            return createDualThresholdParameter();
        }
    }

    private SystemParameter createSingleThresholdParameter() {
        try {
            String parameterType = parameterTypeValue1.getSelectedItem().toString();
            double threshold = Double.parseDouble(valueHighTreshold1.getText());
            double mean = Double.parseDouble(valueMean1.getText());
            double sd = Double.parseDouble(valueSd1.getText());
            double abnormalMean = Double.parseDouble(valueMeanHigh1.getText());
            double abnormalSd = Double.parseDouble(valueSdHigh1.getText());
            
            if (!isPositive(threshold) || !isPositive(mean) || !isPositive(sd) ||
                !isPositive(abnormalMean) || !isPositive(abnormalSd)) {
                JOptionPane.showMessageDialog(this, 
                    "Все значения должны быть положительными числами",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
                return null;
            }
            
            return new SystemParameter(mean, sd, abnormalMean, abnormalSd);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Пожалуйста, введите корректные числовые значения",
                "Ошибка ввода",
                JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private SystemParameter createDualThresholdParameter() {
        try {
            String parameterType = parameterTypeValue.getSelectedItem().toString();
            double highThreshold = Double.parseDouble(valueHighTreshold.getText());
            double lowThreshold = Double.parseDouble(valueLowThreshold.getText());
            double mean = Double.parseDouble(valueMean.getText());
            double sd = Double.parseDouble(valueSd.getText());
            double abnormalHighMean = Double.parseDouble(valueMeanHigh.getText());
            double abnormalHighSd = Double.parseDouble(valueSdHigh.getText());
            double abnormalLowMean = Double.parseDouble(valueMeanLow.getText());
            double abnormalLowSd = Double.parseDouble(valueSdLow.getText());
            
            if (!isPositive(highThreshold) || !isPositive(lowThreshold) || 
                !isPositive(mean) || !isPositive(sd) ||
                !isPositive(abnormalHighMean) || !isPositive(abnormalHighSd) ||
                !isPositive(abnormalLowMean) || !isPositive(abnormalLowSd)) {
                JOptionPane.showMessageDialog(this, 
                    "Все значения должны быть положительными числами",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
                return null;
            }
            
            return new DualSystemParameter(mean, sd, abnormalHighMean, abnormalHighSd, abnormalLowMean, abnormalLowSd);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Пожалуйста, введите корректные числовые значения",
                "Ошибка ввода",
                JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    private boolean isPositive(double value) {
        return value > 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHighThreshold;
    private javax.swing.JLabel LabelHighThreshold1;
    private javax.swing.JLabel LabelLowThreshold;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton create;
    private javax.swing.JButton create1;
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
