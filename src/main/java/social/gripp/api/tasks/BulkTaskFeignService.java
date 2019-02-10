package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.tasks.models.BulkTask;

@FeignClient(value = "tasks-server")
public interface BulkTaskFeignService {

    @PostMapping("api/v1/tasks/bulk/create")
    ResponseEntity<BulkTask> createBulkTask(@RequestBody BulkTask bulkTask);
}
