package org.example.athletesdiary.service;

import lombok.RequiredArgsConstructor;
import org.example.athletesdiary.Model.Record.RunsRecord;
import org.example.athletesdiary.Model.Runs;
import org.example.athletesdiary.Model.dto.RunsDto;
import org.example.athletesdiary.Repository.RunsRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("RunServiceImpl")
@RequiredArgsConstructor
@Component
public class RunServiceImpl implements RunService{

    private final RunsRepository runsRepository;

    @Override
    public Runs createRun(RunsDto runsDto) {
        Runs runs = new Runs(
                runsDto.getDistance(),
                runsDto.getDurOfrun(),
                runsDto.getPause(),
                runsDto.getRepetition()
        ); return runsRepository.save(runs);
    }

    @Override
    public Runs createRun(RunsRecord runsRecord) {
        Runs runs = new Runs(
                runsRecord.distance(),
                runsRecord.durOfrun(),
                runsRecord.Pause(),
                runsRecord.repetition()
        );
        return runsRepository.save(runs);
    }
}
