package social.gripp.api.projects.models;

import java.io.Serializable;

public class GitHubRepo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String defaultBranch;
    private Boolean isPrivate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitHubRepo that = (GitHubRepo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (defaultBranch != null ? !defaultBranch.equals(that.defaultBranch) : that.defaultBranch != null)
            return false;
        return isPrivate != null ? isPrivate.equals(that.isPrivate) : that.isPrivate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (defaultBranch != null ? defaultBranch.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitHubRepo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", defaultBranch='" + defaultBranch + '\'' +
                ", isPrivate=" + isPrivate +
                '}';
    }
}
