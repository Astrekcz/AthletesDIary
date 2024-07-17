package org.example.athletesdiary.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor
public class Diary {
        private LocalDateTime date;
        private LocalDateTime time;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;  //number of weeks
        private String Title;
        private Long DurOfTraining;  //duration of training in hours
        private String warmUp;
        private String runs;
        private Long durOfrun;        //duration of runs... 200m break 1min etc
        private Long distanceOfrun;


        public Diary(
                LocalDateTime date,
                LocalDateTime time,
                String title,
                Long DurOfTraining,
                String warmUp,
                String runs,
                Long durOfrun,
                Long distanceOfrun
        ){
                this.date = date;
                this.time = time;
                this.Title = title;
                this.DurOfTraining = DurOfTraining;
                this.warmUp = warmUp;
                this.runs = runs;
                this.durOfrun = durOfrun;
                this.distanceOfrun = distanceOfrun;
        }
}
