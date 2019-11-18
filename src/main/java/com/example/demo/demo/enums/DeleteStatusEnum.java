package com.example.demo.demo.enums;

/**
 * Create by
 *
 * @author xueshengwen
 */
public enum DeleteStatusEnum implements ITextValueEnum {
    /**
     * 删除
     */
    DELETE(0, "删除"),
    /**
     * 未删除
     */
    NO_DELETE(1, "未删除");

    private final int value;
    private final String text;

    DeleteStatusEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public int getCode() {
        return value;
    }

    @Override
    public String getMessage() {
        return text;
    }
}
