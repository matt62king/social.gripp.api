package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import social.gripp.api.projects.models.GitHubRepo;

import java.util.List;

@FeignClient(value = "projects-server")
public interface GitHubRepoProxyService {

    @GetMapping("api/v1/project/repos/{email:.+}")
    ResponseEntity<List<GitHubRepo>> getUserRepos(@PathVariable("email") String email);
}
