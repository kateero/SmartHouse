package GUI;

import EngineeringSystems.EngineeringSystem;
import Sensors.Sensor;
import SmartHouse.LogExcel;
import SmartHouse.SensorsStateMonitor;
import SmartHouse.SmartHouse;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class GalaFrame extends javax.swing.JFrame {

    private SmartHouse house;
    private CustomTreeCellRenderer renderer;
    private SensorsStateMonitor monitoring;
    private LogExcel logging;

    public GalaFrame(SmartHouse smartHouse) {
        super("Мониторинг умного дома");
        this.house = smartHouse;
        this.renderer = new CustomTreeCellRenderer();
        this.monitoring = new SensorsStateMonitor(this);
        this.logging = new LogExcel();
        this.logging.createExcel(house);
        initComponents();
        SystemsTree.setCellRenderer(renderer);
        monitoring.registerSystem(house.getSystems());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        getDataButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SystemsTree = new javax.swing.JTree(createTree());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(214, 204, 194));

        getDataButton.setBackground(new java.awt.Color(245, 235, 224));
        getDataButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getDataButton.setText("Получить данные");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        SystemsTree.setBackground(new java.awt.Color(237, 237, 233));
        SystemsTree.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        SystemsTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SystemsTree.setDragEnabled(true);
        jScrollPane1.setViewportView(SystemsTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(getDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataButtonActionPerformed
        this.house.updateSystems();
        this.logging.writeLog(house);
    }//GEN-LAST:event_getDataButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       this.logging.close();
    }//GEN-LAST:event_formWindowClosed

    private DefaultMutableTreeNode createTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Home Assistant");
        ArrayList<EngineeringSystem> systems = house.getSystems();

        for (EngineeringSystem system : systems) {
            DefaultMutableTreeNode systemNode = new DefaultMutableTreeNode(system);
            ArrayList<Sensor> sensors = system.getSensors();
            for (Sensor sensor : sensors) {
                DefaultMutableTreeNode sensorNode = new DefaultMutableTreeNode(sensor);
                systemNode.add(sensorNode);
            }
            root.add(systemNode);
        }
        return root;
    }

    public void highlightSensorAndSystem(Sensor targetSensor) {
        DefaultMutableTreeNode systemNode = findParentSystem(targetSensor);

        for (int j = 0; j < systemNode.getChildCount(); j++) {
            DefaultMutableTreeNode sensorNode = (DefaultMutableTreeNode) systemNode.getChildAt(j);
            if (((Sensor) sensorNode.getUserObject()).equals(targetSensor)) {
                renderer.setNodeRed(systemNode);
                renderer.setNodeRed(sensorNode);
                SystemsTree.repaint();
                alarmMessage(targetSensor, (EngineeringSystem) systemNode.getUserObject());
                return;
            }
        }
    }

    private void alarmMessage(Sensor sensor, EngineeringSystem system) {
        String message = String.format("%s - проверьте систему !!!\n %s зафиксировал недопустимое значение: %.3f %s",
                system.getName(),
                sensor.getName(),
                sensor.getCurrentValue(),
                sensor.getUnit());
        JOptionPane.showMessageDialog(null, message, "Регистрация неполадок", JOptionPane.ERROR_MESSAGE);
    }

    public void sensorBroke(Sensor targetSensor) {
        EngineeringSystem system = (EngineeringSystem) findParentSystem(targetSensor).getUserObject();
        warningMessage(targetSensor, system);
    }

    public DefaultMutableTreeNode findParentSystem(Sensor targetSensor) {
        DefaultTreeModel model = (DefaultTreeModel) SystemsTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode systemNode = (DefaultMutableTreeNode) root.getChildAt(i);

            for (int j = 0; j < systemNode.getChildCount(); j++) {
                DefaultMutableTreeNode sensorNode = (DefaultMutableTreeNode) systemNode.getChildAt(j);
                if (((Sensor) sensorNode.getUserObject()).equals(targetSensor)) {
                    return systemNode;
                }
            }
        }
        return null;
    }

    private void warningMessage(Sensor sensor, EngineeringSystem system) {
        String message = String.format("%s - проверьте систему !!!\n %s сломался",
                system.getName(),
                sensor.getName());
        JOptionPane.showMessageDialog(null, message, "Поломка датчика", JOptionPane.WARNING_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree SystemsTree;
    private javax.swing.JButton getDataButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
