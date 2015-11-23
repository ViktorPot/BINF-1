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
public class Competitie {
    
    private ArrayList<Competitie> competities;
    private ArrayList<Team> teams;
    private ArrayList<Seizoen> seizoenen;
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Competitie> getCompetities() {
        return competities;
    }

    public void setCompetities(ArrayList<Competitie> competities) {
        this.competities = competities;
    }

    public ArrayList<Seizoen> getSeizoenen() {
        return seizoenen;
    }

    public void setSeizoenen(ArrayList<Seizoen> seizoenen) {
        this.seizoenen = seizoenen;
    }
    

}
