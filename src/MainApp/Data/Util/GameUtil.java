package MainApp.Data.Util;

import MainApp.AppProcess.InputValidation;

public class GameUtil {
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public boolean chooseHelp(String userAnswer) {
        boolean yesOrNo=false;
        InputValidation inputValidation=new InputValidation();
        boolean active=true;
        while (active) {
            switch (userAnswer) {
                case "Y":
                    yesOrNo = true;
                    active = false;
                    break;
                case "N":
                    active=false;

            }
        }

        return yesOrNo;
    }
}
