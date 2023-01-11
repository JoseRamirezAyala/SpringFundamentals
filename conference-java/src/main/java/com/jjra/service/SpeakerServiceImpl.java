package com.jjra.service;

import com.jjra.model.Speaker;
import com.jjra.repository.HibernateSpeakerRepositoryImpl;
import com.jjra.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("We're called after the constructos");
    }

    @Autowired
    public void  setRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpekaerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }

    private SpeakerRepository speakerRepository;
    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
