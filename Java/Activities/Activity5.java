package activities;

abstract class Book {
    String title;
    abstract void setTitle(String s);
     String getTitle(){
    return title;
    }
}

class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }

}

public class Activity5{
        public static  void main(String[] args){
        MyBook newNovel = new MyBook();
        String title="Secret";
        newNovel.setTitle(title);
        System.out.println("Name of the book is:"+newNovel.getTitle());

    }

}

