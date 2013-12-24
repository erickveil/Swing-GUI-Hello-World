import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by eveil on 12/24/13.
 */
public class MainWindow {
    private JButton bu_press;
    private JTextField tb_output;
    private JPanel MainPanel;

    public MainWindow() {
        bu_press.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tb_output.setText("Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
