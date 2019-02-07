package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String sha;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitBranch branch = (GitBranch) o;

        if (name != null ? !name.equals(branch.name) : branch.name != null) return false;
        return sha != null ? sha.equals(branch.sha) : branch.sha == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sha != null ? sha.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitBranch{" +
                "name='" + name + '\'' +
                ", sha='" + sha + '\'' +
                '}';
    }
}
