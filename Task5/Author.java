/**
 * The Author class model a book's author
 */
package Composition;

public class Author {
    //The private instance variables
    private String name;
    private String email;
    private char gender; //'m' or 'f'

    /** Constructs a Author instance with the given inpuys */
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email ;
    }
}
