public class Person {
    
    String name, ICno, email;

    public Person(String name, String ICno, String email) {
        this.name = name;
        this.ICno = ICno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getICno() {
        return ICno;
    }

    public void setICno(String ICno) {
        this.ICno = ICno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", ICno=" + ICno + ", email=" + email + '}';
    }
}
