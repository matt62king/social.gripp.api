package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String url;
    private String branchFrom;
    private GitCommit gitCommit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBranchFrom() {
        return branchFrom;
    }

    public void setBranchFrom(String branchFrom) {
        this.branchFrom = branchFrom;
    }

    public GitCommit getGitCommit() {
        return gitCommit;
    }

    public void setGitCommit(GitCommit gitCommit) {
        this.gitCommit = gitCommit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitBranch gitBranch = (GitBranch) o;

        if (name != null ? !name.equals(gitBranch.name) : gitBranch.name != null) return false;
        if (url != null ? !url.equals(gitBranch.url) : gitBranch.url != null) return false;
        if (branchFrom != null ? !branchFrom.equals(gitBranch.branchFrom) : gitBranch.branchFrom != null) return false;
        return gitCommit != null ? gitCommit.equals(gitBranch.gitCommit) : gitBranch.gitCommit == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (branchFrom != null ? branchFrom.hashCode() : 0);
        result = 31 * result + (gitCommit != null ? gitCommit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitBranch{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", branchFrom='" + branchFrom + '\'' +
                ", gitCommit=" + gitCommit +
                '}';
    }
}
