
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TravelManager extends javax.swing.JFrame {

    private double gross;
    private cFlight cost;
    private cCostTax iTax;
    private double subtotal;
    private FileWriter outFile = null;
    File file = new File("receipts.txt");
    BufferedWriter br = null;
    PrintWriter pr = null;

    public TravelManager() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        postCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        returnRB = new javax.swing.JRadioButton();
        Standard = new javax.swing.JRadioButton();
        Economy = new javax.swing.JRadioButton();
        firstClass = new javax.swing.JRadioButton();
        singleRB = new javax.swing.JRadioButton();
        specialNeeds = new javax.swing.JCheckBox();
        standardLabel = new javax.swing.JLabel();
        firstClassLabel = new javax.swing.JLabel();
        economyLabel = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        singleLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Destination1 = new javax.swing.JLabel();
        airportTax = new javax.swing.JCheckBox();
        exitLuggage = new javax.swing.JCheckBox();
        travellingInsurance = new javax.swing.JCheckBox();
        airMiles = new javax.swing.JCheckBox();
        accomodation = new javax.swing.JComboBox<>();
        departure = new javax.swing.JComboBox<>();
        Destination = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        specialNeedsLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        subTotalLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        specialNeedsBox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Receipt = new javax.swing.JButton();
        total = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Management System");
        setBackground(new java.awt.Color(255, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Travel Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 110));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setFont(new java.awt.Font("CMU Serif", 0, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        lastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel3.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Post Code");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        postCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(postCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telephone");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        telephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email Address");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 30));

        emailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        firstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 300));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("CMU Serif", 0, 12)); // NOI18N
        receipt.setRows(5);
        receipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(receipt);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 340));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Receipt");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, 350, 380));

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnRB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnRB.setText("Return");
        returnRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnRBActionPerformed(evt);
            }
        });
        jPanel5.add(returnRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        Standard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Standard.setText("Standard");
        Standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandardActionPerformed(evt);
            }
        });
        jPanel5.add(Standard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Economy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Economy.setText("Economy");
        Economy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EconomyActionPerformed(evt);
            }
        });
        jPanel5.add(Economy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        firstClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstClass.setText("First Class");
        firstClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstClassActionPerformed(evt);
            }
        });
        jPanel5.add(firstClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        singleRB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        singleRB.setText("Single ");
        singleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleRBActionPerformed(evt);
            }
        });
        jPanel5.add(singleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        specialNeeds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specialNeeds.setText("Special Needs ($50 additional)");
        specialNeeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialNeedsActionPerformed(evt);
            }
        });
        jPanel5.add(specialNeeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        standardLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        standardLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        standardLabel.setText("0.00");
        standardLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(standardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, -1));

        firstClassLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstClassLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstClassLabel.setText("0.00");
        firstClassLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(firstClassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 20));

        economyLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        economyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        economyLabel.setText("0.00");
        economyLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(economyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 20));

        returnLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        returnLabel.setText("0.00");
        returnLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(returnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 20));

        singleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        singleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        singleLabel.setText("0.00");
        singleLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(singleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 580, 180));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Accomodation");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        Destination1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Destination1.setText("Destination");
        jPanel6.add(Destination1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        airportTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airportTax.setText("Airport Tax");
        airportTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportTaxActionPerformed(evt);
            }
        });
        jPanel6.add(airportTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        exitLuggage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitLuggage.setText("Exit Luggage");
        jPanel6.add(exitLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        travellingInsurance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        travellingInsurance.setText("Travelling Insurance");
        jPanel6.add(travellingInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        airMiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airMiles.setText("Air Miles over 20000");
        jPanel6.add(airMiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        accomodation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accomodation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Islamabad Airport", "Jinnah International Airport", "Alllama Iqbal Airport" }));
        jPanel6.add(accomodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 240, -1));

        departure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        departure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "CPW Airport", "Oslo Airport", "Nairobi Airport", "MM Airport" }));
        departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureActionPerformed(evt);
            }
        });
        jPanel6.add(departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 240, -1));

        Destination.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Canada - 7 Days in Toronto", "Canada - 7 Days in Ottawa", "Norway - 7 Days in Oslo", "Nigeria - 5 Days in Lagos", "USA - 5 Days in Dallas Fort Worth", "UK - 7 Days in London", "UK - 7 Days in Wales", "France - 7 Days in Paris", "Kenya - 7 Days in Nairobi", "Ghana - 7 Days in Acora", "South Africa - 7 Days in Cape Town", "Ireland - 7 Days in Dublin" }));
        Destination.setEnabled(false);
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });
        jPanel6.add(Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Departure");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 480, 220));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        specialNeedsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specialNeedsLabel.setText("Special Needs");
        jPanel7.add(specialNeedsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Sub Total");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        taxLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        taxLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.add(taxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, 20));

        subTotalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subTotalLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.add(subTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 20));

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Tax");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 20));

        specialNeedsBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specialNeedsBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.add(specialNeedsBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 400, 150));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        Receipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Receipt.setText("Receipt");
        Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptActionPerformed(evt);
            }
        });
        jPanel2.add(Receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 770, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xeros-logo-512x512.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 80, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void singleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleRBActionPerformed
        if (!singleRB.isSelected()) {
            singleLabel.setText(null);
        } else {
            String sing = String.format("$%.2f", gross);
            singleLabel.setText(sing);
            returnRB.setSelected(false);
            returnLabel.setText(null);
        }
    }//GEN-LAST:event_singleRBActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        cQuit cExit = new cQuit();
        cExit.quit();
    }//GEN-LAST:event_ExitActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        iTax = new cCostTax();
        double iTaxes;
        double total = 0.0;
        if (returnRB.isSelected()) {
            subtotal = gross * 2;
            String costs = String.format("%.2f", subtotal);
            subTotalLabel.setText(costs);
            iTaxes = iTax.cFindTax(subtotal);
            String tax = String.format("%.2f", iTaxes);
            taxLabel.setText(tax);
            if (specialNeeds.isSelected()) {
                total = subtotal + iTaxes + 50.00;
                specialNeedsBox.setText("50.00");
            }
            if (specialNeeds.isSelected() == false) {
                specialNeedsBox.setText("0.00");
                total = subtotal + iTaxes;
            }
            String Total = String.format("%.2f", total);
            totalLabel.setText(Total);
        } else {
            subtotal = gross;
            String costs = String.format("%.2f", subtotal);
            subTotalLabel.setText(costs);
            iTaxes = iTax.cFindTax(subtotal);
            String tax = String.format("%.2f", iTaxes);
            taxLabel.setText(tax);
            if (specialNeeds.isSelected()) {
                total = subtotal + iTaxes + 50.00;
                specialNeedsBox.setText("50.00");
            }
            if (specialNeeds.isSelected() == false) {
                specialNeedsBox.setText("0.00");
                total = subtotal + iTaxes;
            }
            String Total = String.format("%.2f", total);
            totalLabel.setText(Total);
        }
    }//GEN-LAST:event_totalActionPerformed

    private void departureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureActionPerformed

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationActionPerformed
        cost = new cFlight();
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Toronto") && Standard.isSelected()) {
            gross = cost.Canada_T;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Ottawa") && Standard.isSelected()) {
            gross = cost.Canada_O;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Norway - 7 Days in Oslo") && Standard.isSelected()) {
            gross = cost.Norway;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Nigeria - 5 Days in Lagos") && Standard.isSelected()) {
            gross = cost.Nigeria;
            String Cost = String.format("$%.2f", gross);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("USA - 5 Days in Dallas Fort Worth") && Standard.isSelected()) {
            gross = cost.USA_D;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in London") && Standard.isSelected()) {
            gross = cost.UK_L;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in Wales") && Standard.isSelected()) {
            gross = cost.UK_W;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("France - 7 Days in Paris") && Standard.isSelected()) {
            gross = cost.France;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Kenya - 7 Days in Nairobi") && Standard.isSelected()) {
            gross = cost.Kenya;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ghana - 7 Days in Acora") && Standard.isSelected()) {
            gross = cost.Ghana;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("South Africa - 7 Days in Cape Town") && Standard.isSelected()) {
            gross = cost.SAfrica;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ireland - 7 Days in Dublin") && Standard.isSelected()) {
            gross = cost.Ireland;
            String Cost = String.format("$%.2f", gross);
            standardLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        //=================================================================================================================================================
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Toronto") && Economy.isSelected()) {
            gross = cost.Canada_T - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Ottawa") && Economy.isSelected()) {
            gross = cost.Canada_O - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Norway - 7 Days in Oslo") && Economy.isSelected()) {
            gross = cost.Norway - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Nigeria - 5 Days in Lagos") && Economy.isSelected()) {
            gross = cost.Nigeria - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("USA - 5 Days in Dallas Fort Worth") && Economy.isSelected()) {
            gross = cost.USA_D - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in London") && Economy.isSelected()) {
            gross = cost.UK_L - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in Wales") && Economy.isSelected()) {
            gross = cost.UK_W - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("France - 7 Days in Paris") && Economy.isSelected()) {
            gross = cost.France - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Kenya - 7 Days in Nairobi") && Economy.isSelected()) {
            gross = cost.Kenya - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ghana - 7 Days in Acora") && Economy.isSelected()) {
            gross = cost.Ghana - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("South Africa - 7 Days in Cape Town") && Economy.isSelected()) {
            gross = cost.SAfrica - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ireland - 7 Days in Dublin") && Economy.isSelected()) {
            gross = cost.Ireland - 50;
            String Cost = String.format("$%.2f", gross);
            economyLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        //=================================================================================================================================================
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Toronto") && firstClass.isSelected()) {
            gross = cost.Canada_T + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Canada - 7 Days in Ottawa") && firstClass.isSelected()) {
            gross = cost.Canada_O + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Norway - 7 Days in Oslo") && firstClass.isSelected()) {
            gross = cost.Norway + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Nigeria - 5 Days in Lagos") && firstClass.isSelected()) {
            gross = cost.Nigeria + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("USA - 5 Days in Dallas Fort Worth") && firstClass.isSelected()) {
            gross = cost.USA_D + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in London") && firstClass.isSelected()) {
            gross = cost.UK_L + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("UK - 7 Days in Wales") && firstClass.isSelected()) {
            gross = cost.UK_W + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("France - 7 Days in Paris") && firstClass.isSelected()) {
            gross = cost.France + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Kenya - 7 Days in Nairobi") && firstClass.isSelected()) {
            gross = cost.Kenya + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ghana - 7 Days in Acora") && firstClass.isSelected()) {
            gross = cost.Ghana + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("South Africa - 7 Days in Cape Town") && firstClass.isSelected()) {
            gross = cost.SAfrica + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
        if (Destination.getSelectedItem().equals("Ireland - 7 Days in Dublin") && firstClass.isSelected()) {
            gross = cost.Ireland + 150;
            String Cost = String.format("$%.2f", gross);
            firstClassLabel.setText(Cost);
            singleLabel.setText(Cost);
            singleRB.setSelected(true);
        }
    }//GEN-LAST:event_DestinationActionPerformed

    private void StandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandardActionPerformed
        if (Standard.isSelected() == true) {
            Destination.setEnabled(true);
            Destination.setSelectedItem("None");
            Economy.setSelected(false);
            firstClass.setSelected(false);
            economyLabel.setText("0.00");
            firstClassLabel.setText("0.00");
            returnLabel.setText("0.00");
            singleLabel.setText("0.00");
        }
        if (Standard.isSelected() == false) {
            Destination.getSelectedItem().equals("None");
            Destination.setEnabled(false);
            standardLabel.setText("0.00");
        }
    }//GEN-LAST:event_StandardActionPerformed

    private void airportTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airportTaxActionPerformed

    private void EconomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EconomyActionPerformed
        if (Economy.isSelected() == true) {
            Destination.setEnabled(true);
            Destination.setSelectedItem("None");
            Standard.setSelected(false);
            firstClass.setSelected(false);
            standardLabel.setText("0.00");
            firstClassLabel.setText("0.00");
            returnLabel.setText("0.00");
            singleLabel.setText("0.00");
        }
        if (Economy.isSelected() == false) {
            Destination.getSelectedItem().equals("None");
            Destination.setEnabled(false);
            economyLabel.setText("0.00");
        }
    }//GEN-LAST:event_EconomyActionPerformed

    private void firstClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstClassActionPerformed
        if (firstClass.isSelected() == true) {
            Destination.setEnabled(true);
            Destination.setSelectedItem("None");
            Standard.setSelected(false);
            Economy.setSelected(false);
            standardLabel.setText("0.00");
            economyLabel.setText("0.00");
            returnLabel.setText("0.00");
            singleLabel.setText("0.00");
        }
        if (firstClass.isSelected() == false) {
            Destination.getSelectedItem().equals("None");
            Destination.setEnabled(false);
            firstClassLabel.setText("0.00");
        }
    }//GEN-LAST:event_firstClassActionPerformed

    private void returnRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnRBActionPerformed
        if (!returnRB.isSelected()) {
            returnLabel.setText(null);
        } else {
            String sing = String.format("$%.2f", gross * 2);
            returnLabel.setText(sing);
            singleRB.setSelected(false);
            singleLabel.setText(null);
        }
    }//GEN-LAST:event_returnRBActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        firstName.setText(null);
        lastName.setText(null);
        address.setText(null);
        postCode.setText(null);
        telephone.setText(null);
        emailAddress.setText(null);
        taxLabel.setText("0.00");
        subTotalLabel.setText("0.00");
        totalLabel.setText("0.00");
        receipt.setText(null);
        standardLabel.setText("0.00");
        economyLabel.setText("0.00");
        firstClassLabel.setText("0.00");
        singleLabel.setText("0.00");
        returnLabel.setText("0.00");
        Standard.setSelected(false);
        Economy.setSelected(false);
        firstClass.setSelected(false);
        singleRB.setSelected(false);
        returnRB.setSelected(false);
        specialNeeds.setSelected(false);
        airportTax.setSelected(false);
        airMiles.setSelected(false);
        exitLuggage.setSelected(false);
        travellingInsurance.setSelected(false);
        departure.setSelectedItem("None");
        Destination.setSelectedItem("None");
        accomodation.setSelectedItem("None");
        specialNeedsBox.setText("0.00");
        specialNeeds.setSelected(false);
    }//GEN-LAST:event_resetActionPerformed

    private void ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptActionPerformed
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        String iTime = (tTime.format(timer.getTime()));
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        String iDate = (tDate.format(timer.getTime()));
        int i = 0;
        int num1;
        String ref = "";
        num1 = 1325 + (int) (Math.random() * 4328);
        ref += num1 + 1325;
        String first = firstName.getText();
        String last = lastName.getText();
        String add = address.getText();
        String pc = postCode.getText();
        String tele = telephone.getText();
        String ea = emailAddress.getText();
        String rTax = taxLabel.getText();
        String rSubTotal = subTotalLabel.getText();
        String tot = totalLabel.getText();

        receipt.append("\nRef:\t\t" + ref
                + "\n==============================="
                + "\nName:\t\t" + first
                + "\nLast Name:\t\t" + last
                + "\nAddress:\t\t" + add
                + "\nPostal Code:\t\t" + pc
                + "\nTelephone:\t\t" + tele
                + "\nEmail:\t\t" + ea
                + "\nTax:\t\t" + rTax
                + "\nSub Total:\t\t" + rSubTotal
                + "\nTotal:\t\t" + tot
                + "\n==============================="
                + "\nDate: " + iDate + "\tTime: " + iTime
                + "\n\n\tThanks for using Travel Management System"
        );
      
        if (JOptionPane.showConfirmDialog(this, "Do you want to do more transactions ?", "Travel Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            try {
                outFile = new FileWriter(file, true);
                br = new BufferedWriter(outFile);
                pr = new PrintWriter(br);
                pr.append("\n\n\n\n");
                pr.append(receipt.getText());
                pr.append("\n\n\n\n ************************\n\n\n\n");
                pr.close();
                br.close();
                outFile.close();
            } catch (IOException ex) {
                Logger.getLogger(TravelManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.resetActionPerformed(evt);
        } else {
            try {
                outFile = new FileWriter(file, true);
                br = new BufferedWriter(outFile);
                pr = new PrintWriter(br);
                 pr.append("\n\n\n\n");
                pr.append(receipt.getText());
                pr.append("\n\n\n\n ************************\n\n\n\n");
                pr.close();
                br.close();
                outFile.close();
            } catch (IOException ex) {
                Logger.getLogger(TravelManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_ReceiptActionPerformed

    private void specialNeedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialNeedsActionPerformed
    }//GEN-LAST:event_specialNeedsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Destination;
    private javax.swing.JLabel Destination1;
    private javax.swing.JRadioButton Economy;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Receipt;
    private javax.swing.JRadioButton Standard;
    private javax.swing.JComboBox<String> accomodation;
    private javax.swing.JTextField address;
    private javax.swing.JCheckBox airMiles;
    private javax.swing.JCheckBox airportTax;
    private javax.swing.JComboBox<String> departure;
    private javax.swing.JLabel economyLabel;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JCheckBox exitLuggage;
    private javax.swing.JRadioButton firstClass;
    private javax.swing.JLabel firstClassLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField postCode;
    public javax.swing.JTextArea receipt;
    private javax.swing.JButton reset;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JRadioButton returnRB;
    private javax.swing.JLabel singleLabel;
    private javax.swing.JRadioButton singleRB;
    private javax.swing.JCheckBox specialNeeds;
    private javax.swing.JLabel specialNeedsBox;
    private javax.swing.JLabel specialNeedsLabel;
    private javax.swing.JLabel standardLabel;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JTextField telephone;
    private javax.swing.JButton total;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JCheckBox travellingInsurance;
    // End of variables declaration//GEN-END:variables

}
