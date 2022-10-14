package test.arraylist;

import java.util.ArrayList;

public class MainMovie {
    public static void main(String[] args) {
        Movie m1 = new Movie("aa",1.1,"aaa");
        Movie m2 = new Movie("bb",1.2,"bbb");
        Movie m3 = new Movie("cc",1.3,"ccc");

        ArrayList<Movie> movies=new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie m=movies.get((i));
            System.out.println(m.getName());
            System.out.println(m.getAcort());
            System.out.println(m.getScore());

        }

    }
}
