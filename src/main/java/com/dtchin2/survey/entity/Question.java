package com.dtchin2.survey.entity;

import com.dtchin2.survey.base.QuestionType;

public interface Question {

    public void setQuestionId(Integer questionId);
    public Integer getQuestionId();
    public void setSurveyId(Integer surveyId);
    public Integer getSurveyId();
    public String getQuestionText();
    public void setQuestionText(String questionText);
    public void setQuestionType(QuestionType questionType);

    public QuestionType getQuestionType();
}
