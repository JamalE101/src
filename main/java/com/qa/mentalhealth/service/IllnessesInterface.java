package com.qa.mentalhealth.service;

import java.util.List;

public interface IllnessesInterface<Illnesses>{

    Illnesses create(Illnesses x);


    List<com.qa.mentalhealth.domain.Illnesses> read();

    Illnesses update(Long id, Illnesses y);

    Illnesses delete(Illnesses id);









}
