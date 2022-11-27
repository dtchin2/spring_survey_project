package com.dtchin2.survey.questions.surveyOne;

import com.dtchin2.survey.questions.AbstractQuestion;

public class SurveyOneQuestionOne extends AbstractQuestion {

    private String answerOneText;
    private String answerTwoText;
    private String answerThreeText;
    private String answerFourText;

    public SurveyOneQuestionOne(){}

    public String getAnswerOneText() {
        return answerOneText;
    }

    public void setAnswerOneText(String answerOneText) {
        this.answerOneText = answerOneText;
    }

    public String getAnswerTwoText() {
        return answerTwoText;
    }

    public void setAnswerTwoText(String answerTwoText) {
        this.answerTwoText = answerTwoText;
    }

    public String getAnswerThreeText() {
        return answerThreeText;
    }

    public void setAnswerThreeText(String answerThreeText) {
        this.answerThreeText = answerThreeText;
    }

    public String getAnswerFourText() {
        return answerFourText;
    }

    public void setAnswerFourText(String answerFourText) {
        this.answerFourText = answerFourText;
    }

    @Override
    public String toString() {
        return "SurveyOneQuestionOne{" +
                "answerOneText='" + answerOneText + '\'' +
                ", answerTwoText='" + answerTwoText + '\'' +
                ", answerThreeText='" + answerThreeText + '\'' +
                ", answerFourText='" + answerFourText + '\'' +
                '}';
    }
}
