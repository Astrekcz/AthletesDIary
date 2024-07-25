package org.example.athletesdiary.service;

;

import org.example.athletesdiary.Model.Diary;
import org.example.athletesdiary.Model.Record.DiaryRecord;
import org.example.athletesdiary.Model.Runs;
import org.example.athletesdiary.Model.dto.DiaryDto;
import org.example.athletesdiary.Model.dto.RunsDto;
import org.springframework.stereotype.Service;

@Service
public interface DiaryService {


    Diary createdDiary(DiaryDto diaryDto);

    Diary createdDiary(DiaryRecord diaryRecord);





}
