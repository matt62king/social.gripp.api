package social.gripp.api.global.models;

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
}
