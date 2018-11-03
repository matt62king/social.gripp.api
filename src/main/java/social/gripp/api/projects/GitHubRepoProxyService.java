package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.GitHubRepo;
import social.gripp.api.projects.models.ProjectRepo;

@FeignClient(value = "projects-server")
public interface GitHubRepoProxyService {

    @GetMapping("api/v1/projects/repos/{email}/{token}")
    ResponseEntity<GitHubRepo> getUserRepos(@PathVariable("email") String email, @PathVariable("token") String token);

    @PostMapping("api/v1/projects/add_repo")
    ResponseEntity<ProjectRepo> addRepoToProject(@RequestBody ProjectRepo projectRepo);
}
