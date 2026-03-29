package com.Starts;

import com.drive.SmartAirConditioner;

import java.util.Scanner;

public class StartsWork {

    static void main(String[] args){
        Scanner input=new Scanner(System.in);
        MUNE a=new MUNE();
        StartWorkthing B =new StartWorkthing();
        a.menu();
        int number=input.nextInt();
        switch (number){
           case 1->{
               B.StartSmartAirConditioner();
           }
            case 2->{B.StartSmartLight();}

        }
    }
}
