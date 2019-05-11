package ort.edu.juegoazarclases;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Game {
    MainActivity mainActivity;
    //Información del array
    private static int SLOTS_AMOUNT=3;
    private static int LEFT_INDEX=0;
    private static int CENTER_INDEX=1;
    private static int RIGHT_INDEX=2;
    private static int EMPTY_INDEX=4;
    private int[] indexes = new int[SLOTS_AMOUNT];
    //Slots
    private  Slot left;
    private  Slot center;
    private  Slot right;
    //Variable que confirma si los indices son iguales para indicar que se ganó la partida
    private  boolean areEqual;





    public Game(ImageView leftImage, ImageView centerImage, ImageView rightImage) {
        left= new Slot(leftImage);
        center=new Slot(centerImage);
        right=new Slot(rightImage);
    }

    private void startPlay(){
        areEqual=true;
        for (int i=0; i< SLOTS_AMOUNT; i++) {
            indexes[i] = (new Random()).nextInt(4);
            if((i!=0)&&(indexes[i-1]!=indexes[i])) areEqual=false;
        }
    }

    private int getLeftIndex(){ return indexes[LEFT_INDEX]; }
    private int getCenterIndex(){
        return indexes[CENTER_INDEX];
    }
    private int getRightIndex(){ return indexes[RIGHT_INDEX]; }

    public void play(){
        startPlay();
        left.setSlotImage(getLeftIndex());
        center.setSlotImage(getCenterIndex());
        right.setSlotImage(getRightIndex());
    }


    public boolean hasWon() {
        return areEqual;
    }



    private int getEmptyIndex() {
        return EMPTY_INDEX;
    }
}

