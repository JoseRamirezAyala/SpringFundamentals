package com.jjra.repository;

import com.jjra.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Jose");
        speaker.setLastName("Ramirez");

        speakers.add(speaker);

        return speakers;
    }

    public static interface SpeakerRepository {
    }
}
