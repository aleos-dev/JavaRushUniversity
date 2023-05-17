package ua.javarush.task.jdk13.task14.task1408;

import java.util.ArrayList;
import java.util.List;

/* 
Потрібно більше лайків!
*/

public class Solution {

    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Про смачну та здорову їжу"));
        articles.add(new Article("Про котиків"));
        articles.add(new Article("Гострокінцевики проти тупоконечників"));
        articles.add(new Article("Останні новини від Бі-Бі-Сі"));
        articles.add(new Article("Як відкрити сироварню"));
        articles.add(new Article("Британські вчені дізналися, чи є користь від нововведень, науки та прогресу"));

        printReport(articles);
    }

    public static void printReport(List<Article> articles) {
        for (Article article : articles) {
            System.out.printf("%s : %d\n", article.getName(), article.getLikesCount());
        }
    }
}
