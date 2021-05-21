package giftModel;

public class user1 {
    private int userID;
    private String name;
    private String Pass;
    private String Type;

    public user1(int userID, String name, String pass, String type) {
        this.userID = userID;
        this.name = name;
        Pass = pass;
        Type = type;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
