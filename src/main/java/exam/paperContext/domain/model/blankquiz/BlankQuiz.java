package exam.paperContext.domain.model.blankquiz;

import exam.paperContext.shared.ValueObject;

public class BlankQuiz implements ValueObject<BlankQuiz> {
    private int score;

    private String content;

    public BlankQuiz(int score, String content) {
        this.score = score;
        this.content = content;
    }

    @Override
    public boolean sameValueAs(BlankQuiz other) {
        return this.content.equals(other.content);
    }
}
