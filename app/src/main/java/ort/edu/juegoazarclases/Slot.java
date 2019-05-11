package ort.edu.juegoazarclases;

import android.widget.ImageView;

public class Slot {

    int[] slotsArray = {
            R.drawable.apple,
            R.drawable.cuore,
            R.drawable.smile,
            R.drawable.world,
            R.drawable.empty
    };
    ImageView slotImage;

    public Slot(ImageView slotImage) {
        this.slotImage = slotImage;
    }



    public void setSlotImage(int index){

        slotImage.setImageResource(slotsArray[index]);
    }
}
