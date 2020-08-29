package exam.paperContext.domain.service;

import exam.paperContext.domain.model.paper.PaperId;

import java.util.List;

public interface BlankQuizClient {
    List<BlankQuizDto> getBlankQuizzesByIds(List<String> blankQuizIds);
    List<BlankQuizDto> getBlankQuizzesByPaperId(PaperId paperId);
}

