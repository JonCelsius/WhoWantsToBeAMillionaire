package MainApp.Help;

import MainApp.Data.Question;
import MainApp.Data.Util.GameUtil;

public class FiftyFiftyHelp extends HelpOption {

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        GameUtil gameUtil =new GameUtil();
        int randomIndex=gameUtil.getRandomNumber(0,3);
        HelpAnswer[] helpAnswers = new HelpAnswer[2];
        helpAnswers[0] = new HelpAnswer(question.getCorrectAnswer(),50);

        helpAnswers[1] = new HelpAnswer(question.getWrongAnswer()[randomIndex],50);
        setUsed(true);

        return helpAnswers;
    }

}
