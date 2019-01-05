package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectSprint;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "projects-server")
public interface ProjectSprintFeignService {

    @PostMapping("api/v1/project/sprint/create")
    ResponseEntity<ProjectSprint> createSprint(@RequestBody ProjectSprint projectSprint);

    @PutMapping("api/v1/project/sprint/start/{id}")
    ResponseEntity<BooleanResponse> startSprint(@PathVariable("id") String sprintId);

    @PutMapping("api/v1/project/sprint/end/{id}")
    ResponseEntity<BooleanResponse> endSprint(@PathVariable("id") String sprintId);

    @DeleteMapping("api/v1/project/sprint/remove/{id}")
    ResponseEntity<BooleanResponse> removeSprint(@PathVariable("id") String sprintId);
}
