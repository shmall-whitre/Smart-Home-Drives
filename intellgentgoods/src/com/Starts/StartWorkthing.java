package com.Starts;

import com.drive.SmartAirConditioner;
import java.util.Scanner;

public class StartWorkthing {
    void StartSmartAirConditioner() {
        MUNE a = new MUNE();
        int turnonnum;
        Scanner sc = new Scanner(System.in);
        SmartAirConditioner c = new SmartAirConditioner();
        if(!c.Status)
        {
            System.out.println("请先开机(输入1开机)");
            turnonnum=sc.nextInt();
            if(turnonnum==1){
                c.TurnOn();
            }
            else {
                System.out.println("Error!");
                return;
            }
        }
        a.AirConditionermenu();
        int number = sc.nextInt();
        switch (number) {
            case 1 -> {
                byte num = 0;
                System.out.println("你想调到几度（最高30度最低为16）");
                while (true) {
                    num = sc.nextByte();
                    if (num <= 30 && num >= 16) {
                        break;
                    } else {
                        System.out.println("温度太高或太低");
                    }
                }
                c.ChangeTemperature(num);
            }
            case 2 -> {
                System.out.println("选择模式（1.制冷或2.制热）");
                int m = sc.nextInt();
                String MODE = "制冷";
                while (true)
                    if (m == 1) {
                        MODE = "制冷";break;
                    } else if (m == 2) {
                        MODE = "制热";break;
                    } else {
                        System.out.println("模式选择有误请检查");
                    }
                c.ChangeMode(MODE);
            }
            case 3 -> {
                if(c.Status) {
                    System.out.println("确定关机（yes or no）");
                    String que= sc.next();
                    if(que.equals("yes")){
                        c.TurnOff();
                    }
                    else if(que.equals("no")){
                        break;
                    }

                }
                else{
                    c.TurnOn();

                }
            }
        }

    }

    void StartSmartLight() {
        MUNE a = new MUNE();
        Scanner sc = new Scanner(System.in);
    }
}
