package Domain;

public class Room {
    private int id;
    private int numberOfpersons;
    private int roomnumber;
    private int days;
    private boolean leftroom = false;
    private String feedback;
    private double rating;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfpersons=" + numberOfpersons +
                ", roomnumber=" + roomnumber +
                ", days=" + days +
                ", leftroom=" + leftroom +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    public Room (int id, int numberOfpersons, int roomnumber, int days){
        this.id = id;
        this.numberOfpersons = numberOfpersons;
        this.roomnumber = roomnumber;
        this.days = days;
        leftroom = false; //nu este necesar
    }
    public Room(int id, int numberOfpersons, int roomnumber, int days, boolean leftroom, String feedback, double rating) {
        this.id = id;
        this.numberOfpersons = numberOfpersons;
        this.roomnumber = roomnumber;
        this.days = days;
        this.leftroom = leftroom;
        this.feedback = feedback;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfpersons() {
        return numberOfpersons;
    }

    public void setNumberOfpersons(int numberOfpersons) {
        this.numberOfpersons = numberOfpersons;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isLeftroom() {
        return leftroom;
    }

    public void setLeftroom(boolean leftroom) {
        this.leftroom = leftroom;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }




