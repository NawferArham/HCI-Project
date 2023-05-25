import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class ShapePage extends JFrame {

    public ShapePage() {
        setTitle("Shape Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        // Create rectangles with different shapes and background colors
        RectanglePanel triangle = createRectangle(Color.YELLOW, "Triangle", "triangle.jpg");
        RectanglePanel square = createRectangle(new Color(255, 255, 153), "Square", "square.jpg");
        RectanglePanel star = createRectangle(Color.BLUE, "Star", "star.jpg");
        RectanglePanel otherShapes = createRectangle(new Color(204, 229, 255), "Other Shapes", "othershapes.jpg");
        RectanglePanel circle = createRectangle(Color.PINK, "Circle", "circle.jpg");
        RectanglePanel rectangle = createRectangle(new Color(153, 102, 255), "Rectangle", "rectangle.jpg");

        // Add rectangles to the frame
        add(triangle);
        add(square);
        add(star);
        add(otherShapes);
        add(circle);
        add(rectangle);

        setSize(800, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private RectanglePanel createRectangle(Color bgColor, String shapeName, String imageName) {
        RectanglePanel rectangle = new RectanglePanel(bgColor, shapeName, imageName);
        rectangle.addMouseListener((MouseListener) new ShapeClickListener());
        return rectangle;
    }

    private class ShapeClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            RectanglePanel rectangle = (RectanglePanel) e.getSource();
            String shapeName = rectangle.getShapeName();
            System.out.println("Clicked on " + shapeName); // Redirect logic goes here
        }
    }

    private class RectanglePanel extends JPanel {
        private final Color bgColor;
        private final String shapeName;
        private final String imageName;

        public RectanglePanel(Color bgColor, String shapeName, String imageName) {
            this.bgColor = bgColor;
            this.shapeName = shapeName;
            this.imageName = imageName;
            setBackground(Color.WHITE);
        }

        public String getShapeName() {
            return shapeName;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(bgColor);
            g.fillRect(0, 0, getWidth(), getHeight());

            // Load and draw the image
            ImageIcon imageIcon = new ImageIcon(imageName);
            Image image = imageIcon.getImage();
            int xPos = (getWidth() - image.getWidth(null)) / 2;
            int yPos = (getHeight() - image.getHeight(null)) / 2;
            g.drawImage(image, xPos, yPos, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShapePage::new);
    }
}