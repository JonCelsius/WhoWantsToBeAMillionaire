package MainApp.AppProcess;

import MainApp.Data.Question;

public class PlayerProfile {
    Question questionToAnswer;
    int playerPoints;
    int currentLevel;
    int maxPoints;
    boolean correctAnswer;

    public PlayerProfile(Question questionToAnswer, int playerPoints, int currentLevel, int maxPoints, boolean correctAnswer) {
        this.questionToAnswer = questionToAnswer;
        this.playerPoints = playerPoints;
        this.currentLevel = currentLevel;
        this.maxPoints = maxPoints;
        this.correctAnswer = correctAnswer;
    }

    public void setQuestionToAnswer(Question questionToAnswer) {
        this.questionToAnswer = questionToAnswer;
    }

    public Question getQuestionToAnswer() {
        return questionToAnswer;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }


    public void checkCorrectAnswer ( String answerIndex) {

        if (questionToAnswer.getCorrectAnswer().getIndexOfAnswer().equals(answerIndex)) {
            System.out.println("\nYour answer is correct! :)");
            playerPoints = playerPoints + questionToAnswer.getScore();
            System.out.println("You current points are: " + playerPoints);
            System.out.println("\n\n><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
            if (currentLevel <= 7) {
                currentLevel++;
                if (playerPoints == maxPoints) {
                    System.out.println("Congratulations! You WON the GAME!");
                }
            }

        } else {
            System.out.println("\nYour answer is not correct! :(");
            System.out.println("You points are: " + playerPoints + ", try harder next time ;)");
            System.out.println("\n\n><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
            correctAnswer = false;
        }
    }
}
