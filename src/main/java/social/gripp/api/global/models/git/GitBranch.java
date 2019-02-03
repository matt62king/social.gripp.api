package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String sha;
    private String branchFrom;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitBranch gitBranch = (GitBranch) o;

        if (name != null ? !name.equals(gitBranch.name) : gitBranch.name != null) return false;
        if (sha != null ? !sha.equals(gitBranch.sha) : gitBranch.sha != null) return false;
        return branchFrom != null ? branchFrom.equals(gitBranch.branchFrom) : gitBranch.branchFrom == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sha != null ? sha.hashCode() : 0);
        result = 31 * result + (branchFrom != null ? branchFrom.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitBranch{" +
                "name='" + name + '\'' +
                ", sha='" + sha + '\'' +
                ", branchFrom='" + branchFrom + '\'' +
                '}';
    }
}
