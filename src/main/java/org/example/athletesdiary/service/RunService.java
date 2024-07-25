package org.example.athletesdiary.service;

import org.example.athletesdiary.Model.Record.RunsRecord;
import org.example.athletesdiary.Model.Runs;
import org.example.athletesdiary.Model.dto.RunsDto;
import org.springframework.stereotype.Service;

@Service
public interface RunService {


    Runs createRun(RunsDto runsDto);

    Runs createRun(RunsRecord runsRecord);
}
