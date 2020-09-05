package exam.paperContext.domain.model.blankquiz;

import exam.paperContext.shared.ValueObject;

public class BlankQuiz implements ValueObject<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private int score;
    private String content;

    public BlankQuiz(BlankQuizId blankQuizId, int score, String content) {
        this.blankQuizId = blankQuizId;
        this.score = score;
        this.content = content;
    }

    @Override
    public boolean sameValueAs(BlankQuiz other) {
        return this.content.equals(other.content);
    }

    public BlankQuizId getBlankQuizId() {
        return blankQuizId;
    }
}
