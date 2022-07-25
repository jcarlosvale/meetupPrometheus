package learning.prometheus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
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
            return ResponseEntity.status(statusCode).body("RESPONSE");
        }

        return ResponseEntity.ok("RESPONSE");
    }
}
