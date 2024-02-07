package labs.lab06;


import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        final String TIME = "1hrs and 5 minutes";
        int totalMins = calculateMinutes(TIME);
        System.out.println("Total minutes is: " + totalMins);                               //Lab 6.1

        inputPassword();                                                                    //Lab 6.2
        System.out.println(extractChar("12345nabc678"));                              //Lab 6.3
        checkUrl("https://abc.com");                                                        //Lab 6.4
        countAndGroupWords("Hello, tui ten teo, ban co phai ten teo khong?");     //Lab 6.5
    }

    public static int calculateMinutes(String timeInput) {
        int hours = 0;
        int mins = 0;
        String[] temp = timeInput.split(" ", -2);
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i].contains("hrs")) {
                String hourString = temp[i].replaceAll("[^0-9]", "");
                hours = Integer.parseInt(hourString);
            } else if (temp[i + 1].equals("minutes")) {
                mins = Integer.parseInt(temp[i]);
            }
        }


        return hours * 60 + mins;
    }

    public static void inputPassword() {
        int loginTime = 0;
        String validPwd = "password123";
        do {
            System.out.println("Enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String pwd = scanner.next();
            if (pwd.equals(validPwd)) {
                System.out.println("Correct password!");
                break;
            }
            loginTime++;
        } while (loginTime < 3);
        if (loginTime == 3) {
            System.out.println("Please try again");
        }
    }

    public static String extractChar(String input) {
        StringBuilder stbBuilder = new StringBuilder();
        char[] characters = input.toCharArray();
        for (char character : characters) {
            if (Character.isDigit(character)) {
                stbBuilder.append(character);
            }
        }
        return stbBuilder.toString();
    }

    public static void checkUrl(String url) {
        int ind = url.indexOf("://");
        String protocol = url.substring(0, ind);
        System.out.printf("URL is using protocol %s\n", protocol);
        int index = url.indexOf(".");
        String domain = url.substring((ind + 3), index);
        System.out.printf("Domain of URL is: %s\n", domain);

        String topLevelDomain = url.substring(index + 1);
        System.out.println(topLevelDomain);
        System.out.printf("TLD of URL is: %s", topLevelDomain);
    }

    public static void countAndGroupWords(String inputString) {
        Map<String, Integer> wordsList = new HashMap<>();
        String[] arrayWords = inputString.split("\\W+");
        System.out.println(Arrays.toString(arrayWords));
        for (String word : arrayWords) {
            if (wordsList.containsKey(word)) {
                wordsList.put(word, wordsList.get(word) + 1);
            } else {
                wordsList.put(word, 1);
            }
        }
        System.out.println("Words count: ");
        for (String w : wordsList.keySet()) {
            System.out.println(w + ": " + wordsList.get(w));
        }
    }

}
