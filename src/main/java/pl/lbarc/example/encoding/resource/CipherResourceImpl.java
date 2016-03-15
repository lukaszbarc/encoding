package pl.lbarc.example.encoding.resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lbarc.example.encoding.service.CipherService;

@RestController
@RequestMapping("/encoding")
public class CipherResourceImpl implements CipherResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CipherResourceImpl.class);

    @Autowired
    private CipherService encodingService;

    @Override
    @RequestMapping(path = "/{cipher}/{data}", method = RequestMethod.GET)
    public String encode(@PathVariable("cipher") String cipher,
                         @PathVariable("data") String data) {
        LOGGER.info("GET {} {}", cipher, data);
        return encodingService.encode(cipher, data);
    }
}
