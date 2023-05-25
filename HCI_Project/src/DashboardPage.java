import javax.swing.*;
import java.awt.*;

public class DashboardPage extends JFrame {

    private final String userName;

    public DashboardPage(String userName) {
        this.userName = userName;

        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create welcome note panel
        JPanel welcomePanel = createWelcomePanel();
        add(welcomePanel, BorderLayout.NORTH);

        // Create rectangles panel
        JPanel rectanglesPanel = createRectanglesPanel();
        add(rectanglesPanel, BorderLayout.CENTER);

        // Create progress panel
        JPanel progressPanel = createProgressPanel();
        add(progressPanel, BorderLayout.SOUTH);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createWelcomePanel() {
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(Color.WHITE);
        JLabel welcomeLabel = new JLabel("Hi " + userName + "!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomePanel.add(welcomeLabel);
        return welcomePanel;
    }

    private JPanel createRectanglesPanel() {
        JPanel rectanglesPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        rectanglesPanel.setBackground(Color.WHITE);

        RectanglePanel buildPictures = createRectangle(Color.LIGHT_GRAY, "Build Pictures");
        RectanglePanel shapesLibrary = createRectangle(Color.LIGHT_GRAY, "My Shapes Library");
        RectanglePanel exercise = createRectangle(Color.LIGHT_GRAY, "Exercise");
        RectanglePanel tutorials = createRectangle(Color.LIGHT_GRAY, "Tutorials");

        rectanglesPanel.add(buildPictures);
        rectanglesPanel.add(shapesLibrary);
        rectanglesPanel.add(exercise);
        rectanglesPanel.add(tutorials);

        return rectanglesPanel;
    }

    private JPanel createProgressPanel() {
        JPanel progressPanel = new JPanel(new BorderLayout());
        progressPanel.setBackground(Color.WHITE);

        RectanglePanel progress = createBigRectangle(Color.LIGHT_GRAY, "My Progress");
        progress.setPreferredSize(new Dimension(600, 200));

        JPanel progressDetailsPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        progressDetailsPanel.setBackground(Color.WHITE);

        RectanglePanel exerciseProgress = createRectangle(Color.LIGHT_GRAY, "Exercise Progress");
        RectanglePanel tutorialProgress = createRectangle(Color.LIGHT_GRAY, "Tutorial Progress");
        RectanglePanel shapeDesignProgress = createRectangle(Color.LIGHT_GRAY, "Shape Design Progress");

        progressDetailsPanel.add(exerciseProgress);
        progressDetailsPanel.add(tutorialProgress);
        progressDetailsPanel.add(shapeDesignProgress);

        progress.add(progressDetailsPanel, BorderLayout.CENTER);

        progressPanel.add(progress, BorderLayout.CENTER);

        return progressPanel;
    }

    private RectanglePanel createRectangle(Color bgColor, String title) {
        RectanglePanel rectangle = new RectanglePanel(bgColor, title);
        return rectangle;
    }

    private RectanglePanel createBigRectangle(Color bgColor, String title) {
        RectanglePanel rectangle = new RectanglePanel(bgColor, title);
        rectangle.setPreferredSize(new Dimension(400, 150));
        return rectangle;
    }

    private class RectanglePanel extends JPanel {
        private final Color bgColor;
        private final String title;

        public RectanglePanel(Color bgColor, String title) {
            this.bgColor = bgColor;
            this.title = title;
            setPreferredSize(new Dimension(150, 100));
            setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(bgColor);
            g.fillRect(0, 0,0,0);
                    g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 14));
            FontMetrics fm = g.getFontMetrics();
            int textWidth = fm.stringWidth(title);
            int textHeight = fm.getHeight();
            int x = (getWidth() - textWidth) / 2;
            int y = (getHeight() - textHeight) / 2 + fm.getAscent();
            g.drawString(title, x, y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String userName = "John"; // Replace with the actual user's name
            new DashboardPage(userName);
        });
    }}