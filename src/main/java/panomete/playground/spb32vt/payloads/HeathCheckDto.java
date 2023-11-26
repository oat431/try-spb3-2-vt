package panomete.playground.spb32vt.payloads;

import org.springframework.http.HttpStatus;

public record HeathCheckDto(
        String message,
        HttpStatus status

) {
}
