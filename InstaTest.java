import javax.swing.JOptionPane;

public class InstaTest {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, "Geben Sie hier Ihren Text ein.");
        String x = InstaStats.statistik2(text);
        JOptionPane.showMessageDialog(null, x);
    }
}
