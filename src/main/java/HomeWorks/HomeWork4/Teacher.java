package HomeWorks.HomeWork4;

public class Teacher extends User {
    private String scienceOfTeaching;
    private int rating;

    public void setScienceOfTeaching(String scienceOfTeaching) {
        this.scienceOfTeaching = scienceOfTeaching;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getScienceOfTeaching() {return scienceOfTeaching;}
    public int getRating() {return rating;}

    public Teacher(String name, int age, String scienceOfTeaching, int rating) {
        super(name, age);
        this.scienceOfTeaching = scienceOfTeaching;
        this.rating = rating;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "{" + "Имя: " + super.getName() + "; возраст: " + super.getAge() +
                "; предмет: " + scienceOfTeaching +
                "; рейтинг: " + rating +
                '}';
    }
}
