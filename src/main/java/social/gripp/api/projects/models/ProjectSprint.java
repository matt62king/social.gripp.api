package social.gripp.api.projects.models;

import social.gripp.api.global.models.DurationUnit;

import java.io.Serializable;
import java.util.Date;

public class ProjectSprint implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;
    String projectId;
    String projectBoardId;
    String description;
    Integer duration;
    DurationUnit durationUnit;
    Date startDate;
    Boolean complete;
    Boolean active;

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

    public String getProjectBoardId() {
        return projectBoardId;
    }

    public void setProjectBoardId(String projectBoardId) {
        this.projectBoardId = projectBoardId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public DurationUnit getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(DurationUnit durationUnit) {
        this.durationUnit = durationUnit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectSprint that = (ProjectSprint) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (projectBoardId != null ? !projectBoardId.equals(that.projectBoardId) : that.projectBoardId != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (durationUnit != that.durationUnit) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (complete != null ? !complete.equals(that.complete) : that.complete != null) return false;
        return active != null ? active.equals(that.active) : that.active == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (projectBoardId != null ? projectBoardId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (durationUnit != null ? durationUnit.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (complete != null ? complete.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        return result;
    }
}
