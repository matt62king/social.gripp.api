package social.gripp.api.tasks.models;

import com.google.common.collect.Lists;
import social.gripp.api.utils.CodedEnum;

public enum  TaskLinkerType implements CodedEnum {
    RELATES_TO("R"),
    BLOCKS("B"),
    BLOCKED_BY("BB"),
    DUPLICATES("D");

    private String code;

    TaskLinkerType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    public static TaskLinkerType enumValue(String code) {
        return Lists.newArrayList(values()).stream()
                .filter(taskLinkerType -> code.equalsIgnoreCase(taskLinkerType.getCode()))
                .findFirst().orElseThrow(() -> new RuntimeException("No enum value for code: " + code));
    }
}
