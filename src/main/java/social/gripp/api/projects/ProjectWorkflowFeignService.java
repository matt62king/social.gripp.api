package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectWorkflow;
import social.gripp.api.projects.models.WorkflowLinker;
import social.gripp.api.projects.models.WorkflowTransition;
import social.gripp.api.utils.responces.BooleanResponse;

import java.util.List;

@FeignClient(value = "projects-server")
public interface ProjectWorkflowFeignService {

    @PostMapping("api/v1/project/details/workflow/create")
    ResponseEntity<ProjectWorkflow> createWorkflow(@RequestBody ProjectWorkflow projectWorkflow);

    @PutMapping("api/v1/project/details/workflow/update")
    ResponseEntity<ProjectWorkflow> updateWorkflow(@RequestBody ProjectWorkflow projectWorkflow);

    @DeleteMapping("api/v1/project/details/workflow/delete/{id}")
    ResponseEntity<BooleanResponse> removeWorkflow(@PathVariable("id") String id);

    @PostMapping("api/v1/project/details/workflow/linker/update")
    ResponseEntity<WorkflowLinker> createWorkflowLinker(@RequestBody WorkflowLinker workflowLinker);

    @DeleteMapping("api/v1/project/details/workflow/linker/delete/{id}")
    ResponseEntity<BooleanResponse> deleteWorkflowLinker(@PathVariable("id") String id);

    @PostMapping("api/v1/project/details/workflow/transition/create")
    ResponseEntity<WorkflowTransition> createTransition(@RequestBody WorkflowTransition transition);

    @DeleteMapping("api/v1/project/details/workflow/transition/delete/{id}")
    ResponseEntity<BooleanResponse> removeTransition(@PathVariable("id") String id);

    @PutMapping("api/v1/project/details/workflow/sequence/update")
    ResponseEntity<List<ProjectWorkflow>> updateSequences(@RequestBody List<ProjectWorkflow> projectWorkflows);
}
