package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
       System.out.println("Speaker Service default constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speaker Service repository constructor");
        this.repository = repository;
    }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("Speaker Service repository setter");
        this.repository = repository;
    }
}
