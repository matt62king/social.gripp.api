package social.gripp.api.constraints;

import social.gripp.api.utils.HasRoleDescription;

public enum Authority implements HasRoleDescription {
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
