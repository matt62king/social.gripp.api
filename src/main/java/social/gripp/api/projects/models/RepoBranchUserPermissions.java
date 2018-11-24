package social.gripp.api.projects.models;

import java.io.Serializable;
import java.util.UUID;

public class RepoBranchUserPermissions implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private UUID repoBranchPermissionsId;
    private String userEmail;
    private Boolean canMerge;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRepoBranchPermissionsId() {
        return repoBranchPermissionsId;
    }

    public void setRepoBranchPermissionsId(UUID repoBranchPermissionsId) {
        this.repoBranchPermissionsId = repoBranchPermissionsId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Boolean getCanMerge() {
        return canMerge;
    }

    public void setCanMerge(Boolean canMerge) {
        this.canMerge = canMerge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepoBranchUserPermissions that = (RepoBranchUserPermissions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (repoBranchPermissionsId != null ? !repoBranchPermissionsId.equals(that.repoBranchPermissionsId) : that.repoBranchPermissionsId != null)
            return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        return canMerge != null ? canMerge.equals(that.canMerge) : that.canMerge == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (repoBranchPermissionsId != null ? repoBranchPermissionsId.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (canMerge != null ? canMerge.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RepoBranchUserPermissions{" +
                "id=" + id +
                ", repoBranchPermissionsId=" + repoBranchPermissionsId +
                ", userEmail='" + userEmail + '\'' +
                ", canMerge=" + canMerge +
                '}';
    }
}
