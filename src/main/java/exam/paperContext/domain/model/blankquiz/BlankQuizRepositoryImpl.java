package exam.paperContext.domain.model.blankquiz;

import exam.paperContext.domain.model.paper.PaperId;
import org.springframework.stereotype.Component;

@Component
public class BlankQuizRepositoryImpl implements BlankQuizRepository {

    @Override
    public BlankQuiz findByPaperId(PaperId paperId) {
        return null;
    }

    @Override
    public BlankQuiz findById(BlankQuizId BlankQuizId) {
        return new BlankQuiz(new BlankQuizId(), 100, "请选择答案");
    }

    @Override
    public void save(BlankQuiz blankQuiz) {

    }
}
