public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int nVerbal;
    double effectOfVerbal;
    double effectOfExam;
    Teacher teacher;
    Course(String name, String code, String prefix,Teacher teacher,double effectOfVerbal,double effectOfExam){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;
        int nVerbal=0;
        this.effectOfVerbal=effectOfVerbal;
        this.effectOfExam=effectOfExam;


    }
    void printTeacherinfo(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.name)){
            this.teacher=teacher;

        }
        else
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!!");
    }

    void print(){
        System.out.println("Ders adı: "+this.name);
        System.out.println("Ders kodu: "+this.code);
        System.out.println("Dersin kısaltılmış adı: "+this.prefix);
    }
}
