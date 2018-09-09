package social.gripp.api.user.models;

import com.google.cloud.datastore.Key;
import social.gripp.api.constraints.Authority;

public interface UserAuthority {
    Key getKey();
    void setKey(Key key);

    String getUserEmail();
    void setUserEmail(String userEmail);

    Authority getUserAuthority();
    void setUserAuthority(Authority userAuthority);
}
