package com.example.UdemyEx_5_04_SaveSurvey.domain.survey;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor//コンストラクタを自動生成してくれる
@Data//getter,setterを自動生成してくれる
public class SurveyEntity {
    private Long id;
    private String name;
    private int age;
    private int sex;
    private int score;
    private String message;
}
