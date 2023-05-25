import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {

    private JTextField nameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel forgetPasswordLabel;

    public LoginPage() {
        setTitle("Kids Corner - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(new Color(144, 238, 144)); // Light green background color

        // Create center panel for login components
        JPanel loginPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        loginPanel.setBackground(new Color(144, 238, 144)); // Light green background color
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Name input box
        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Password input box
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(new Color(128, 0, 128)); // Purple color
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);

        // Forget password label
        forgetPasswordLabel = new JLabel("Forgot Password?");
        forgetPasswordLabel.setForeground(Color.RED);
        forgetPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        forgetPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to the login panel
        loginPanel.add(nameField);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        // Add components to the container panel
        containerPanel.add(loginPanel, BorderLayout.CENTER);
        containerPanel.add(forgetPasswordLabel, BorderLayout.SOUTH);

        setContentPane(containerPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Handle login button click event
            String name = nameField.getText();
            String password = new String(passwordField.getPassword());

            // Perform login authentication here
            // ...
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginPage();
        });
    }
}