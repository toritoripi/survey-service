package com.example.UdemyEx_5_04_SaveSurvey.web.survey;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SurveyForm {

    @NotBlank//NOT NULLのバリデーション
    @Size(max=256)//256文字以内のバリデーション
    private String name;

    @Min(0)
    private int age;

    @Min(1)
    @Max(2)
    private int sex;

    @Min(1)
    @Max(5)
    private int score;

    @NotBlank//NOT NULLのバリデーション
    @Size(max=256)//256文字以内のバリデーション
    private String message;
}
