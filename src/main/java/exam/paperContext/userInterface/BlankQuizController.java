package exam.paperContext.userInterface;

import exam.paperContext.application.BlankQuizApplicationService;
import exam.paperContext.domain.model.blankquiz.BlankQuiz;
import exam.paperContext.domain.model.blankquiz.BlankQuizId;
import exam.paperContext.domain.model.blankquiz.BlankQuizRepositoryImpl;
import exam.paperContext.domain.service.BlankQuizDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhimao.lin
 */
@RestController
public class BlankQuizController {
    private BlankQuizApplicationService blankQuizApplicationService;
    private BlankQuizRepositoryImpl blankQuizRepository;

    @Autowired
    public BlankQuizController (BlankQuizApplicationService blankQuizApplicationService, BlankQuizRepositoryImpl blankQuizRepository) {
        this.blankQuizApplicationService = blankQuizApplicationService;
        this.blankQuizRepository = blankQuizRepository;
    }

    @GetMapping("/blank-quizzes/{blankQuizId}")
    @ResponseStatus(HttpStatus.OK)
    BlankQuizDto getBlankQuizById (@PathVariable String blankQuizId) {
        return BlankQuizDto.from(
                this.blankQuizApplicationService
                        .getBlankQuizzesById(new BlankQuizId(blankQuizId))
                        .getBlankQuizId()
        );
    }
}
