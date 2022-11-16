package techItEasy.techItEasy.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevisions(@PathVariable int id) {
        return ResponseEntity.ok("televisions " + id);
    }

    @GetMapping("/televisions")
    public ResponseEntity<Object> getTelevisions() {
        return ResponseEntity.ok("televisions");
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> postTelevisions(@RequestBody String television){
        return ResponseEntity.created(null).body("television");
    }

    @DeleteMapping("/televisions{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/televisions{id}")
    public ResponseEntity<Object> updateTelevision (@PathVariable int id, @RequestBody String televisions){
        return ResponseEntity.noContent().build();
    }

}
