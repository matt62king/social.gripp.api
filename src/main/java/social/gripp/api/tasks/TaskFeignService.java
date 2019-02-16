package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectLabel;
import social.gripp.api.tasks.models.Task;
import social.gripp.api.tasks.models.TaskAssign;
import social.gripp.api.tasks.models.TaskBoard;
import social.gripp.api.tasks.models.TaskDescription;
import social.gripp.api.tasks.models.TaskLabel;
import social.gripp.api.tasks.models.TaskPoints;
import social.gripp.api.tasks.models.TaskSprint;
import social.gripp.api.tasks.models.TaskTestingNotes;
import social.gripp.api.tasks.models.TaskTransition;

import java.util.List;

@FeignClient(value = "tasks-server")
public interface TaskFeignService {

    @PostMapping("api/v1/tasks/create")
    ResponseEntity<Task> createTask(@RequestBody Task task);

    @PutMapping("api/v1/tasks/update")
    ResponseEntity<Task> updateTask(@RequestBody Task task);

    @PutMapping("api/v1/tasks/assign")
    ResponseEntity<Task> assignTask(@RequestBody TaskAssign taskAssign);

    @PutMapping("api/v1/tasks/transition")
    ResponseEntity<Task> transitionTask(@RequestBody TaskTransition taskTransition);

    @PutMapping("api/v1/tasks/sprint-assign")
    ResponseEntity<Task> sprintAssign(@RequestBody TaskSprint taskSprint);

    @PutMapping("api/v1/tasks/board-assign")
    ResponseEntity<Task> boardAssign(@RequestBody TaskBoard taskBoard);

    @PutMapping("api/v1/tasks/points")
    ResponseEntity<Task> pointsUpdate(@RequestBody TaskPoints taskPoints);

    @PutMapping("api/v1/tasks/description")
    ResponseEntity<Task> descriptionUpdate(@RequestBody TaskDescription taskDescription);

    @PutMapping("api/v1/tasks/testing-notes")
    ResponseEntity<Task> testingNotesUpdate(@RequestBody TaskTestingNotes taskTestingNotes);

    @PutMapping("api/v1/tasks/labels")
    ResponseEntity<Task> labelsUpdate(@RequestBody TaskLabel taskLabel);
}
