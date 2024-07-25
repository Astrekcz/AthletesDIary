package org.example.athletesdiary.service;


import lombok.RequiredArgsConstructor;
import org.example.athletesdiary.Model.Diary;
import org.example.athletesdiary.Model.Record.DiaryRecord;
import org.example.athletesdiary.Model.dto.DiaryDto;
import org.example.athletesdiary.Repository.DiaryRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("DiaryServiceImpl")
@RequiredArgsConstructor
@Component
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;

    @Override
    public Diary createdDiary(DiaryDto diaryDto){
        Diary diary = new Diary(
                diaryDto.getDate(),
                diaryDto.getTime(),
                diaryDto.getTitle(),
                diaryDto.getDurOfTraining(),
                diaryDto.getRuns()
           //     diaryDto.getWarmUp(),


        );
        return diaryRepository.save(diary);


    }
    @Override
    public Diary createdDiary(DiaryRecord diaryRecord){
        Diary diary = new Diary(
                diaryRecord.date(),
                diaryRecord.time(),
                diaryRecord.Title(),
                diaryRecord.DurOfTraining(),
                diaryRecord.runs()



        );
        return diaryRepository.save(diary);


    }



}
