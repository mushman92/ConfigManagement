/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;



/**
 *
 * @author Matt
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new BeerSong().Ninety_Nine_bottles_of_Beer();
    }
    
    public void Ninety_Nine_bottles_of_Beer(){
        
        int i = 99;
        
        while(i>1){
            System.out.println(i + " bottels of beer on the wall, " + i + " bottels of beer take one down, pass it around, ");
            i--;
            System.out.println(i + " bottels of beer on the wall.");
        }
        System.out.println("1 bottel of beer on the wall, 1 bottel of beer take one down, pass it around, no more bottels of beer on the wall.");
    }
}