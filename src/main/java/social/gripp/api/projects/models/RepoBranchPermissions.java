package social.gripp.api.projects.models;

import java.io.Serializable;
import java.util.UUID;

public class RepoBranchPermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private UUID repoId;
    private UUID branchId;
    private Boolean canMergeDefault;
    private Boolean canMergeMaster;
    private Boolean canMergeDevelop;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRepoId() {
        return repoId;
    }

    public void setRepoId(UUID repoId) {
        this.repoId = repoId;
    }

    public UUID getBranchId() {
        return branchId;
    }

    public void setBranchId(UUID branchId) {
        this.branchId = branchId;
    }

    public Boolean getCanMergeDefault() {
        return canMergeDefault;
    }

    public void setCanMergeDefault(Boolean canMergeDefault) {
        this.canMergeDefault = canMergeDefault;
    }

    public Boolean getCanMergeMaster() {
        return canMergeMaster;
    }

    public void setCanMergeMaster(Boolean canMergeMaster) {
        this.canMergeMaster = canMergeMaster;
    }

    public Boolean getCanMergeDevelop() {
        return canMergeDevelop;
    }

    public void setCanMergeDevelop(Boolean canMergeDevelop) {
        this.canMergeDevelop = canMergeDevelop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepoBranchPermissions that = (RepoBranchPermissions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (repoId != null ? !repoId.equals(that.repoId) : that.repoId != null) return false;
        if (branchId != null ? !branchId.equals(that.branchId) : that.branchId != null) return false;
        if (canMergeDefault != null ? !canMergeDefault.equals(that.canMergeDefault) : that.canMergeDefault != null)
            return false;
        if (canMergeMaster != null ? !canMergeMaster.equals(that.canMergeMaster) : that.canMergeMaster != null)
            return false;
        return canMergeDevelop != null ? canMergeDevelop.equals(that.canMergeDevelop) : that.canMergeDevelop == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (repoId != null ? repoId.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (canMergeDefault != null ? canMergeDefault.hashCode() : 0);
        result = 31 * result + (canMergeMaster != null ? canMergeMaster.hashCode() : 0);
        result = 31 * result + (canMergeDevelop != null ? canMergeDevelop.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RepoBranchPermissions{" +
                "id=" + id +
                ", repoId=" + repoId +
                ", branchId=" + branchId +
                ", canMergeDefault=" + canMergeDefault +
                ", canMergeMaster=" + canMergeMaster +
                ", canMergeDevelop=" + canMergeDevelop +
                '}';
    }
}
