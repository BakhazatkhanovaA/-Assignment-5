public class BackEnd extends Company implements Developer {
    public static int Salary;
    public static String work;

    public BackEnd(int id, String name, String address, String work, String adress) {

        super(id, name, address, work, adress);
    }

    private static int experience;
    private static String recommendation;

    public static String getRecommendation() {
        return recommendation;
    }

    public static void setRecommendation(String recommendation) {
        BackEnd.recommendation = recommendation;
    }

    public static int getExperience() {
        return experience;
    }

    public static void setExperience(int experience) {
        BackEnd.experience = experience;
    }

    public static int getSalary() {
        return Salary;
    }

    public static void setSalary(int salary) {
        Salary = salary;
    }

    public String Information() {
        return super.getId() + super.getName() + super.getWork() + "Works as BackEnd developer." + super.CompanySalaries()
                +"with experiences"+BackEnd.getExperience();
    }


    @Override
    public double develop() {
        writeJava();
        return 0;
    }

    @Override
    public String getRecomendation() {
        return "He is the best worker!";
    }

    protected String writeJava() {
        return "He works with BackEnd";
    }
    public String compliment(){
        if(Salary>1000 && experience<=2){
           return "Give to this worker"+getRecommendation();


        }
        return null;
    }
    public void BackendInfo(){
        System.out.println(Information());
        System.out.println(develop());
        System.out.println(compliment());
    }

}

