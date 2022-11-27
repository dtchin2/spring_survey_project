package com.dtchin2.survey.surveys;

import com.dtchin2.survey.entity.Survey;
import com.dtchin2.survey.questions.AbstractQuestion;

import java.util.Date;
import java.util.List;

public abstract class AbstractSurvey implements Survey {

    private Integer surveyId;
    private String surveyName;
    private Date surveyStartDate;

    private List<AbstractQuestion> questionsList;

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyStartDate(Date surveyStartDate) {
        this.surveyStartDate = surveyStartDate;
    }

    public Date getSurveyStartDate() {
        return surveyStartDate;
    }

    public List<AbstractQuestion> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<AbstractQuestion> questionsList) {
        this.questionsList = questionsList;
    }

    @Override
    public String toString() {
        return "SurveyInstance{" +
                "surveyId=" + surveyId + '\n' +
                ", surveyName='" + surveyName + '\n' +
                ", surveyStartDate=" + surveyStartDate + '\n'+
                ", questionsList=" + questionsList + '\n' +
                '}';
    }

    public abstract String printDetails();
}
