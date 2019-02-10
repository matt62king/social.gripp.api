package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectLabel;
import social.gripp.api.utils.responces.BooleanResponse;

import java.util.List;

@FeignClient(value = "projects-server")
public interface ProjectLabelFeignService {

    @PostMapping("api/v1/project/label/add")
    ResponseEntity<ProjectLabel> createProjectLabel(@RequestBody ProjectLabel projectLabel);

    @PostMapping("api/v1/project/label/bulk-add")
    ResponseEntity<List<ProjectLabel>> createProjectLabels(@RequestBody List<ProjectLabel> projectLabels);

    @DeleteMapping("api/v1/project/label/{id}")
    ResponseEntity<BooleanResponse> deleteProjectLabel(@PathVariable("id") String labelId);
}
