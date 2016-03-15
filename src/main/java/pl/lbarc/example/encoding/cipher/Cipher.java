package pl.lbarc.example.encoding.cipher;

/**
 * Created by lbarc on 2016-03-15.
 */
public interface Cipher {

    String encode(String data);

    String name();
}
