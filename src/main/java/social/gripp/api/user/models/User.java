package social.gripp.api.user.models;

import social.gripp.api.constraints.Authority;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String handle;
    private String email;
    private String password;
    private String gitToken;
    private List<Authority> userAuthorities;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGitToken() {
        return gitToken;
    }

    public void setGitToken(String gitToken) {
        this.gitToken = gitToken;
    }

    public List<Authority> getUserAuthorities() {
        return userAuthorities;
    }

    public void setUserAuthorities(List<Authority> userAuthorities) {
        this.userAuthorities = userAuthorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (handle != null ? !handle.equals(user.handle) : user.handle != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (gitToken != null ? !gitToken.equals(user.gitToken) : user.gitToken != null) return false;
        return userAuthorities != null ? userAuthorities.equals(user.userAuthorities) : user.userAuthorities == null;
    }

    @Override
    public int hashCode() {
        int result = handle != null ? handle.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (gitToken != null ? gitToken.hashCode() : 0);
        result = 31 * result + (userAuthorities != null ? userAuthorities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "handle='" + handle + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gitToken='" + gitToken + '\'' +
                ", userAuthorities=" + userAuthorities +
                '}';
    }
}
