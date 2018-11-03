package social.gripp.api.global.models;

import java.io.Serializable;

public class GitHubUserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String token;
    private String userEmail;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitHubUserModel that = (GitHubUserModel) o;

        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        return userEmail != null ? userEmail.equals(that.userEmail) : that.userEmail == null;
    }

    @Override
    public int hashCode() {
        int result = token != null ? token.hashCode() : 0;
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitHubUserModel{" +
                "token='" + token + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
