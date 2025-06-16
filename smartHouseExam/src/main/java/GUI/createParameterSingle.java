package GUI;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import Sensors.Sensor;
import Sensors.factories.DualFactories;
import Sensors.factories.SingleFactories;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class createParameterSingle extends javax.swing.JFrame {

    EngineeringSystem system;
    Sensor sensor;

    public createParameterSingle(EngineeringSystem system) {
        initComponents();
        initComboBoxes();
        this.system = system;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        endButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create1ActionPerformed(evt);
            }
        });

        valueSdHigh1.setFont(new java.awt.Font("Geoform", 0, 16)); // NOI18N

        endButton1.setFont(new java.awt.Font("Geoform", 0, 14)); // NOI18N
        endButton1.setText("Закончить создание");
        endButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSingleThresholdLayout = new javax.swing.GroupLayout(panelSingleThreshold);
        panelSingleThreshold.setLayout(panelSingleThresholdLayout);
        panelSingleThresholdLayout.setHorizontalGroup(
            panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSingleThresholdLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(create1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(endButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
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
                                .addComponent(valueHighTreshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelSingleThresholdLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Title1)))
                .addContainerGap(85, Short.MAX_VALUE))
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
                .addGroup(panelSingleThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSingleThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSingleThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create1ActionPerformed
        SystemParameter parameter = createSingleThresholdParameter();
        if (parameter != null) {
            this.system.addParameter(whichType(), parameter);
            this.system.addSensor(sensor);
            JOptionPane.showMessageDialog(this,
                    "Параметр добавлен",
                    "Успех",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_create1ActionPerformed

    private void endButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_endButton1ActionPerformed

    private void initComboBoxes() {
        ParametersTypes[] types = ParametersTypes.values();
        String[] formattedTypes = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            String typeName = types[i].toString();
            formattedTypes[i] = typeName.substring(0, 1).toUpperCase()
                    + typeName.substring(1).toLowerCase();
        }
        parameterTypeValue1.setModel(new DefaultComboBoxModel<>(formattedTypes));
    }

    private SystemParameter createSingleThresholdParameter() {
        try {
            double threshold = Double.parseDouble(valueHighTreshold1.getText());
            double mean = Double.parseDouble(valueMean1.getText());
            double sd = Double.parseDouble(valueSd1.getText());
            double abnormalMean = Double.parseDouble(valueMeanHigh1.getText());
            double abnormalSd = Double.parseDouble(valueSdHigh1.getText());

            if (!isPositive(threshold) || !isPositive(mean) || !isPositive(sd)
                    || !isPositive(abnormalMean) || !isPositive(abnormalSd)) {
                JOptionPane.showMessageDialog(this,
                        "Все значения должны быть положительными числами",
                        "Ошибка ввода",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }
            this.sensor = SingleFactories.createSensor(whichType(), threshold);
            return new SystemParameter(mean, sd, abnormalMean, abnormalSd);
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
        String selectedType = parameterTypeValue1.getSelectedItem().toString();
        return ParametersTypes.valueOf(selectedType.toUpperCase());
    }

    private void clearFields() {
        valueMean1.setText("");
        valueSd1.setText("");
        valueMeanHigh1.setText("");
        valueSdHigh1.setText("");
        valueHighTreshold1.setText("");
        parameterTypeValue1.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHighThreshold1;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton create1;
    private javax.swing.JButton endButton1;
    private javax.swing.JLabel labelHighMean1;
    private javax.swing.JLabel labelMean1;
    private javax.swing.JLabel labelSd1;
    private javax.swing.JLabel labelSdHigh1;
    private javax.swing.JPanel panelSingleThreshold;
    private javax.swing.JLabel parameterTypeLabel1;
    private javax.swing.JComboBox<String> parameterTypeValue1;
    private javax.swing.JTextField valueHighTreshold1;
    private javax.swing.JTextField valueMean1;
    private javax.swing.JTextField valueMeanHigh1;
    private javax.swing.JTextField valueSd1;
    private javax.swing.JTextField valueSdHigh1;
    // End of variables declaration//GEN-END:variables
}
