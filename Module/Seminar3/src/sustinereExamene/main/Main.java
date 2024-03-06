package sustinereExamene.main;

import sustinereExamene.classes.Student;
import sustinereExamene.classes.SustinereExamen;

public class Main {
    public static  void main(String[] args) {
        Student student1 = new Student(123, "Pop Denis", "popdenis21@stud.ase.ro", 3);
        Student student2 = new Student(125, "Popescu Ion", "popescuion20@stud.ase.ro", 4);
        Student student3 = new Student(221, "Ionescu Dan", "ionescudan21@stud.ase.ro", 3);
        Student student4 = new Student(239, "Pop Andrei", "popandrei22@stud.ase.ro", 2);

        SustinereExamen examenPoo = new SustinereExamen("Programare orientata obiect");
        SustinereExamen examenCts = new SustinereExamen("Calitate si testare software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student2);
    }

}
