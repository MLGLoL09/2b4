/**
 * ueberprueft wie oft es jeden Buchstaben im Text gibt.
 * @author Sebastian Weigl
 * @version 05-19-2024
 */
public class InstaStats {
    /**
     * zaehlt wie viele buchsaben es von einem bestimmten giebt im text
     * @param letter uebernimmt den buchstaben der ueberprueft werden soll
     * @param text uebernimmt den text in welchem der Buchstabe ueberprueft werden soll
     * @return gibt zurueck wie oft es den Buchstaben gibt
     */
    public static int buchstabeZaehlen(char letter, String text) {
        int indexMerken = 0;
        int indexZaehler = 0;
        int length = text.length();
        while (indexZaehler < length) {
            if (text.charAt(indexZaehler) == letter) {
                indexMerken++;
            }
            indexZaehler++;
        }
        return indexMerken;
    }
    /**
     * macht die Statistik
     * @param text uebernimmt den Text von welchem die Buchstaben ueberprueft werden sollen
     * @return gibt die Tabelle mit den Werten wie oft es welchen buchstaben gibt zurueck
     */
    public static String statistik2(String text) {
        String abc = "abcdefghijklmnopqrstuvwxyzäüö";
        String haufigkeiten = "STATISTIK";
        for (int i =0; i < abc.length(); i++) {
            char buchstabe = abc.charAt(i);
            haufigkeiten += "\n" + buchstabe + ": " + buchstabeZaehlen(buchstabe, text);
        }
        return haufigkeiten;
    }
}
