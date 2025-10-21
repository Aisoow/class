import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class GUI04 {
    private JCheckBox chkGreen;
    private JPanel rootPanel;
    private JCheckBox chkRed;
    private JButton btnColor;

    public GUI04() {
        chkGreen.setMnemonic(KeyEvent.VK_G);
        chkRed.setMnemonic(KeyEvent.VK_R);
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( chkGreen.isSelected() )
                    btnColor.setForeground(Color.green);
                else
                    btnColor.setForeground(Color.black);
                if ( chkRed.isSelected() )
                    btnColor.setBackground(Color.red);
                else
                    btnColor.setBackground(Color.gray);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI04");
        frame.setContentPane(new GUI04().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
