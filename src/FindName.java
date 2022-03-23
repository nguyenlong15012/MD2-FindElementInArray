import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] GenGName = {"Chovy", "Peanut", "Ruller", "Lehends", "Doran", "Sofm", "TheShy", "Huanfeng"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name's Gamer");
        String input_name = sc.nextLine();

        boolean isExít = false;
        for (int i =0; i< GenGName.length; i++){
            if (GenGName[i].equals(input_name)){
                System.out.print("Vị trí của game trong danh sách " + input_name + "là " + i);
                isExít = true;
                break;
            }
        }
        if (!isExít){
            System.out.print("Không có " + input_name + " Trong danh sách!");
        }
    }
}
