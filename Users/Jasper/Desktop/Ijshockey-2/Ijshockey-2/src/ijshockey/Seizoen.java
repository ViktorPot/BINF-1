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
public class Seizoen {

    private int jaar;
    private ArrayList<Speeldag> speeldagen;

//getters en setters
    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public ArrayList<Speeldag> getSpeeldagen() {
        return speeldagen;
    }

    public void setSpeeldagen(ArrayList<Speeldag> speeldagen) {
        this.speeldagen = speeldagen;
    }

}
