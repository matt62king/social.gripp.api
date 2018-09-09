package social.gripp.api.user.models;

import social.gripp.api.constraints.Authority;

public interface UserAuthority {
    String getUserEmail();
    void setUserEmail(String userEmail);
    Authority getUserAuthority();
    void setUserAuthority(Authority userAuthority);
}
