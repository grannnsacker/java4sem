package _2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> arr = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Misha", "Kolya", "Nadya", "Dasha", "Stepa", "Andrey"));
        ArrayList<String> surnames = new ArrayList<>(Arrays.asList("Shihskin", "Repin", "Ivanov", "Nichkov", "Puhov", "Gorohov"));
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Human human1 = new Human(random.nextInt(20, 70),
                    names.get(random.nextInt(0, names.size())),
                    surnames.get(random.nextInt(0, surnames.size())),
                    LocalDate.of(random.nextInt(1970, 2020),
                            random.nextInt(1, 12),
                            random.nextInt(1, 28)),
                    random.nextInt(40, 100));
            arr.add(human1);

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }

        OptionalInt ages = arr.stream()
                .sorted(Comparator.comparing(Human::getFirstName))
                .filter(human -> human.getBirthDate().isAfter(LocalDate.of(2000, 6, 24)))
                .sorted(Comparator.comparing(Human::getLastName))
                .mapToInt(Human::getAge).reduce(Integer::sum);
        if (ages.isPresent()){
            System.out.println(ages.getAsInt());
        }
    }


}
