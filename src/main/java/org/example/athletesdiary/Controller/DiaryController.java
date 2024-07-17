package org.example.athletesdiary.Controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.athletesdiary.Model.Diary;
import org.example.athletesdiary.Model.Record.DiaryRecord;
import org.example.athletesdiary.Model.dto.DiaryDto;
import org.example.athletesdiary.service.DiaryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1")
public class DiaryController {


    private final DiaryService diaryService;

  @PostMapping("/createDiary")
   public ResponseEntity<Diary> createdDiary(@RequestBody DiaryDto diaryDto) {
      Diary createDiary = diaryService.createdDiary(diaryDto);
      return new ResponseEntity<>(createDiary, HttpStatus.CREATED);
  }
    @PostMapping("/createDiaryR")
    public ResponseEntity<Diary> createdDiary(@RequestBody DiaryRecord diaryRecord) {
        Diary createDiary = diaryService.createdDiary(diaryRecord);
        return new ResponseEntity<>(createDiary, HttpStatus.CREATED);
    }

}
