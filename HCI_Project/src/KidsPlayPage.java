import javax.swing.*;
import java.awt.*;

public class KidsPlayPage extends JFrame {

    public KidsPlayPage() {
        setTitle("Kids Play");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a container panel with BorderLayout
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(Color.WHITE); // White background color

        // Create vertical box panel
        JPanel verticalBoxPanel = new JPanel();
        verticalBoxPanel.setLayout(new BoxLayout(verticalBoxPanel, BoxLayout.Y_AXIS));
        verticalBoxPanel.setBackground(new Color(0, 128, 128)); // Teal color

        // Create vertical contents
        String[] verticalContents = {
                "Dashboard", "Build Pictures", "My Shapes", "Shapes Library", "Exercises", "Tutorials", "Settings"
        };

        for (String content : verticalContents) {
            JLabel contentLabel = new JLabel(content);
            contentLabel.setFont(new Font("Arial", Font.BOLD, 16));
            contentLabel.setForeground(Color.WHITE);
            contentLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            verticalBoxPanel.add(contentLabel);
        }

        // Create horizontal box panel
        JPanel horizontalBoxPanel = new JPanel();
        horizontalBoxPanel.setLayout(new BoxLayout(horizontalBoxPanel, BoxLayout.X_AXIS));
        horizontalBoxPanel.setBackground(Color.WHITE); // White background color

        // Create horizontal contents
        String[] horizontalContents = {
                "All", "Basic", "Fancy", "Lines", "Signs", "Trending"
        };

        for (String content : horizontalContents) {
            JButton contentButton = new JButton(content);
            contentButton.setFont(new Font("Arial", Font.BOLD, 14));
            contentButton.setBackground(Color.WHITE);
            contentButton.setFocusPainted(false);
            contentButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            horizontalBoxPanel.add(contentButton);
        }

        // Create search bar panel
        JPanel searchBarPanel = new JPanel();
        searchBarPanel.setBackground(Color.WHITE);
        searchBarPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JTextField searchBarField = new JTextField(20);
        searchBarField.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton searchButton = new JButton("Search");
        searchButton.setFont(new Font("Arial", Font.BOLD, 12));
        searchButton.setFocusPainted(false);

        searchBarPanel.add(searchBarField);
        searchBarPanel.add(searchButton);

        // Create basic shapes panel
        JPanel basicShapesPanel = new JPanel(new GridLayout(4, 5, 10, 10));
        basicShapesPanel.setBackground(Color.WHITE);
        basicShapesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create basic shapes labels
        String[] shapeNames = {
                "Triangle", "Circle", "Rectangle", "Square", "Star",
                "Heart", "Oval", "Hexagon", "Pentagon", "Octagon",
                "Diamond", "Arrow", "Crescent", "Cloud", "Flower",
                "Sun", "Moon", "House", "Tree", "Car"
        };

        for (String shape : shapeNames) {
            JLabel shapeLabel = new JLabel(shape);
            shapeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            shapeLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            shapeLabel.setOpaque(true);
            shapeLabel.setBackground(Color.LIGHT_GRAY);
            shapeLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            basicShapesPanel.add(shapeLabel);
        }

        // Add components to container panel
        containerPanel.add(verticalBoxPanel, BorderLayout.WEST);
        containerPanel.add(horizontalBoxPanel, BorderLayout.NORTH);
        containerPanel.add(searchBarPanel, BorderLayout.EAST);
        containerPanel.add(basicShapesPanel, BorderLayout.CENTER);

        // Add container panel to the frame
        add(containerPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KidsPlayPage().setVisible(true);
            }
        });
    }
}