import javax.swing.*;

public class VentanaInicioSesion1 {
    private JPanel Panel01;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaInicioSesion1");
        frame.setContentPane(new VentanaInicioSesion1().Panel01);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
