import javax.swing.*;
import java.awt.*;

public class VentanaInicioSesion3 {

    private JPanel Jpane;
    private JLabel SignInLabel;
    private JRadioButton TermsCheckbox;
    private JButton button1;
    private JTextField textField1;
    private JLabel UserLabel;
    private JComboBox comboBox1;
    private JPasswordField passwordField1;
    private JCheckBox checkBoxRemember;

    // Constructor
    public VentanaInicioSesion3() {
        // Envolver el panel generado por IntelliJ dentro de un FondoPanel
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());

        // Hacemos transparente el Jpane original y lo ponemos encima del fondo
        if (Jpane == null) Jpane = new JPanel(); // por si es null
        Jpane.setOpaque(false);
        fondo.add(Jpane, BorderLayout.CENTER);

        Jpane = fondo; // reasigno para que el JFrame lo use
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    // Clase interna para el fondo animado más lento
    private static class FondoPanel extends JPanel {
        private final ImageIcon imagenIcon;

        public FondoPanel() {
            imagenIcon = new ImageIcon(
                    "C:/Users/Usuario1/Documents/GitHub/Desarrollo-de-interfaces/InterfazMaven/src/main/resources/Image/parallax-woods.gif"
            );

            // Timer para ralentizar la animación del GIF
            Timer timer = new Timer(200, e -> repaint()); // 200ms entre repaints (ajusta a tu gusto)
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imagenIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaInicioSesion3");
        frame.setContentPane(new VentanaInicioSesion3().Jpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
