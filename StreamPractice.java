package BasicPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

    public static List<UserDetailsNew> createObject() {

        List<UserDetailsNew> detailsNews = new ArrayList<>();

        detailsNews.add(new UserDetailsNew(1, "dfdfsfasf", 25, 30000));
        detailsNews.add(new UserDetailsNew(2, "sdfedfdfd", 27, 20000));
        detailsNews.add(new UserDetailsNew(3, "etgrefrt", 18, 15000));
        detailsNews.add(new UserDetailsNew(4, "wetwererw", 30, 40000));

        return detailsNews;
    }

    public static void main(String[] args) {

        List<UserDetailsNew> result = createObject();

        // OLD way (for loop)
        List<String> output = new ArrayList<>();
        for (UserDetailsNew detailsNew : result) {
            if (detailsNew.getSalary() > 20000) {
                output.add(detailsNew.getUserName());
            }
        }

        // Stream - filter users salary > 20000
        List<UserDetailsNew> filtered = result.stream()
                .filter(e -> e.getSalary() > 20000)
                .collect(Collectors.toList());

        System.out.println(filtered);

        // Stream - get usernames
        List<String> usernames = result.stream()
                .filter(e -> e.getSalary() > 20000)
                .map(UserDetailsNew::getUserName)
                .collect(Collectors.toList());

        System.out.println(usernames);
        System.out.println("Old for loop output: " + output);

        // Grouping by salary
        Map<Integer, Long> resultMap = result.stream()
                .collect(Collectors.groupingBy(
                        UserDetailsNew::getSalary,
                        Collectors.counting()));

        System.out.println(resultMap);

        // Manual counting using Map
        Map<Integer, Integer> mapResult = new HashMap<>();

        for (UserDetailsNew detailsNew : result) {
            mapResult.put(
                    detailsNew.getSalary(),
                    mapResult.getOrDefault(detailsNew.getSalary(), 0) + 1
            );
        }

        System.out.println(mapResult);

        long alt = resultMap.getOrDefault(15000, 0L);
        System.out.println(alt);
    }
}