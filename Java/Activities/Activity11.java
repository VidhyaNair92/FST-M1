package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Blue");
        map.put(2,"Orange");
        map.put(3,"Red");
        map.put(4,"Black");
        map.put(5,"Green");
        System.out.println("Original HashMap "+map);
        map.remove("Red");
        if(map.containsValue("Green")){
            System.out.println("Colour Green exist in the map");
        }
        else{
            System.out.println("Colour Green does not exist in the map");
        }
        System.out.println("Size of HashMap "+map.size());
    }
}