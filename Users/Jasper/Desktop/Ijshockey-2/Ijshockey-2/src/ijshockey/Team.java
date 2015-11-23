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
public class Team {

    private int stamNr;
    private String naam;
    private String thuisArena;
    private int punten;         // Berekenen uit gewonnen verloren?
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    private HashMap<Integer, String> resultaten; // wedstrijdnummer,gewonnen/verloren/gelijk
    private ArrayList<Speler> spelers;
    private Trainer trainer;

//getters en setters
    public int getStamNr() {
        return stamNr;
    }

    public void setStamNr(int stamNr) {
        this.stamNr = stamNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getThuisArena() {
        return thuisArena;
    }

    public void setThuisArena(String thuisArena) {
        this.thuisArena = thuisArena;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }

    public HashMap<Integer, String> getResultaten() {
        return resultaten;
    }

    public void setResultaten(HashMap<Integer, String> resultaten) {
        this.resultaten = resultaten;
    }

    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public void setSpelers(ArrayList<Speler> spelers) {
        this.spelers = spelers;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    
}
