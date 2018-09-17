/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2a1example;

import java.util.ArrayList;

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
        
        System.out.println("--------------");
        
        //This program will use dynamic arrays
        ArrayList<String> nouns = new ArrayList<>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList<>();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList<>();
        rhymingNouns.add("mouse");
        rhymingNouns.add("blouse");
        rhymingNouns.add("grouse");
        rhymingNouns.add("house");
        rhymingNouns.add("spouse");
        rhymingNouns.add("doghouse");
        rhymingNouns.add("beachhouse");
        rhymingNouns.add("treehouse");

        String noun, verb1, verb2, rhymingNoun1, rhymingNoun2;
        int randomNum;

        //get a random noun from the nouns ArrayList
        //use .size() method to get the # of elements in the ArrayList
        randomNum = (int)(Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first verb & remove it from the array
        randomNum = (int)(Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second verb
        randomNum = (int)(Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);

        //get the two rhyming nouns
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " a " + rhymingNoun1 + "\n" +
                "And then " + verb2 + " it in the " + rhymingNoun2);
    }
    
}
