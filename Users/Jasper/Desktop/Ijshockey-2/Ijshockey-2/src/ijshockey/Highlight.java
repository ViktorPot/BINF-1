package ijshockey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author favdndor
 */
public class Highlight {

    public String highlightId;
    private int tijdsstip;
    public Speler speler;

//getters en setters
    public String getHighlightId() {
        return highlightId;
    }

    public void setHighlightId(String highlightId) {
        this.highlightId = highlightId;
    }

    public int getTijdsstip() {
        return tijdsstip;
    }

    public void setTijdsstip(int tijdsstip) {
        this.tijdsstip = tijdsstip;
    }

    public Speler getSpeler() {
        return speler;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
    }
    

}
