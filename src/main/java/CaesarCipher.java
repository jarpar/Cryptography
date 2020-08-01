public class CaesarCipher {

    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String t = "Kryptoanaliza i kryptografia";
        int k = 3;
        System.out.println(szyfruj(t, a, k));
        System.out.println(deszyfruj(szyfruj(t, a, k), a, k));

    }

    public static String szyfruj(String tekst, String alfabet, int klucz) {
        String wynik = "";
        for (int i = 0; i < tekst.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (tekst.charAt(i) == alfabet.charAt(j))
                    wynik += alfabet.charAt((j + klucz) % alfabet.length());

        return wynik;
    }

    public static String deszyfruj(String tekst, String alfabet, int klucz) {
        String wynik = "";
        for (int i = 0; i < tekst.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (tekst.charAt(i) == alfabet.charAt(j))
                    wynik += alfabet.charAt((j - klucz + alfabet.length()) % alfabet.length());

        return wynik;
    }
}
