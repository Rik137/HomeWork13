import java.util.Scanner;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentMap = new HashSet<>();

        while (true) {
            System.out.println("Введите информацию о студенте ФИО, группу, номер студенческого билета \n (для завершения работы программы введите \"end\")");
            try {
                String input = scanner.nextLine();
                if (input.equals("end")) {
                    System.out.println("досвидания");

                    System.out.print(studentMap);
                    break;
                } else {
                    String[] pars = input.split(",");
                    String name = (pars[0]);
                    String grope = (pars[1]);
                    String studentID = (pars[2]);
                    studentMap.add(new Student(name, grope, studentID));

                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ввод не корректен \n наверное вы что то забыли \n повторите ввод");
            }
        }
    }
}