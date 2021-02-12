package com.pitisha96;

import com.pitisha96.actions.Action;
import com.pitisha96.actions.CreateClientAction;
import com.pitisha96.actions.ShowClientsAction;

public class EmulateUsers {
    public static void main(String[] args) {
        new EmulateUsers().startActivities();
    }

    public void startActivities(){
        IClinic clinic=new Clinic();
        new EmulateUserActivities(
                build(
                        clinic,
                        new String[]{"10"},
                        new ShowClientsAction()
                )
        ).start();

        new EmulateUserActivities(
                build(
                        clinic,
                        new String[]{"1","Petr"},
                        new CreateClientAction()
                )
        ).start();
    }

    public ClinicUI build(IClinic clinic, String[] answers, Action ... actions){
        ClinicUI ui=new SingleClinicUI(
                clinic,new StubInput(answers).validator()
        );
        for(Action action:actions){
            ui.loadActions(action);
        }
        return ui;
    }
}
