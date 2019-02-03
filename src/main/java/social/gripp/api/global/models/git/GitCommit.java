package social.gripp.api.global.models.git;

import java.io.Serializable;

public class GitCommit implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sha;
    private String url;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GitCommit gitCommit = (GitCommit) o;

        if (sha != null ? !sha.equals(gitCommit.sha) : gitCommit.sha != null) return false;
        return url != null ? url.equals(gitCommit.url) : gitCommit.url == null;
    }

    @Override
    public int hashCode() {
        int result = sha != null ? sha.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GitCommit{" +
                "sha='" + sha + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
