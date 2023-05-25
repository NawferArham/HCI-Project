

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPage extends JFrame implements ActionListener {

    private JButton sendMessageButton;
    private JTextField nameField, ageField, emailField, mobileField;
    private JTextArea messageArea;

    public SettingsPage() {
        setTitle("Kids Play - Settings");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(Color.WHITE);

        // Create header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(0, 128, 128)); // Teal color
        JLabel headerLabel = new JLabel("Profile");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);

        // Create profile panel
        JPanel profilePanel = new JPanel();
        profilePanel.setBackground(Color.WHITE);
        profilePanel.setLayout(new GridLayout(5, 2, 10, 10));
        profilePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel mobileLabel = new JLabel("Mobile No:");

        nameField = new JTextField();
        ageField = new JTextField();
        emailField = new JTextField();
        mobileField = new JTextField();

        profilePanel.add(nameLabel);
        profilePanel.add(nameField);
        profilePanel.add(ageLabel);
        profilePanel.add(ageField);
        profilePanel.add(emailLabel);
        profilePanel.add(emailField);
        profilePanel.add(mobileLabel);
        profilePanel.add(mobileField);

        // Create topics panel
        JPanel topicsPanel = new JPanel();
        topicsPanel.setBackground(Color.WHITE);
        topicsPanel.setLayout(new GridLayout(4, 1, 10, 10));
        topicsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton feedbackButton = new JButton("Teacher Feedback Portal");
        JButton contactButton = new JButton("Contact Us");
        JButton faqButton = new JButton("FAQ");

        topicsPanel.add(feedbackButton);
        topicsPanel.add(contactButton);
        topicsPanel.add(faqButton);

        // Create message panel
        JPanel messagePanel = new JPanel(new BorderLayout());
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel messageLabel = new JLabel("Message:");
        messageArea = new JTextArea();
        messageArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        sendMessageButton = new JButton("Send");
        sendMessageButton.addActionListener(this);
        sendMessageButton.setPreferredSize(new Dimension(80, 30));
        sendMessageButton.setBackground(new Color(128, 0, 128)); // Purple color
        sendMessageButton.setForeground(Color.WHITE);

        messagePanel.add(messageLabel, BorderLayout.NORTH);
        messagePanel.add(scrollPane, BorderLayout.CENTER);
        messagePanel.add(sendMessageButton, BorderLayout.SOUTH);

        // Add components to container panel
        containerPanel.add(headerPanel, BorderLayout.NORTH);
        containerPanel.add(profilePanel, BorderLayout.WEST);
        containerPanel.add(topicsPanel, BorderLayout.CENTER);
        containerPanel.add(messagePanel, BorderLayout.EAST);

        // Add container panel to the frame
        setContentPane(containerPanel);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sendMessageButton)

        // Validate user input
        if (name.isEmpty() || age.isEmpty() || email.isEmpty() || mobile.isEmpty() || message.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Send message to customer support
            // ...
            JOptionPane.showMessageDialog(this, "Message sent successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void main(String[] args) {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.setVisible(true);
    }}