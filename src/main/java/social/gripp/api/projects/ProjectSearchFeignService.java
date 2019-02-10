package social.gripp.api.projects;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import social.gripp.api.projects.models.ProjectLabel;

import java.util.List;

@FeignClient(value = "projects-server")
public interface ProjectSearchFeignService {

    @GetMapping("api/v1/project/search/label/{index}")
    ResponseEntity<List<ProjectLabel>> searchLabel(@PathVariable("index") String index);
}
