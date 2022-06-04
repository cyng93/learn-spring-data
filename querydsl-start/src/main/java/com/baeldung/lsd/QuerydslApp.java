package com.baeldung.lsd;

import com.baeldung.lsd.persistence.model.Task;
import com.baeldung.lsd.persistence.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.baeldung.lsd.persistence.model.Predicates.TaskPredicates.tasksSortedByDueDateDesc;

@SpringBootApplication
public class QuerydslApp implements ApplicationRunner {

    @Autowired
    private TaskRepository taskRepository;

    private static final Logger LOG = LoggerFactory.getLogger(QuerydslApp.class);

    public static void main(final String... args) {
        SpringApplication.run(QuerydslApp.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Iterable<Task> tasksDueDateDesc = taskRepository.findAll(tasksSortedByDueDateDesc());

        LOG.info("All Tasks Sorted By Due Date Desc :");
        tasksDueDateDesc.forEach(t -> LOG.info(t.toString()));
    }

}
