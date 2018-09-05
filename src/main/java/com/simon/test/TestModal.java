package com.simon.test;


public class TestModal {
    String first;
    String second;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public TestModal() {
    }

    public TestModal(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TestModal{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
