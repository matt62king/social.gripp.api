package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.Project;

import java.util.List;

@FeignClient(value = "projects-server")
public interface ProjectsFeignService {

    @PostMapping("api/v1/project/create")
    ResponseEntity<Project> createProject(@RequestBody Project project);

    @GetMapping("api/v1/project/{id}")
    ResponseEntity<Project> getProject(@PathVariable("id") String id);

    @GetMapping("api/v1/project/user/{email:.+}")
    ResponseEntity<List<Project>> getProjectsForUser(@PathVariable("email") String email);
}
