import java.util.*;
public class Main{
    public static void main(String[] hash) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Password length: ");
        try{
        int digit = input.nextInt();
        String lower_case = "qwertyuioplkjhgfdsazxcvbnm";
        String upper_case = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String special_keys = "!@#$%^&*()._+{}][|?/><";
        String password = "";



                for (int i = 0; i < digit; i++) {
                    int ran = (int) (4 * Math.random());

                    switch (ran) {
                        case 0:
                            password += String.valueOf((int) (10 * Math.random()));
                            break;
                        case 1:
                            ran = (int) (lower_case.length() * Math.random());
                            password += String.valueOf(lower_case.charAt(ran));
                            break;
                        case 2:
                            ran = (int) (upper_case.length() * Math.random());
                            password += String.valueOf(upper_case.charAt(ran));
                            break;
                        case 3:
                            ran = (int) (special_keys.length() * Math.random());
                            password += String.valueOf(special_keys.charAt(ran));
                            break;
                    }
                }
            System.out.println(password);
        }
        catch(InputMismatchException e){
            System.out.println("Try numeric value");
        }
    }
}