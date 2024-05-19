public class Main {

    public static void main(String[] args) {
        Square sq = new Square(3);
        Rectangle re = new Rectangle(5,7);
        System.out.println(sq.getName() + " " + sq.area());
        System.out.println(re.getName() + " " + re.area());
    }
}
