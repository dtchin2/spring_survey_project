package com.dtchin2.survey;

import com.dtchin2.survey.hello.HelloWorld;
import com.dtchin2.survey.surveys.SurveyInstance;
import com.dtchin2.survey.surveys.surveyOne.SurveyOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SurveyOne.xml");
        SurveyOne surveyOne = (SurveyOne) context.getBean("surveyOne");

        System.out.println(surveyOne.printDetails());
    }
}