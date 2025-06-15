package GUI;

import EngineeringSystems.EngineeringSystem;
import Sensors.Sensor;
import SmartHouse.SmartHouse;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class GalaFrame extends javax.swing.JFrame {

    private SmartHouse house;
    private CustomTreeCellRenderer renderer;

    public GalaFrame() {
        this.house = new SmartHouse();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        getDataButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SystemsTree = new javax.swing.JTree(createTree());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getDataButton.setText("Получить данные");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(SystemsTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(getDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataButtonActionPerformed
        this.house.updateSystems();
    }//GEN-LAST:event_getDataButtonActionPerformed

    private DefaultMutableTreeNode createTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("SmartHouse");
        ArrayList<EngineeringSystem> systems = house.getSystems();

        for (EngineeringSystem system : systems) {
            DefaultMutableTreeNode systemNode = new DefaultMutableTreeNode(system.getName());
            ArrayList<Sensor> sensors = system.getSensors();
            for (Sensor sensor : sensors) {
                DefaultMutableTreeNode sensorNode = new DefaultMutableTreeNode(sensor.getName());
                systemNode.add(sensorNode);
            }
            root.add(systemNode);
        }
        return root;
    }

    public void highlightSensorAndSystem(Sensor targetSensor) {
        DefaultTreeModel model = (DefaultTreeModel) SystemsTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode systemNode = (DefaultMutableTreeNode) root.getChildAt(i);
            String systemName = (String) systemNode.getUserObject();

            for (int j = 0; j < systemNode.getChildCount(); j++) {
                DefaultMutableTreeNode sensorNode = (DefaultMutableTreeNode) systemNode.getChildAt(j);
                if (sensorNode.equals(targetSensor.getName())) {
                    renderer.setNodeRed(systemNode);
                    renderer.setNodeRed(sensorNode);
                    SystemsTree.repaint();
                    return;
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree SystemsTree;
    private javax.swing.JButton getDataButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
