package com.example.UdemyEx_5_04_SaveSurvey.domain.survey;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor////finalフィールド、初期化されていないフィールドを初期化するコンストラクタを自動生成してくれる
public class SurveyService {

    private final SurveyRepository surveyRepository;
    public List<SurveyEntity> findAll() {
        return surveyRepository.findAll();
    }

    @Transactional
    public void create(String name,int age,int sex,int score,String message) {
        surveyRepository.insert(name,age,sex,score,message);
    }
    public SurveyEntity findById(long surveyId){
        return surveyRepository.findById(surveyId);
    }
}
