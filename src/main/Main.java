package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Ivan"),
                new Student(2, "Alex"),
                new Student(3, "Petr"),
                new Student(4, "Serg"),
                new Student(5, "Ivan7"),
                new Student(6, "Ivan2")
        ));

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("stud.dat"))) {
            stream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
