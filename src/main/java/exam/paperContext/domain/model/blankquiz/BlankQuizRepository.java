package exam.paperContext.domain.model.blankquiz;

import exam.paperContext.domain.model.paper.PaperId;

public interface BlankQuizRepository {
    BlankQuiz findByPaperId(PaperId paperId);
}
