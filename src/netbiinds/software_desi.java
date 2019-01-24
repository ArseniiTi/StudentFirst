/*
 * Arsenii Tiurin
 * Student ID: 991523179
 *
 */
package netbiinds;

/**
 *
 * @author ars19
 */
public class software_desi {
public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    private char letter;



   public software_desi(String color, char letter){
this.color = color;
this.letter = letter;
    }

}

