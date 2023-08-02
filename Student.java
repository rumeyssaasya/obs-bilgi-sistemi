public class Student {
    String name,stuNo,classes;
    Course c1,c2,c3;
    boolean isPass;
    double average;
    double newaverage;
    Student(String name, String stuNo, String classes, Course c1, Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2 =c2;
        this.c3 =c3;
        this.average=0.0;
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if (note1>=0 && note1<=100){
        this.c1.note=note1;}
        if(note2>=0 && note2<=100){
        this.c2.note=note2;}
        if (note3>=0&&note3<=100){
        this.c3.note=note3;}
    }
    void addBulkVerbalNote(int n1, int n2, int n3){
        if (n1>=0 && n1<=100){
        this.c1.nVerbal=n1;}
        if(n2>=0 && n2<=100){
        this.c2.nVerbal=n2;}
        if (n3>=0&&n3<=100){
        this.c3.nVerbal=n3;}
    }


    void isPass(){

        this.average=(this.c1.note*this.c1.effectOfExam+this.c1.nVerbal*this.c1.effectOfVerbal+this.c2.note*this.c2.effectOfExam+ this.c2.nVerbal* this.c2.effectOfVerbal+this.c3.note*this.c3.effectOfExam+this.c1.nVerbal*this.c1.effectOfVerbal)/3;
        if (this.average>55){
            System.out.println("Sınıfı geçtiniz.");
            this.isPass=true;
        }
        else if (this.average<=55) {
            System.out.println("Sınıfta kaldınız.");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name+" Notunuz:\t "+this.c1.note*this.c1.effectOfExam+this.c1.nVerbal*this.c1.effectOfVerbal);
        System.out.println(c2.name+" Notunuz:\t "+this.c2.note*this.c2.effectOfExam+ this.c2.nVerbal* this.c2.effectOfVerbal);
        System.out.println(c3.name+" Notunuz:\t "+this.c3.note*this.c3.effectOfExam+this.c1.nVerbal*this.c1.effectOfVerbal);
        System.out.println("Sınıfı geçme notu:\t "+this.average);
        System.out.println("\n");

    }
}
