import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class theGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel radioBs;
    private JRadioButton circleRadio;
    private JRadioButton rectangleRadio;
    private JRadioButton triangleRadio;
    private JRadioButton squareRadio;
    private JComboBox polygons;
    private JButton cancelButton;
    private JButton okButton;
    private JPanel downButtons;

    public theGUI() {
        super("the shit");
        setContentPane(mainPanel);
        ButtonGroup group = new ButtonGroup();
        group.add(squareRadio);
        group.add(triangleRadio);
        group.add(rectangleRadio);
        group.add(circleRadio);
//        setContentPane(radioBs);
//        setContentPane(downButtons);
        squareRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == squareRadio) {
                    JOptionPane.showMessageDialog(null, "the square has been selected");
                }
            }
        });
        circleRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == circleRadio) {
                    JOptionPane.showMessageDialog(null, "the circle has been selected");
                }
            }
        });
        triangleRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == triangleRadio) {
                    JOptionPane.showMessageDialog(null, "the triangle has been selected");
                }
            }
        });
        rectangleRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == rectangleRadio) {
                    JOptionPane.showMessageDialog(null, "the rectangle has been selected");
                }
            }
        });
        polygons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == polygons) {
                    JComboBox cb = (JComboBox) e.getSource();
                    String message = (String) cb.getSelectedItem();
                    switch (message) {
                        case "pentagon":
                            JOptionPane.showMessageDialog(null, "your selection has been pentagon");
                            break;
                        case "hexagon":
                            JOptionPane.showMessageDialog(null, "your selection has been hexagon");
                            break;
                        case "heptagon":
                            JOptionPane.showMessageDialog(null, "Your selection has been heptagon");
                            break;
                        case "octagon":
                            JOptionPane.showMessageDialog(null, "Your selection has been octagon");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No option has been selected");
                    }
                }
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "ok");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame cesar = new theGUI();
                cesar.setSize(500, 500);
                cesar.setVisible(true);

            }
        });
    }
}