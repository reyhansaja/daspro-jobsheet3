import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class nganu extends JPanel implements ActionListener{
    private double angle = 0;  // Rotation angle for petals
    private Timer timer;

    public nganu() {
        // Set up a timer that triggers the repaint every 50 milliseconds (for smooth animation)
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Enable anti-aliasing for smooth drawing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Get the center of the panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        // Set color for flower's center
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - 20, centerY - 20, 40, 40);  // Draw the center of the flower
        
        // Set color for petals
        g2d.setColor(Color.PINK);
        
        // Rotate and draw petals
        for (int i = 0; i < 6; i++) {
            g2d.rotate(Math.toRadians(angle + i * 60), centerX, centerY);
            g2d.fillOval(centerX - 10, centerY - 80, 20, 60);  // Draw petal
            g2d.rotate(Math.toRadians(-(angle + i * 60)), centerX, centerY);  // Reset rotation
        }
        
        // Draw stem
        g2d.setColor(Color.GREEN);
        g2d.fillRect(centerX - 5, centerY + 20, 10, 100);  // Vertical stem
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the rotation angle for petals
        angle += 2;  // Adjust speed by changing the increment
        repaint();  // Repaint the panel
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated Flower");
        nganu flower = new nganu();

        frame.add(flower);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}