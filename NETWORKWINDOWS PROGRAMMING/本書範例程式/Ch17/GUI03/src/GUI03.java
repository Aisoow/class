import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI03 {
    private JPanel rootPanel;
    private JLabel lblOutput;
    private JTextField txtOutput;

    public GUI03() {
        txtOutput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                    switch (key) {
                        case KeyEvent.VK_LEFT:
                            lblOutput.setText("向左"+Integer.toString(key));
                            break;
                        case KeyEvent.VK_RIGHT:
                            lblOutput.setText("向右"+Integer.toString(key));
                            break;
                        case KeyEvent.VK_UP:
                            lblOutput.setText("向上"+Integer.toString(key));
                            break;
                        case KeyEvent.VK_DOWN:
                            lblOutput.setText("向下"+Integer.toString(key));
                            break;
                        default: lblOutput.setText(Integer.toString(key));
                    }
            }
        });
        txtOutput.addKeyListener(new KeyAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI03");
        frame.setContentPane(new GUI03().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
