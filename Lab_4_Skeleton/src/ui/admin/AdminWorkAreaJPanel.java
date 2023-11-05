/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package ui.admin;

import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.LoginScreen;

/**
 *
 * @author  Rushabh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    SupplierDirectory supplierDirectory;

    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel mainWorkArea, SupplierDirectory supplierDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.supplierDirectory = supplierDirectory;

        lblWelcome.setText("Welcome to Lab 4!");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnManageSuppliers = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        workArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnManageSuppliers.setText("Manage Suppliers");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(btnManageSuppliers)
                .addGap(19, 19, 19)
                .addComponent(btnLogOut)
                .addGap(46, 46, 46))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSuppliers)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        // TODO add your handling code here:
        ManageSuppliers panel = new ManageSuppliers(workArea,supplierDirectory);
        workArea.add("ManageSupplistAdministrative",panel);
        CardLayout layout = (CardLayout)
 workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);

        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length-1];
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateSupplierCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);


    }//GEN-LAST:event_btnLogOutActionPerformed

    @Override
    public String toString(){
        return "Administrator";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

}
