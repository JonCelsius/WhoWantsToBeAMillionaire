package MainApp.Help;

import MainApp.Data.Answer;

public class HelpAnswer {
     private final Answer answer;
     private final double probability;

    public HelpAnswer(Answer answer, double probability) {
        this.answer = answer;
        this.probability = probability;
    }

    public Answer getAnswer() {
        return answer;
    }

    public double getProbability() {
        return probability;
    }
}
