package org.example.athletesdiary.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
public class Diary {
        private LocalDateTime date;
        private LocalDateTime time;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;  //number of weeks
        private String Title;
        private Long DurOfTraining;  //duration of training in hours
       // private String warmUp;  TODO warmup class

        @ManyToOne
        @JoinColumn(name = "RunsId")
        private Runs runs;


        public Diary(
                LocalDateTime date,
                LocalDateTime time,
                String title,
                Long DurOfTraining,
               // String warmUp,
                Runs runs
        ){
                this.date = date;
                this.time = time;
                this.Title = title;
                this.DurOfTraining = DurOfTraining;
                //this.warmUp = warmUp;
                this.runs = runs;

        }
}
