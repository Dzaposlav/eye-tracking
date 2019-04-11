package com.example.demo.data.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "question_text", nullable = false)
    private  String questionText;

    private int index;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @OneToMany(mappedBy = "question")

    private List<Answer> answers;
}
