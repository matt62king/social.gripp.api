package social.gripp.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import social.gripp.api.user.models.PasswordReset;
import social.gripp.api.user.models.User;
import social.gripp.api.utils.responces.BooleanResponse;

@FeignClient(value = "auth-server")
public interface UserFeignService {

    @GetMapping("api/v1/user/{email}/{check}")
    ResponseEntity<User> getUser(@PathVariable("email") String email, @PathVariable("check") String check);

    @GetMapping("api/v1/user/create/check_email/{email:.+}")
    ResponseEntity<BooleanResponse> checkUserEmail(@PathVariable("email") String email);

    @GetMapping("api/v1/user/create/check_handle/{handle}")
    ResponseEntity<BooleanResponse> checkUserHandle(@PathVariable("handle") String handle);

    @PostMapping("api/v1/user/create")
    ResponseEntity<User> createUser(@RequestBody User user);

    @GetMapping("api/v1/user/password/password_reset_token/{email:.+}")
    ResponseEntity<String> getResetToken(@PathVariable("email") String email);

    @PostMapping("api/v1/user/password/reset_password")
    ResponseEntity<String> resetUserPassword(@RequestBody PasswordReset passwordResetBean);
}
