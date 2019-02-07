package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String requestingUser;
    private String repoId;
    private String reference;
    private String sha;

    public String getRequestingUser() {
        return requestingUser;
    }

    public void setRequestingUser(String requestingUser) {
        this.requestingUser = requestingUser;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitRequest that = (GitRequest) o;

        if (requestingUser != null ? !requestingUser.equals(that.requestingUser) : that.requestingUser != null)
            return false;
        if (repoId != null ? !repoId.equals(that.repoId) : that.repoId != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;
        return sha != null ? sha.equals(that.sha) : that.sha == null;
    }

    @Override
    public int hashCode() {
        int result = requestingUser != null ? requestingUser.hashCode() : 0;
        result = 31 * result + (repoId != null ? repoId.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (sha != null ? sha.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitRequest{" +
                "requestingUser='" + requestingUser + '\'' +
                ", repoId='" + repoId + '\'' +
                ", reference='" + reference + '\'' +
                ", sha='" + sha + '\'' +
                '}';
    }
}
