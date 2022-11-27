package com.dtchin2.survey.questions;

import com.dtchin2.survey.base.QuestionType;
import com.dtchin2.survey.entity.Question;

public abstract class QuestionInstance implements Question {

    private Integer questionId;
    private Integer surveyId;
    private String questionText;
    private QuestionType questionType;

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    @Override
    public String toString() {
        return "QuestionInstance{" +
                "questionId=" + questionId +
                ", surveyId=" + surveyId +
                ", questionText='" + questionText + '\'' +
                ", questionType=" + questionType +
                '}';
    }
}
