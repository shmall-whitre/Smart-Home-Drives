package com.drive;//brightness (亮度), color (颜色)。

public class SmartLight extends Drive {
    int Brightness;//（亮度）
    String Color;
   public SmartLight(){
            super("小米电灯");
            Brightness=10;
            Color="white";
            this.showstatus();
    }
    public void ChangeColor(String color){
        Color=color;

    }
    public void ChangeBrightness(int brightness){
        Brightness=brightness;

    }
    @Override
    public void showstatus() {
        if (Status) {
            System.out.println(name+"已开机"+"当前亮度为"+Brightness+"灯光颜色为"+Color);
        }
        else{
            System.out.println(name+"已关机");
        }
    }


}
