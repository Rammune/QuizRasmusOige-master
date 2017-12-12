package com.example.opilane.quiz;

/**
 * Created by opilane on 05.12.2017.
 */

public class küsimused {
    public String MyQuestions [] = {

            "Miks on puder hea maitsega?",
            "Kas sulle meeldib puder?",
            "Kas sööksid putru, kui see ei maitseks hästi?",
            "Kas puder on tähtis sinu elus?",
            "Kas puder sobib ka õhtusöögiks?"



    };
    public String MyChoices [] []= {
            {"Kuna see on hea","Sellel on hea lõhn","See voolab kurgust hästi alla","Seda võib palju süüa"},
            {"Ei","Ja","Võib-olla","Ei oska vastata"},
            {"Ja","Ei","Võib-olla","Ei oska vastata"},
            {"Ei","Ja","Ei oska vastata","Võib-olla"},
            {"Ei oska vastata","Võib-olla","Ja","Ei"}
    };

    private String MyCorrectAnswers [] = {
            "Kuna see on hea","Ja","Ja","Ja","Ja"

    };
    public int getLength (){
        return MyQuestions.length;
    }
    public String getQuestion(int a){
        String question =MyQuestions[a];
        return question;
    }
    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }
    public String getCorrectAnswer(int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }
}
