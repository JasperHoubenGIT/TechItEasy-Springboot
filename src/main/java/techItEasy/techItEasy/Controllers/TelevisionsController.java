package techItEasy.techItEasy.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import techItEasy.techItEasy.Models.Televisions;
import techItEasy.techItEasy.Repositories.TelevisionsRepository;

import java.util.Optional;

@RestController
public class TelevisionsController {

@Autowired
    TelevisionsRepository televisionsRepository;


    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevisions(@PathVariable int id) {
        return ResponseEntity.ok("televisions " + id);
    }

    @GetMapping("/televisions")
    public ResponseEntity<Object> getTelevisions() {
        return ResponseEntity.ok("televisions");
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> createTelevisions(@RequestBody Televisions televisions){
        televisionsRepository.save(televisions);
        return ResponseEntity.created(null).body("television");
    }

    @DeleteMapping("/televisions{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/televisions{id}")
    public ResponseEntity<Object> updateTelevision (@PathVariable int id, @RequestBody String televisions){
        Optional<Televisions> optionalTelevisions = televisionsRepository.findById(id);
        if (optionalTelevisions.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            Televisions updateTelevision = optionalTelevisions.get();


        }

        return ResponseEntity.noContent().build();
    }

}
