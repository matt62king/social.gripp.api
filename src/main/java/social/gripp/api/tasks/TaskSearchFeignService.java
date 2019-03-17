package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import social.gripp.api.tasks.models.Task;

import java.util.List;

@FeignClient(value = "tasks-server")
public interface TaskSearchFeignService {

    @GetMapping("api/v1/tasks/search/{index}")
    ResponseEntity<List<Task>> searchTask(@PathVariable("index") String index);
}
