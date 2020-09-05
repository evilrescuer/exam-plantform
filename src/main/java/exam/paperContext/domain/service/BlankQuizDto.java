package exam.paperContext.domain.service;

import exam.paperContext.domain.model.blankquiz.BlankQuizId;
import exam.paperContext.domain.model.paper.Paper.BlankQuiz;
import exam.paperContext.domain.model.paper.PaperId;
import exam.paperContext.userInterface.PaperDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BlankQuizDto {
    private String quizId;
    private int score;

    public static BlankQuiz toBlankQuiz(BlankQuizDto blankQuizDto) {
        // TODO map BlankQuizDto to BlankQuiz
        return null;
    }

    public static BlankQuizDto from(BlankQuizId blankQuizId) {
        return null;
    };
}
