
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        semesterAddedLabel = new javax.swing.JPanel();
        semesterName = new javax.swing.JLabel();
        addSemesterTextfield = new javax.swing.JTextField();
        addSemesterSubmitButton = new javax.swing.JButton();
        addSemesterStatusLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addCourseCodeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addCourseDescriptionTextField = new javax.swing.JTextField();
        addCourseSubmitButton = new javax.swing.JButton();
        addCourseLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        chooseCourseComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        addClassSubmitButton = new javax.swing.JButton();
        addClassLabel = new javax.swing.JLabel();
        addClassSeatsLeft = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        studentIDTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addStudentSubmitButton = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        addStudentLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chooseCourseComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayScheduledTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        displayWaitlistedTable = new javax.swing.JTable();
        displayClassButton = new javax.swing.JButton();
        displayClassLabel = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        selectStudentComboBox3 = new javax.swing.JComboBox<>();
        dropStudentButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        dropStudentInfoArea = new javax.swing.JTextArea();
        dropStudentLabel = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        chooseCourseComboBox5 = new javax.swing.JComboBox<>();
        dropCourseButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        dropCourseInfoArea = new javax.swing.JTextArea();
        dropCourseLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayClassesTable = new javax.swing.JTable();
        displayClassesButton = new javax.swing.JButton();
        displayClassesLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        chooseCourseComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        selectStudentComboBox = new javax.swing.JComboBox<>();
        scheduleClassesSubmitButton = new javax.swing.JButton();
        studentClassesLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selectStudentComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        displayScheduleButton = new javax.swing.JButton();
        displayScheduleLabel = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        selectStudentComboBox4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        chooseCourseComboBox4 = new javax.swing.JComboBox<>();
        dropClassButton = new javax.swing.JButton();
        dropClassLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        dropClassInfoArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        currentSemesterLabel = new javax.swing.JLabel();
        currentSemesterComboBox = new javax.swing.JComboBox<>();
        changeSemesterButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu5.setText("jMenu5");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Scheduler");

        semesterName.setText("Semester Name:");

        addSemesterTextfield.setColumns(20);

        addSemesterSubmitButton.setText("Submit");
        addSemesterSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSemesterSubmitButtonActionPerformed(evt);
            }
        });

        addSemesterStatusLabel.setText("                                                   ");

        javax.swing.GroupLayout semesterAddedLabelLayout = new javax.swing.GroupLayout(semesterAddedLabel);
        semesterAddedLabel.setLayout(semesterAddedLabelLayout);
        semesterAddedLabelLayout.setHorizontalGroup(
            semesterAddedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semesterAddedLabelLayout.createSequentialGroup()
                .addGroup(semesterAddedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(semesterAddedLabelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(semesterName)
                        .addGap(18, 18, 18)
                        .addComponent(addSemesterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(semesterAddedLabelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(addSemesterStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(semesterAddedLabelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(addSemesterSubmitButton)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        semesterAddedLabelLayout.setVerticalGroup(
            semesterAddedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semesterAddedLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semesterAddedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSemesterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterName))
                .addGap(18, 18, 18)
                .addComponent(addSemesterSubmitButton)
                .addGap(12, 12, 12)
                .addComponent(addSemesterStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Semester", semesterAddedLabel);

        jLabel4.setText("Course Code:");

        jLabel5.setText("Course Description:");

        addCourseSubmitButton.setText("Submit");
        addCourseSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(addCourseSubmitButton))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addCourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCourseDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addCourseDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(addCourseSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(addCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Course", jPanel4);

        jLabel11.setText("Course Code:");

        chooseCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Seats Left:");

        addClassSubmitButton.setText("Submit");
        addClassSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addClassLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(24, 24, 24)
                                .addComponent(addClassSeatsLeft))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chooseCourseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(addClassSubmitButton)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(addClassSeatsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addClassSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(addClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Class", jPanel6);

        jLabel7.setText("Student ID:");

        jLabel8.setText("First Name:");

        jLabel9.setText("Last Name:");

        addStudentSubmitButton.setText("Submit");
        addStudentSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(addStudentSubmitButton))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(690, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addStudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(addStudentSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(addStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Student", jPanel7);

        jPanel11.setPreferredSize(new java.awt.Dimension(946, 880));

        jLabel6.setText("Choose Class:");

        chooseCourseComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        displayScheduledTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Student ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(displayScheduledTable);

        jLabel10.setText("Scheduled Students in the Class");

        jLabel15.setText("Waitlisted Students in the Class in Waitlist Order");

        displayWaitlistedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Student ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(displayWaitlistedTable);

        displayClassButton.setText("Display");
        displayClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayClassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayClassLabel)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(chooseCourseComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(displayClassButton)))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseCourseComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(displayClassButton))
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayClassLabel)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Display Class List", jPanel11);

        jLabel16.setText("Choose Student:");

        selectStudentComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropStudentButton.setText("Drop");
        dropStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropStudentButtonActionPerformed(evt);
            }
        });

        dropStudentInfoArea.setColumns(20);
        dropStudentInfoArea.setRows(5);
        jScrollPane7.setViewportView(dropStudentInfoArea);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropStudentLabel)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropStudentButton)
                            .addComponent(selectStudentComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStudentComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(dropStudentButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dropStudentLabel)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Drop Student", jPanel12);

        jLabel19.setText("Choose CLass:");

        chooseCourseComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropCourseButton.setText("Drop");
        dropCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropCourseButtonActionPerformed(evt);
            }
        });

        dropCourseInfoArea.setColumns(20);
        dropCourseInfoArea.setRows(5);
        jScrollPane8.setViewportView(dropCourseInfoArea);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropCourseLabel)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropCourseButton)
                            .addComponent(chooseCourseComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseCourseComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(dropCourseButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dropCourseLabel)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Drop Course", jPanel15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        displayClassesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Code", "Description", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayClassesTable);

        displayClassesButton.setText("Display");
        displayClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayClassesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(433, 433, 433)
                                .addComponent(displayClassesButton))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(displayClassesLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayClassesLabel)
                .addGap(2, 2, 2)
                .addComponent(displayClassesButton))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Display Classes", jPanel3);

        jLabel13.setText("Select Class:");

        chooseCourseComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Select Student");

        selectStudentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        scheduleClassesSubmitButton.setText("Submit");
        scheduleClassesSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleClassesSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentClassesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(scheduleClassesSubmitButton))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseCourseComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectStudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseCourseComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(selectStudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(scheduleClassesSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(studentClassesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Schedule Classes", jPanel8);

        jLabel3.setText("Select Student:");

        selectStudentComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Code", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(scheduleTable);

        displayScheduleButton.setText("Display");
        displayScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayScheduleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayScheduleLabel)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(selectStudentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(displayScheduleButton)))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStudentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(displayScheduleButton))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(displayScheduleLabel)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Display Schedule", jPanel9);

        jLabel17.setText("Choose Student:");

        selectStudentComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("Choose Class:");

        chooseCourseComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropClassButton.setText("Drop");
        dropClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropClassButtonActionPerformed(evt);
            }
        });

        dropClassInfoArea.setColumns(20);
        dropClassInfoArea.setRows(5);
        jScrollPane6.setViewportView(dropClassInfoArea);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectStudentComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(chooseCourseComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dropClassButton))))
                    .addComponent(dropClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(selectStudentComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(chooseCourseComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropClassButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(dropClassLabel)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Drop Class", jPanel13);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Student", jPanel2);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setText("Current Semester: ");

        currentSemesterLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        currentSemesterLabel.setText("           ");

        currentSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        currentSemesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentSemesterComboBoxActionPerformed(evt);
            }
        });

        changeSemesterButton.setText("Change Semester");
        changeSemesterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSemesterButtonActionPerformed(evt);
            }
        });

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentSemesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(currentSemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changeSemesterButton)
                                .addGap(31, 31, 31)
                                .addComponent(aboutButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(currentSemesterLabel)
                    .addComponent(currentSemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSemesterButton)
                    .addComponent(aboutButton))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ----------------------- SAFE ZONE -------------------------
    private String author;
    private String project;
    private String semester;

    public MainFrame() {
        initComponents();
        checkData();
        rebuildSemesterComboBoxes();
        rebuildClassCodeComboBox(this.semester);
        rebuildSelectStudentComboBox();
    }

    public boolean isNumber(String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphabet(String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    public String getID(String student){
        String ID = "";
        for(int i = student.length()-2; i>=student.length()-10; i--){
            char ch = student.charAt(i);
            ID = ch + ID;
        }
        return ID;
    }
    
    public void rebuildSemesterComboBoxes() {
        // Adding the semesters to the semester combo box
        ArrayList<String> semesters = SemesterQueries.getSemesterList();
        semesters.add(0, "");
        currentSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(semesters.toArray()));
        if (this.semester == null) {
            this.semester = "";
            currentSemesterLabel.setText("None Selected");
        }
    }

    public void rebuildClassCodeComboBox(String semester) {
        // adding the courses to the combo boxes that make you select a course
        ArrayList<String> courses = CourseQueries.getCourses(semester);
        chooseCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
        chooseCourseComboBox2.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
        chooseCourseComboBox3.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
        chooseCourseComboBox5.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
        chooseCourseComboBox4.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
    }

    public void rebuildSelectStudentComboBox() {
        ArrayList<String> students = StudentQueries.getStudents();
        students.add(0, "".trim());
        selectStudentComboBox.setModel(new javax.swing.DefaultComboBoxModel(students.toArray()));
        selectStudentComboBox2.setModel(new javax.swing.DefaultComboBoxModel(students.toArray()));
        selectStudentComboBox3.setModel(new javax.swing.DefaultComboBoxModel(students.toArray()));
        selectStudentComboBox4.setModel(new javax.swing.DefaultComboBoxModel(students.toArray()));
    }
    
    public void scheduleWaitlisted(String course, int seats, String semester, JTextArea textArea){
        // function will schedule students into their courses depending on availability
        ArrayList<String> waitListed = new ArrayList<>(); // list of student IDs that are waitlisted
        waitListed = ScheduleQueries.getWaitlisted(course, semester);
        int i=0;
        while(i<waitListed.size()){
            if(seats==0){
                break;
            }
            textArea.setText(textArea.getText() + (waitListed.get(i) + ", " + StudentQueries.getName(waitListed.get(i)) + " has been scheduled into " + course + "\n"));
            ScheduleQueries.updateStatus("Scheduled", course, waitListed.get(i), semester);
            i++;
            seats--;
        }             
        seats = CourseQueries.getSeats(course, semester) + seats;
        CourseQueries.updateSeats(course, semester, seats);
    }
    
    public void scheduleWaitlisted(String course, int seats){
        // function will schedule students into their courses depending on availability
        ArrayList<String> waitListed = new ArrayList<>(); // list of student IDs that are waitlisted
        waitListed = ScheduleQueries.getWaitlisted(course, this.semester);
        int i=0;
        while(i<waitListed.size()){
            if(seats==0){
                break;
            }
            ScheduleQueries.updateStatus("Scheduled", course, waitListed.get(i), this.semester);
            i++;
            seats--;
        }             
        CourseQueries.updateSeats(course, this.semester, seats);
    }

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // Display about information.
        JOptionPane.showMessageDialog(null, "Author: " + author + " Project: " + project);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void changeSemesterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSemesterButtonActionPerformed
        this.semester = (String) currentSemesterComboBox.getSelectedItem();
        this.semester = this.semester.trim();
        if (this.semester.isEmpty()) {
            currentSemesterLabel.setText("None Selected");
        } else {
            currentSemesterLabel.setText(this.semester);
        }
        rebuildClassCodeComboBox(this.semester);
    }//GEN-LAST:event_changeSemesterButtonActionPerformed

    private void currentSemesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentSemesterComboBoxActionPerformed
        this.semester = (String) currentSemesterComboBox.getSelectedItem();
        this.semester = this.semester.trim();
        if (this.semester.isEmpty()) {
            currentSemesterLabel.setText("None Selected");
        } else {
            currentSemesterLabel.setText(this.semester);
        }
        rebuildClassCodeComboBox(this.semester);
    }//GEN-LAST:event_currentSemesterComboBoxActionPerformed

    private void scheduleClassesSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleClassesSubmitButtonActionPerformed
        String selectedStudent = (String) selectStudentComboBox.getSelectedItem();
        String className = (String) chooseCourseComboBox2.getSelectedItem();
        if(this.semester.isEmpty()){
            studentClassesLabel.setText("Error: No semester has been selected.");
        }
        else if(selectedStudent == null || selectedStudent.isEmpty()){
            studentClassesLabel.setText("Error: No student selected.");
        }
        else if(className==null || className.isEmpty()){
            studentClassesLabel.setText("Error: No class selected.");
        }
        else{
            studentClassesLabel.setText("");
            String studentID = getID(selectedStudent);
            int seats = CourseQueries.getSeats(className, this.semester);
            if (ScheduleQueries.scheduled(className, studentID, this.semester)) {
                if(ScheduleQueries.getStatus(className, studentID, this.semester).toLowerCase().equals("waitlisted")){
                    studentClassesLabel.setText("Error: " + selectedStudent + " is already in the waitlist for " + className + " and will be auto-enrolled if seats open up");
                }
                else{
                    studentClassesLabel.setText("Error: " + selectedStudent + " has already enrolled in this class");
                }
            }
            else{
                if (seats == 0) {
                    ScheduleQueries.addClass(studentID, className, "Waitlisted", this.semester);
                    studentClassesLabel.setText(selectedStudent + " has been added to the wailisted for " + className);
                } 
                else {
                    ScheduleQueries.addClass(studentID, className, "Scheduled", this.semester);
                    CourseQueries.updateSeats(className, this.semester, seats - 1);
                    studentClassesLabel.setText(selectedStudent + " has been added to " + className + "!");
                }    
            }
        }
    }//GEN-LAST:event_scheduleClassesSubmitButtonActionPerformed

    private void displayClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayClassesButtonActionPerformed
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Course Code");
        tableModel.addColumn("Description");
        tableModel.addColumn("Seats");
        if(this.semester.isEmpty()){
            displayClassesTable.setModel(tableModel);
            displayClassesLabel.setText("Error: No semester has been selected");
        }
        else{
            ArrayList<Object[]> table = CourseQueries.getTable(this.semester);
            for (Object[] row : table) {
                tableModel.addRow(row);
            }
            displayClassesTable.setModel(tableModel);
            displayClassesLabel.setText("");
        }
    }//GEN-LAST:event_displayClassesButtonActionPerformed

    private void addStudentSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentSubmitButtonActionPerformed
        // Adds the student info to the student table
        String studentID = studentIDTextField.getText().trim();
        if (studentID.length() > 9 || studentID.length() < 9) {
            addStudentLabel.setText("Error: the student ID should be 9 digits");
        } else if (!isNumber(studentID)) {
            addStudentLabel.setText("Student ID has to be numbers only");
        } else {
            int ID = Integer.parseInt(studentID);
            ArrayList<Integer> IDs = StudentQueries.getIDs();
            int start = 0, end = IDs.size() - 1;
            int mid = end + (start - end) / 2;
            boolean isThere = false;
            while (start <= end) {
                if (ID < IDs.get(mid)) {
                    end = mid - 1;
                } else if (ID > IDs.get(mid)) {
                    start = mid + 1;
                } else {
                    isThere = true;
                    break;
                }
                mid = end + (start - end) / 2;
            }
            if (isThere) {
                addStudentLabel.setText("Error: A student with that PSU ID already exists");
            } else {
                String firstName = firstNameTextField.getText().trim();
                String lastName = lastNameTextField.getText().trim();
                if (!isAlphabet(firstName)) {
                    addStudentLabel.setText("First Name has to be english alphabets only");
                } else if (firstName.isEmpty()) {
                    addStudentLabel.setText("Error: First name cannot be an empty field");
                } else if (!isAlphabet(lastName)) {
                    addStudentLabel.setText("Last Name has to be english alphabets only");
                } else if (lastName.isEmpty()) {
                    addStudentLabel.setText("Error: Last name cannot be an empty field");
                } else {
                    StudentQueries.addStudent(studentID, firstName, lastName);
                    addStudentLabel.setText(lastName + ", " + firstName + " has been added successfully");
                    studentIDTextField.setText("");
                    firstNameTextField.setText("");
                    lastNameTextField.setText("");
                    rebuildSelectStudentComboBox();
                }
            }
        }
    }//GEN-LAST:event_addStudentSubmitButtonActionPerformed

    private void addClassSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassSubmitButtonActionPerformed
        String className = (String) chooseCourseComboBox.getSelectedItem();
        if (this.semester.isEmpty()) {
            addClassLabel.setText("Error: Please select a semester for the courses to appear");
        } 
        else if (className==null || className.isEmpty()) {
            addClassLabel.setText("Error: Please select a course from the Course Code selection");
        }
        else {
            className = className.trim();
            int seats = (int) addClassSeatsLeft.getValue();
            if (seats < 0) {
                addClassLabel.setText("Error: Seats cannot be in negative");
            } else {
                scheduleWaitlisted(className, seats);
                addClassLabel.setText("Class " + className + " has been added");
            }
        }
    }//GEN-LAST:event_addClassSubmitButtonActionPerformed

    private void addCourseSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseSubmitButtonActionPerformed
        // Adds the course along with the desc, semester (seats=none) in the course table
        String courseCode = addCourseCodeTextField.getText().trim();
        String courseDescription = addCourseDescriptionTextField.getText().trim();
        if (this.semester.isEmpty()) {
            addCourseLabel.setText("Error: Please select a semester to add that course to");
        } else if (courseCode.isEmpty() || courseDescription.isEmpty()) {
            addCourseLabel.setText("Error: Both fields are required.");
        } else {
            ArrayList<String> courses = CourseQueries.getCourses(this.semester);
            boolean proceed = true;
            for (String course : courses) {
                if (courseCode.toLowerCase().equals(course.toLowerCase())) {
                    addCourseLabel.setText("Error: You already have a course named " + course);
                    proceed = false;
                    break;
                }
            }
            if (proceed) {
                CourseQueries.addCourse(courseCode.toUpperCase(), courseDescription, this.semester);
                addCourseLabel.setText("Course " + courseCode.toUpperCase() + " has been added successfully.");
                addCourseCodeTextField.setText("");
                addCourseDescriptionTextField.setText("");
                rebuildClassCodeComboBox(this.semester);
            }
        }
    }//GEN-LAST:event_addCourseSubmitButtonActionPerformed

    private void addSemesterSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSemesterSubmitButtonActionPerformed
        // Adds a semester to the semester selector combo box on top
        String semester = addSemesterTextfield.getText().trim();
        if(!semester.isEmpty()){
            SemesterQueries.addSemester(semester);
            addSemesterStatusLabel.setText("Semester " + semester + " has been added.");
            addSemesterTextfield.setText("");
            rebuildSemesterComboBoxes();
        }
        else{
            addSemesterStatusLabel.setText("Error: Semester name cannot be empty.");
        }
    }//GEN-LAST:event_addSemesterSubmitButtonActionPerformed

    private void displayScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayScheduleButtonActionPerformed
        String selectedStudent = (String) selectStudentComboBox2.getSelectedItem();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Course Code");
        tableModel.addColumn("Status");
        if(this.semester.isEmpty()){
            scheduleTable.setModel(tableModel);
            displayScheduleLabel.setText("Error: No semester has been selected");
        }
        else if(selectedStudent==null || selectedStudent.isEmpty()){
            scheduleTable.setModel(tableModel);
            displayScheduleLabel.setText("Error: No student selected.");
        }
        else{  
            displayScheduleLabel.setText("");
            ArrayList<Object[]> table = ScheduleQueries.getTable(getID(selectedStudent), this.semester);
            for (Object[] row : table) {
                tableModel.addRow(row);
            }
            scheduleTable.setModel(tableModel);
        }
    }//GEN-LAST:event_displayScheduleButtonActionPerformed

    private void dropCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropCourseButtonActionPerformed
        String className = (String) chooseCourseComboBox5.getSelectedItem();
        if(this.semester.isEmpty()){
            dropCourseLabel.setText("Error: No semester has been selected");
        }
        else if(className==null || className.isEmpty()){
            dropClassLabel.setText("Error: No class selected.");
        }
        else{
            ArrayList<Object[]> scheduled = ScheduleQueries.getData("Scheduled", className, this.semester);
            ArrayList<Object[]> waitlisted = ScheduleQueries.getData("Waitlisted", className, this.semester);   
            dropCourseInfoArea.setText("Scheduled students dropped from this course:\n");
            for(Object[] row: scheduled){
                String ID = row[2].toString();
                ScheduleQueries.dropClass(ID, className, this.semester);
                dropCourseInfoArea.setText(dropCourseInfoArea.getText() + row[1].toString() + ", " + row[0].toString() + "(" + ID + ")\n");
            }
            dropCourseInfoArea.setText(dropCourseInfoArea.getText() + "\nWaitlisted students dropped from this course:\n");
            for(Object[] row: waitlisted){
                String ID = row[2].toString();
                ScheduleQueries.dropClass(ID, className, this.semester);
                dropCourseInfoArea.setText(dropCourseInfoArea.getText() + row[1].toString() + ", " + row[0].toString() + "(" + ID + ")\n");
            }
            CourseQueries.dropCourse(className, this.semester);
            rebuildClassCodeComboBox(this.semester);
        }
    }//GEN-LAST:event_dropCourseButtonActionPerformed

    private void dropClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropClassButtonActionPerformed
        String selectedStudent = (String) selectStudentComboBox4.getSelectedItem();
        String className = (String) chooseCourseComboBox4.getSelectedItem();
        if(this.semester.isEmpty()){
            dropClassLabel.setText("Error: No semester has been selected");
        }
        else if(selectedStudent==null || selectedStudent.isEmpty()){
            dropClassLabel.setText("Error: No student selected.");
        }
        else if(className==null || className.isEmpty()){
            dropClassLabel.setText("Error: No class selected.");
        }
        else{
            String ID = getID(selectedStudent);
            if(ScheduleQueries.getStatus(className, ID, this.semester).equals("Scheduled")){
                ScheduleQueries.dropClass(ID, className, this.semester);
                ScheduleQueries.updateStatus("Dropped", className, ID, this.semester);
                dropClassInfoArea.setText(selectedStudent + " has been dropped from " + className + "\n\n");
                scheduleWaitlisted(className, 1, this.semester, dropClassInfoArea);
            }
            else if(ScheduleQueries.getStatus(className, ID, this.semester).equals("Waitlisted")){
                ScheduleQueries.dropClass(ID, className, this.semester);
                dropClassInfoArea.setText(selectedStudent + " has been removed from " + className + " waitlist\n\n");
            }
            else{
                dropClassInfoArea.setText(selectedStudent + " is not enrolled in " + className + "\n\n");
            }
        }
    }//GEN-LAST:event_dropClassButtonActionPerformed

    private void displayClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayClassButtonActionPerformed
        String className = (String) chooseCourseComboBox3.getSelectedItem();
        
        DefaultTableModel scheduledTableModel = new DefaultTableModel();
        scheduledTableModel.addColumn("Last Name");
        scheduledTableModel.addColumn("First Name");
        scheduledTableModel.addColumn("Student ID");
        
        DefaultTableModel waitlistTableModel = new DefaultTableModel();
        waitlistTableModel.addColumn("Las tName");
        waitlistTableModel.addColumn("First Name");
        waitlistTableModel.addColumn("Student ID");
        if(this.semester.isEmpty()){
            displayScheduledTable.setModel(scheduledTableModel);
            displayWaitlistedTable.setModel(waitlistTableModel);
            displayClassLabel.setText("Error: No semester has been selected");
        }
        else if(className==null || className.isEmpty()){
            displayScheduledTable.setModel(scheduledTableModel);
            displayWaitlistedTable.setModel(waitlistTableModel);
            displayClassLabel.setText("Error: No class selected");
        }
        else{
            ArrayList<Object[]> scheduled = ScheduleQueries.getData("Scheduled", className, this.semester);
            ArrayList<Object[]> waitlisted = ScheduleQueries.getData("Waitlisted", className, this.semester);
            
            for(Object[] row: scheduled){
                scheduledTableModel.addRow(row);
            }
            
            for(Object[] row: waitlisted){
                waitlistTableModel.addRow(row);
            }
            
            displayScheduledTable.setModel(scheduledTableModel);
            displayWaitlistedTable.setModel(waitlistTableModel);
            displayClassLabel.setText("");
        }
    }//GEN-LAST:event_displayClassButtonActionPerformed

    private void dropStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropStudentButtonActionPerformed
        String selectedStudent = (String) selectStudentComboBox3.getSelectedItem();
        if(this.semester.isEmpty()){
            dropStudentLabel.setText("Error: No semester has been selected");
        }
        else if(selectedStudent==null || selectedStudent.isEmpty()){
            dropStudentLabel.setText("Error: No student selected.");
        }
        else{  
            dropStudentLabel.setText("");
            String ID = getID(selectedStudent);
            dropStudentInfoArea.setText(selectedStudent + " has been dropped from the list of students\n-----------------------------------------------------\n\n");
            ArrayList<String> semesters = SemesterQueries.getSemesterList();
            for(String semester: semesters){    
                dropStudentInfoArea.setText(dropStudentInfoArea.getText() + "For Semester: " + semester + "\n");
                ArrayList<String> courses = CourseQueries.getCourses(semester);
                for(String className: courses){
                    if(ScheduleQueries.getStatus(className, ID, this.semester).equals("Scheduled")){
                        ScheduleQueries.dropClass(ID, className, semester);
                        dropStudentInfoArea.setText(dropStudentInfoArea.getText() + selectedStudent + " has been dropped from " + className + "\n");
                        scheduleWaitlisted(className, 1, semester, dropStudentInfoArea);
                    }
                    else if(ScheduleQueries.getStatus(className, ID, this.semester).equals("Waitlisted")){
                        ScheduleQueries.dropClass(ID, className, this.semester);
                        dropClassInfoArea.setText(selectedStudent + " has been removed from " + className + " waitlist\n\n");
                    }
                }
                dropStudentInfoArea.setText(dropStudentInfoArea.getText() + "\n");
            }
            StudentQueries.dropStudent(ID);
            rebuildSelectStudentComboBox();
        }
    }//GEN-LAST:event_dropStudentButtonActionPerformed

    // ---------- DO NOT TOUCH BEYOND THIS -----------------
    private void checkData() {
        try {
            FileReader reader = new FileReader("xzq789yy.txt");
            BufferedReader breader = new BufferedReader(reader);

            String encodedAuthor = breader.readLine();
            String encodedProject = breader.readLine();
            byte[] decodedAuthor = Base64.getDecoder().decode(encodedAuthor);
            author = new String(decodedAuthor);
            byte[] decodedProject = Base64.getDecoder().decode(encodedProject);
            project = new String(decodedProject);
            reader.close();

        } catch (FileNotFoundException e) {
            //get user info and create file
            author = JOptionPane.showInputDialog("Enter your first and last name.");
            project = "Course Scheduler Fall 2024";

            //write data to the data file.
            try {
                FileWriter writer = new FileWriter("xzq789yy.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                // encode the output data.
                String encodedAuthor = Base64.getEncoder().encodeToString(author.getBytes());

                bufferedWriter.write(encodedAuthor);
                bufferedWriter.newLine();

                String encodedProject = Base64.getEncoder().encodeToString(project.getBytes());
                bufferedWriter.write(encodedProject);

                bufferedWriter.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
                System.exit(1);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JLabel addClassLabel;
    private javax.swing.JSpinner addClassSeatsLeft;
    private javax.swing.JButton addClassSubmitButton;
    private javax.swing.JTextField addCourseCodeTextField;
    private javax.swing.JTextField addCourseDescriptionTextField;
    private javax.swing.JLabel addCourseLabel;
    private javax.swing.JButton addCourseSubmitButton;
    private javax.swing.JLabel addSemesterStatusLabel;
    private javax.swing.JButton addSemesterSubmitButton;
    private javax.swing.JTextField addSemesterTextfield;
    private javax.swing.JLabel addStudentLabel;
    private javax.swing.JButton addStudentSubmitButton;
    private javax.swing.JButton changeSemesterButton;
    private javax.swing.JComboBox<String> chooseCourseComboBox;
    private javax.swing.JComboBox<String> chooseCourseComboBox2;
    private javax.swing.JComboBox<String> chooseCourseComboBox3;
    private javax.swing.JComboBox<String> chooseCourseComboBox4;
    private javax.swing.JComboBox<String> chooseCourseComboBox5;
    private javax.swing.JComboBox<String> currentSemesterComboBox;
    private javax.swing.JLabel currentSemesterLabel;
    private javax.swing.JButton displayClassButton;
    private javax.swing.JLabel displayClassLabel;
    private javax.swing.JButton displayClassesButton;
    private javax.swing.JLabel displayClassesLabel;
    private javax.swing.JTable displayClassesTable;
    private javax.swing.JButton displayScheduleButton;
    private javax.swing.JLabel displayScheduleLabel;
    private javax.swing.JTable displayScheduledTable;
    private javax.swing.JTable displayWaitlistedTable;
    private javax.swing.JButton dropClassButton;
    private javax.swing.JTextArea dropClassInfoArea;
    private javax.swing.JLabel dropClassLabel;
    private javax.swing.JButton dropCourseButton;
    private javax.swing.JTextArea dropCourseInfoArea;
    private javax.swing.JLabel dropCourseLabel;
    private javax.swing.JButton dropStudentButton;
    private javax.swing.JTextArea dropStudentInfoArea;
    private javax.swing.JLabel dropStudentLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton scheduleClassesSubmitButton;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JComboBox<String> selectStudentComboBox;
    private javax.swing.JComboBox<String> selectStudentComboBox2;
    private javax.swing.JComboBox<String> selectStudentComboBox3;
    private javax.swing.JComboBox<String> selectStudentComboBox4;
    private javax.swing.JPanel semesterAddedLabel;
    private javax.swing.JLabel semesterName;
    private javax.swing.JLabel studentClassesLabel;
    private javax.swing.JTextField studentIDTextField;
    // End of variables declaration//GEN-END:variables
}