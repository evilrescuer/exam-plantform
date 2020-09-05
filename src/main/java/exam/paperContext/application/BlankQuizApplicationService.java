package exam.paperContext.application;

import exam.paperContext.domain.model.blankquiz.BlankQuiz;
import exam.paperContext.domain.model.blankquiz.BlankQuizId;
import exam.paperContext.domain.model.blankquiz.BlankQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhimao.lin
 */
@Service
public class BlankQuizApplicationService {
    private BlankQuizRepository blankQuizRepository;

    @Autowired
    public BlankQuizApplicationService(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }

    public BlankQuiz getBlankQuizzesById(BlankQuizId blankQuizId) {
        return this.blankQuizRepository.findById(blankQuizId);
    }
}
