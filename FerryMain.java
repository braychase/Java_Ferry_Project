package ferry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Assignment 4 - Ferry
 */
public class FerryMain extends javax.swing.JFrame {

    Ferry ferry = null;
    ArrayList<String> rejections = new ArrayList<>();

    /**
     * Creates new form Assignment4MainForm
     */
    public FerryMain() {
        initComponents();
        //getClass().getClassLoader().
        URL url = getClass().getClassLoader().getResource("assignment4/passengersAndVehicles.csv");
        System.out.println(getClass().getClassLoader().getClass());
        System.out.println("It is " + url);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFerryName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassengerLimit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNormalVehicleLimit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLargeVehicleLimit = new javax.swing.JTextField();
        btnCreateFerry = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRejectionsFile = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnShowPassengers = new javax.swing.JButton();
        btnShowNormalVehicles = new javax.swing.JButton();
        btnShowLargeVehicles = new javax.swing.JButton();
        btnShowRejections = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assignment 3 - Ferry");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ferry Status"));

        txtStatus.setColumns(20);
        txtStatus.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txtStatus.setRows(5);
        jScrollPane1.setViewportView(txtStatus);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Setup"));

        jLabel2.setText("Ferry Name:");

        txtFerryName.setText("Island Hopper");

        jLabel3.setText("Passenger Spaces:");

        txtPassengerLimit.setText("90");

        jLabel4.setText("Normal-Size Vehicle Spaces:");

        txtNormalVehicleLimit.setText("20");

        jLabel5.setText("Large-Size Vehicle Spaces:");

        txtLargeVehicleLimit.setText("5");

        btnCreateFerry.setMnemonic('C');
        btnCreateFerry.setText("Create Ferry");
        btnCreateFerry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFerryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFerryName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassengerLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLargeVehicleLimit)
                            .addComponent(txtNormalVehicleLimit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateFerry)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFerryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNormalVehicleLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassengerLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtLargeVehicleLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateFerry))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Files"));

        jLabel1.setText("Waiting List:");

        txtFile.setText("passengersAndVehicles.csv");

        btnLoad.setMnemonic('L');
        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel6.setText("Rejections:");

        txtRejectionsFile.setText("rejections.txt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLoad)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRejectionsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRejectionsFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoad))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        btnShowPassengers.setMnemonic('P');
        btnShowPassengers.setText("Show Passengers");
        btnShowPassengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPassengersActionPerformed(evt);
            }
        });

        btnShowNormalVehicles.setMnemonic('N');
        btnShowNormalVehicles.setText("Show Normal Vehicles");
        btnShowNormalVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNormalVehiclesActionPerformed(evt);
            }
        });

        btnShowLargeVehicles.setMnemonic('R');
        btnShowLargeVehicles.setText("Show Large Vehicles");
        btnShowLargeVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowLargeVehiclesActionPerformed(evt);
            }
        });

        btnShowRejections.setMnemonic('R');
        btnShowRejections.setText("Show Rejections");
        btnShowRejections.setToolTipText("");
        btnShowRejections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRejectionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnShowPassengers)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowNormalVehicles)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowLargeVehicles)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowRejections)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnShowLargeVehicles, btnShowNormalVehicles, btnShowPassengers, btnShowRejections});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowPassengers)
                    .addComponent(btnShowNormalVehicles)
                    .addComponent(btnShowLargeVehicles)
                    .addComponent(btnShowRejections))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        // *** DO NOT MODIFY THIS METHOD ***//
        if (ferry == null) {
            txtStatus.setText("Please create the ferry first ...");
            return;
        }

        String fileName = txtFile.getText();
        loadFerry(fileName);
        txtStatus.setText(ferry.reportStatus());

        //** DO NOT MODIFY THIS METHOD ***//

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnCreateFerryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFerryActionPerformed

        // *** DO NOT MODIFY THIS METHOD ***//
        try {
            String name = txtFerryName.getText();
            int passengerLimit = Integer.parseInt(txtPassengerLimit.getText());
            int normalVehicleLimit = Integer.parseInt(txtNormalVehicleLimit.getText());
            int largeVehicleLimit = Integer.parseInt(txtLargeVehicleLimit.getText());

            ferry = new Ferry(name, passengerLimit, normalVehicleLimit, largeVehicleLimit);
            txtStatus.setText(ferry.reportStatus());
        } catch (Exception ex) {
            txtStatus.setText("Oops - there was a problem :(");
        }

        // *** DO NOT MODIFY THIS METHOD ***//        

    }//GEN-LAST:event_btnCreateFerryActionPerformed

    private void btnShowPassengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPassengersActionPerformed

        // TODO-C1: YOUR CODE HERE
        txtOutput.setText("Passengers\n\n");
        for (Passenger p : ferry.getPassengers()) {
            String birthDate = p.getDateOfBirth().format();
            txtOutput.append("{ID: " + p.getId() + ", Date of Birth: " + birthDate + "}\n");
        }

    }//GEN-LAST:event_btnShowPassengersActionPerformed

    private void btnShowNormalVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNormalVehiclesActionPerformed

        // TODO-C2: YOUR CODE HERE
        txtOutput.setText("Normal Vehicles\n\n");
        for (Vehicle v : ferry.getNormalVehicles()) {
            String birthDate = v.getOwner().getDateOfBirth().format();
            txtOutput.append("Vehicle Size: " + v.getSize() + ", Weight: " + v.getWeight() + ", Owner: ");
            txtOutput.append("{ID: " + v.getOwner().getId() + ", Date of Birth: " + birthDate + "}\n");
        }
    }//GEN-LAST:event_btnShowNormalVehiclesActionPerformed

    private void btnShowLargeVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowLargeVehiclesActionPerformed

        // TODO-C3: YOUR CODE HERE
        txtOutput.setText("Large Vehicles\n\n");
        for (Vehicle v : ferry.getLargeVehicles()) {
            String birthDate = v.getOwner().getDateOfBirth().format();
            txtOutput.append("Vehicle Size: " + v.getSize() + ", Weight: " + v.getWeight() + ", Owner: ");
            txtOutput.append("{ID: " + v.getOwner().getId() + ", Date of Birth: " + birthDate + "}\n");
        }
    }//GEN-LAST:event_btnShowLargeVehiclesActionPerformed

    private void btnShowRejectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRejectionsActionPerformed

        // TODO-C4: YOUR CODE HERE
        txtOutput.setText("Rejection Report\n\n");
        for (String msg : rejections) {
            txtOutput.append(msg + "\n");
        }

    }//GEN-LAST:event_btnShowRejectionsActionPerformed

    /**
     * Loads the ferry with the passengers and vehicles contained in the
     * specified file.
     *
     * @param fileName the file containing the passenger and vehicle data.
     */
    private void loadFerry(String fileName) {

        // TODO-B3: YOUR CODE HERE   
        rejections.clear();
        
        // load CSV file, one line at a time
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                //2 parts == passenger only
                //4 parts == passenger & vehicle
                //attempt to load passenger/vehicle on the ferry
                //if you get an error from ferry.load()
                //save rejection mesages in ArrayList 'rejections'
                if (parts.length == 2) {
                    Passenger p = new Passenger(Integer.parseInt(parts[0]), SimpleDate.parseDMY(parts[1]));
                    String msg = ferry.loadPassenger(p);
                    if (msg.contains(Constants.ERROR)) {
                        rejections.add(msg);
                    }
                }
                else {
                    Passenger p = new Passenger(Integer.parseInt(parts[0]), SimpleDate.parseDMY(parts[1]));
                    Vehicle v = new Vehicle(p, parts[2], Integer.parseInt(parts[3]));
                    String msg = ferry.loadVehicle(v);
                    if (msg.contains(Constants.ERROR)) {
                        rejections.add(msg);
                    }
                }
            }
            
        } catch (FileNotFoundException ex) { 
            System.out.println("File not found: " + ex.getMessage());
        }
        
        // when done loading:
        //  write rejections to a TXT file
        writeAccountData("rejections.txt", rejections);
        //  display the NUMBER of rejection messages (txtOutput)
        txtOutput.append("Number of rejections: " + rejections.toArray().length + "\n"); 
        //  followed by the rejection messages
        for (String s : rejections) {
            txtOutput.append(s + "\n");
        }
        // scroll txtOutput to the top, so we can see the count & first message
        txtOutput.setCaretPosition(0);

    }
    private boolean writeAccountData(String fileName, ArrayList<String> list) {
        boolean result = true;
        PrintWriter writer = null;
        try {
            File f = new File(fileName);
            writer = new PrintWriter(f);
            
            for (String s : list) {
                writer.append(s + "\n");
            }
            
        } catch (FileNotFoundException ex) { 
            System.out.println("File not found: " + ex.getMessage());
            result = false;
        } finally {
            if (writer != null)
                writer.close();
        }
        return result;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FerryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FerryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FerryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FerryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FerryMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateFerry;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnShowLargeVehicles;
    private javax.swing.JButton btnShowNormalVehicles;
    private javax.swing.JButton btnShowPassengers;
    private javax.swing.JButton btnShowRejections;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtFerryName;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtLargeVehicleLimit;
    private javax.swing.JTextField txtNormalVehicleLimit;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPassengerLimit;
    private javax.swing.JTextField txtRejectionsFile;
    private javax.swing.JTextArea txtStatus;
    // End of variables declaration//GEN-END:variables
}
