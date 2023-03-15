package ua.javarush.task.pro.task09.task0912;

/* 
Перевірка URL-адреси
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишіть тут ваш код
        if ( !(url.startsWith("http://") || url.startsWith("https://"))) return "невідомий";
        return url.substring(0, url.indexOf(":"));
    }

    public static String checkDomain(String url) {
        //напишіть тут ваш код
        if ( !(url.endsWith("com") || url.endsWith("org") || url.endsWith("net")
                || url.endsWith("ua"))) return "невідомий";

        return url.substring(url.lastIndexOf(".") + 1);
    }

}
