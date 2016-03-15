package pl.lbarc.example.encoding.cipher;

/**
 * Created by lbarc on 2016-03-15.
 */
public class Caesar implements Cipher {

    private int shift;
    private String name;

    public Caesar(int shift, String name) {
        this.shift = shift;
        this.name = name;
    }

    @Override
    public String encode(String data) {
        StringBuffer s = new StringBuffer();

        for (int x = 0; x < data.length(); x++) {
            char c = (char) (data.charAt(x) + shift);
            if (c > 'z')
                s.append((char) (data.charAt(x) - (26 - shift)));
            else
                s.append(((char) (data.charAt(x) + shift)));
        }
        return s.toString();
    }

    @Override
    public String name() {
        return name;
    }
}
