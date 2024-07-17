package org.example.athletesdiary.Model.Record;

import java.time.LocalDateTime;

public record DiaryRecord(
        LocalDateTime date,
        LocalDateTime time,
        String Title,
        Long DurOfTraining,  //duration of training in hoursString warmUp,
        String warmUp,
        String runs,
        Long durOfrun,        //duration of runs... 200m break 1min etc
        Long distanceOfrun) {

}


