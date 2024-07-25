package org.example.athletesdiary.Model.Record;

import java.util.concurrent.TimeUnit;

public record RunsRecord(
        String distance,
        Integer RunsId,
        TimeUnit durOfrun,
        TimeUnit Pause,
        Boolean repetition

) {
}
