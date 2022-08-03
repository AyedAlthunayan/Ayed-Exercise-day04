public class Employee {
//    Exercise05
    int id;
    String firstName;
    String lastName;
    int salary;
    public Employee (int id, String firstName, String lastName, int salary) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName (){
        return firstName+" "+ lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary (int salary){
        this.salary=salary;
    }
    public int AnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        percent = salary + salary * 5/100;
        return percent;
    }
    public String toString (){
        return "Employee [id="+id+", name="+firstName+" "+lastName+",salary="+salary+"]";
    }

    public static void main(String[] args) {
        Employee Ayed = new Employee(1102,"Ayed","Alshammari",28000);
        System.out.println(Ayed.toString());
    }
}
