public class CaesarCipherRule {
    String szyfr(String str) {
        char x[] = str.toCharArray();
        for (int i = 0;
             i != x.length;
             i++) {
            int n = x[i];
            n += 3;
            x[i] = (char) n;
        }
        return new String(x);
    }

    public static void main(String[] args) {
        CaesarCipherRule caesarCipher = new CaesarCipherRule();
        System.out.println(caesarCipher.szyfr("aaa abc aaa"));
    }
}
