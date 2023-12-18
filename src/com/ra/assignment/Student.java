package com.ra.assignment;

public class Student implements BaseEntity{
    private String id;
    private String name;
    private String className;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean checkId(Object id) {
        boolean check = id.equals(this.id);
        return check;
    }

    @Override
    public void input() {

    }

    @Override
    public void output() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Class name: " + this.className);
    }


}
