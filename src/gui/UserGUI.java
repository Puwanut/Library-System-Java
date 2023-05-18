/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author IsilenceT
 */
public class UserGUI {

    private UserMenu menu;
    private static JFrame frame;
    private static JPanel pa_center;
    private UserSearch pa_search;
    private UserBorrow pa_borrow;
    private UserHistory pa_history;

    public UserGUI(int userid) {
        frame = new JFrame("Library System");
        menu = new UserMenu(userid);
        menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));

        pa_center = new JPanel();
        pa_search = new UserSearch();
        pa_borrow = new UserBorrow(userid);
        pa_history = new UserHistory(userid);

        pa_center.setLayout(new CardLayout());
        pa_center.add(pa_search, "panel_search");
        pa_center.add(pa_borrow, "panel_borrow");
        pa_center.add(pa_history, "panel_history");

        frame.add(menu, BorderLayout.WEST);
        frame.add(pa_center, BorderLayout.CENTER);

        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void getCenterPanel(String panel_name) {
        CardLayout card = (CardLayout) (pa_center.getLayout());
        card.show(pa_center, panel_name);
        System.out.println("Change to " + panel_name);
    }

    public static void logout() {
        frame.dispose();
        new LoginForm();
    }

}
