public class main{
    public static void main(String[] args) {
        Employee A = new Employee("Tom", 11, "UX/UI", "0001");
        Employee B = new Employee("Tim", 11, "FrontEnd", "0002");
        Project First = new Project("Web A :", "Deverloping a web application");
        Project Second = new Project("Mobile app A :", "Deverloping a mobile app");

        A.ShowDetails();
        First.getProjectName();
        First.getProjectDes();
        Second.getProjectName();
        Second.getProjectDes();


        B.ShowDetails();
        First.getProjectName();
        First.getProjectDes();
    }
}