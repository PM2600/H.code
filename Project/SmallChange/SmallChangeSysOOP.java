package com.pm.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP { //完成各个功能
    //属性：
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "------------------零钱通明细------------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String note = "";

    //菜单
    public void Menu(){
        do{
            System.out.println("------------------零钱通菜单------------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4)：");
            key = scanner.next();

            switch(key){
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择错误，请重新选择");
            }
        }while(loop);
    }

    //明细
    public void details(){
        System.out.println(details);
    }

    //收益入账
    public void income(){
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        if(money <= 0){
            System.out.println("金额范围应大于0");
            return;
        }
        balance += money;

        date = new Date(); //获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费说明
    public void pay(){
        System.out.println("消费说明:");
        note = scanner.next();
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance){
            System.out.println("消费金额异常");
            return;
        }

        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
        String choice = "";
        while(true) {
            System.out.println("确定要退出吗?(y/n):");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if("y".equals(choice)) {
            loop = false;
        }
    }
}
