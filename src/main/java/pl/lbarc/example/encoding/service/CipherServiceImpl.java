package pl.lbarc.example.encoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lbarc.example.encoding.cipher.Cipher;

import java.util.List;

/**
 * Created by lbarc on 2016-03-15.
 */
@Component
public class CipherServiceImpl implements CipherService {


    @Autowired
    private List<Cipher> ciphers;


    @Override
    public String encode(String cipherName, String data) {
        for (Cipher cipher : ciphers) {
            if (cipher.name().equalsIgnoreCase(cipherName)) {
                return cipher.encode(data);
            }
        }
        throw new RuntimeException("Cipher serivce for '" + cipherName + "' not found");
    }
}
