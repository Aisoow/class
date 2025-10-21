import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIForm {
    private JPanel rootPanel;
    private JTextField txtHeight;
    private JTextField txtWeight;
    private JButton btnBMI;
    private JLabel lblOutput;

    public BMIForm() {
        btnBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double h = Double.parseDouble(txtHeight.getText()) / 100.0;
                double w = Double.parseDouble(txtWeight.getText());
                double bmi = w / (h * h);
                lblOutput.setText("BMI值: " + bmi);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMIForm");
        frame.setContentPane(new BMIForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
