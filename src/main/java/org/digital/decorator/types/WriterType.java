package org.digital.decorator.types;

public enum WriterType {
    STRING_WRITER ("STRING_WRITER"),
    FILE_WRITER ("FILE_WRITER");


    private final String name;

    private WriterType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}

