package com.dtchin2.survey.questions.surveyOne;

import com.dtchin2.survey.questions.AbstractQuestion;

public class SurveyOneQuestionTree extends AbstractQuestion {

    private String answerOneText;

    public String getAnswerOneText() {
        return answerOneText;
    }

    public void setAnswerOneText(String answerOneText) {
        this.answerOneText = answerOneText;
    }

    @Override
    public String toString() {
        return "SurveyOneQuestionTree{" +
                "answerOneText='" + answerOneText + '\'' +
                '}';
    }
}
