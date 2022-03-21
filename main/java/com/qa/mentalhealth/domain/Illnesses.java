package com.qa.mentalhealth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Illnesses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Long id;
    private String symptoms;
    private String illness;
    private int duration;
    private boolean medication;

    public Illnesses(){
        super();
    }

    public Illnesses(Long id, String symptoms, String illness, int duration, String medication) {
        super();
        this.id = id;
        this.symptoms = symptoms;
        this.illness = illness;
        this.duration = duration;
        this.medication = Boolean.parseBoolean(medication);
    }

    public Illnesses(String symptoms, String illness, int duration, String medication) {
        super();
        this.symptoms = symptoms;
        this.illness = illness;
        this.duration = duration;
        this.medication = Boolean.parseBoolean(medication);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public boolean getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = Boolean.parseBoolean(medication);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, symptoms, illness, duration, medication);
    }

    @Override
    public boolean equals(Objects obj){
        if (this == obj) {
            return true;
        }
        if (obj = null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Illnesses other = (Illnesses) obj;
        return duration == other.duration && Objects.equals(illness, other.illness) && Objects.equals(symptoms, other.symptoms) && Objects.equals(id, other.id) && medication == other.medication;

    }





}
