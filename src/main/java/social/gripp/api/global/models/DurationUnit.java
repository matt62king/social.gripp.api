package social.gripp.api.global.models;

import com.google.common.collect.Lists;
import social.gripp.api.utils.CodedEnum;

public enum DurationUnit implements CodedEnum {
    DAY("D"),
    WEEK("W"),
    MONTH("M");

    private String code;

    DurationUnit(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    public static DurationUnit enumCode(String code) {
        return Lists.newArrayList(values()).stream()
                .filter(durationUnit -> code.equalsIgnoreCase(durationUnit.getCode()))
                .findFirst().orElseThrow(() -> new RuntimeException("No duration unit for code: " + code));
    }
}
