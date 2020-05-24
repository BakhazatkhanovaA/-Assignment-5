public class FrontEnd extends Company {
    public static int Salary;
    public static String work;

    public FrontEnd(int id, String name, String address, String work, String adress) {
        super(id, name, address, work, adress);
    }


    private static int experience;
    private static String recommendation;

    public static String getRecommendation(String excellent) {
        return recommendation;
    }

    public static void setRecommendation(String recommendation) {
        FrontEnd.recommendation = recommendation;
    }

    public static int getExperience() {
        return experience;
    }

    public static void setExperience(int experience) {
        FrontEnd.experience = experience;
    }

    public static int getSalary() {
        return Salary;
    }

    public static void setSalary(int salary) {
        Salary = salary;
    }

    public String Information() {
        return super.getId() + super.getName() + super.getWork() + "Works as  FrontEnd developer." + super.CompanySalaries()+"with experiences"
                +FrontEnd.getExperience();
    }


    @Override
    public double develop() {
        writeJavaScript();
        return 0;
    }



    private String   writeJavaScript() {
        return "He works with FrontEnd";
    }
    public String compliment(){
        if(Salary>1000 && experience<=2){
            getRecommendation("Excellent");


        }
        return null;
    }
    public void FrontEndInfo(){
        System.out.println(Information());
        System.out.println(develop());
        System.out.println(compliment());
    }
}


