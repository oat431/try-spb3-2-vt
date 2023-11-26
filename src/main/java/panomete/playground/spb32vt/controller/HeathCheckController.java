package panomete.playground.spb32vt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HeathCheckController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        log.info("Rest controller method has been called {}", Thread.currentThread());
        return new ResponseEntity<>(
                "pong",
                HttpStatus.OK
        );
    }

}
