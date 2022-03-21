package com.qa.mentalhealth.rest;

import com.qa.mentalhealth.domain.Illnesses;
import com.qa.mentalhealth.service.IllnessesServiceDB;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IllnessController {

    private IllnessesServiceDB service;

    public IllnessController(IllnessesServiceDB service){
        super();
        this.service = service;
    }



    @PostMapping("/create")
    public ResponseEntity<Illnesses> createIllnesses(@RequestBody Illnesses i){
        return new ResponseEntity<Illnesses>(this.service.create(i), HttpStatus.CREATED);
    }


    private List<Illnesses> illnesses = new ArrayList<>();


    @GetMapping("readAll")
    public List<Illnesses> readIllnesses(){
        return this.service.read();

    }


    @GetMapping("/readById/{id}")
    public Illnesses getById(@PathVariable int id){
        return this.service.readOne(id);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this .illnesses.remove(id);
    }

    @PutMapping("/update/{id}")
    public Illnesses update(@PathVariable Long id, @RequestBody Illnesses updated){
        return this.service.update(id, updated);
    }

    @DeleteMapping("/remove")
    public boolean remove(@PathParam("id") long id){
        return this.service.read().remove(id);
    }

}
