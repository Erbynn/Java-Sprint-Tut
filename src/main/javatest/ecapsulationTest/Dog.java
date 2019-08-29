package ecapsulationTest;

import javax.sound.midi.Soundbank;

public class Dog {
//    data and right protected
    private int size;

//    getter
    public int getSize(){
        return size;
    }

//    setter
    public void setSize(int theSize){
        size = theSize;
    }

    
    void bark() {
        if(size > 60) System.out.println("Whoof! whoof!!");
        if(size > 14) System.out.println("Ruff! ruff!!");
        else System.out.println("Yip! yip!!");
    }

}
