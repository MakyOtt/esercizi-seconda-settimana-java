

public class Esercizion8 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

    studentClass studente=new studentClass("dimitri",26,"maschio",true,10.00);
    studente.setAge(24);
    System.out.println(studente.getAge());
        studente.setName("dmytro");
        System.out.println(studente.getName());
        studente.setSesso("mini maschio");
        System.out.println(studente.getSesso());
        studente.setEssereUmano(false);
        System.out.println(studente.getEssereUmano());
        studente.setStipendio(120.00);
        System.out.println(studente.getStipendio());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        studentClass studente=new studentClass("dimitri",26,"maschio",true,10.00);
        studente.setAge(-30);
        System.out.println(studente.getAge());
        studente.setName("dmytro");
        System.out.println(studente.getName());
        studente.setSesso("mini maschio");
        System.out.println(studente.getSesso());
        studente.setEssereUmano(false);
        System.out.println(studente.getEssereUmano());
        studente.setStipendio(-1000.000);
        System.out.println(studente.getStipendio());
    }

}
