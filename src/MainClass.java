import java.util.Scanner;
/* Федотов Николай ПИЭ 22*/
class Employee{
    String fam, im, otch, doljnost;
    int oklad;
    int countChildren;
    Children[] children = null;
}
class Children{
    String nameC;
    int ageC;
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сотрудников => ");
        int count = sc.nextInt();
        sc.nextLine();
        Employee[] emp = new Employee[count];

        System.out.println("Введите информацию о каждом сотруднике.");

        for (int i = 0; i < count; i++) {
            System.out.println("Введите информацию о " + (i + 1) + "-м сотруднике");
            emp[i] = new Employee();
            System.out.println("Введите Фамилию");
            emp[i].fam = sc.nextLine();
            System.out.println("Введите Имя");
            emp[i].im = sc.nextLine();
            System.out.println("Введите Отчество");
            emp[i].otch = sc.nextLine();
            System.out.println("Введите Должность");
            emp[i].doljnost = sc.nextLine();
            System.out.println("Введите Оклад");
            emp[i].oklad = sc.nextInt();
            System.out.println("Введите количетсво детей");
            emp[i].countChildren = sc.nextInt();
            sc.nextLine();

            if(emp[i].countChildren != 0){
                emp[i].children = new Children[emp[i].countChildren];
                System.out.println("Дети:");
                for (int j = 0; j < emp[i].countChildren; j++){
                    emp[i].children[j] = new Children();

                    System.out.println("Введите имя "+ (i+1) +" ребенка:");
                    emp[i].children[j].nameC = sc.nextLine();

                    System.out.println("Введите возраст "+ (i+1) +" ребенка:");
                    emp[i].children[j].ageC = sc.nextInt();
                    sc.nextLine();
                    }
                }
            }

            System.out.println("\nСотрудники фирмы \n фам \t имя \t отч \t должность");

            for (Employee e : emp) {
                System.out.print(e.fam+ "\t"+e.im + "\t"+ e.otch + "\t "+ e.doljnost+ "\t\t"+e.oklad+ "\n");
                System.out.println("\n Дети: ");
                for  (Children c: e.children)
                    System.out.println(c.nameC+ "\t\t"+ c.ageC);
            }
        }
    }


