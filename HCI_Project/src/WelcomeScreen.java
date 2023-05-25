import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame implements ActionListener {

    private JButton getStartedButton;

    public WelcomeScreen() {
        setTitle("Welcome to the App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());

        // Create left panel for welcome message and button
        JPanel welcomePanel = new JPanel(new BorderLayout());
        welcomePanel.setBackground(new Color(128, 0, 128)); // Custom purple color
        welcomePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel welcomeLabel = new JLabel("Let's Start");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel primaryPrivilegeLabel = new JLabel("Welcome to the primary privilege");
        primaryPrivilegeLabel.setForeground(Color.BLACK);
        primaryPrivilegeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        primaryPrivilegeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        primaryPrivilegeLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        getStartedButton = new JButton("Let's Begin");
        getStartedButton.addActionListener(this);
        getStartedButton.setPreferredSize(new Dimension(150, 40)); // Set preferred size
        getStartedButton.setFont(new Font("Arial", Font.BOLD, 16));
        getStartedButton.setBackground(new Color(0, 0, 128)); // Custom dark blue color
        getStartedButton.setForeground(Color.WHITE);
        getStartedButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        getStartedButton.setFocusPainted(false);
        getStartedButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        getStartedButton.setOpaque(true);

        welcomePanel.add(welcomeLabel, BorderLayout.NORTH);
        welcomePanel.add(primaryPrivilegeLabel, BorderLayout.CENTER);
        welcomePanel.add(getStartedButton, BorderLayout.SOUTH);

        containerPanel.add(welcomePanel, BorderLayout.CENTER);

        setContentPane(containerPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getStartedButton) {
            // Handle button click event
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new WelcomeScreen();
        });
    }
}