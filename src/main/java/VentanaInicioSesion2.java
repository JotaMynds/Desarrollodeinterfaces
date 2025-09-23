import javax.swing.*;
import java.awt.*;

public class VentanaInicioSesion2 {
    private JPanel Jpane;
    private JLabel SignInLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel UserLabel;
    private JRadioButton TermsCheckbox;
    private JComboBox comboBox1;
    private JButton button1;
    private JCheckBox checkBoxRemember;

    // Constructor
    public VentanaInicioSesion2() {
        // Envolver el panel generado por IntelliJ dentro de un FondoPanel
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());
        Jpane.setOpaque(false);
        fondo.add(Jpane, BorderLayout.CENTER); // pongo el Jpane original encima del fondo
        Jpane = fondo; // reasigno para que el JFrame lo use
    }

    // Clase interna para el fondo
    private static class FondoPanel extends JPanel {
        private final Image imagen;

        public FondoPanel() {
            imagen = new ImageIcon(
                    "C:/Users/Usuario1/Documents/GitHub/Desarrollo-de-interfaces/InterfazMaven/src/main/resources/Image/boliviainteligente-37WxvlfW3to-unsplash (1).jpg"
            ).getImage();
        }

        //Método para escalar la imagen a la ventana
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaInicioSesion2");
        frame.setContentPane(new VentanaInicioSesion2().Jpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
