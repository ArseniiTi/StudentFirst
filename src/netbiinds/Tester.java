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
public class Tester {
    public static void main(String[] args) {
  software_desi software_desi = new software_desi("Yellow", 's');

  //array of objects

  software_desi[] list = new software_desi[7];
  list[0] = software_desi;
  list[1] = new software_desi("Pink", 'p');
  list[2] = new software_desi("Blue", 'b');
  list[3] = new software_desi("Green", 'g');
  list[4] = new software_desi("Orange", 'o');
        System.out.println(software_desi.getColor());
        System.out.println(list[2].getColor());
    }

}

