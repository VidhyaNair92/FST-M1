package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("Selenium");
        hs.add("TestNG");
        hs.add("API");
        hs.add("Cucumber");
        hs.add("SQL");
        System.out.println("HashSet "+hs);

        System.out.println("Size of HashSet "+hs.size());
        hs.remove("Cucumber");
        if(hs.remove("Cloud")){
            System.out.println("Cloud is removed from the list");
        }
        else{
            System.out.println("Cloud is not present in the list");
        }
        if(hs.contains("API")){
            System.out.println("API is present in the list");
        }
        System.out.println("Updated HashSet "+hs);

    }
    }
