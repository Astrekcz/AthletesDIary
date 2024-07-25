package org.example.athletesdiary.Model.Record;

import org.example.athletesdiary.Model.Runs;

import java.time.LocalDateTime;

public record DiaryRecord(
        LocalDateTime date,
        LocalDateTime time,
        String Title,
        Long DurOfTraining,  //duration of training in hoursString warmUp,
        String warmUp,
        Runs runs
        ) {

}


