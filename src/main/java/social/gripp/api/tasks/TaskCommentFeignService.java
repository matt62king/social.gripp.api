package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.tasks.models.TaskComment;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "tasks-server")
public interface TaskCommentFeignService {

    @PostMapping("api/v1/tasks/comment/create")
    ResponseEntity<TaskComment> createTaskComment(@RequestBody TaskComment taskComment);

    @PutMapping("api/v1/tasks/comment/update")
    ResponseEntity<TaskComment> updateTaskComment(@RequestBody TaskComment taskComment);

    @DeleteMapping("api/v1/tasks/comment/delete/{id}")
    ResponseEntity<BooleanResponse> deleteTaskComment(@PathVariable("id") String taskId);
}
