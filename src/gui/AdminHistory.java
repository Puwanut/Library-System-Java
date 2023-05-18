/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.Connect;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IsilenceT
 */
public class AdminHistory extends javax.swing.JPanel {

    public AdminHistory() {
        initComponents();

        setborrowhistoryTable();
        setTableColor();

    }
    
    public void setborrowhistoryTable(){
        try {
            Connection con = Connect.connectDB();
            String queryhistory
                    = "SELECT * FROM borrowhistory "
                    + "INNER JOIN bookinfo ON borrowhistory.callnumber = bookinfo.callnumber "
                    + "INNER JOIN userinfo ON borrowhistory.userid = userinfo.userid";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(queryhistory);
            DefaultTableModel model = (DefaultTableModel) JTable_borrowhistory.getModel();
            Object[] row = new Object[7];
            model.setRowCount(0);
            while (rs.next()){
                row[0] = rs.getString("borrowid") ;
                row[1] = rs.getString("callnumber");
                row[2] = rs.getString("bname");
                row[3] = rs.getString("fname") + " " + rs.getString("sname");
                row[4] = rs.getString("borrowdate");
                row[5] = rs.getString("returndate");
                if (rs.getBoolean("returned") == false)
                    row[6] = "ยังไม่คืน";
                else
                    row[6] = "คืนแล้ว";
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
    public void setTableColor() {
        JTable_borrowhistory.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                String status = (String) table.getModel().getValueAt(row, 6);
                if (status.equals("ยังไม่คืน")) {
                    setBackground(new Color(255, 153, 153));
                    setForeground(table.getForeground());
                } else {
                    setBackground(new Color(153, 255, 153));
                    setForeground(table.getForeground());
                }
                return this;
            }
        });
    }
    
    public void updateBorrowhistoryTable(){
        setborrowhistoryTable();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane_borrowhistory = new javax.swing.JScrollPane();
        JTable_borrowhistory = new javax.swing.JTable();
        lb_title = new javax.swing.JLabel();
        lb_squaregreen = new javax.swing.JLabel();
        lb_textreturned = new javax.swing.JLabel();
        lb_squarered = new javax.swing.JLabel();
        lb_textunreturn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));

        JTable_borrowhistory.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        JTable_borrowhistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสการยืม", "รหัสหนังสือ", "ชื่อหนังสือ", "ชื่อผู้ยืม", "วันที่ยืม", "วันที่คืน", "สถานะการยืม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_borrowhistory.setRowHeight(30);
        JScrollPane_borrowhistory.setViewportView(JTable_borrowhistory);
        if (JTable_borrowhistory.getColumnModel().getColumnCount() > 0) {
            JTable_borrowhistory.getColumnModel().getColumn(0).setPreferredWidth(75);
            JTable_borrowhistory.getColumnModel().getColumn(0).setMaxWidth(75);
            JTable_borrowhistory.getColumnModel().getColumn(1).setPreferredWidth(75);
            JTable_borrowhistory.getColumnModel().getColumn(1).setMaxWidth(75);
            JTable_borrowhistory.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTable_borrowhistory.getColumnModel().getColumn(4).setMaxWidth(100);
            JTable_borrowhistory.getColumnModel().getColumn(5).setPreferredWidth(100);
            JTable_borrowhistory.getColumnModel().getColumn(5).setMaxWidth(100);
            JTable_borrowhistory.getColumnModel().getColumn(6).setPreferredWidth(100);
            JTable_borrowhistory.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        lb_title.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_title.setText("ประวัติการยืม-คืนหนังสือ");

        lb_squaregreen.setBackground(new java.awt.Color(153, 255, 153));
        lb_squaregreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_squaregreen.setOpaque(true);

        lb_textreturned.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_textreturned.setText("คืนแล้ว");

        lb_squarered.setBackground(new java.awt.Color(255, 153, 153));
        lb_squarered.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_squarered.setOpaque(true);

        lb_textunreturn.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_textunreturn.setText("ยังไม่คืน");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JScrollPane_borrowhistory, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_squaregreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_textreturned)
                        .addGap(18, 18, 18)
                        .addComponent(lb_squarered, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_textunreturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_squaregreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_textreturned, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_squarered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_textunreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(JScrollPane_borrowhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane_borrowhistory;
    private javax.swing.JTable JTable_borrowhistory;
    private javax.swing.JLabel lb_squaregreen;
    private javax.swing.JLabel lb_squarered;
    private javax.swing.JLabel lb_textreturned;
    private javax.swing.JLabel lb_textunreturn;
    private javax.swing.JLabel lb_title;
    // End of variables declaration//GEN-END:variables

}
