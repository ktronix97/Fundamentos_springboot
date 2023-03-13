package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanProperties{

    private String name;
    private String apellido;

    public MyBeanWithPropertiesImplement(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }
    @Override
    public String funtion() {
        return name + "-" + apellido;
    }
}
