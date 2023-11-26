package panomete.playground.spb32vt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import panomete.playground.spb32vt.payloads.HeathCheckDto;

@Slf4j
@Controller
public class HeathCheckController {

    @GetMapping("/ping")
    public ResponseEntity<HeathCheckDto> ping() {
        log.info("Rest controller method has been called {}", Thread.currentThread());
        return new ResponseEntity<>(
                new HeathCheckDto(
                        "pong",
                        HttpStatus.OK
                ),
                HttpStatus.OK
        );
    }

}
