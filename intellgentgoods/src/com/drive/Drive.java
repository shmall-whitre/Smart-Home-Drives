package com.drive;

public abstract class Drive {
    public String name;
    public boolean Status=false;
    Drive(String drivename){
      name=drivename;
    }
    public void  TurnOn(){
        Status=true;
        this.showstatus();

    }
    public void TurnOff(){
        Status=false;
       this.showstatus();
    }
    public void showstatus() {
        if (Status) {
            System.out.println(name+"已开机");
        }
        else{
            System.out.println(name+"已关机");
        }
    }


}
