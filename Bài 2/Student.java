package Lab_03.Bai2;

public class Student {
    private String stID;
    private String stName;
    private String stClass;
    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }
    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return this.stID;
    }

    public void setStID(String id) {
        this.stID = id ;
    }

    public String getStName() {
        return this.stName;
    }

    public void setStName(String name) {
        this.stName = name;
    }

    public String getStClass() {
        return this.stClass;
    }

    public void setStClass(String Class) {
        this.stClass = Class;
    }
    public String toString() {
        return "{" +
            " stID='" + getStID() + "'" +
            ", stName='" + getStName() + "'" +
            ", stClass='" + getStClass() + "'" +
            "}";
    }



    
}
