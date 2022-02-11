package TH_tuan_3;

public class Human {
    private String FirstName;
    private String LastName;

    public Human() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        try {
            if (Character.isUpperCase(firstName.charAt(0)) == false)
                throw new Exception("Error: Lower case letter in FirstName");
                FirstName = firstName;
        }catch(Exception e){
            e.getMessage();
        }
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        try {
            if (Character.isUpperCase(lastName.charAt(0)) == false)
                throw new Exception("Error: Lower case letter in LastName");
            LastName = lastName;
        }catch(Exception e){
            e.getMessage();
        }

    }
}
