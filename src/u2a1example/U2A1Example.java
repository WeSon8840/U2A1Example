/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2a1example;

/**
 *
 * @author glSon8840
 */
public class U2A1Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a blank array
        String friends[] = new String[5];

        //fill in elements
        friends[0] = "Sue";
        friends[1] = "Jerry";
        friends[2] = "Katie";
        friends[3] = "Nick";
        friends[4] = "Nathaniel";

        //print out the friends array
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);

        System.out.println("--------------");
        //create a new friends array in 1 step
        String friends2[] = {"Sheldon","Leonard", "Raj", "Howard"};
        System.out.println(friends2[0]);
        System.out.println(friends2[1]);
        System.out.println(friends2[2]);
        System.out.println(friends2[3]);
    }
    
}
