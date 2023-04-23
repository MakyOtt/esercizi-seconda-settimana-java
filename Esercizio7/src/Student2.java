public class Student2 {
    String name;
    Integer age;

    public Student2(String nome, Integer eta){
        System.out.println("Constructing!");
        this.name=nome;
        this.age=eta;
        System.out.println("Constructed!");
    }
    public Student2(String nome){
        System.out.println("Constructing!");
        this.name=nome;

        System.out.println("Constructed!");
    }
    public Student2(Integer eta){
        System.out.println("Constructing!");

        this.age=eta;
        System.out.println("Constructed!");
    }
    public Student2(){
        System.out.println("Constructing!");

        System.out.println("Constructed!");
    }
}
