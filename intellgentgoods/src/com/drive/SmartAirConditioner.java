package com.drive;

import java.util.Objects;

public class SmartAirConditioner extends Drive{
    byte  Temperature;
    String Mode;
    public SmartAirConditioner(){
        super("格力");
        Mode="制冷";
       this.ChangeMode(Mode);


    }
    public void ChangeTemperature(byte temperature){
        Temperature=temperature;


    }
    public void ChangeMode(String mode)
    {
        Mode=mode;
      if(Mode.equals("制冷")){
          this.Temperature=16;
      }
      else if (Mode.equals("制热")) {
          this.Temperature=27;
      }

    }
    @Override
    public void showstatus()
    {
        if (Status) {
            System.out.println(name+"已开机"+" 当前模式为："+Mode +"温度为："+Temperature);
        }
        else{
            System.out.println(name+"已关机");
        }
    }
}
