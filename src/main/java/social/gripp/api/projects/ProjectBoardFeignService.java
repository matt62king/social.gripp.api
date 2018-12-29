package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectBoard;
import social.gripp.api.projects.models.ProjectBoardLinker;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "projects-server")
public interface ProjectBoardFeignService {

    @PostMapping("api/v1/project/board/create")
    ResponseEntity<ProjectBoard> createProjectBoard(@RequestBody ProjectBoard projectBoard);

    @PutMapping("api/v1/project/board/update")
    ResponseEntity<ProjectBoard> updateProjectBoard(@RequestBody ProjectBoard projectBoard);

    @DeleteMapping("api/v1/project/board/delete/{id}")
    ResponseEntity<BooleanResponse> removeProjectBoard(@PathVariable("id") String id);

    @PostMapping("api/v1/project/board/link_workflow")
    ResponseEntity<ProjectBoardLinker> linkWorkflow(@RequestBody ProjectBoardLinker projectBoardLinker);

    @DeleteMapping("api/v1/project/board/remove_workflow/{id}")
    ResponseEntity<BooleanResponse> removeWorkflow(@PathVariable("id") String id);
}
