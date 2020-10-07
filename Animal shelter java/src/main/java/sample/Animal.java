package sample;

public class Animal {

    private String Name;
    private Gender gender;
    private Reservor reservedBy;


    public Animal(String Name,Gender gender)
    {
        this.Name=Name;
        this.setGender(gender);
    }

    public boolean Reserve(String reservedBy)
    {
        if (this.getReservedBy() ==null)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       String reserved="Not reserved";
       if(this.getReservedBy() !=null)
       {
           reserved=String.format("Reserved by reseverdBy=%s",this.reservedBy.getName());
       }
       return String.format("a1=%s,a2=%s,a3=%s",this.getName(),this.getGender(),reserved);
    }

    public String getName()
    {
        return Name;
    }
    private void setName(String val)
    {
        Name=val;
    }

    public Gender getGender() {
        return gender;
    }

    private void setGender(Gender gender) {
        this.gender = gender;
    }

    public Reservor getReservedBy() {
        return reservedBy;
    }

    private void setReservedBy(Reservor reservedBy) {
        this.reservedBy = reservedBy;
    }
}
