package Assignments;

public class A7 {
    public void driver() {
        Complex a = new Complex();
        a.setComplex(10, 20);
        a.printComplex();
    }

    public void TimeCheck() {
        Time t = new Time();
        t.setTime(3, 45, 20);
        t.printTime();
    }

    public void Cuboid() {
        Cuboid c = new Cuboid();
        c.setLength(20);
        c.setBreadth(15);
        c.setHeight(10);
        System.out.println("Length= " + c.getLength());
        System.out.println("Breadth= " + c.getBreadth());
        System.out.println("Height= " + c.getHeight());
        System.out.println("Volume of Cuboid= " + c.getVolume());
        System.out.println("Surface area of Cuboid= " + c.getSurfaceArea());
    }

    public void EmployeeDetails() {
        Employee e = new Employee();
        e.setEmp_Id(1);
        e.setName("Aayush Singh");
        e.setSalary(60000);
        System.out.println("emp_id: " + e.getEmp_Id());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }

    public void ContactDetails() {
        Contact c = new Contact();
        c.setId(21);
        c.setFirstName("AAYUSH");
        c.setLastName("SINGH");
        c.setMobileNo("9118151707");
        c.setEmailId("as6994770@gmail.com");
        System.out.println("Id: " + c.getId());
        System.out.println("First Name: " + c.getFirstName());
        System.out.println("Last Name: " + c.getLastName());
        System.out.println("Mobile No: " + c.getMobileNo());
        System.out.println("Email id: " + c.getEmailId());
    }

    public void QuestionDetails(){
        Question q=new Question();
        q.setQuestion(1,"which is the very protective class in java?","public","private","default","protected",'b');
        q.DisplayQuestion();
    }

    public void CourseDetails(){
        Course c=new Course();
        c.setCourseId(001);
        c.setCourseName("MCA");
        c.setDuration("2 years");
        c.setFee(110000);
        System.out.println("Id: "+c.getCourseId());
        System.out.println("Course Name: "+c.getCourseName());
        System.out.println("Duration: "+c.getDuration());
        System.out.println("Fee: "+c.getFee());
    }
    public void DistanceDetails(){
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3;
        d1.setDistance(2,40,10);
        d2.setDistance(2,150,53);
        d3=d1.addDistance(d2);
        d3.DisplayDistance();

    }
    public void CircleDetails(){
        Circle r1=new Circle();
        r1.setRadius(12);
        System.out.println("Area= "+r1.getArea());
        System.out.println("Circumference= "+r1.getCircumference());

    }
    public void BookDetails(){
        Book b1=new Book();
        b1.setBookId(1232);
        b1.setTitle("shreemad bhagwat geeta");
        b1.setPrice(120);
        b1.setAuthor("ved vyash");
        System.out.println("bookId: "+b1.getBookId());
        System.out.println("Title: "+b1.getTitle());
        System.out.println("Price: "+b1.getPrice());
        System.out.println("Author: "+b1.getAuthor());
    }

    /* Define a class Complex to represent a complex number. Declare instance member variable to store real and imaginary
    part of a complex number, also define instance member functions to set values of complex number and print values of
    complex number. */
    class Complex {
        private int real, imag;

        public void setComplex(int r, int i) {
            real = r;
            imag = i;
        }

        public void printComplex() {
            System.out.println("Real=" + real + " Imag=" + imag);
        }
    }

    /* Define a class TIme to represent TIme (like 3hr 45 min 20 sec). Declare appropriate number of instance member
     variable and also define instance member functions to set values for time and display values of time. */
    class Time {
        private int hr, min, sec;

        public void setTime(int h, int m, int s) {
            hr = h;
            min = m;
            sec = s;
        }

        public void printTime() {
            System.out.println(hr + ":" + min + ":" + sec);
        }
    }

    /* Define a class Cuboid with member variables to store length of its sides. Also define setters, getters and member
     functions to calculate volume and surface area of cuboid. */
    class Cuboid {
        private int length, breadth, height;

        public void setLength(int l) {
            length = l;
        }

        public void setBreadth(int b) {
            breadth = b;
        }

        public void setHeight(int h) {
            height = h;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public int getHeight() {
            return height;
        }

        public int getVolume() {
            return length * breadth * height;
        }

        public int getSurfaceArea() {
            return 2 * (length * breadth + breadth * height + length * height);
        }
    }

    /* Define a class Employee with properties emp_Id, name, salary and define setters and getters.  */
    class Employee {
        private int emp_Id;
        private String name;
        private float salary;

        public void setEmp_Id(int emp_Id) {
            this.emp_Id = emp_Id;
        }

        public int getEmp_Id() {
            return emp_Id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public float getSalary() {
            return salary;
        }
    }

    /* Define a class Contact with fields id, firstName, lastName, mobileNo and emailId.
     * Provide setters and getters.*/
    class Contact {
        private int id;
        private String firstName, lastName, emailId, mobileNo;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getEmailId() {
            return emailId;
        }
    }

    /* Define a class Question with field queNo, que, optionA, optionB, optionC,optionD, answer.
     * Provide methods to set question and display question. */
    class Question {
        private int queNo;
        private String que, optionA, optionB, optionC, optionD;
        private char answer;

        public void setQuestion(int qNo, String q, String a, String b, String c, String d, char ans) {
            queNo = qNo;
            que = q;
            optionA = a;
            optionB = b;
            optionC = c;
            optionD = d;
            answer = ans;
        }

        public void DisplayQuestion() {
            System.out.println(queNo+". "+que);
            System.out.println("(a) "+optionA);
            System.out.println("(b) "+optionB);
            System.out.println("(c) "+optionC);
            System.out.println("(d) "+optionD);
            System.out.println("Answer: "+answer);
        }
    }
}

/* Define a class Course with field courseId, courseName, duration, fee. Provide setter and getters. */
class Course {
    private int courseId;
    private String courseName, duration;
    private double fee;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
/* define a class distance with details km, m, cm. Provide method to set distance and display distanca.
 Also define a member function to add two distances. */
class Distance{
    private int km, m, cm;
    public void setDistance(int x, int y, int z){
        km=x;
        m=y;
        cm=z;
    }
    public void DisplayDistance(){
        System.out.println(km+"km "+m+"m "+cm+"cm");
    }
    public Distance addDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100 + m+d.m;
        temp.cm=temp.cm%100;
        temp.km=temp.m/1000 + km+d.km;
        temp.m=temp.m%1000;
        return temp;
    }
}

/* Define a class Circle with radius as member variable. provide methods to set radius value,
calculate area and calculate circumference. */
class Circle{
    private float radius;
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getCircumference(){
        return 2*3.14f*radius;
    }
}

/* Define a class Book with member variable bookId, title, price and author.
* provide setters and getters. */
class Book{
    private int bookId;
    private String title, author;
    private double price;
    public void setBookId(int id){
        bookId=id;
    }
    public void setTitle(String t){
        title=t;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setAuthor(String a){
        author=a;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}