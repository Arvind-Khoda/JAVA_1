import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

class employee
{
    Scanner sc=new Scanner(System.in);
    String Name;
    int EID;
    String desi;
    int Age;
    int salary;

    void input()
    {
        System.out.println("Enter EID:");
        EID=sc.nextInt();

        System.out.println("Enter employee name");
        Name=sc.next();

        System.out.println("Enter Age");
        Age=sc.nextInt();

        System.out.println("Enter designation");
        desi=sc.next();

        System.out.println("Enter Salary");
        salary=sc.nextInt();
    }


}

public class Main {
    public static void main(String args[]) throws IOException {

        String Name="";
        int age=0;
        String desi="";
        int salary=0;
        int eid=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add an Employee");
        System.out.println("2.Display all Employee");
        System.out.println("3.Write all Employee in file");
        System.out.println("4.Read all Employee to file");
        System.out.println("5.Display with eid");
        System.out.println("6.Exit");

        System.out.println("choose your options");
        for(;;)
        {int opt = sc.nextInt();
        switch (opt) {
            case 1:
                employee e1 = new employee();
                e1.input();
                Name = e1.Name;
                age = e1.Age;
                desi = e1.desi;
                salary = e1.salary;
                eid = e1.EID;
                break;

            case 3:
                FileWriter fw = new FileWriter("Employee.txt");


                fw.write("Name of Employee is " + Name + "\nAge of Employee is" + age + "\nEID of Employee is" + eid + "\nSalary of Employee is" + salary
                        + "\nDisenation of Employee is" + desi
                );

                fw.close();

            case 4:
                File f1 = new File("Employee.txt");
                Scanner fc = new Scanner(f1);
                while (fc.hasNextLine()) {
                    String data = fc.nextLine();
                    System.out.println(data);
                }

        }
        }

    }
}

