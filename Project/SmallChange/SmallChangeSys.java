package com.pm.smallchange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SmallChangeSys {
    public static void main(String[] args) {

        //菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //完成零钱通明细
        String details = "------------------零钱通明细------------------";

        //收益入账
        double money = 0;
        double balance = 0; //余额
        Date date = null;   //日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //消费
        String note = "";

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
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("金额范围应大于0");
                        break;
                    }
                    balance += money;

                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费说明:");
                    note = scanner.next();
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance){
                        System.out.println("消费金额异常");
                        break;
                    }

                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择错误，请重新选择");
            }

        }while(loop);
        System.out.println("------------------退出零钱通------------------");
    }
}
