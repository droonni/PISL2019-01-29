package by.it.group673602.eliseev.lab6_7spring.src.main.java.app.domains;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


public enum Gender{
    MAN("Мужской"),
    WOMAN("Женский");

    private String value;

    Gender(String s){
        this.value = s;
    }

    @Override
    public String toString(){
        return value;
    }
}