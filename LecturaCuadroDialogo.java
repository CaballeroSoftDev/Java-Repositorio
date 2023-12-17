import javax.swing.JOptionPane;

public class LecturaCuadroDialogo {
    public static void main(String[] args) {
        String nombre;
        byte edad;

        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        edad = Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu edad: "));

        JOptionPane.showMessageDialog(null, "Te llamas " + nombre + " y tienes " + edad + " años");
    }
}
