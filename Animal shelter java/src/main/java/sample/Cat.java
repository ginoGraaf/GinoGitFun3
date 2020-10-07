package sample;

public class Cat extends Animal {

    private String BadHabits;

    public Cat(String Name, Gender gender,String badHabits) {
        super(Name, gender);
        this.setBadHabits(badHabits);
    }

    private String getBadHabits() {
        return BadHabits;
    }

    private void setBadHabits(String badHabits) {
        BadHabits = badHabits;
    }

    @Override
    public String toString() {
    return super.toString()+String.format("a4=%s",this.getBadHabits().toLowerCase());

    }
}
