package social.gripp.api.projects.models;

import social.gripp.api.global.models.action.Action;
import social.gripp.api.utils.HasAction;

import java.io.Serializable;

public class ProjectLabel implements Serializable, HasAction {

    private static final long serialVersionUID = 1L;

    private String id;
    private String projectId;
    private String label;
    private Action action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public Action getAction() {
        return action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectLabel that = (ProjectLabel) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        return label != null ? label.equals(that.label) : that.label == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectLabel{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
