package MainApp.Data.Enum;


public enum QuestionList {
    QUESTION_1_LEVEL_1(" What's the most famous triangle?", 1, 100, 1),
    QUESTION_2_LEVEL_1(" How many seconds are in a day?", 1, 100, 2),
    QUESTION_3_LEVEL_1(" Who is the founder of the social network Facebook?", 1, 100, 3),
    QUESTION_4_LEVEL_1(" What's' celebrated in the Republic of Moldova on August 31?", 1, 100, 4),

    QUESTION_1_LEVEL_2(" What is the chemical formula of the water?", 2, 200, 1),
    QUESTION_2_LEVEL_2(" Which driver has won the most Formula 1 championships?", 2, 200, 2),
    QUESTION_3_LEVEL_2(" What school did Harry Potter attend?", 2, 200, 3),
    QUESTION_4_LEVEL_2(" How many days does it take for the Earth to orbit the Sun?", 2, 200, 4),

    QUESTION_1_LEVEL_3(" Which essential spice is also known as Japanese horseradish?", 3, 300, 1),
    QUESTION_2_LEVEL_3(" What item of clothing is usually worn by a Scotsman at a wedding?", 3, 300, 2),
    QUESTION_3_LEVEL_3(" Who wrote \"Harry Potter\" ?", 3, 300, 3),
    QUESTION_4_LEVEL_3(" Who is the main protagonist of the 1985 film Back to the Future?", 3, 300, 4),

    QUESTION_1_LEVEL_4(" Which of the following is the best-selling book in the world?", 4, 400, 1),
    QUESTION_2_LEVEL_4(" What is the national currency in Morocco?", 4, 400, 2),
    QUESTION_3_LEVEL_4(" Where was the first modern Olympic Games held?", 4, 400, 3),
    QUESTION_4_LEVEL_4(" Who lives in a pineapple under the sea?", 4, 400, 4),

    QUESTION_1_LEVEL_5(" What color are zebra's stripes when they are first born?", 5, 500, 1),
    QUESTION_2_LEVEL_5(" When was Netflix founded?", 5, 500, 2),
    QUESTION_3_LEVEL_5(" The sum of all the numbers on a roulette wheel is?", 5, 500, 3),
    QUESTION_4_LEVEL_5(" How many keys does a classic piano have?", 5, 500, 4),

    QUESTION_1_LEVEL_6(" Which language has the most words (according to dictionary entries)?", 6, 600, 1),
    QUESTION_2_LEVEL_6(" Which is the longest river in the world?", 6, 600, 2),
    QUESTION_3_LEVEL_6(" What’s the capital of Canada?", 6, 600, 3),
    QUESTION_4_LEVEL_6(" What’s the smallest country in the world?", 6, 600, 4),

    QUESTION_1_LEVEL_7(" Until 1923, what was the Turkish city of Istanbul called?", 7, 700, 1),
    QUESTION_2_LEVEL_7(" Which planet is closest to Earth?", 7, 700, 2),
    QUESTION_3_LEVEL_7(" What contains more sugar from the list below?", 7, 700, 3),
    QUESTION_4_LEVEL_7(" How many legs does a lobster have?", 7, 700, 4);

    private final String question;
    private final int level;
    private final int score;
    private final int questionNumber;

    QuestionList(String s, int level, int score, int questionNumber) {
        this.question = s;
        this.level = level;
        this.score = score;
        this.questionNumber = questionNumber;
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

    public int getQuestionNumber() {
        return questionNumber;
    }

}