import javax.swing.JOptionPane;
/**
 * ueberprueft wie oft es jeden Buchstaben im Text gibt.
 * @author Sebastian Weigl
 * @version 05-19-2024
 */
public class InstaTest {
    /**
     * uebernimmt den Text den du ueberpruefen willst und gibt die Statistik zurueck
     */
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, "Geben Sie hier Ihren Text ein.");
        String x = InstaStats.statistik2(text);
        JOptionPane.showMessageDialog(null, x);
    }
}
