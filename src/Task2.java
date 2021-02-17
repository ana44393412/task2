

public class Task2 {
    public static void main(String args[]) {
        String str = "+79537473448";
        // String str = "+";


        String[] arr = checkNumber(str);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static String[] checkNumber(String number) {

        String[] arr = {number, ""};

        if (arr[0].length() >= 2) {   // Так как необходима проверка друх первых символов строки, поэтому строка должна быть от 2х символов
            if (arr[0].substring(0, 2).equals("+7")) {
                arr[0] = arr[0].substring(1);
                arr[0] = arr[0].replaceFirst("7", "8");
                arr[1] = "Замена +7 на 8";


            }

            if ((arr[0].contains(" ")) || (arr[0].contains(")")) || (arr[0].contains("("))) {
                arr[0] = arr[0].replace(" ", "");
                arr[0] = arr[0].replace("(", "");
                arr[0] = arr[0].replace(")", "");

                if (arr[1].isEmpty()) {
                    arr[1] = "В номере есть пробелы и/или скобки";
                } else {
                    arr[1] = arr[1] + "; В номере есть пробелы и/или скобки";
                }
            }
            if (arr[0].length() != 11) {
                arr[0] = "Некорректный номер";
            }
            if (arr[1].isEmpty()) {
                arr[1] = "Не было изменений";
            }
        } else {
            arr[0] = "Некорректный номер";
            arr[1] = "Не было изменений";

        }
        return arr;
    }

}