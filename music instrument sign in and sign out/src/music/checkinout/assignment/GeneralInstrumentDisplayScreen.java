
/*
 * Author: Core Inc (Kyle, Helen, Nina)
 * Class: ICS4U
 * Program: Gneral instrument display screen
 * Description: displays all instruments in the system
 */
package music.checkinout.assignment;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nina
 */
public class GeneralInstrumentDisplayScreen extends javax.swing.JPanel {

    /**
     * Creates new form InstrumentGeneralDisplayScreen
     */
    public GeneralInstrumentDisplayScreen() {
        initComponents();
        Color darkBlue = new Color(89, 131, 146);
        Font myFont = new Font("Monospaced", Font.BOLD, 18);
        //change the font of the column titles
        displayTable.getTableHeader().setFont(myFont);
        //load instrument, and intially showing every instrument
        loadInstrumentInfo(false);
    }
    
    public void loadInstrumentInfo(boolean checkBox){
        //the table needs two things: the 1-D array that contains the column names and the 2-D array that contains the data of the table
        String[] columnNames = {"Instrument Name","Instrument ID","Student ID","Checked In/Out","Latest check in/out date"};
        String[][] instrumentInfo = null;
        
        //if the checkbox is checked, only display the instruments that has status that is out
        if(checkBox){
            //read instruments from the text file
            Instrument[] instrumentList = Utilities.loadInstrumentFile(errorWarning);
            //if the list is not empty
            if(instrumentList != null){
                //variable that record how many instruments are checked out
                int outItemCount = 0;
                //go through the list and check each insrtument's status, if it is checked out increase 1 to the checked out instrument count
                for(int i = 0;i < instrumentList.length;i++){
                    if(instrumentList[i].getStatus() == true){
                        outItemCount++;
                    }
                }
                //initiate the instrument info list with the number of checked out item count as rows and 5 columns
                instrumentInfo = new String[outItemCount][5];
                
                //make checked out item variable 0 again, this time it tracks which row are we on for recording checked out instrument informatoin
                outItemCount = 0;
                
                //go through the instrument list again this time actually recording information of each intrument down
                //into a string list. Since we know that we are recording checked out instruments so the status can just directly stored as "out"
                for(int i = 0;i < instrumentList.length;i++){
                    if(instrumentList[i].getStatus() == true){
                        instrumentInfo[outItemCount][0] = instrumentList[i].getName();
                        instrumentInfo[outItemCount][1] = instrumentList[i].getNumber() + "";
                        instrumentInfo[outItemCount][2] = instrumentList[i].getStudentID() + "";
                        instrumentInfo[outItemCount][3] = "out";
                        instrumentInfo[outItemCount][4] = instrumentList[i].getDate();
                        outItemCount++;
                    }
                }
            }
            else{
                //in case somehow the instrument list end up being null, do nothing and give warning
                errorWarning.setText("The instrument file is not found or faulty");
            }
        }
        //if the checkbox is unchecked, display all the instruments
        else{
            //read in instruments from text file
            Instrument[] instrumentList = Utilities.loadInstrumentFile(errorWarning);
            //if the list is not empty
            if(instrumentList != null){
                //intialize the instrument info list and make it the size of the instrument list
                instrumentInfo = new String[instrumentList.length][5];
                for(int i = 0;i < instrumentList.length;i++){
                    //change the status from true and false into corresponding out and in status
                    String status = "";
                    if(instrumentList[i].getStatus() == true){
                       status = "out";
                    }
                    else{
                        status = "in";
                    }
                    //record all the information into the 2D array
                    instrumentInfo[i][0] = instrumentList[i].getName();
                    instrumentInfo[i][1] = instrumentList[i].getNumber() + "";
                    instrumentInfo[i][2] = instrumentList[i].getStudentID() + "";
                    instrumentInfo[i][3] = status;
                    instrumentInfo[i][4] = instrumentList[i].getDate();
                }
            }
            else{
                //in case somehow the instrument list end up being null, do nothing and give warning
                errorWarning.setText("The instrument file is not found or faulty");
            }
        }
        
        //this two lines of code fill out the table with the provided column titles and data
        DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        model.setDataVector(instrumentInfo,columnNames);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        errorMessage1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        BackButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        errorWarning = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showOutInstrumentBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(18, 69, 89));
        jPanel2.setForeground(new java.awt.Color(18, 69, 89));
        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanel3.setBackground(new java.awt.Color(239, 246, 224));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel5.setText("Instrument Display");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Search Results: ");

        errorMessage1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        BackButton.setBackground(new java.awt.Color(239, 246, 224));
        BackButton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BackButton.setForeground(new java.awt.Color(18, 69, 89));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        setBackground(new java.awt.Color(18, 69, 89));

        jPanel4.setBackground(new java.awt.Color(239, 246, 224));
        jPanel4.setPreferredSize(new java.awt.Dimension(1720, 800));

        errorWarning.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        errorWarning.setForeground(new java.awt.Color(250, 0, 0));
        errorWarning.setText(" ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setText("Instrument Display");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Results: ");

        showOutInstrumentBox.setBackground(new java.awt.Color(239, 246, 224));
        showOutInstrumentBox.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        showOutInstrumentBox.setText("Only show checked out instruments");
        showOutInstrumentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOutInstrumentBoxActionPerformed(evt);
            }
        });

        displayTable.setBackground(new java.awt.Color(250, 250, 250));
        displayTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displayTable.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        displayTable.setToolTipText("");
        displayTable.setCellSelectionEnabled(true);
        displayTable.setRequestFocusEnabled(false);
        displayTable.setRowHeight(25);
        jScrollPane1.setViewportView(displayTable);

        refreshButton.setBackground(new java.awt.Color(18, 69, 89));
        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(250, 250, 250));
        refreshButton.setText("Refresh page");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(showOutInstrumentBox, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(132, 132, 132))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showOutInstrumentBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(errorWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //it doesn't seem I can delete this button
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInOutFrame().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void showOutInstrumentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOutInstrumentBoxActionPerformed
        //if the person only wants to see the checked out instruments
        errorWarning.setText("     ");
        if(showOutInstrumentBox.isSelected()){
            loadInstrumentInfo(true);
        }
        //if the person wants to see all the instruments
        else{
            loadInstrumentInfo(false);
        }
    }//GEN-LAST:event_showOutInstrumentBoxActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        //this button just refresh instrument information
        //when actions are done in add/remove/edit instrumtent the information will not directly get reflected on the general instrument display screen
        //because it needs refrsh
        //presssing the check box works, but for the users that are not so good with computers, here is a refresh button for them.
        //default shows all instruments and set the checkbox back to unchecked state
        errorWarning.setText("    ");
        loadInstrumentInfo(false);
        showOutInstrumentBox.setSelected(false);
    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel errorMessage1;
    private javax.swing.JLabel errorWarning;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton refreshButton;
    private javax.swing.JCheckBox showOutInstrumentBox;
    // End of variables declaration//GEN-END:variables
}
