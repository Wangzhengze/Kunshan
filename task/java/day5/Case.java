public class Case {
    private Patient p;
    private SicBed s;
    private Doctor d;
    private Nurse n;
    private Drug drug;

    public Case(Patient p, SicBed s, Doctor d, Nurse n, Drug drug) {
        this.p = p;
        this.s = s;
        this.d = d;
        this.n = n;
        this.drug = drug;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public SicBed getS() {
        return s;
    }

    public void setS(SicBed s) {
        this.s = s;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }

    public Nurse getN() {
        return n;
    }

    public void setN(Nurse n) {
        this.n = n;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
