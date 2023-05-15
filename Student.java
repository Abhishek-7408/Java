public class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

public class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
        this.rollNo = rollNo;
        this.course = course;

        // Validate name
        if (name.matches(".*[^a-zA-Z ].*")) {
            throw new NameNotValidException(String.format("Name '%s' is not valid", name));
        }

        this.name = name;

        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(String.format("Age '%d' is not within range (15-21)", age));
        }

        this.age = age;
    }
}
