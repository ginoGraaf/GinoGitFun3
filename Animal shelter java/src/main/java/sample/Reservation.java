package sample;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reservation {

    private List<Animal>animals=new ArrayList<Animal>();
    public List<Animal> Getanimals()
    {
        return(List<Animal>) Collections.unmodifiableList(animals);
    }
    public void NewCat(String name,Gender gender,String badHabits )
    {
        this.animals.add(new Cat(name,gender,badHabits));
    }

    public void NewDog(String name, Gender gender)
    {
        this.animals.add(new Dog(name,gender));
    }
}
