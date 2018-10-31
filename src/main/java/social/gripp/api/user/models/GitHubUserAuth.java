package social.gripp.api.user.models;

import java.io.Serializable;

public class GitHubUserAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userEmail;
    private String code;
    private String status;
    private String token;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitHubUserAuth that = (GitHubUserAuth) o;

        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return token != null ? token.equals(that.token) : that.token == null;
    }

    @Override
    public int hashCode() {
        int result = userEmail != null ? userEmail.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitHubUserAuth{" +
                "userEmail='" + userEmail + '\'' +
                ", code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
