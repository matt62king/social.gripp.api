package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.tasks.models.TaskLinker;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "tasks-server")
public interface TaskLinkerFeignService {

    @PostMapping("api/v1/tasks/linker/create")
    ResponseEntity<TaskLinker> createTaskLinker(@RequestBody TaskLinker taskLinker);

    @DeleteMapping("api/v1/tasks/linker/delete/{id}")
    ResponseEntity<BooleanResponse> deleteTaskLinker(@PathVariable("id") String id);
}
