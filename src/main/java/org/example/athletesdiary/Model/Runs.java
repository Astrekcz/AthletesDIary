package org.example.athletesdiary.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Entity
@NoArgsConstructor
public class Runs {

    private String distance;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RunsId;
    private TimeUnit durOfrun;
    private TimeUnit Pause;
    private Boolean repetition;

    @OneToMany(mappedBy = "runs", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Diary> diaries;

    public Runs(String distance, TimeUnit durOfrun, TimeUnit pause, Boolean repetition) {
        this.distance = distance;
        this.durOfrun = durOfrun;
        Pause = pause;
        this.repetition = repetition;
    }



}
