package com.pitisha96;

public class EmulateUserActivities extends Thread{
    ClinicUI ui;

    public EmulateUserActivities(ClinicUI ui){
        this.ui=ui;
    }

    @Override
    public void run() {
        ui.show();
    }
}
