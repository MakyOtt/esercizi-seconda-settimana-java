

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizion6 {
    public static void main(String[] args) {
        datiCorso("Developer","Mario Rossi",7,true,2023);
        exercise2();
        exercise3();

    }


    //1: Create a new Class in this package
    //Call this class 'Course'
    //Inside add the following variables, using an appropriate type.
    //courseName, maxStudents, qualityRatingOutOf10
    //On top of this choose 2 variables of your choice!
    private static Course datiCorso (String nomeCorso,String nomeStrudente,Integer valore,Boolean vale,Integer anno ){
        Course corso = new Course();
        corso.courseName=nomeCorso;
        corso.maxStudents=nomeStrudente;
        corso.qualityRatingOutOf10=valore;
        corso.usefulForJobHunting=vale;
        corso.yearReached=anno;

        System.out.println(corso.courseName);
        System.out.println(corso.maxStudents);
        System.out.println(corso.qualityRatingOutOf10);
        System.out.println(corso.usefulForJobHunting);
        System.out.println(corso.yearReached);

        return corso;
    }

    //2: use the class called 'Student', add variables
    //(class variables are called 'fields' or 'attributes')
    //called 'name' and 'age'
    //Using the function below set the student name and ages
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        List<Student> studenti = new ArrayList<Student>();
        for(int i=0; i< studentNames.toArray().length; i++){
            studenti.add(createNewStudent(studentNames.get(i), studentAges.get(i)));
            System.out.println(studenti.get(i).name + " " + studenti.get(i).age);
        }

    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        student.name=name;
        student.age=age;

        return student;

    }

    // 3: Finally lets edit our 'Course' class once more,
    //This time we are going to add another internal variable (field or attribute) called
    //students. It's going to be a List<Student> called students
    //Copy the code above and add the students from exercise 2
    //Bonus: Using an appropriate loop of your choice find the average age of our students.
    //Hint: use a double to stop automatic integer rounding

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        Course course= new Course();
        course.studenti= new ArrayList<Student>();
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        for(int i=0; i< studentNames.toArray().length; i++){
            course.studenti.add(createNewStudent(studentNames.get(i), studentAges.get(i)));
            System.out.println(course.studenti.get(i).name + " " + course.studenti.get(i).age);
        }
        int nStudenti=0;
        double etaMedia=0;
        for(nStudenti=0;nStudenti<course.studenti.size();nStudenti++){
            etaMedia+=course.studenti.get(nStudenti).age;
        }
        etaMedia/=nStudenti;
        System.out.println(Math.round(etaMedia));
    }
}
