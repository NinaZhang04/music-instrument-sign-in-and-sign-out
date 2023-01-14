
/*
 * Author: Core Inc (Kyle, Helen, Nina)
 * Class: ICS4U
 * Program: edit instrument screen
 * Description: Screen to edit instruments in the system
 */
package music.checkinout.assignment;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kyle
 */
public class EditInstrumentScreen extends javax.swing.JPanel {

    /**
     * Creates new form EditInstrumentScreen
     */
    public EditInstrumentScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newNameField = new javax.swing.JTextField();
        originalIDField = new javax.swing.JTextField();
        newIDField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 246, 224));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("Edit Instruments");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("New Instrument Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Original Instrument ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("New Equipment ID:");

        newNameField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        originalIDField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        newIDField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        editButton.setBackground(new java.awt.Color(18, 69, 89));
        editButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(72, 72, 72)
                                            .addComponent(jLabel5))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(516, 516, 516)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(originalIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(437, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newIDField, newNameField, originalIDField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(originalIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Instrument[] instrumentList = Utilities.loadInstrumentFile(statusLabel);
        boolean exist = false;
        if(!originalIDField.getText().equals("")){
        //check if id is integer
        int originalID = -1;
        try {
            originalID = Integer.parseInt(originalIDField.getText());
        } catch (NumberFormatException ex) {
            statusLabel.setForeground(Color.red);
            statusLabel.setText("Original ID entered must be integer");
            return;
        }
        //check if id exists
        for (int i = 0; i <= instrumentList.length - 1; i++) {
            if (instrumentList[i].getNumber() == originalID) {
                exist = true;
                break;
            } else {
                exist = false;
            }
        }
        
        //run cases
        if (exist == true) {
            //exist but no inputs
            if (newIDField.getText().equals("") && newNameField.getText().equals("")) {
                statusLabel.setForeground(Color.red);
                statusLabel.setText("Atleast one field has to have an input");
            }
            //new id input + no name input
            else if (!newIDField.getText().equals("") && newNameField.getText().equals("")) {
                //check if id is integer
                int newID = -1;
                try {
                    newID = Integer.parseInt(newIDField.getText());
                } catch (NumberFormatException ex) {
                    statusLabel.setForeground(Color.red);
                    statusLabel.setText("New ID entered must be integer");
                    return;
                }
                
                //check if id exists already
                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getNumber() == newID) {
                        statusLabel.setForeground(Color.red);
                        statusLabel.setText("Instrument with same ID already exists!");
                        return;
                    }
                }

                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getNumber() == originalID) {
                        instrumentList[i].setNumber(newID);
                        statusLabel.setForeground(Color.green);
                        statusLabel.setText("Instrument ID change successful!");
                    }
                }
                //write to file
                Utilities.writeInstrumentFile(instrumentList, statusLabel);

            }

            //no id input and new name input
            else if (newIDField.getText().equals("") && !newNameField.getText().equals("")) {
                //check if name exists already
                String newName = newNameField.getText();
                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getName().equals(newName)) {
                        statusLabel.setForeground(Color.red);
                        statusLabel.setText("Instrument with same name already exists!");
                        return;
                    }
                }
                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getNumber() == originalID) {
                        instrumentList[i].setName(newName);
                        statusLabel.setForeground(Color.green);
                        statusLabel.setText("Instrument name change successful!");
                    }
                }
                //write to file
                Utilities.writeInstrumentFile(instrumentList, statusLabel);
            }

            //new id input and new name input
            else if (!newIDField.getText().equals("") && !newNameField.getText().equals("")) {
                //check if name exists already
                String newName = newNameField.getText();
                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getName().equals(newName)) {
                        statusLabel.setForeground(Color.red);
                        statusLabel.setText("Instrument with same name already exists!");
                        return;
                    }
                }
                //check if id is integer
                int newID = -1;
                try {
                    newID = Integer.parseInt(newIDField.getText());
                } catch (NumberFormatException ex) {
                    statusLabel.setForeground(Color.red);
                    statusLabel.setText("New ID entered must be integer");
                    return;
                }
                //check if id exists already
                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getNumber() == newID) {
                        statusLabel.setForeground(Color.red);
                        statusLabel.setText("Instrument with same ID already exists!");
                        return;
                    }
                }

                for (int i = 0; i <= instrumentList.length - 1; i++) {
                    if (instrumentList[i].getNumber() == originalID) {
                        instrumentList[i].setName(newName);
                        instrumentList[i].setNumber(newID);
                        statusLabel.setForeground(Color.green);
                        statusLabel.setText("Instrument name and ID change successful!");
                    }
                }
                //write to file
                Utilities.writeInstrumentFile(instrumentList, statusLabel);

            }
        }//if id doesnt exist
        else {
            statusLabel.setForeground(Color.red);
            statusLabel.setText("ID you are trying to edit doesn't exist");
        }
        }
        else{
            statusLabel.setForeground(Color.red);
            statusLabel.setText("Original ID must be inputted to edit");
        }
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField newIDField;
    private javax.swing.JTextField newNameField;
    private javax.swing.JTextField originalIDField;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
