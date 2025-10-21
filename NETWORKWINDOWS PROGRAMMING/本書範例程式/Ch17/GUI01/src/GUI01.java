import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI01 {
    private JPanel rootPanel;
    private JLabel lblOutput;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI01");
        frame.setContentPane(new GUI01().rootPanel);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.out.println("準備關閉視窗...");
                System.exit(0);
            }
            public void windowOpened(WindowEvent evt) {
                System.out.println("成功開啟視窗...");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}
