package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectRepo;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "projects-server")
public interface ProjectReposFeignService {

    @PostMapping("api/v1/project/add_repo")
    ResponseEntity<ProjectRepo> addRepoToProject(@RequestBody ProjectRepo projectRepo);

    @DeleteMapping("api/v1/project/repo/delete/{id}")
    ResponseEntity<BooleanResponse> deleteProjectRepo(@PathVariable("id") String id);
}
