package ma.youcode.beans;

public class User {

    public String fname;

    public User(){
        // runs when no constructor-arg given from spring.xml
        System.out.println("User non-arg constructor...");
    }
    public User(String fname){
        // runs when constructor-arg are given from spring.xml
        this.fname = fname;
        System.out.println("User fname constructor... "+this.fname);
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        // runs when property are given from spring.xml
        this.fname = fname;
        System.out.println("User fname setter... "+this.fname);
    }











}
