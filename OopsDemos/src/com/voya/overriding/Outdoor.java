package com.voya.overriding;

public class Outdoor extends Sports {
    @Override
    String[] showTypes() {
        return new String[]{"Cricket", "Tennis", "Soccer", "Squash"};
    }
}
