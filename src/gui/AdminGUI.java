package gui;

import java.awt.*;
import javax.swing.*;

public class AdminGUI {
    private AdminMenu menu;
    private static JFrame frame;
    private static JPanel pa_center;
    private static AdminSearch pa_search;
    private AdminBorrowNreturn pa_borrowNreturn;
    private static AdminHistory pa_history;
    private AdminBook pa_book;

    public AdminGUI() {
        frame = new JFrame("Library System");
        menu = new AdminMenu();
        menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        
        pa_center = new JPanel();
        pa_search = new AdminSearch();
        pa_borrowNreturn = new AdminBorrowNreturn();
        pa_history = new AdminHistory();
        pa_book = new AdminBook();
        
        pa_center.setLayout(new CardLayout());
        pa_center.add(pa_search, "panel_search");
        pa_center.add(pa_borrowNreturn, "panel_borrowNreturn");
        pa_center.add(pa_history, "panel_history");
        pa_center.add(pa_book, "panel_book");

        frame.add(menu, BorderLayout.WEST);
        frame.add(pa_center, BorderLayout.CENTER);

        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 

    public static void getCenterPanel(String panel_name){
        CardLayout card = (CardLayout)(pa_center.getLayout());
        card.show(pa_center, panel_name);
        System.out.println("Change to " + panel_name);
    }
    
    public static void updateSearchTable(){
        pa_search.updateSearchTable();
        System.out.println("Update Search Table");
    }

    public static void updateBorrowhistoryTable(){
        pa_history.updateBorrowhistoryTable();
        System.out.println("Update Borrowhistory Table");
    }
    
    public static void logout() {
        frame.dispose();
        new LoginForm();
    }
    
}
