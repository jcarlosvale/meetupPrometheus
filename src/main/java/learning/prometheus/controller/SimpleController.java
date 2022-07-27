package learning.prometheus.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class SimpleController {

    @GetMapping(path={"/simple/{status}", "/simple/"})
    public ResponseEntity<String> getEndpoint(@PathVariable(name="status", required = false) final Integer statusCode) {

        return createResponse(statusCode);
    }

    @PostMapping(path={"/simple/{status}", "/simple/"})
    public ResponseEntity<String> postEndpoint(@PathVariable(name="status", required = false) final Integer statusCode) {

        return createResponse(statusCode);
    }

    @DeleteMapping(path={"/simple/{status}", "/simple/"})
    public ResponseEntity<String> deleteEndpoint(@PathVariable(name="status", required = false) final Integer statusCode) {

        return createResponse(statusCode);
    }

    @PutMapping(path={"/simple/{status}", "/simple/"})
    public ResponseEntity<String> putEndpoint(@PathVariable(name="status", required = false) final Integer statusCode) {

        return createResponse(statusCode);
    }

    private ResponseEntity<String> createResponse(Integer statusCode) {
        if (null != statusCode) {
            if (statusCode > 299) {
                log.error("HttpStatus Error: {}", statusCode);
            } else {
                log.info("Processado GET");
            }
            return ResponseEntity.status(statusCode).body("RESPONSE");
        }
        log.info("Processado GET");
        return ResponseEntity.ok("RESPONSE");
    }
}
