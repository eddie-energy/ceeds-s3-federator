package energy.eddie.ceeds.s3federator.controllers;

import energy.eddie.ceeds.s3federator.generated.api.PingApi;
import energy.eddie.ceeds.s3federator.generated.model.Pong;
import java.time.Instant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController implements PingApi {

    @Override
    public ResponseEntity<Pong> getPing() {
        var pong = new Pong()
                .message("pong")
                .timestamp(Instant.now());
        return ResponseEntity.ok(pong);
    }
}
