package MainApp.Help;

import MainApp.Data.Question;
import MainApp.Data.Util.GameUtil;

public class AudienceHelp extends HelpOption {
    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[4];
        GameUtil gameUtil = new GameUtil();
        helpAnswers[0] = new HelpAnswer(question.getCorrectAnswer(), gameUtil.getRandomNumber(68, 95));
        helpAnswers[1] = new HelpAnswer(question.getWrongAnswer()[0], gameUtil.getRandomNumber(13, 60));
        helpAnswers[2] = new HelpAnswer(question.getWrongAnswer()[1], gameUtil.getRandomNumber(13, 60));
        helpAnswers[3] = new HelpAnswer(question.getWrongAnswer()[2], gameUtil.getRandomNumber(13, 60));
        setUsed(true);

        return helpAnswers;
    }
}
