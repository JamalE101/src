package com.qa.mentalhealth.service;


import com.qa.mentalhealth.domain.Illnesses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IllnessesServiceList implements IllnessesInterface {

    private List<Illnesses> illnesses = new ArrayList<>();

    public Illnesses create (Illnesses i){
        i.setId((long) this.illnesses.indexOf(i));
        this.illnesses.add(i);
        Illnesses created = this.illnesses.get(this.illnesses.size() - 1);
        return created;
    }

    @Override
    public List read(){
        return this.animals;
    }

    public Illnesses readOne(int id){

    }
}





