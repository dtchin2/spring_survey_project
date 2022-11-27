package com.dtchin2.survey.surveys.surveyOne;

import com.dtchin2.survey.surveys.SurveyInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SurveyOne extends SurveyInstance {


   private SurveyOne surveyOne;
    // this is the class that generated/uses the survey details
   public SurveyOne(){
   }

   @Override
   public String printDetails(){
       return this.toString();
   }

}
