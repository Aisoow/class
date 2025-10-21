import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class GUI02 {
    private JPanel rootPanel;
    private JTextField txtMouse;

    public GUI02() {
        txtMouse.setBackground(Color.white);
        txtMouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                txtMouse.setText("mousePressed");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                txtMouse.setText("mouseEntered");
                txtMouse.setBackground(Color.yellow);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                txtMouse.setText("mouseExited");
                txtMouse.setBackground(Color.white);
            }
        });
        txtMouse.addMouseListener(new MouseAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI02");
        frame.setContentPane(new GUI02().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
