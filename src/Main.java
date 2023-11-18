import java.util.Scanner;
import java.util.StringTokenizer;

//Необходимо нарисовать ёлочку символом звёздочки. Каждый новый ярус должен быть шире предыдущего.
//С клавиатуры вводится количество ярусов, и высота первого (верхнего) яруса ёлочки. Ёлочка должна быть симметричная.

public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть кількість ярусів та висоту ялинки через пробіл: ");
        Scanner scanner = new Scanner(System.in);
        String numbersStr = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(numbersStr);
        int[] params = new int[tokenizer.countTokens()];
        int item = 0;
        while (tokenizer.hasMoreTokens()) { params[item++] = Integer.parseInt(tokenizer.nextToken());}
        int backSpase = params[0] * params[1];
        for (int i1 = 1; i1 <= params[0]; i1++){
            int toLeft = params[1];
            int toRight = toLeft;
            for (int i2 = 0; i2 < params[1]; i2++){
                for(int j = backSpase; j > 0; j--)System.out.print(" ");
                for (int i3 = 0; i3 <params[1] * 2; i3++){
                    if(i3 >= toLeft && i3 <= toRight ) System.out.print(" *");
                    else System.out.print("  ");
                }
                System.out.println();
                toLeft--;
                toRight++;
            }
            backSpase-=2;
            params[1] ++;
        }
    }
}