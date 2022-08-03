public class Author {
//    Exercise 3
    String name;
    String email;
    public Author (String name, String email){
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString (){
        String info = "Author[ = "+name+ ", email = "+email+ " ]";
        return info;
    }

    public static void main(String[] args) {
        Author student1 = new Author("Ayed","Ayed@java.net");
        System.out.println(student1.toString());
    }
}
