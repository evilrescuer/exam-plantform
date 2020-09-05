package exam.paperContext.domain.model.blankquiz;

import exam.paperContext.domain.model.paper.PaperId;
import exam.paperContext.shared.ValueObject;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class BlankQuizId implements ValueObject {
    private String id;

    public BlankQuizId() {

    }

    public static PaperId nextId() {
        //TODO Generate ID
        return null;
    }

    @Override
    public boolean sameValueAs(Object other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlankQuizId blankQuizId = (BlankQuizId) o;
        return Objects.equals(id, blankQuizId. id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }
}
