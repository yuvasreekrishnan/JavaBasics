package BasicPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
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
        
        
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(2);
        
        Set<Integer> setResult = integers.stream().collect(Collectors.toSet());
        System.out.println(setResult);
        
        Set<Integer> setresultnew = new HashSet<>();
        for(Integer a : integers) {
        	setresultnew.add(a);
        }
        
        System.out.println(setresultnew);
        
        List<Integer> unordered =  new ArrayList<>();
        unordered.add(7000);
        unordered.add(1000);
        unordered.add(5000);
        unordered.add(500);
        
        System.out.println(unordered);
        
        List<Integer> sortednum = unordered.stream().sorted().collect(Collectors.toList());
        System.out.println(sortednum);
        
        
        List<Integer> sortednum1 = unordered.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortednum1);
    }
}