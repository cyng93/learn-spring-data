package com.baeldung.lsd.persistence.model.Predicates;

import com.baeldung.lsd.persistence.model.QTask;
import com.baeldung.lsd.persistence.model.TaskStatus;
import com.querydsl.core.types.dsl.BooleanExpression;

public class TaskPredicates {
    private TaskPredicates() {
    }

    public static BooleanExpression tasksWithNameContaining(String nameLike) {
        return QTask.task.name.contains(nameLike);
    }

    public static BooleanExpression tasksWithStatusEquals(TaskStatus status) {
        return QTask.task.status.eq(status);
    }

}
