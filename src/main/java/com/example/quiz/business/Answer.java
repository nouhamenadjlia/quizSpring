package com.example.quiz.business;

public class Answer {
    private Long id;
    private String title;
    private boolean correctAnswer;

    public Answer() {
    }

    public Answer(String title, boolean correctAnswer) {
        this.title = title;
        this.correctAnswer = correctAnswer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
