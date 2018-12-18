package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.Project;

@FeignClient(value = "projects-server")
public interface ProjectsFeignService {

    @PostMapping("api/v1/project/create")
    ResponseEntity<Project> createProject(@RequestBody Project project);
}
