package com.ra.assignment;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Objects;

public class Manager {
    private BaseEntity[] entities;
    private int defaultElements = 5;
    private int index = 0;

    public Manager() {
        this.entities = new BaseEntity[defaultElements];
    }

    public boolean add(BaseEntity baseEntity){
        if(index == entities.length)
            entities = Arrays.copyOf(entities,entities.length + defaultElements);
        entities[index++] = baseEntity;
        System.out.println("Thêm thành công");
        return true;
    }

    public void show(){
        for (int i = 0; i < index; i++){
            entities[i].output();
        }
    }

    public BaseEntity findId(Object id) {
        for (int i = 0; i < index; i++) {
            if (entities[i].checkId(id)) {
                return entities[i];
            }
        }
        return null;
    }

    // BTVN
    public BaseEntity findFirst(Predicated predicated){
        for (int i = 0; i < index; i++){
            if (predicated.condition(entities[i])){
                return entities[i];
            }
        }
        return null;
    }

}
