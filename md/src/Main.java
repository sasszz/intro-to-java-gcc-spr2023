import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 5, y = 28;
//        float z;
//        z = (float) (y / x);
//        System.out.println(z);
//
//        double i = 25 / 4  + 4 * 10 % 3;
//        System.out.println(i);

//        int x = 11;
//        int count = 0;
//        do {
//            x += 20;
//            count += 1;
//            System.out.println(count);
//            System.out.println(x);
//        } while (x > 100);

//        int countReal = 0;
//        for (int count = 9; count <= 21; count++)
//            countReal ++;
//            System.out.println("Java is great!!!");
//            System.out.println(countReal);
//        }

//        int bonus, sales = 85000;
//        char dept = 'S';
//        if (sales > 100000) {
//            if (dept == 'R') {
//                bonus = 2000;
//            } else {
//                bonus = 1500;
//            }
//        } else if (sales > 75000) {
//            if (dept == 'R') {
//                bonus = 1250;
//            } else {
//                bonus = 1000;
//            } //end inner if 2
//        } else {
//            bonus = 0;
//        }
//
//        System.out.println(bonus);

//        int x = 10, y = 20;
//
//        while (y < 100) {
//            x += y;
//            y += 20;
//        }
//        System.out.println(x);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int day = in.nextInt();
//
//        String dayName = "";
//        switch (day) {
//            case 1: dayName = "Monday"; break;
//            case 2: dayName = "Tuesday"; break;
//            case 3: dayName = "Wednesday"; break;
//            case 4: dayName = "Thursday"; break;
//            case 5: dayName = "Friday"; break;
//            case 6: dayName = "Saturday"; break;
//            case 7: dayName = "Sunday"; break;
//            default:dayName = "Invalid day range";
//        }
//
//        System.out.println(dayName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many weeks would you like printed?");
        int numberOfWeeks = Integer.parseInt(scanner.next());
        for(int i = 0; i < numberOfWeeks; i++) {
            System.out.printf("Week %d: ", i + 1);
            for (int j = 0; j < 6; j++){
                switch(j) {
                    case 0:
                        System.out.print("Monday, ");
                        break;
                    case 1:
                        System.out.print("Tuesday, ");
                        break;
                    case 2:
                        System.out.print("Wednesday, ");
                        break;
                    case 3:
                        System.out.print("Thursday, ");
                        break;
                    case 4:
                        System.out.print("Friday");
                        break;
                    default: System.out.print('\n');
                }
            }
        }
    }
}