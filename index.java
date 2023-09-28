import java.util.ArrayList;
class Project {
    private String projectName;
    private String Description;

    Project(String projectName,String Description){
        this.projectName = projectName;
        this.Description = Description;
    }
    
    public String getProjectName(){
        System.out.print(this.projectName);
        return this.projectName;

    }

    public String getProjectDes(){
        System.out.println(this.Description);
        return this.Description;
    }
}

interface Person{
    String getName();
    double getAge();
    void setName();
    void setAge();
}

interface Job{
    String getPosition();
    String getEmpID();
    void setPosition();
    void setEmpID();
}

class Employee implements Job,Person{
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> MyProject;

    Employee(String Name,double Age,String Position,String EmpID){
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
        this.EmpID = EmpID;
        this.MyProject = new ArrayList<Project>();
    }

    public String getName(){
    return Name;
    }

    public double getAge(){
        return Age;
    }

    public String getPosition(){
        return Position;
    }
    public String getEmpID(){
        return EmpID;
    }

    public void setName(String newName){
        this.Name = newName;
    }

    public void setAge(int newAge){
        this.Age = newAge;
    }

    public void setPosition(String newPosition){
        this.Position = newPosition;
    }

    public void setEmpID(String newEmpID){
        this.EmpID = newEmpID;
    }

    public void AddProject(Project Project){
        this.MyProject.add(Project);
    }

    public void ShowDetails(){
        System.out.println("****************");
        System.out.println("Name :"+ this.Name);
        System.out.println("position : "+ this.Position);
        System.out.println("EmpID : "+ this.EmpID);
        System.out.println("Projects");
    }   
}

