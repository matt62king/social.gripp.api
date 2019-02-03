package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.global.models.git.GitBranch;

@FeignClient(value = "tasks-server")
public interface TaskBranchFeignService {

    @PostMapping("api/v1/tasks/branch/create")
    ResponseEntity<GitBranch> createBranch(@RequestBody GitBranch createBranch);
}
