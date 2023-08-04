package com.example.UdemyEx_5_04_SaveSurvey.domain.survey;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SurveyRepository {

    @Select("select * from surveys")
    List<SurveyEntity> findAll();

    @Insert("insert into surveys (name, age, sex, score, message) values (#{name}, #{age}, #{sex}, #{score}, #{message})")
    void insert(String name, int age, int sex, int score, String message);

    @Select("select * from surveys where id = #{surveyId}")
    SurveyEntity findById(long surveyId);
}
