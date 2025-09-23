import javax.swing.*;
import java.awt.*;

public class VentanaInicioSesion3 {

    private JPanel Jpane;
    private JTabbedPane tabbedPane1;
    private JTextPane Jtextpanel;
    private JRadioButton TermsChekMark;
    private JSplitPane Divisor;
    private JTextField textField1;
    private JLabel PasswordLabel;
    private JPasswordField passwordField1;
    private JButton button1;
    private JLabel UserNameLabel;
    private JLabel PasswLabel;
    private JTextField EmailField2;
    private JPasswordField passwordField2;
    private JSpinner spinner1;
    private JLabel AgeLabel;
    private JPanel panel01;
    private JLabel VidaLabel;
    private JLabel LevelLabel;
    private JProgressBar progressBar1;
    private JLabel NameLabel;
    private JSlider slider1;
    private JLabel XP;
    private JSpinner spinner2;

    public VentanaInicioSesion3() {
        // Envolver el panel generado por IntelliJ dentro de un FondoPanel
        VentanaInicioSesion3.FondoPanel fondo = new VentanaInicioSesion3.FondoPanel();
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
                    "src/main/resources/Image/pescao.gif"
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
        JFrame frame = new JFrame("VentanaInicioSesion3");
        frame.setContentPane(new VentanaInicioSesion3().Jpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
