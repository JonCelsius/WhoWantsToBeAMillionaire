package MainApp.Data;

public class Answer {
   private final String answer;
   private final boolean isCorrect;
   private final String indexOfAnswer;

    public Answer(String answer, boolean isCorrect, String indexOfAnswer) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.indexOfAnswer = indexOfAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getIndexOfAnswer() {
        return indexOfAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", isCorrect=" + isCorrect +
                ", indexOfAnswer='" + indexOfAnswer + '\'' +
                '}';
    }
}
