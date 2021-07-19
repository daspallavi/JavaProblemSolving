package dsAlgoInJava;

import javax.sound.midi.SysexMessage;

public class BishopMove {
    public static int numOfMoves(int A, int B){
        return Math.min(Math.abs(8-A), Math.abs(8-B)) + Math.min(Math.abs(1-A),Math.abs( 8-B)) + Math.min(Math.abs(1-A),Math.abs( 1-B)) + Math.min(Math.abs(8-A),Math.abs( 1-B));
    }

    public static void main(String[] args){
       System.out.println(numOfMoves(1,1));
    }
}
