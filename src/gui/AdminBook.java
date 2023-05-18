/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.Connect;
import java.awt.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author IsilenceT
 */
public class AdminBook extends javax.swing.JPanel {
    
    String bookimgpath;
    /**
     * Creates new form AdminBook
     */
    private JFileChooser file;
    
    public AdminBook() {
        initComponents();
        file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".jpg, .gif, .png", "jpg", "gif", "png");
        file.setFileFilter(filter);
    }

    public void getBookPanel(String panel_name){
        CardLayout bcards = (CardLayout)(pa_book_cards.getLayout());
        bcards.show(pa_book_cards, panel_name);
        System.out.println("Panel book cards: change to " + panel_name);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_tab_addbook = new javax.swing.JLabel();
        lb_tab_removebook = new javax.swing.JLabel();
        pa_book_cards = new javax.swing.JPanel();
        pa_addbook = new javax.swing.JPanel();
        lb_callnumber3 = new javax.swing.JLabel();
        tf_callnumber3 = new javax.swing.JTextField();
        lb_bookname3 = new javax.swing.JLabel();
        tf_bookname3 = new javax.swing.JTextField();
        lb_img_book3 = new javax.swing.JLabel();
        btn_addbook = new javax.swing.JButton();
        lb_bookname5 = new javax.swing.JLabel();
        btn_choosefile = new javax.swing.JButton();
        lb_filename = new javax.swing.JLabel();
        lb_bookauthor3 = new javax.swing.JLabel();
        tf_bookauthor3 = new javax.swing.JTextField();
        pa_removebook = new javax.swing.JPanel();
        lb_callnumber4 = new javax.swing.JLabel();
        tf_callnumber4 = new javax.swing.JTextField();
        lb_bookname4 = new javax.swing.JLabel();
        tf_bookname4 = new javax.swing.JTextField();
        lb_img_book4 = new javax.swing.JLabel();
        btn_removebook = new javax.swing.JButton();
        lb_bookauthor4 = new javax.swing.JLabel();
        tf_bookauthor4 = new javax.swing.JTextField();

        lb_tab_addbook.setBackground(new java.awt.Color(255, 204, 204));
        lb_tab_addbook.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        lb_tab_addbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tab_addbook.setText("เพิ่มข้อมูลหนังสือ");
        lb_tab_addbook.setOpaque(true);
        lb_tab_addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_tab_addbookMouseClicked(evt);
            }
        });

        lb_tab_removebook.setBackground(new java.awt.Color(153, 204, 255));
        lb_tab_removebook.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        lb_tab_removebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tab_removebook.setText("ลบข้อมูลหนังสือ");
        lb_tab_removebook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_tab_removebook.setOpaque(true);
        lb_tab_removebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_tab_removebookMouseClicked(evt);
            }
        });

        pa_book_cards.setPreferredSize(new java.awt.Dimension(1080, 620));
        pa_book_cards.setLayout(new java.awt.CardLayout());

        pa_addbook.setBackground(new java.awt.Color(255, 204, 204));

        lb_callnumber3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_callnumber3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_callnumber3.setText("รหัสเรียกหนังสือ : ");

        tf_callnumber3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N

        lb_bookname3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_bookname3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bookname3.setText("ชื่อหนังสือ : ");

        tf_bookname3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N

        lb_img_book3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_img_book3.setText("(รูปหนังสือ)");
        lb_img_book3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        btn_addbook.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        btn_addbook.setText("เพิ่มข้อมูลหนังสือ");
        btn_addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addbookActionPerformed(evt);
            }
        });

        lb_bookname5.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_bookname5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bookname5.setText("รูปปกหนังสือ : ");

        btn_choosefile.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        btn_choosefile.setText("Choose File");
        btn_choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choosefileActionPerformed(evt);
            }
        });

        lb_filename.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        lb_filename.setText("No file chosen");

        lb_bookauthor3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_bookauthor3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bookauthor3.setText("ชื่อผู้แต่ง : ");

        tf_bookauthor3.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N

        javax.swing.GroupLayout pa_addbookLayout = new javax.swing.GroupLayout(pa_addbook);
        pa_addbook.setLayout(pa_addbookLayout);
        pa_addbookLayout.setHorizontalGroup(
            pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_addbookLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pa_addbookLayout.createSequentialGroup()
                            .addComponent(lb_callnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_callnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pa_addbookLayout.createSequentialGroup()
                                .addComponent(lb_bookname3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_bookname3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pa_addbookLayout.createSequentialGroup()
                                .addComponent(lb_bookname5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_choosefile, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pa_addbookLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lb_bookauthor3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_bookauthor3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(lb_img_book3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(pa_addbookLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(btn_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_addbookLayout.setVerticalGroup(
            pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_addbookLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_addbookLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_callnumber3)
                            .addComponent(lb_callnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bookname3)
                            .addComponent(lb_bookname3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bookauthor3)
                            .addComponent(lb_bookauthor3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_bookname5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_choosefile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_filename)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pa_addbookLayout.createSequentialGroup()
                        .addComponent(lb_img_book3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 80, Short.MAX_VALUE)))
                .addComponent(btn_addbook)
                .addGap(30, 30, 30))
        );

        pa_book_cards.add(pa_addbook, "panel_addbook");

        pa_removebook.setBackground(new java.awt.Color(153, 204, 255));

        lb_callnumber4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_callnumber4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_callnumber4.setText("รหัสเรียกหนังสือ : ");

        tf_callnumber4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        tf_callnumber4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_callnumber4KeyReleased(evt);
            }
        });

        lb_bookname4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_bookname4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bookname4.setText("ชื่อหนังสือ : ");

        tf_bookname4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        tf_bookname4.setEnabled(false);

        lb_img_book4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_img_book4.setText("(รูปหนังสือ)");
        lb_img_book4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        btn_removebook.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        btn_removebook.setText("ลบข้อมูลหนังสือ");
        btn_removebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removebookActionPerformed(evt);
            }
        });

        lb_bookauthor4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        lb_bookauthor4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bookauthor4.setText("ชื่อผู้แต่ง : ");

        tf_bookauthor4.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        tf_bookauthor4.setEnabled(false);

        javax.swing.GroupLayout pa_removebookLayout = new javax.swing.GroupLayout(pa_removebook);
        pa_removebook.setLayout(pa_removebookLayout);
        pa_removebookLayout.setHorizontalGroup(
            pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_removebookLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pa_removebookLayout.createSequentialGroup()
                        .addComponent(lb_callnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_callnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pa_removebookLayout.createSequentialGroup()
                            .addComponent(lb_bookauthor4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_bookauthor4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pa_removebookLayout.createSequentialGroup()
                            .addComponent(lb_bookname4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_bookname4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 145, Short.MAX_VALUE)
                .addComponent(lb_img_book4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(pa_removebookLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(btn_removebook, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_removebookLayout.setVerticalGroup(
            pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_removebookLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_img_book4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pa_removebookLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_callnumber4)
                            .addComponent(lb_callnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bookname4)
                            .addComponent(lb_bookname4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_removebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bookauthor4)
                            .addComponent(lb_bookauthor4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btn_removebook)
                .addGap(30, 30, 30))
        );

        pa_book_cards.add(pa_removebook, "panel_removebook");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_tab_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lb_tab_removebook, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pa_book_cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tab_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tab_removebook, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pa_book_cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lb_tab_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_tab_addbookMouseClicked
        lb_tab_addbook.setBorder(null);
        lb_tab_removebook.setBorder(BorderFactory.createRaisedBevelBorder());
        getBookPanel("panel_addbook");
    }//GEN-LAST:event_lb_tab_addbookMouseClicked

    private void lb_tab_removebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_tab_removebookMouseClicked
        lb_tab_removebook.setBorder(null);
        lb_tab_addbook.setBorder(BorderFactory.createRaisedBevelBorder());
        getBookPanel("panel_removebook");
    }//GEN-LAST:event_lb_tab_removebookMouseClicked

    private void btn_choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choosefileActionPerformed
        int result = file.showOpenDialog(null);
        //if the user click on open in Jfilechooser
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            String filename = selectedFile.getName();
            System.out.println("Chosen file path: " + path);
            lb_filename.setText(filename);
            
            ImageIcon img_book_chosen = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH));
            lb_img_book3.setIcon(img_book_chosen);
            bookimgpath = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btn_choosefileActionPerformed

    private void btn_addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addbookActionPerformed
        try{
            Connection con = Connect.connectDB();
            String query = "INSERT INTO bookinfo(callnumber, bname, bookauthor, imgbook, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            InputStream is = new FileInputStream(new File(bookimgpath));
            pst.setString(1, tf_callnumber3.getText());
            pst.setString(2, tf_bookname3.getText());
            pst.setString(3, tf_bookauthor3.getText());
            pst.setBlob(4, is);
            pst.setBoolean(5, true);
            pst.executeUpdate();
            
            AdminGUI.updateSearchTable();
            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลหนังสือสำเร็จ");

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_addbookActionPerformed

    private void btn_removebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removebookActionPerformed
        try{
            Connection con = Connect.connectDB();
            String query = "DELETE FROM `bookinfo` WHERE callnumber=?";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, tf_callnumber4.getText());
            
            pst.executeUpdate();
            AdminGUI.updateSearchTable();
            JOptionPane.showMessageDialog(null, "ลบข้อมูลหนังสือสำเร็จ");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_removebookActionPerformed

    private void tf_callnumber4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_callnumber4KeyReleased
        try{
            Connection con = Connect.connectDB();
            String query = "SELECT * FROM `bookinfo` WHERE callnumber=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, tf_callnumber4.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                byte[] img = rs.getBytes("imgbook");
                tf_bookname4.setText(rs.getString("bname"));
                tf_bookauthor4.setText(rs.getString("bookauthor"));
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(lb_img_book4.getWidth(), lb_img_book4.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                lb_img_book4.setIcon(newImage);
                }
            else{
                tf_bookname4.setText("ไม่พบ");
                tf_bookauthor4.setText("ไม่พบ");
                ImageIcon img_book_chosen = new ImageIcon(new ImageIcon(getClass().getResource("../image/questionbook.jpg")).getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH));
                lb_img_book4.setIcon(img_book_chosen);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tf_callnumber4KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addbook;
    private javax.swing.JButton btn_choosefile;
    private javax.swing.JButton btn_removebook;
    private javax.swing.JLabel lb_bookauthor3;
    private javax.swing.JLabel lb_bookauthor4;
    private javax.swing.JLabel lb_bookname3;
    private javax.swing.JLabel lb_bookname4;
    private javax.swing.JLabel lb_bookname5;
    private javax.swing.JLabel lb_callnumber3;
    private javax.swing.JLabel lb_callnumber4;
    private javax.swing.JLabel lb_filename;
    private javax.swing.JLabel lb_img_book3;
    private javax.swing.JLabel lb_img_book4;
    private javax.swing.JLabel lb_tab_addbook;
    private javax.swing.JLabel lb_tab_removebook;
    private javax.swing.JPanel pa_addbook;
    private javax.swing.JPanel pa_book_cards;
    private javax.swing.JPanel pa_removebook;
    private javax.swing.JTextField tf_bookauthor3;
    private javax.swing.JTextField tf_bookauthor4;
    private javax.swing.JTextField tf_bookname3;
    private javax.swing.JTextField tf_bookname4;
    private javax.swing.JTextField tf_callnumber3;
    private javax.swing.JTextField tf_callnumber4;
    // End of variables declaration//GEN-END:variables
}
