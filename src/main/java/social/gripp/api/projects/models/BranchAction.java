package social.gripp.api.projects.models;

import com.google.common.collect.Lists;
import social.gripp.api.utils.CodedEnum;

public enum BranchAction implements CodedEnum<BranchAction> {
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

    @Override
    public BranchAction enumValue(String code) {
        return Lists.newArrayList(values()).stream()
                .filter(branchAction -> code.equalsIgnoreCase(branchAction.getCode()))
                .findFirst().orElseThrow(() -> new RuntimeException("No enum value for code: " + code));
    }


}
