package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.tasks.models.Task;

@FeignClient(value = "tasks-server")
public interface TaskFeignService {

    @PostMapping("api/v1/tasks/create")
    ResponseEntity<Task> createTask(@RequestBody Task task);
}
