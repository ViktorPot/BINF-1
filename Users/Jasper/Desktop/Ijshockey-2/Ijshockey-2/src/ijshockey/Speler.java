package ijshockey;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author favdndor
 */
public class Speler extends Lid {

    private ArrayList<Goal> goals;
    private ArrayList<Assist> assists;
    private ArrayList<Penalty> penaltys;
    private String voorkeursPositie;
    private int speelMinuten;

//getters en setters
    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    public ArrayList<Assist> getAssists() {
        return assists;
    }

    public void setAssists(ArrayList<Assist> assists) {
        this.assists = assists;
    }

    public ArrayList<Penalty> getPenaltys() {
        return penaltys;
    }

    public void setPenaltys(ArrayList<Penalty> penaltys) {
        this.penaltys = penaltys;
    }

    public String getVoorkeursPositie() {
        return voorkeursPositie;
    }

    public void setVoorkeursPositie(String voorkeursPositie) {
        this.voorkeursPositie = voorkeursPositie;
    }

    public int getSpeelMinuten() {
        return speelMinuten;
    }

    public void setSpeelMinuten(int speelMinuten) {
        this.speelMinuten = speelMinuten;
    }

}
