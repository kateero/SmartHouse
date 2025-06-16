package GUI;

import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.Sensor;
import Sensors.factories.DualFactories;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class createParameterDual extends javax.swing.JFrame {

    EngineeringSystem system;
    Sensor sensor;

    public createParameterDual(EngineeringSystem system) {
        initComponents();
        initComboBoxes();
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
        endButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDualThreshold.setBackground(new java.awt.Color(237, 237, 233));

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

        create.setBackground(new java.awt.Color(227, 213, 202));
        create.setFont(new java.awt.Font("Geoform", 0, 14)); // NOI18N
        create.setText("Добавить параметр");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        endButton.setBackground(new java.awt.Color(227, 213, 202));
        endButton.setFont(new java.awt.Font("Geoform", 0, 14)); // NOI18N
        endButton.setText("Завершить создание");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
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
                                            .addComponent(valueSdLow)))))
                            .addGroup(panelDualThresholdLayout.createSequentialGroup()
                                .addComponent(parameterTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parameterTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDualThresholdLayout.createSequentialGroup()
                                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))))
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
                .addGap(18, 18, 18)
                .addGroup(panelDualThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDualThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDualThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        SystemParameter parameter = createDualThresholdParameter();
        if (parameter != null) {
            this.system.addParameter(whichType(), parameter);
            this.system.addSensor(sensor);
            JOptionPane.showMessageDialog(this,
                    "Параметр добавлен",
                    "Успех",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_createActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_endButtonActionPerformed

    private void initComboBoxes() {
        ParametersTypes[] types = ParametersTypes.values();
        String[] formattedTypes = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            String typeName = types[i].toString();
            formattedTypes[i] = typeName.substring(0, 1).toUpperCase()
                    + typeName.substring(1).toLowerCase();
        }

        parameterTypeValue.setModel(new DefaultComboBoxModel<>(formattedTypes));
    }

    private SystemParameter createDualThresholdParameter() {
        try {
            double highThreshold = Double.parseDouble(valueHighTreshold.getText());
            double lowThreshold = Double.parseDouble(valueLowThreshold.getText());
            double mean = Double.parseDouble(valueMean.getText());
            double sd = Double.parseDouble(valueSd.getText());
            double abnormalHighMean = Double.parseDouble(valueMeanHigh.getText());
            double abnormalHighSd = Double.parseDouble(valueSdHigh.getText());
            double abnormalLowMean = Double.parseDouble(valueMeanLow.getText());
            double abnormalLowSd = Double.parseDouble(valueSdLow.getText());

            if (!isPositive(highThreshold) || !isPositive(lowThreshold)
                    || !isPositive(mean) || !isPositive(sd)
                    || !isPositive(abnormalHighMean) || !isPositive(abnormalHighSd)
                    || !isPositive(abnormalLowMean) || !isPositive(abnormalLowSd)) {
                JOptionPane.showMessageDialog(this,
                        "Все значения должны быть положительными числами",
                        "Ошибка ввода",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }
            this.sensor = DualFactories.createSensor(whichType(), lowThreshold, highThreshold);
            return new DualSystemParameter(mean, sd, abnormalLowMean, abnormalLowSd, abnormalHighMean, abnormalHighSd);
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

    private ParametersTypes whichType() {
        String selectedType = parameterTypeValue.getSelectedItem().toString();
        return ParametersTypes.valueOf(selectedType.toUpperCase());
    }

    private void clearFields() {
        valueMean.setText("");
        valueSd.setText("");
        valueMeanHigh.setText("");
        valueSdHigh.setText("");
        valueMeanLow.setText("");
        valueSdLow.setText("");
        valueHighTreshold.setText("");
        valueLowThreshold.setText("");
        parameterTypeValue.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHighThreshold;
    private javax.swing.JLabel LabelLowThreshold;
    private javax.swing.JLabel Title;
    private javax.swing.JButton create;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel labelHighMean;
    private javax.swing.JLabel labelLowMean;
    private javax.swing.JLabel labelMean;
    private javax.swing.JLabel labelSd;
    private javax.swing.JLabel labelSdHigh;
    private javax.swing.JLabel labelSdLow;
    private javax.swing.JPanel panelDualThreshold;
    private javax.swing.JLabel parameterTypeLabel;
    private javax.swing.JComboBox<String> parameterTypeValue;
    private javax.swing.JTextField valueHighTreshold;
    private javax.swing.JTextField valueLowThreshold;
    private javax.swing.JTextField valueMean;
    private javax.swing.JTextField valueMeanHigh;
    private javax.swing.JTextField valueMeanLow;
    private javax.swing.JTextField valueSd;
    private javax.swing.JTextField valueSdHigh;
    private javax.swing.JTextField valueSdLow;
    // End of variables declaration//GEN-END:variables
}
