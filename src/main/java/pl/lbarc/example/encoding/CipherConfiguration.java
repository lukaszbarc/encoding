package pl.lbarc.example.encoding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.lbarc.example.encoding.cipher.Caesar;
import pl.lbarc.example.encoding.cipher.Cipher;

/**
 * Created by lbarc on 2016-03-15.
 */
@Configuration
public class CipherConfiguration {

    @Bean
    public Cipher caesar3() {
        return new Caesar(3, "caesar3");
    }

    @Bean
    public Cipher caesar6() {
        return new Caesar(6, "caesar6");
    }
}
