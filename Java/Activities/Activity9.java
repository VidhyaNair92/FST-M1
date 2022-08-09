package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Jithin");
        myList.add("Vidhya");
        myList.add("Vishnu");
        myList.add("Jishnu");
        myList.add("Gokul");
       for(String s: myList){
           System.out.println(s);
       }
        System.out.println("3rd element in the list "+myList.get(2));
        if(myList.contains("Vidhya")){
            System.out.println("Name Vidhya exist in the list");
        }
        System.out.println("Size of ArrayList "+ myList.size());
        myList.remove(4);
        System.out.println("New size of ArrayList "+ myList.size());
    }
}