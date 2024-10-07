import ht1.car.CarClass;
import ht1.book.BookClass;
import ht1.clock.ClockClass;
import ht1.point.PointClass;
import ht1.student.StudentClass;

public class Main {
    public static void main(String[] args) {

        BookClass book = new BookClass();
        StudentClass student = new StudentClass();
        PointClass point = new PointClass();
        ClockClass clock = new ClockClass();
        CarClass car = new CarClass();

        String bookName = "The Lord of the Rings";
        String bookAuthor = "J.R.R. Tolkien";
        int bookYear = 1954;

        String studentName = "John";
        int gradeBookNumber = 123;
        int gPA = 4;

        int x = 0;
        int y = 0;

        int hours = 10;
        int minutes = 12;
        int seconds = 38;

        String carName = "Toyota";
        String carModel = "Corolla";
        int carYear = 2010;
        int distance = 100;

        book.setBookName(bookName);
        book.setBookAuthor(bookAuthor);
        book.setBookYear(bookYear);

        student.setStudentName(studentName);
        student.setGradeBookNumber(gradeBookNumber);
        student.setGPA(gPA);

        point.setxPoint(x);
        point.setyPoint(y);

        clock.setHours(hours);
        clock.setMinutes(minutes);
        clock.setSeconds(seconds);

        car.setCarName(carName);
        car.setCarModel(carModel);
        car.setCarYear(carYear);

        book.display();

        student.print();

        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

        clock.readTime();

        car.drive(distance);
    }
}
