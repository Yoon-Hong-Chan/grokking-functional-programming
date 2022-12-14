package chapter_5_Sequential_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
//        List<Person> personList = Arrays.asList(new Person("Kimtaeng", 30), new Person("Madplay", 29));
//
//        Set<String> names = personList.stream()
//                .map(Person::getName)
//                .collect(Collectors.toSet());
//
//        // Kimtaeng, Madplay 출력
//        names.forEach(System.out::println);


        String[][] namesArray = new String[][]{
                {"kim", "taeng"}, {"mad", "play"},
                {"kim", "mad"}, {"taeng", "play"}};

//        String[][][] namesArray = new String[][][]{
//                {{"kim"}, {"taeng"}}, {{"mad", "play"}},
//                {{"kim", "mad"}}, {{"taeng", "play"}}};

//        Set<String> namesWithFlatMap = Arrays.stream(namesArray)
//                .flatMap(Arrays::stream)
////                .filter(name -> name.length() > 3)
//                .collect(Collectors.toSet());

        // play, taeng 출력
//        namesWithFlatMap.forEach(System.out::println);

        List<String> namesWithFlatList = Arrays.stream(namesArray)
                .flatMap(innerArray -> {
                    System.out.println(Arrays.toString(innerArray));
                    Stream<String> stream = Arrays.stream(innerArray);
                    return stream;
                })
//                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
        namesWithFlatList.forEach(System.out::println);
    }

    static class Person {
        private String name;
        private Integer age;
        // constructor, getter, setter 생략


        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }
}
