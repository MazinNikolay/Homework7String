public class Main {
    public static void main(String[] args) {
        task2(task1());
        task3();
        task5HardWork();
        task6HardWork();
        task7HardWork();
        task8HardWork();
    }

    public static String task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        return fullName;
    }

    public static void task2(String fullName) {
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }

    public static void task5HardWork() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstSpase = fullName.indexOf(' ');
        int secondSpase = fullName.lastIndexOf(' ');
        int fullNameLength = fullName.length();
        String firstName = fullName.substring(firstSpase, secondSpase);
        String middleName = fullName.substring(secondSpase, fullNameLength);
        String lastName = fullName.substring(0, firstSpase);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task6HardWork() {
        String fullName = "ivanov ivan ivanovich";
        int arrayItemLength;
        char convertibleChar;
        String[] fullNameArray = fullName.split(" ");
        for (int i = 0; i < fullNameArray.length; i++) {
            arrayItemLength = fullNameArray[i].length();
            convertibleChar = fullNameArray[i].charAt(0);
            fullNameArray[i] = Character.toUpperCase(convertibleChar) + fullNameArray[i].substring(1, arrayItemLength);
        }
        fullName = String.join(" ", fullNameArray);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
    }

    public static void task7HardWork() {
        String first = "135";
        String second = "246";
        StringBuilder concat = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            concat.append(first.charAt(i)).append(second.charAt(i));
        }
        String result = concat.toString();
        System.out.println("Данные строки —  " + result);
    }

    public static void task8HardWork() {
        String str = "aabccddefgghiijjkk";
        String result = "";
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(i-1)){
                result += str.charAt(i);
            }
            i++;
        }
        System.out.println("Повторяющиеся символы - " + result);
    }
}