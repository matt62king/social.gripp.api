package social.gripp.api.projects.models;

import com.google.common.collect.Lists;
import social.gripp.api.utils.CodedEnum;

public enum SprintStatus implements CodedEnum {
    PENDING("P"),
    ACTIVE("A"),
    COMPLETE("C");

    private String code;

    SprintStatus(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    public static SprintStatus enumCode(String code) {
        return Lists.newArrayList(values()).stream()
                .filter(sprintStatus -> code.equalsIgnoreCase(sprintStatus.code))
                .findFirst().orElseThrow(() -> new RuntimeException("No status for code: " + code));
    }
}
