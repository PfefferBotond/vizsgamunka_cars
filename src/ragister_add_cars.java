import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ragister_add_cars {
    private JPanel Main;
    private JLabel brand;
    private JLabel model;
    private JLabel modelYear;
    private JLabel fuelType;
    private JLabel power;
    private JLabel gearType;
    private JLabel color;
    private JLabel chassiType;
    private JLabel doors;
    private JLabel fuelEconomy;
    private JLabel licencePlate;
    private JLabel CarName;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox fuel;
    private JTextField textField4;
    private JTextField car_name;
    private JTextField licence_plate;
    private JComboBox door_number;
    private JTextField fuel_Economy;
    private JComboBox chassi;
    private JTextField textField8;
    private JComboBox gear;
    private JButton Save;
    private JButton Delete;
    private JButton Update;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ragister_add_cars");
        frame.setContentPane(new ragister_add_cars().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ragister_add_cars() {
    Save.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
