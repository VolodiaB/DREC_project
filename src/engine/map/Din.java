package engine.map;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by USER on 20.02.2017.
 */
public class Din {
    public static ArrayList<Integer> getSmoothRandom(int num, int first, int speed, int downD, int upD){
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        arr.add(first);
        for(int i = 1; i <num; i++){
            while (true){
                int temp = r.nextInt(speed);
                if(temp < arr.get(i-1) + r.nextInt(upD) && temp > arr.get(i-1) - r.nextInt(downD)){
                    arr.add(temp);
                    break;
                }
            }

        }
        return arr;
    }


}
