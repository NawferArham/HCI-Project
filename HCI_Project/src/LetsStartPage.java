import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetsStartPage extends JFrame implements ActionListener {

    private JButton startButton;

    public LetsStartPage() {
        setTitle("Kids Play - Let's Start");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(Color.WHITE); // White background color

        // Create rectangle panel
        JPanel rectanglePanel = new JPanel();
        rectanglePanel.setBackground(new Color(0, 128, 128)); // Teal color
        rectanglePanel.setPreferredSize(new Dimension(400, 250));

        // Create cat image label
        ImageIcon catImageIcon = new ImageIcon("cat.png"); // Replace "cat.png" with the actual image file
        JLabel catImageLabel = new JLabel(catImageIcon);

        rectanglePanel.add(catImageLabel);

        // Create "Let's Start" panel
        JPanel letsStartPanel = new JPanel();
        letsStartPanel.setBackground(Color.WHITE);
        letsStartPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        JLabel letsStartLabel = new JLabel("Let's Start");
        letsStartLabel.setFont(new Font("Arial", Font.BOLD, 24));

        letsStartPanel.add(letsStartLabel);

        // Create start button
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        startButton.setFont(new Font("Arial", Font.BOLD, 16));
        startButton.setBackground(new Color(128, 0, 128)); // Purple color
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setPreferredSize(new Dimension(120, 40));

        // Create drag and drop panel
        JPanel dragDropPanel = new JPanel();
        dragDropPanel.setBackground(Color.WHITE);
        dragDropPanel.setPreferredSize(new Dimension(300, 100));

        // Create shapes labels for drag and drop
        JLabel[] shapeLabels = new JLabel[6];
        String[] shapeNames = {"Square", "Rectangle", "Circle", "Star", "Triangle", "Big Circle"};

        for (int i = 0; i < 6; i++) {
            shapeLabels[i] = new JLabel(shapeNames[i]);
            shapeLabels[i].setFont(new Font("Arial", Font.PLAIN, 14));
            shapeLabels[i].setPreferredSize(new Dimension(80, 20));
            shapeLabels[i].setOpaque(true);
            shapeLabels[i].setBackground(Color.LIGHT_GRAY);
            shapeLabels[i].setHorizontalAlignment(SwingConstants.CENTER);

            // Enable drag and drop for shapes
            shapeLabels[i].setTransferHandler(new TransferHandler("text"));
            shapeLabels[i].setEnabled(true);

            dragDropPanel.add(shapeLabels[i]);
        }

        // Create pencils panel
        JPanel pencilsPanel = new JPanel();
        pencilsPanel.setBackground(Color.WHITE);
        pencilsPanel.setPreferredSize(new Dimension(300, 50));

        // Create pencil labels
        JLabel[] pencilLabels = new JLabel[10];
        Color[] pencilColors = {
                Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE,
                Color.PINK, Color.CYAN, Color.MAGENTA, Color.GRAY, Color.BLACK
        };

        for (int i = 0; i < 10; i++) {
            pencilLabels[i] = new JLabel();
            pencilLabels[i].setPreferredSize(new Dimension(20, 40));
            pencilLabels[i].setOpaque(true);
            pencilLabels[i].setBackground(pencilColors[i]);
            pencilLabels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // Enable drag and drop for pencils
            pencilLabels[i].setTransferHandler(new TransferHandler("background"));
            pencilLabels[i].setEnabled(true);

            pencilsPanel.add(pencilLabels[i]);
        }

        // Add components to container panel
        containerPanel.add(rectanglePanel, BorderLayout.NORTH);
        containerPanel.add(letsStartPanel, BorderLayout.CENTER);
        containerPanel.add(startButton, BorderLayout.SOUTH);
        containerPanel.add(dragDropPanel, BorderLayout.WEST);
        containerPanel.add(pencilsPanel, BorderLayout.EAST);

        // Add container panel to the frame
        add(containerPanel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            // Perform the desired action when the start button is clicked
            // For example, navigate to another page or start the game
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LetsStartPage();
            }
        });
    }}