package com.dtchin2.survey.questions.surveyOne;

import com.dtchin2.survey.questions.AbstractQuestion;

public class SurveyOneQuestionTwo extends AbstractQuestion {

    private String answerOneText;
    private String answerTwoText;

    public SurveyOneQuestionTwo(){}

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

    @Override
    public String toString() {
        return "SurveyOneQuestionTwo{" +
                "answerOneText='" + answerOneText + '\'' +
                ", answerTwoText='" + answerTwoText + '\'' +
                '}';
    }
}
