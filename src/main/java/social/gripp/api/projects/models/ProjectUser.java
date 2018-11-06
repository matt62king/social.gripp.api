package social.gripp.api.projects.models;

import java.io.Serializable;

public class ProjectUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String projectId;
    private String userEmail;
    private String userHandle;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectUser that = (ProjectUser) o;

        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        return userHandle != null ? userHandle.equals(that.userHandle) : that.userHandle == null;
    }

    @Override
    public int hashCode() {
        int result = projectId != null ? projectId.hashCode() : 0;
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userHandle != null ? userHandle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectUser{" +
                "projectId='" + projectId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userHandle='" + userHandle + '\'' +
                '}';
    }
}
