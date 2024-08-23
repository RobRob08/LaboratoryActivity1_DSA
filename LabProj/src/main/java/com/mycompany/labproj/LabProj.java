package com.mycompany.labproj;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LabProj extends javax.swing.JFrame {
public static ArrayList Bookinfo = new ArrayList();
    public LabProj() {
           initComponents();
        setExtendedState(MAXIMIZED_BOTH);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Selection = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        search_btn = new javax.swing.JLabel();
        add_btn = new javax.swing.JLabel();
        remove_btn = new javax.swing.JLabel();
        PAGES = new javax.swing.JPanel();
        SEARCH = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title_get = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        index_get = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Total_book = new javax.swing.JLabel();
        ADD = new javax.swing.JPanel();
        title_add = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantity_add = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        add_book = new javax.swing.JLabel();
        index_add = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        update_book = new javax.swing.JLabel();
        REMOVE = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        index_remove = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        remove_book = new javax.swing.JLabel();
        title_remove = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Selection.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SelectionLayout = new javax.swing.GroupLayout(Selection);
        Selection.setLayout(SelectionLayout);
        SelectionLayout.setHorizontalGroup(
            SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SelectionLayout.setVerticalGroup(
            SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Selection, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Menu.setBackground(new java.awt.Color(0, 153, 102));

        search_btn.setBackground(new java.awt.Color(0, 51, 51));
        search_btn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        search_btn.setForeground(new java.awt.Color(255, 255, 255));
        search_btn.setText("SEARCH");
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                search_btnMousePressed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(255, 255, 255));
        add_btn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("ADD");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add_btnMousePressed(evt);
            }
        });

        remove_btn.setBackground(new java.awt.Color(255, 255, 255));
        remove_btn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("REMOVE");
        remove_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                remove_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(search_btn)
                .addGap(89, 89, 89)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(remove_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_btn)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        PAGES.setBackground(new java.awt.Color(255, 255, 255));
        PAGES.setLayout(new java.awt.CardLayout());

        SEARCH.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        title_get.setBackground(new java.awt.Color(255, 255, 255));
        title_get.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        title_get.setForeground(new java.awt.Color(0, 102, 51));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("TITLE");

        index_get.setBackground(new java.awt.Color(255, 255, 255));
        index_get.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        index_get.setForeground(new java.awt.Color(0, 102, 51));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("INDEX");

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));
        jPanel4.setForeground(new java.awt.Color(0, 51, 0));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 0));
        jPanel6.setForeground(new java.awt.Color(0, 51, 0));

        Total_book.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        Total_book.setForeground(new java.awt.Color(255, 255, 255));
        Total_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total_book.setText("DISPLAY TOTAL");
        Total_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Total_bookMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Total_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Total_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SEARCHLayout = new javax.swing.GroupLayout(SEARCH);
        SEARCH.setLayout(SEARCHLayout);
        SEARCHLayout.setHorizontalGroup(
            SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SEARCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SEARCHLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(SEARCHLayout.createSequentialGroup()
                        .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(SEARCHLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(index_get, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SEARCHLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(43, 43, 43)
                                    .addComponent(title_get, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SEARCHLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(776, Short.MAX_VALUE))))
        );
        SEARCHLayout.setVerticalGroup(
            SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SEARCHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index_get, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_get, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        PAGES.add(SEARCH, "card2");

        ADD.setBackground(new java.awt.Color(204, 255, 204));

        title_add.setBackground(new java.awt.Color(255, 255, 255));
        title_add.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        title_add.setForeground(new java.awt.Color(0, 102, 51));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("TITLE");

        quantity_add.setBackground(new java.awt.Color(255, 255, 255));
        quantity_add.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        quantity_add.setForeground(new java.awt.Color(0, 102, 51));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("QUANTITY");

        jPanel5.setBackground(new java.awt.Color(0, 51, 0));

        add_book.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        add_book.setForeground(new java.awt.Color(255, 255, 255));
        add_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_book.setText("ADD BOOK");
        add_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add_bookMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_book, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_book, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        index_add.setBackground(new java.awt.Color(255, 255, 255));
        index_add.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        index_add.setForeground(new java.awt.Color(0, 102, 51));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("INDEX");

        jPanel8.setBackground(new java.awt.Color(0, 51, 0));

        update_book.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        update_book.setForeground(new java.awt.Color(255, 255, 255));
        update_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_book.setText("UPDATE BOOK");
        update_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_bookMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_book, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ADDLayout = new javax.swing.GroupLayout(ADD);
        ADD.setLayout(ADDLayout);
        ADDLayout.setHorizontalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADDLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(913, 913, 913))
                    .addGroup(ADDLayout.createSequentialGroup()
                        .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ADDLayout.createSequentialGroup()
                                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity_add, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title_add, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ADDLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(88, 88, 88)
                                .addComponent(index_add, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ADDLayout.setVerticalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(80, 80, 80)
                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(80, 80, 80)
                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(92, 92, 92)
                .addGroup(ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        PAGES.add(ADD, "card3");

        REMOVE.setBackground(new java.awt.Color(204, 255, 204));
        REMOVE.setForeground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("INDEX");

        index_remove.setBackground(new java.awt.Color(255, 255, 255));
        index_remove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        index_remove.setForeground(new java.awt.Color(0, 102, 51));

        jPanel7.setBackground(new java.awt.Color(0, 51, 0));

        remove_book.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        remove_book.setForeground(new java.awt.Color(255, 255, 255));
        remove_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remove_book.setText("REMOVE BOOK");
        remove_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                remove_bookMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remove_book, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remove_book, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        title_remove.setBackground(new java.awt.Color(255, 255, 255));
        title_remove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        title_remove.setForeground(new java.awt.Color(0, 102, 51));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("TITLE");

        javax.swing.GroupLayout REMOVELayout = new javax.swing.GroupLayout(REMOVE);
        REMOVE.setLayout(REMOVELayout);
        REMOVELayout.setHorizontalGroup(
            REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, REMOVELayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, REMOVELayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(88, 88, 88)
                            .addComponent(index_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(868, Short.MAX_VALUE))
        );
        REMOVELayout.setVerticalGroup(
            REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVELayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(81, 81, 81)
                .addGroup(REMOVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(98, 98, 98)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        PAGES.add(REMOVE, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PAGES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PAGES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        System.exit(0);
    }//GEN-LAST:event_jPanel3MousePressed

    private void add_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMousePressed
    SEARCH.setVisible(false);  
    ADD.setVisible(true);
    REMOVE.setVisible(false);
    add_btn.setForeground(new Color(0,51,51));
    search_btn.setForeground(new Color(255,255,255));
    remove_btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_add_btnMousePressed

    private void search_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMousePressed
    SEARCH.setVisible(true);  
    ADD.setVisible(false);
    REMOVE.setVisible(false);
    add_btn.setForeground(new Color(255,255,255));
    search_btn.setForeground(new Color(0,51,51));
    remove_btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_search_btnMousePressed

    private void add_bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_bookMousePressed
     
    }//GEN-LAST:event_add_bookMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
      
    }//GEN-LAST:event_jLabel2MousePressed

    private void remove_bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_bookMousePressed
      
    }//GEN-LAST:event_remove_bookMousePressed

    private void remove_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_btnMousePressed
    SEARCH.setVisible(false);  
    ADD.setVisible(false);
    REMOVE.setVisible(true);
    add_btn.setForeground(new Color(255,255,255));
    search_btn.setForeground(new Color(255,255,255));
    remove_btn.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_remove_btnMousePressed

    private void Total_bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Total_bookMousePressed
        JOptionPane.showMessageDialog(null,"Total Number of books is: " + Bookinfo.size());
    }//GEN-LAST:event_Total_bookMousePressed

    private void update_bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_bookMousePressed
    
    }//GEN-LAST:event_update_bookMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabProj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADD;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel PAGES;
    private javax.swing.JPanel REMOVE;
    private javax.swing.JPanel SEARCH;
    private javax.swing.JPanel Selection;
    private javax.swing.JLabel Total_book;
    private javax.swing.JLabel add_book;
    private javax.swing.JLabel add_btn;
    private javax.swing.JTextField index_add;
    private javax.swing.JTextField index_get;
    private javax.swing.JTextField index_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField quantity_add;
    private javax.swing.JLabel remove_book;
    private javax.swing.JLabel remove_btn;
    private javax.swing.JLabel search_btn;
    private javax.swing.JTextField title_add;
    private javax.swing.JTextField title_get;
    private javax.swing.JTextField title_remove;
    private javax.swing.JLabel update_book;
    // End of variables declaration//GEN-END:variables
}
