package GUI;

import EngineeringSystems.ConcreteSystems.*;
import SmartHouse.SmartHouse;

public class CreateSystem extends javax.swing.JFrame {

    SmartHouse house;

    public CreateSystem() {
        this.house = new SmartHouse();
        initComponents();
    }

    public SmartHouse getHouse() {
        return house;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        labelQuantity = new javax.swing.JLabel();
        ComboBoxExisting = new javax.swing.JComboBox<>();
        quantityValue = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        nameSystemValue = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        LabelOR = new javax.swing.JLabel();
        thresholdCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 235, 224));

        Title.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        Title.setText("Создайте свой умный дом");

        labelQuantity.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelQuantity.setText("Добавлено систем:");

        ComboBoxExisting.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        ComboBoxExisting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Кондиционер", "Котел", "Газопровод", "Отопление", "Насосная станция", "Трансформатор" }));

        quantityValue.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        quantityValue.setText("0");

        buttonAdd.setBackground(new java.awt.Color(227, 213, 202));
        buttonAdd.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        buttonAdd.setText("Добавить");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(213, 189, 175));
        startButton.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        startButton.setText("Начать пользоваться");

        nameSystemValue.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        nameSystemValue.setText("Имя новой системы");

        buttonCreate.setBackground(new java.awt.Color(227, 213, 202));
        buttonCreate.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        buttonCreate.setText("Создать");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        LabelOR.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LabelOR.setText("ИЛИ");

        thresholdCombobox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        thresholdCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 порог", "2 порога"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(quantityValue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameSystemValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(ComboBoxExisting, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(thresholdCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 57, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(LabelOR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Title)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantity)
                    .addComponent(quantityValue))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxExisting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(LabelOR)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSystemValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thresholdCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        switch(ComboBoxExisting.getSelectedItem().toString()){
            case "Кондиционер" -> this.house.addSystem(new AirConditioner());
            case "Котел" -> this.house.addSystem(new Boiler());
            case "Газопровод" -> this.house.addSystem(new GasPipeline());
            case "Отопление" -> this.house.addSystem(new HeatingSystem());
            case "Насосная станция" -> this.house.addSystem(new PumpStation());
            case "Трансформатор" -> this.house.addSystem(new Transformer());
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed

    }//GEN-LAST:event_buttonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxExisting;
    private javax.swing.JLabel LabelOR;
    private javax.swing.JLabel Title;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JTextField nameSystemValue;
    private javax.swing.JLabel quantityValue;
    private javax.swing.JButton startButton;
    private javax.swing.JComboBox<String> thresholdCombobox;
    // End of variables declaration//GEN-END:variables
}
