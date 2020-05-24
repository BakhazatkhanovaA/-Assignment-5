public abstract class Company {
    private int id;
    private String name;
    private String adress;
    private String work;
    public double salaries;
    public double n;

    public Company(int id, String name, String address, String work, String adress) {
        this.adress = adress;
        this.setaddress(address);
        this.setid(id);
        this.setname(name);
        this.setwork(work);
    }

    private void setaddress(String address) {
    }
    public String getadress(){
        return adress;
    }

    private void setname(String name) {
    }

    private void setwork(String work) {
    }

    private void setid(int id) {
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double develop();

    public double CompanySalaries() {
        System.out.println(salaries += n);

        return 0;
    }
    public String toString() {
        return "ID[ID= " + id + ","  + "Name= " + name +","  + "Adress= " + adress +","
                + "Work= " + work +","  + "Salary= " + salaries + "]";
    }
public void info(){
        System.out.println("Company`s member with id"+ getId()+"First name"+getName()+"Living with adress"+getadress()
        +"Working as"+getWork()+"earning"+CompanySalaries());
}

}
