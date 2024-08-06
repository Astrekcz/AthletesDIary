package org.example.athletesdiary.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.athletesdiary.Model.Diary;
import org.example.athletesdiary.service.DiaryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MVController {

    private final DiaryService diaryService;


    @GetMapping
    public String LandingPage(Model model){
        return "index";
    }

    @GetMapping("DiariesMVC")
    public String getDiaries(Model model){
        List<Diary> diaryList = diaryService.getDiaryList();
        model.addAttribute("diaryList", diaryList);
        return "diaries";
    }

}
