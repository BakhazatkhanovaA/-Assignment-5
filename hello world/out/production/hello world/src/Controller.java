public class Controller {
    public static void main(String[] args) {
        BackEnd BackEnd = new BackEnd(1, "Aruzhan Bakhazatkhanova", "Zholayeva street 14","BackEndDeveloper","Mangilek el 54");
        BackEnd.setSalary(3000);
        FrontEnd FrontEnd = new FrontEnd(2, "Ali Akhmetov", "Baurzhan Momyshuly 3", "FrontEnd Designer","Mangilek el 54 ");
        System.out.println("IT company  Info: ");
        FrontEnd.setSalary(5000);
        BackEnd.info();
        BackEnd.Information();
        BackEnd. BackendInfo();
        FrontEnd.FrontEndInfo();
        FrontEnd.Information();
        FrontEnd.getRecommendation("Excellent");
        System.out.println("IT company Project Info: ");
        System.out.println("With this project works "+FrontEnd.getName()+"working with"+FrontEnd.develop()+"and BackEnd developer"+BackEnd.getName()+"working with"+BackEnd.develop());
        System.out.println("BackEnd salary: "+ BackEnd.getSalary()+"$"+"FrontEnd salary"+FrontEnd.getSalary()+"$");



    }
}
