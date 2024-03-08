package com.util.maps;

public class Department {
    private String depName;
    private String depId;
    private String depHead;

    public Department() {
    }

    public Department(String depName, String depId, String depHead) {
        this.depName = depName;
        this.depId = depId;
        this.depHead = depHead;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }

    @Override
    public String toString() {
        return "Department {" +
                "depName='" + depName + '\'' +
                ", depId='" + depId + '\'' +
                ", depHead='" + depHead + '\'' +
                '}';
    }
}
