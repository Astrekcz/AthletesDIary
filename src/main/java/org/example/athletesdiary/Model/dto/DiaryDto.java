package org.example.athletesdiary.Model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.athletesdiary.Model.Runs;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DiaryDto {

    private LocalDateTime date;
    private LocalDateTime time;
    private String Title;
    private Long DurOfTraining;  //duration of training in hours
    private String warmUp;
    private Runs runs;



}
