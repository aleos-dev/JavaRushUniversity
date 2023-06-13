package ua.javarush.task.jdk13.task20.task2008;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

/* 
Серіалізація зоопарку
*/

public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        Zoo zoo = new Zoo();
        zoo.animals.add(new Zoo.Lion("Алекс", 5.5));
        zoo.animals.add(new Zoo.Penguin("Шкіпер", true, 8));
        zoo.animals.add(new Zoo.Penguin("Ковальскі", true, 7));
        zoo.animals.add(new Zoo.Penguin("Ріко", false, 6));
        zoo.animals.add(new Zoo.Penguin("Прапор", false, 5));

        String result = new YAMLMapper().writeValueAsString(zoo);

        System.out.println(result);
    }
}
