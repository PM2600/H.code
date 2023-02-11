package com.pm.houserent.view;

import com.pm.houserent.domain.House;
import com.pm.houserent.service.HouseService;
import com.pm.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    //1 新增界面
    public void addHouseShow(){
        System.out.println("-----------------------新增房屋信息-----------------------");
        System.out.println("姓名:");
        String name = Utility.readString(5);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租:");
        int rent = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);
        House newhouse = new House(0, name, phone, address, rent, state);
        if(houseService.Add(newhouse)){
            System.out.println("添加成功");
        }
        else{
            System.out.println("添加失败");
        }
        System.out.println("-----------------------新增信息完毕-----------------------");
    }

    //2 查找界面
    public void searchShow(){
        System.out.println("-----------------------删除房屋信息-----------------------");
        System.out.println("请输入要查找的id:");
        int findid = Utility.readInt();
        House house = houseService.findByid(findid);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("未查找到信息");
        }
    }

    //3 删除界面
    public void delHouseShow(){
        System.out.println("-----------------------删除房屋信息-----------------------");
        System.out.println("请输入要删除房屋信息的编号(-1退出):");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("-----------------------放弃删除信息-----------------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.Del(delId)){
                System.out.println("-----------------------信息删除成功-----------------------");
            }else{
                System.out.println("未找到要删除的房屋信息");
            }
        } else{
            System.out.println("-----------------------放弃删除信息-----------------------");
        }
    }

    //4
    public void updateHouseShow(){
        System.out.println("-----------------------修改房屋信息-----------------------");
        System.out.println("请输入要修改房屋的id(-1退出):");
        int dex = Utility.readInt();
        if(dex == -1){
            System.out.println("放弃修改信息");
            return;
        }
        House house = houseService.findByid(dex);
        if(house == null){
            System.out.println("id不存在");
            return;
        }

        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(16, "");
        if(!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }

        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if(!"".equals(state)){
            house.setState(state);
        }
        System.out.println("-----------------------修改信息完毕-----------------------");
    }


    //5 显示房屋列表
    public void listHousesShow(){
        System.out.println("-----------------------显示房屋列表-----------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-----------------------列表显示完毕-----------------------");
    }

    //6 退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    
    //显示主菜单
    public void mainMenu(){

        do{
            System.out.println("-----------------------房屋出租系统-----------------------");
            System.out.println("\t\t1 新增房源");
            System.out.println("\t\t2 查找房源");
            System.out.println("\t\t3 删除房屋");
            System.out.println("\t\t4 修改信息");
            System.out.println("\t\t5 房屋列表");
            System.out.println("\t\t6 退出系统");
            System.out.println("请输入选择(1-6):");

            key = Utility.readChar();
            switch(key){
                case '1':
                    addHouseShow();
                    break;
                case '2':
                    searchShow();
                    break;
                case '3':
                    delHouseShow();
                    break;
                case '4':
                    updateHouseShow();
                    break;
                case '5':
                    listHousesShow();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
