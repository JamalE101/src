package com.qa.mentalhealth.service;

import com.qa.mentalhealth.domain.Illnesses;
import com.qa.mentalhealth.repo.IllnessesRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class IllnessesServiceDB implements IllnessesInterface<Long> {

    private IllnessesRepo repo;

    public IllnessesServiceDB(IllnessesRepo repo){
        super();
        this.repo = repo;

    }
    @Override
    public  Illnesses create(Illnesses i){
        return this.repo.save(i);
    }

    @Override
    public Long create(Long x) {
        return null;
    }

    @Override
    public List<Illnesses> read(){
        return this.repo.findAll();
    }

    @Override
    public Long update(Long id, Long y) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public Illnesses delete(Long, id){
        Optional<Illnesses> toDelete = this.repo.findById();
        this.repo.deleteAllById(id);
        return toDelete.orElse(null);
    }

    public boolean remove(Long id){
        this.repo.deleteById(id);
        return !this.repo.existsById(id);

    }



}
