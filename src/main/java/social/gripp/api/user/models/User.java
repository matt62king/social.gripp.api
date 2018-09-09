package social.gripp.api.user.models;

import com.google.cloud.datastore.Key;

import java.util.List;

public interface User {
    Key getKey();
    void setKey(Key key);

    String getHandle();
    void setHandle(String handle);

    String getEmail();
    void setEmail(String email);

    String getPassword();
    void setPassword(String password);

    List<UserAuthority> getUserAuthorities();
    void setUserAuthorities(List<UserAuthority> userAuthorities);
}
