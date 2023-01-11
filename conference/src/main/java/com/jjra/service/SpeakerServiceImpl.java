package com.jjra.service;

import com.jjra.model.Speaker;
import com.jjra.repository.HibernateSpeakerRepositoryImpl;
import com.jjra.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
