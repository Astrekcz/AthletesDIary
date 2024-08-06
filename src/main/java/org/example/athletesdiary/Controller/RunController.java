package org.example.athletesdiary.Controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.athletesdiary.Model.Record.RunsRecord;
import org.example.athletesdiary.Model.Runs;
import org.example.athletesdiary.Model.dto.RunsDto;
import org.example.athletesdiary.service.RunService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/Runs")
public class RunController {

    private final RunService runService;


    @PostMapping("/createRun")
    public ResponseEntity<Runs> createRun(@RequestBody RunsDto runsdto) {
        Runs createRuns = runService.createRun(runsdto);
        return new ResponseEntity<>(createRuns, HttpStatus.CREATED);
    }
    @PostMapping("/createRunR")
    public ResponseEntity<Runs> createRunR(@RequestBody RunsRecord runsRecord) {
        Runs createRuns = runService.createRun(runsRecord);
        return new ResponseEntity<>(createRuns, HttpStatus.CREATED);
    }
}
