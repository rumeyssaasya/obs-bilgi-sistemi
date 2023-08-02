public class Teacher {
    String name;
    String mphon;
    String branch;

    Teacher(String name, String mphon,String branch){
        this.name= name;
        this.mphon=mphon;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adı: "+ this.name);
        System.out.println("Telefon numarısı: "+this.mphon);
        System.out.println("Bölümü: "+this.branch);
    }
}
