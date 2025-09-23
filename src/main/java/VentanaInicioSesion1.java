import javax.swing.*;

public class VentanaInicioSesion1 {
    private JPanel Panel01;
    private JLabel TituloLabel;
    private JRadioButton CheckmarkPolities;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel UserLabel;
    private JLabel PasswordLabel;
    private JButton button1;
    private JRadioButton CheckMarkNews;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaInicioSesion1");
        frame.setContentPane(new VentanaInicioSesion1().Panel01);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
