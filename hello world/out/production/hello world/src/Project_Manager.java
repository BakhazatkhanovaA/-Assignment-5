public abstract class Project_Manager extends Company implements Developer{
    public Project_Manager(int id, String name, String address, String work, int salary, String adress) {
        super(id, name, address, work, adress);

    }
    private int Salary;
    public  void setSalary(int m){

        this.Salary=m;
    }
    public int getSalary(){
        return Salary;
    }

    public double choosesalarydevelop(int salary){
        FrontEnd.Salary=salary;
        BackEnd.Salary=salary;

        return 0;
    }
    public void setwork(String w){
        BackEnd.work=w;
        FrontEnd.work=w;
    }
    public String Information(){
        return super.getId() + super.getName() + super.getWork() + "Works as BackEnd developer." + super.CompanySalaries();
    }

    @Override
    public String getRecomendation() {
        return "Give recommendation"+getRecomendation();

    }

    public String Recommendation(){
        return "We must give recommendations for "+ getSalary()+"with adress"+super.getadress()+"and with id"+super.getId();
    }


}
