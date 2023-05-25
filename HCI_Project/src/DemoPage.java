import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoPage extends JFrame implements ActionListener {

    private JButton loginButton;

    public DemoPage() {
        setTitle("Kids Corner - Demo Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(Color.WHITE); // White background color

        // Create header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(173, 216, 230)); // Light blue background color

        JLabel headerLabel = new JLabel("Kids Corner");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        headerPanel.add(headerLabel);

        // Create content panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE); // White background color
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel contentBox = new JPanel();
        contentBox.setBackground(new Color(144, 238, 144)); // Light green background color
        contentBox.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel discoverLabel = new JLabel("Discover Our Content");
        discoverLabel.setForeground(Color.BLACK);
        discoverLabel.setFont(new Font("Arial", Font.BOLD, 18));
        discoverLabel.setHorizontalAlignment(SwingConstants.CENTER);

        String[] contentTitles = {
                "Shapes",
                "Colors",
                "Dimension",
                "Languages",
                "Numbers"
        };

        String[] contentTexts = {
                "Figure recognition is the fundamental character of an intelligent child and it will make them smart",
                "This is a perfect aspect for a new hobby",
                "3D dimensions are the future",
                "No matter what your future is, be ready to speak any language",
                "A number system is a set of symbols or numbers that are used to represent numbers"
        };

        for (int i = 0; i < 5; i++) {
            JLabel titleLabel = new JLabel(contentTitles[i]);
            titleLabel.setForeground(Color.WHITE);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

            JLabel contentLabel = new JLabel(contentTexts[i]);
            contentLabel.setForeground(Color.WHITE);
            contentLabel.setFont(new Font("Arial", Font.PLAIN, 14));

            contentBox.add(titleLabel);
            contentBox.add(contentLabel);
        }

        contentPanel.add(discoverLabel, BorderLayout.NORTH);
        contentPanel.add(contentBox, BorderLayout.CENTER);

        // Create login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(new Color(0, 100, 0)); // Dark green color
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new Dimension(120, 40));

        // Add components to the container panel
        containerPanel.add(headerPanel, BorderLayout.NORTH);
        containerPanel.add(contentPanel, BorderLayout.CENTER);
        containerPanel.add(loginButton, BorderLayout.SOUTH);

        setContentPane(containerPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Handle login button click event
            // Perform necessary actions to direct the user to the demo page
            // ...
        }
    }

    public static void main(String[] args) {
        DemoPage demoPage = new DemoPage();
    }
}