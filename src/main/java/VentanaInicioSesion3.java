import javax.swing.*;
import java.awt.*;

public class VentanaInicioSesion3 {

    private JPanel Jpane;

    // Constructor
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
                    "C:/Users/Usuario1/Documents/GitHub/Desarrollo-de-interfaces/InterfazMaven/src/main/resources/Image/fondo3.gif  "
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
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
