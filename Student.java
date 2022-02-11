package TH_tuan_3;

public class Student extends Human{
    private int StudentID;
    private String[] Subject;

    public Student() {
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        try{
            if(Integer.toString(studentID).matches("\\d{7}") == false)
                throw new Exception("Error: Invalid StudentID");
            StudentID = studentID;
        }catch(Exception e){
            e.getMessage();
        }

    }

    public String[] getSubject() {
        return Subject;
    }

    public void setSubject(String[] subject) {
        Subject = subject;
    }
}
