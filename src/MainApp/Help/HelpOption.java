package MainApp.Help;

import MainApp.Data.Question;

public abstract class HelpOption {
    private boolean isUsed=false;
    abstract HelpAnswer [] getHelpAnswers(Question question);

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
