package social.gripp.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import social.gripp.api.user.models.User;

import java.util.List;

@FeignClient(value = "auth-server")
public interface UserTypeAheadFeignService {

    @GetMapping("api/v1/user/search/{user:.+}")
    ResponseEntity<List<User>> searchForUser(@PathVariable("user") String user);
}
