package social.gripp.api.projects.models;

import social.gripp.api.utils.CodedEnum;

public enum BranchAction implements CodedEnum {
    CREATE("C"),
    MERGE("M"),
    DELETE("D");

    private String code;

    BranchAction(String code) {
        this.code = code;
    }


    @Override
    public String getCode() {
        return code;
    }
}
