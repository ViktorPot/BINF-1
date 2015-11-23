package ijshockey;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author favdndor
 */
public class Opstelling {

    private String rol; //beter: positie?
    private int tijdstipIn;
    private int tijdstipUit;

//getters en setters
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTijdstipIn() {
        return tijdstipIn;
    }

    public void setTijdstipIn(int tijdstipIn) {
        this.tijdstipIn = tijdstipIn;
    }

    public int getTijdstipUit() {
        return tijdstipUit;
    }

    public void setTijdstipUit(int tijdstipUit) {
        this.tijdstipUit = tijdstipUit;
    }

}
