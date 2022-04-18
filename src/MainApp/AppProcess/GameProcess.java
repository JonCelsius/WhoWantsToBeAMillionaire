package MainApp.AppProcess;

import MainApp.Data.Question;
import MainApp.Data.QuestionAnswerInit;
import MainApp.Data.Util.GameUtil;
import MainApp.Help.AudienceHelp;
import MainApp.Help.FiftyFiftyHelp;
import MainApp.Help.HelpAnswer;
import MainApp.Help.PhoneHelp;

import java.util.ArrayList;
import java.util.List;

public class GameProcess {
    QuestionAnswerInit questionAnswerInit = new QuestionAnswerInit();
    List<Question> questions = questionAnswerInit.questionInit();
    boolean correctAnswer = true;
    int maxPoints = 2800;
    int minPoints = 0;
    int playerPoints;
    int currentLevel;
    GameUtil gameUtil = new GameUtil();


    public Question getQuestionByLevel(int level) {

        List<Question> questionsByLevel = new ArrayList<>();
        int indexRandomQuestion;
        for (Question question : questions) {
            if (question.getLevel() == level) {
                questionsByLevel.add(question);
            }
        }
        indexRandomQuestion = gameUtil.getRandomNumber(0, 4);
        return questionsByLevel.get(indexRandomQuestion);

    }

    public void startGame() {

        System.out.println("\t\t               WELCOME");
        System.out.println("\t to the \"WHO WANTS TO BE A MILLIONAIRE!!?\" Project");
        System.out.println("=======================================================");
        System.out.println("\n\n\t\t             LET'S START!");
        InputValidation inputValidation = new InputValidation();
        FiftyFiftyHelp fiftyFiftyHelp = new FiftyFiftyHelp();
        AudienceHelp audienceHelp = new AudienceHelp();
        PhoneHelp phoneHelp = new PhoneHelp();
        currentLevel = 1;
        playerPoints = 0;
        PlayerProfile playerProfile = new PlayerProfile(null, playerPoints, currentLevel, maxPoints, correctAnswer);
        Question questionToAnswer;
        do {
            System.out.println("\n\n><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("@ Level " + playerProfile.getCurrentLevel() + "\n");
            questionToAnswer = getQuestionByLevel(playerProfile.getCurrentLevel());

            System.out.print(">>");
            System.out.println(questionToAnswer.getQuestion());
            System.out.println();
            questionToAnswer.getAnswers().forEach(answer -> {
                System.out.println(answer.getIndexOfAnswer() + "." + answer.getAnswer());
            });
            System.out.print("\nEnter the letter that belongs to the correct answer!\n\n");
            System.out.println("\n\n**************************************************");
            System.out.println("<<In case you need help, there are HELP OPTIONS for you!>>");
            System.out.println("### For <Fifty-Fifty> option press <<F>>");
            System.out.println("### For <Audience Help> option press <<A>>");
            System.out.println("### For <Phone Help> option press <<P>>");
            System.out.println("**************************************************");
            playerProfile.setQuestionToAnswer(questionToAnswer);
            boolean helpOptionActive = true;
            while (helpOptionActive) {
                switch (inputValidation.inputString()) {
                    case "a":
                        playerProfile.checkCorrectAnswer("a");
                        helpOptionActive = false;
                        break;
                    case "b":
                        playerProfile.checkCorrectAnswer("b");
                        helpOptionActive = false;
                        break;
                    case "c":
                        playerProfile.checkCorrectAnswer("c");
                        helpOptionActive = false;
                        break;
                    case "d":
                        playerProfile.checkCorrectAnswer("d");
                        helpOptionActive = false;
                        break;
                    case "F":
                        helpOptionProcess(inputValidation, fiftyFiftyHelp.isUsed(), fiftyFiftyHelp.getHelpAnswers(playerProfile.getQuestionToAnswer()));
                        break;
                    case "A":
                        helpOptionProcess(inputValidation, audienceHelp.isUsed(), audienceHelp.getHelpAnswers(playerProfile.getQuestionToAnswer()));
                        break;

                    case "P":
                        helpOptionProcess(inputValidation, phoneHelp.isUsed(), phoneHelp.getHelpAnswers(playerProfile.getQuestionToAnswer()));

                    default:
                        System.out.println("Your answer is not valid! Try again.");
                }


            }
        }
        while (playerProfile.isCorrectAnswer() && playerProfile.getPlayerPoints() < maxPoints && playerProfile.getPlayerPoints() > minPoints);
        inputValidation.closeScanner();

    }

    private void helpOptionProcess(InputValidation inputValidation, boolean used, HelpAnswer[] helpAnswers2) {
        if (!used) {
            System.out.println("You just used a Help option! Choose wisely!!!");
            for (HelpAnswer helpAnswer : helpAnswers2) {
                System.out.println(helpAnswer.getAnswer().getIndexOfAnswer() + "." + helpAnswer.getAnswer().getAnswer() + " ->" + helpAnswer.getProbability() + "%");
            }
            System.out.println("Enter your choice:");


        } else {
            System.out.println("Sorry, you used this help option before!\nDo YOU want to try another one?");
            System.out.println(" Y/N?");
            if (gameUtil.chooseHelp(inputValidation.inputString())) {
                System.out.println("Enter the help option!");
            } else {
                System.out.println("Enter your answer!");

            }

        }
    }
}

