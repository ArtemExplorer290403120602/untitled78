package Task1;

public class Patient {
    public int planOfTreatment;
    public Terapevt doctor;

    public Patient(int planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
        this.doctor = null;
    }

    /**
     * Сеттер для изменения кода
     */
    public void setPlanOfTreatment(int planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
    }
    public void assignedTerapevt() {
        if (planOfTreatment == 1) {
            doctor = new Hiryrg();
        } else if (planOfTreatment == 2) {
            doctor = new Dantist();
        } else {
            doctor = new Doctor();
        }
    }
}
