import javax.swing.*;
import java.awt.GridLayout;

public class BookstoreMgM {
    private JTabbedPane tabbedPane1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bookstore Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null); // Center the frame on the screen

            // Create a tabbed pane to switch between Books, Magazines, and Newspapers
            JTabbedPane tabbedPane = new JTabbedPane();

            // Create panels for Books, Magazines, and Newspapers
            JPanel booksPanel = createBooksPanel();
            JPanel magazinesPanel = createMagazinesPanel();
            JPanel newspapersPanel = createNewspapersPanel();

            // Add panels to the tabbed pane
            tabbedPane.addTab("Books", booksPanel);
            tabbedPane.addTab("Magazines", magazinesPanel);
            tabbedPane.addTab("Newspapers", newspapersPanel);

            frame.add(tabbedPane);
            frame.setVisible(true);
        });
    }

    static JPanel createBooksPanel() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 5));

        // Add labels and text fields for Book information
        panel.add(new JLabel("Book ID:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Title:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Availability:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Author:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Genre:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Publish:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Price:"));
        panel.add(new JTextField());

        return panel;
    }

    static JPanel createMagazinesPanel() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 5));

        // Add labels and text fields for Magazine information
        panel.add(new JLabel("Magazine ID:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Title:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Availability:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Genre:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Price:"));
        panel.add(new JTextField());

        return panel;
    }


    private static JPanel createNewspapersPanel() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 5));

        // Add labels and text fields for Newspaper information
        panel.add(new JLabel("Newspaper ID:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Title:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Availability:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Genre:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Price:"));
        panel.add(new JTextField());

        return panel;

    }
}
