package social.gripp.api.utils;

public interface CodedEnum<E> {
    String getCode();
    E enumValue(String code);
}
