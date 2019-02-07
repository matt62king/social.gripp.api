package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String sha;
    private String branchFrom;
    private String repoId;
    private String requestingUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getBranchFrom() {
        return branchFrom;
    }

    public void setBranchFrom(String branchFrom) {
        this.branchFrom = branchFrom;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public String getRequestingUser() {
        return requestingUser;
    }

    public void setRequestingUser(String requestingUser) {
        this.requestingUser = requestingUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitBranch branch = (GitBranch) o;

        if (name != null ? !name.equals(branch.name) : branch.name != null) return false;
        if (sha != null ? !sha.equals(branch.sha) : branch.sha != null) return false;
        if (branchFrom != null ? !branchFrom.equals(branch.branchFrom) : branch.branchFrom != null) return false;
        if (repoId != null ? !repoId.equals(branch.repoId) : branch.repoId != null) return false;
        return requestingUser != null ? requestingUser.equals(branch.requestingUser) : branch.requestingUser == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sha != null ? sha.hashCode() : 0);
        result = 31 * result + (branchFrom != null ? branchFrom.hashCode() : 0);
        result = 31 * result + (repoId != null ? repoId.hashCode() : 0);
        result = 31 * result + (requestingUser != null ? requestingUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitBranch{" +
                "name='" + name + '\'' +
                ", sha='" + sha + '\'' +
                ", branchFrom='" + branchFrom + '\'' +
                ", repoId='" + repoId + '\'' +
                ", requestingUser='" + requestingUser + '\'' +
                '}';
    }
}
