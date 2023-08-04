package com.example.UdemyEx_5_04_SaveSurvey.web.survey;


import com.example.UdemyEx_5_04_SaveSurvey.domain.survey.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/surveys")
@RequiredArgsConstructor//finalフィールド、初期化されていないフィールドを初期化するコンストラクタを自動生成してくれる
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping
    public String showList(Model model){
        model.addAttribute("surveyList",surveyService.findAll());
        return "surveys/List";
    }

    //GET /surveys/answerForm
    @GetMapping("/answerForm")
    public String showAnswerForm(@ModelAttribute SurveyForm form){
        return "surveys/answerForm";
    }

    //POST /surveys
    @PostMapping
    public String create(@Validated SurveyForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return showAnswerForm(form);
        }
        surveyService.create(form.getName(), form.getAge(), form.getSex(), form.getScore(), form.getMessage());
        return "redirect:/surveys";
    }

    //GET localhost:8080/surveys/1
    @GetMapping("/{surveyId}")
    public String showDetail(@PathVariable("surveyId") long surveyId, Model model) {
        model.addAttribute("survey", surveyService.findById(surveyId));
        return "surveys/detail";
    }
}
