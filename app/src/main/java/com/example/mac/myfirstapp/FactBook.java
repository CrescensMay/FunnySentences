package com.example.mac.myfirstapp;

import java.util.Random;

/**
 * Created by Crescens on 18/06/2017.
 */

public class FactBook {

    //fields(member variables) - properties about the object
    private  String[] mFacts = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
            "when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "It has survived not only five centuries, but also the leap into electronic typesetting,",
            " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
            "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    };

    //methods actions the object can take

    public String getFact(){

        String fact = "";
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
