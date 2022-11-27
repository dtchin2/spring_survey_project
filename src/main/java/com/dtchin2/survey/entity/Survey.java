package com.dtchin2.survey.entity;

import com.dtchin2.survey.questions.AbstractQuestion;

import java.util.Date;
import java.util.List;

public interface Survey {

    public void setSurveyId(Integer surveyId);

    public void setSurveyName(String surveyName);
    public String getSurveyName();
    public void setSurveyStartDate(Date surveyStartDate);
    public Date getSurveyStartDate();
    public List<AbstractQuestion> getQuestionsList();
    public void setQuestionsList(List<AbstractQuestion> questionsList);
}
