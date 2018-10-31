package social.gripp.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.gripp.api.user.models.GitHubUserAuth;

@FeignClient(value = "auth-server")
public interface GitHubUserAuthFeignService {

    @GetMapping("api/v1/user/proxy/github/token")
    ResponseEntity<GitHubUserAuth> getGitHubToken(@RequestBody GitHubUserAuth gitHubUserAuth);
}
