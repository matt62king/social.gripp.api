package social.gripp.api.constraints;

import com.greenfrog.utils.datastore.mapper.enums.EnumDescription;
import social.gripp.api.utils.HasRoleDescription;

public enum Authority implements HasRoleDescription, EnumDescription {
    ADMIN,
    USER,
    CLIENT;

    @Override
    public String getRoleDescription() {
        return "ROLE_" + name();
    }

    @Override
    public String getDescription() {
        return name();
    }
}
