/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import database.Connect;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author IsilenceT
 */
public class UserMenu extends javax.swing.JPanel {

    /**
     * Creates new form UserMenu
     */
    private int userid;
    
    public UserMenu(int userid) {
        initComponents();
        setUserFirstname(userid);
        
        ImageIcon icon_search = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_search.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        ImageIcon icon_borrow = new ImageIcon(new ImageIcon(getClass().getResource("../image/list-bookborrow.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        ImageIcon icon_book = new ImageIcon(new ImageIcon(getClass().getResource("../image/open-bookborrow.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        ImageIcon icon_logout = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        
        lb_menu_search.setIcon(icon_search);
        lb_menu_borrow.setIcon(icon_borrow);
        lb_menu_history.setIcon(icon_book);
        lb_menu_logout.setIcon(icon_logout);
        
    }
    
    public void setUserFirstname(int userid){
        try {
            Connection con = Connect.connectDB();
            String queryname = "SELECT fname FROM userinfo WHERE userid = " + userid;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(queryname);
            if (rs.next())
                lb_userFirstname.setText(rs.getString("fname"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void lb_menu_mouseentered(MouseEvent evt){
        ((JLabel) evt.getSource()).setForeground(Color.red);
    }
    
    public void lb_menu_mouseexited(MouseEvent evt){
        ((JLabel) evt.getSource()).setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_userFirstname = new javax.swing.JLabel();
        lb_menu_search = new javax.swing.JLabel();
        lb_menu_borrow = new javax.swing.JLabel();
        lb_menu_history = new javax.swing.JLabel();
        lb_menu_logout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        lb_userFirstname.setBackground(new java.awt.Color(153, 255, 204));
        lb_userFirstname.setFont(new java.awt.Font("Kanit", 1, 26)); // NOI18N
        lb_userFirstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_userFirstname.setText("(ชื่อ User)");
        lb_userFirstname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        lb_userFirstname.setOpaque(true);

        lb_menu_search.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_menu_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menu_search.setText("ค้นหาหนังสือ");
        lb_menu_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_menu_search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_menu_search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_menu_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_searchMouseExited(evt);
            }
        });

        lb_menu_borrow.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_menu_borrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menu_borrow.setText("<html><body style=\"text-align: center\">รายการ<br>หนังสือที่ยืม</body></html>");
        lb_menu_borrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_menu_borrow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_menu_borrow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_menu_borrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_borrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_borrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_borrowMouseExited(evt);
            }
        });

        lb_menu_history.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_menu_history.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menu_history.setText("<html><body style=\"text-align: center\">ประวัติการ<br>ยืม-คืนหนังสือ</body></html>");
        lb_menu_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_menu_history.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_menu_history.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_menu_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_historyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_historyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_historyMouseExited(evt);
            }
        });

        lb_menu_logout.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_menu_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menu_logout.setText("Logout");
        lb_menu_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_userFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(lb_menu_borrow)
            .addComponent(lb_menu_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_menu_history, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lb_menu_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_userFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_menu_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_menu_borrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_menu_history)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(lb_menu_logout)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lb_menu_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_searchMouseClicked
        UserGUI.getCenterPanel("panel_search");
    }//GEN-LAST:event_lb_menu_searchMouseClicked

    private void lb_menu_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_searchMouseEntered
        lb_menu_mouseentered(evt);
    }//GEN-LAST:event_lb_menu_searchMouseEntered

    private void lb_menu_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_searchMouseExited
        lb_menu_mouseexited(evt);
    }//GEN-LAST:event_lb_menu_searchMouseExited

    private void lb_menu_borrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_borrowMouseClicked
        UserGUI.getCenterPanel("panel_borrow");
    }//GEN-LAST:event_lb_menu_borrowMouseClicked

    private void lb_menu_borrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_borrowMouseEntered
        lb_menu_mouseentered(evt);
    }//GEN-LAST:event_lb_menu_borrowMouseEntered

    private void lb_menu_borrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_borrowMouseExited
        lb_menu_mouseexited(evt);
    }//GEN-LAST:event_lb_menu_borrowMouseExited

    private void lb_menu_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_historyMouseClicked
        UserGUI.getCenterPanel("panel_history");
    }//GEN-LAST:event_lb_menu_historyMouseClicked

    private void lb_menu_historyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_historyMouseEntered
        lb_menu_mouseentered(evt);
    }//GEN-LAST:event_lb_menu_historyMouseEntered

    private void lb_menu_historyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_historyMouseExited
        lb_menu_mouseexited(evt);
    }//GEN-LAST:event_lb_menu_historyMouseExited

    private void lb_menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_logoutMouseClicked
        UserGUI.logout();
    }//GEN-LAST:event_lb_menu_logoutMouseClicked

    private void lb_menu_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_logoutMouseEntered
        lb_menu_mouseentered(evt);
    }//GEN-LAST:event_lb_menu_logoutMouseEntered

    private void lb_menu_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_logoutMouseExited
        lb_menu_mouseexited(evt);
    }//GEN-LAST:event_lb_menu_logoutMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_menu_borrow;
    private javax.swing.JLabel lb_menu_history;
    private javax.swing.JLabel lb_menu_logout;
    private javax.swing.JLabel lb_menu_search;
    private javax.swing.JLabel lb_userFirstname;
    // End of variables declaration//GEN-END:variables
}