package com.dtchin2.survey.surveys.surveyOne;

import com.dtchin2.survey.surveys.AbstractSurvey;
import org.springframework.stereotype.Component;

@Component
public class SurveyOne extends AbstractSurvey {


   private SurveyOne surveyOne;
    // this is the class that generated/uses the survey details
   public SurveyOne(){
   }

   @Override
   public String printDetails(){
       return this.toString();
   }

}
