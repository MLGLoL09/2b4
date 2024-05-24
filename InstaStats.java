public class InstaStats {
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
