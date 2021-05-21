package giftModel;

public class results {
    private int resultsID, userID, examID, point;

    public results(int resultsID, int userID, int examID, int point) {
        this.resultsID = resultsID;
        this.userID = userID;
        this.examID = examID;
        this.point = point;
    }

    public int getResultsID() {
        return resultsID;
    }

    public void setResultsID(int resultsID) {
        this.resultsID = resultsID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
