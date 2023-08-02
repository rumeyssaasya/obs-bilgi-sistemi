public class Main {
    public static void main(String[] args) {
    Teacher t1=new Teacher("Mahmut Hoca","05675011708","Matematik");
    Teacher t2 = new Teacher("Ayla Hoca","05967076893","Türkçe");
    Teacher t3 = new Teacher("Meral Hoca","05698475699","Fen Bilgisi");

    Course Matematik = new Course("Matematik","01005","mat",t1,0.2,0.8);
    Course Turkce = new Course("Türkçe","5321","tur",t2,0.2,0.8);
    Course Fen = new Course("Fen Bilgisi","8596","fen",t3,0.4,0.6);

    Matematik.addTeacher(t1);
    Turkce.addTeacher(t2);
    Fen.addTeacher(t3);

    Student s1 = new Student("Melek","123","c1",Matematik,Turkce,Fen);
    Student s2 =new Student("Maysa","542","c2",Matematik,Turkce,Fen);
    s1.addBulkExamNote(100,50,78);
    s1.addBulkVerbalNote(80,40,20);
    s1.isPass();

    }
}