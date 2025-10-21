import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI07 {
    private JPanel rootPanel;
    private JList lstNames;
    private JList lstItems;
    private JButton btnSelect;
    private JLabel lblOutput;

    public GUI07() {
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = "";
                if (lstNames.getSelectedIndex() != -1)
                    str = (String ) lstNames.getSelectedValue();
                if (!lstItems.isSelectionEmpty()) {
                    str = "";
                    for (Object item : lstItems.getSelectedValuesList())
                        str = str + (String) item + " ";
                }
                lblOutput.setText(str);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI07");
        frame.setContentPane(new GUI07().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
