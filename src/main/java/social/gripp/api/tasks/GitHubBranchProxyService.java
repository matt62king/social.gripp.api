package social.gripp.api.tasks;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.global.models.git.GitRequest;
import social.gripp.api.tasks.models.TaskBranch;

@FeignClient(value = "tasks-server")
public interface GitHubBranchProxyService {

    @PostMapping("api/v1/tasks/git/branch/create")
    ResponseEntity<TaskBranch> createBranch(@RequestBody GitRequest branch);
}
