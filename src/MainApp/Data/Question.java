package MainApp.Data;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final String question;
    private final int level;
    private final int score;
    private final List<Answer> answers;

    public Question(String question, int level, int score, Answer answer1, Answer answer2, Answer answer3, Answer answer4) {
        this.question = question;
        this.level = level;
        this.score = score;
        answers = new ArrayList<>();
        this.answers.add(answer1);
        this.answers.add(answer2);
        this.answers.add(answer3);
        this.answers.add(answer4);

    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getQuestion() {
        return question;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public Answer getCorrectAnswer() {
        Answer correctAnswer = null;
        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                correctAnswer = answer;
                break;
            }
        }

        return correctAnswer;


    }

    public Answer[] getWrongAnswer() {
        Answer[] answerList = new Answer[4];
        Answer[] wrongAnswer = new Answer[3];
        answerList[0] = answers.get(0);
        answerList[1] = answers.get(1);
        answerList[2] = answers.get(2);
        answerList[3] = answers.get(3);

        for (int i = 0, j = 0; i < answerList.length; i++) {
            if (!answerList[i].isCorrect()) {
                wrongAnswer[j] = answerList[i];
                j++;
            }
        }

        return wrongAnswer;


    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", level=" + level +
                ", score=" + score +
                ", answers=" + answers +
                '}';
    }
}
