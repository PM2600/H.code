package com.pm.houserent.service;

import com.pm.houserent.domain.House;
import com.pm.houserent.utils.Utility;

public class HouseService {

    private House[] houses;
    private int count = 0;
    private int idcounter = 0;

    //1.
    public boolean Add(House newhouse){
        if(count == houses.length){
            System.out.println("空间已满，无法添加");
            return false;
        }
        houses[count++] = newhouse;

        newhouse.setId(++idcounter);
        return true;
    }

    //2.
    public House findByid(int findid){
        for (int i = 0; i < count; i++) {
            if(findid == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    //3.
    public boolean Del(int delId){
        int index = -1;
        for (int i = 0; i < count; i++) {
            if(houses[i].getId() == delId){
                index = i;
                break;
            }
        }
        if(index == -1){
            return false;
        }
        else{
            for (int i = 0; i < count - 1; i++) {
                houses[i] = houses[i + 1];
            }
            houses[count - 1] = null;
            count--;
            return true;
        }
    }



    public HouseService(int size){
        houses = new House[size];
    }

    public House[] list(){
        return houses;
    }
}
