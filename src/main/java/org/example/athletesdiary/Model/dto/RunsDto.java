package org.example.athletesdiary.Model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
public class RunsDto {
    private String distance;
    private TimeUnit durOfrun;
    private TimeUnit Pause;
    private Boolean repetition;
}
