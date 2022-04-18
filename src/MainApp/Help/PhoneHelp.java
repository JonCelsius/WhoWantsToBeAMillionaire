package MainApp.Help;

import MainApp.Data.Question;

public class PhoneHelp extends HelpOption {

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[1];
        helpAnswers[0] = new HelpAnswer(question.getCorrectAnswer(), 100.0);
        setUsed(true);

        return helpAnswers;
    }
}
