import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPage extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public SignupPage() {
        setTitle("Kids Corner - Sign Up");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(new Color(144, 238, 144)); // Light green background color

        // Create center panel for signup components
        JPanel signupPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        signupPanel.setBackground(new Color(144, 238, 144)); // Light green background color
        signupPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Name input box
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Email input box
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Phone number input box
        JLabel phoneLabel = new JLabel("Phone No:");
        phoneField = new JTextField();
        phoneField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Password input box
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Register button
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBackground(new Color(0, 100, 0)); // Dark green color
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);

        // Add components to the signup panel
        signupPanel.add(nameLabel);
        signupPanel.add(nameField);
        signupPanel.add(emailLabel);
        signupPanel.add(emailField);
        signupPanel.add(phoneLabel);
        signupPanel.add(phoneField);
        signupPanel.add(passwordLabel);
        signupPanel.add(passwordField);
        signupPanel.add(registerButton);

        // Add signup panel to the container panel
        containerPanel.add(signupPanel, BorderLayout.CENTER);

        setContentPane(containerPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Handle register button click event
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String password = new String(passwordField.getPassword());

            // Perform registration process here
            // ...
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SignupPage();
        });
    }
}