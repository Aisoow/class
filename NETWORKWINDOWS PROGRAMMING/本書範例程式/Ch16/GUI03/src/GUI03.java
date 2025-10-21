import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI03 {
    private JPanel rootPanel;
    private JTextArea txtComment;
    private JButton btnSend;
    private JLabel lblOutput;

    public GUI03() {
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblOutput.setText("留言:" + txtComment.getText());
            }
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
