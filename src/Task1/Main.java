package Task1;

//Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//терапевта создать метод, который будет назначать врача пациенту согласно плану
//лечения:
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//лечить
public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        Patient patient4 = new Patient(1);
        System.out.println("__________________________________");
        System.out.println("Операция для первого пациента котороый имеет код:" + " " + patient1.planOfTreatment);
        patient1.assignedTerapevt();
        patient1.doctor.mainTerapevt();
        System.out.println("__________________________________");
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("Операция для второго пациента котороый имеет код:" + " " + patient2.planOfTreatment);
        patient2.assignedTerapevt();
        patient2.doctor.mainTerapevt();
        System.out.println("__________________________________");
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("Операция для третьего пациента котороый имеет код:" + " " + patient3.planOfTreatment);
        patient3.assignedTerapevt();
        patient3.doctor.mainTerapevt();
        System.out.println("__________________________________");
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("четвертый пациент который имеет код:" + " " + patient4.planOfTreatment + " " + " , захотел другого врача!");
        patient4.setPlanOfTreatment(2);
        System.out.println("Поэтому он имеет такой код:" + " " + patient4.planOfTreatment);
        patient4.assignedTerapevt();
        patient4.doctor.mainTerapevt();
        System.out.println("__________________________________");
    }
}
