package social.gripp.api.projects;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.projects.models.ProjectUser;
import social.gripp.api.projects.models.RepoBranchPermissions;
import social.gripp.api.utils.responces.BooleanResponse;

import java.util.List;

@FeignClient(value = "projects-server")
public interface ProjectDetailsFeignService {

    @PostMapping("api/v1/project/details/add_user")
    ResponseEntity<BooleanResponse> addProjectUser(@RequestBody List<ProjectUser> projectUser);

    @DeleteMapping("api/v1/project/{id}/details/delete_user/{email:.+}/all")
    ResponseEntity<BooleanResponse> removeUser(@PathVariable("id") String projectId, @PathVariable("email") String user);

    @PostMapping("api/v1/project/repo/branch/add_permission")
    ResponseEntity<RepoBranchPermissions> addBranchPermission(@RequestBody RepoBranchPermissions branchPermissions);

    @DeleteMapping("api/v1/project/repo/branch/delete_permission/{id}")
    ResponseEntity<BooleanResponse> deleteBranchPermission(@PathVariable("id") String permissionId);
}
