package MainApp.Data;

import MainApp.Data.Enum.AnswersList;
import MainApp.Data.Enum.QuestionList;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerInit {
    QuestionList[] questionList = QuestionList.values();
    List<Question> questions = new ArrayList<>();
    AnswersList[] answersLists = AnswersList.values();

    public List<Question> questionInit() {
        int questionLevels = questionList[questionList.length - 1].getLevel();

        for (int i = 1; i <= questionLevels; i++) {
            List<QuestionList> questionsByLevel = getQuestionsByLevel(i);
            for (int j = 0; j < questionsByLevel.size(); j++) {
                List<Answer> answerByQuestionNumber = getAnswerByQuestionNumber(i, j + 1);

                questions.add(new Question(questionsByLevel.get(j).getQuestion(), questionsByLevel.get(j).getLevel(), questionsByLevel.get(j).getScore(), answerByQuestionNumber.get(0),
                        answerByQuestionNumber.get(1), answerByQuestionNumber.get(2), answerByQuestionNumber.get(3)));
            }
        }

        return questions;
    }


    public List<QuestionList> getQuestionsByLevel(int level) {

        List<QuestionList> questionsByLevel = new ArrayList<>();
        for (QuestionList questionList1 : questionList) {
            if (questionList1.getLevel() == level) {
                questionsByLevel.add(questionList1);
            }
        }
        return questionsByLevel;
    }

    public List<Answer> getAnswerByQuestionNumber(int level, int questionNumber) {
        List<Answer> answerByQuestionNumber = new ArrayList<>();
        for (AnswersList answersList : answersLists) {
            if (answersList.getQuestionLevel() == level && answersList.getQuestionNumber() == questionNumber)
                answerByQuestionNumber.add(new Answer(answersList.getAnswer(), answersList.isCorrect(), answersList.getAnswerIndex()));

        }
        return answerByQuestionNumber;
    }


}
