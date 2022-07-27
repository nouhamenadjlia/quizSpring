package com.example.quiz.business;

import java.util.ArrayList;

public class Game {
    private ArrayList<Question> questions = new ArrayList<>();

    public Game() {
        Question question1 = new Question("qui est le chanteur du groupe Queeen?");
        question1.addAnswer(new Answer("Mick jagger", false));
        question1.addAnswer(new Answer("Freddie Mercury", true));
        question1.addAnswer(new Answer("Claude Francois", false));
        questions.add(question1);
    }
    public boolean validateAnswer(Long questionId, Long  answerId){
        for(Question question: questions){
            if(question.getId().equals(questionId)){
                for(Answer answer : question.getAnswers()){
                    if(answer.getId().equals(answerId)){
                        return answer.isCorrectAnswer();
                    }
                }
            }
        }
        return false;
    }
}
