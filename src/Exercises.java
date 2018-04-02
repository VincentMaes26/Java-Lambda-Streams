import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {

    public static List<Person> lectorenLijst = Arrays.asList(
            new Person("Kelly", "Casal", "kelly.casalmosteiro@ap.be"),
            new Person("Olga", "Coutrin", "olga.coutrin@ap.be"),
            new Person("Philippe", "Possemiers", "philippe.possemiers@ap.be")
    );
    public static String fileName = "four-letter-words.txt";

    public static void main(String[] args){
        // Uncomment to run an exercise
        //Exercise1();
        //Exercise2();
        //Exercise3();
        //Exercise4();
        //Exercise5();
        //Exercise6();
        //Exercise7();
        //Exercise8();
        //Exercise9();
        //Exercise10();
    }

    public static void Exercise1(){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, Comparator.reverseOrder());
        names.forEach(System.out::println);
    }

    public static void Exercise2(){
        JButton testButton = new JButton("Test Button");
        testButton.addActionListener(ae -> System.out.println("Clicked anonymous class definition"));
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void Exercise3(){
        lectorenLijst.forEach(l -> System.out.println(l.getEmail()));
    }

    public static void Exercise4(){
        lectorenLijst.stream()
                .filter(l -> l.getEmail().equals("philippe.possemiers@ap.be"))
                .forEach(l -> System.out.println(l.getFirstName()));

    }

    public static void Exercise5(){
        Stream<Person> lectorStream = lectorenLijst.stream();
        lectorStream.filter(l -> l.getEmail().equals("philippe.possemiers@ap.be"))
                .map(l -> l.getFirstName())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public static void Exercise6(){
    Person lector = lectorenLijst.stream()
                .filter(l -> l.getEmail().equals("philippe.possemiers@ap.be") && l.getLastName().equals("Possemiers"))
                .findAny()
                .orElse(null);

        System.out.println(lector);

    }

    public static void Exercise7(){
        String newFileName1 = "four-letter-words-filtered.txt";
        Path newPath1 = Paths.get(newFileName1);

        try {
            List<String> newList1 = Files.lines(Paths.get(fileName))
                    .filter(l -> l.contains("A"))
                    .peek(System.out::println)
                    .collect(Collectors.toList());
            Files.write(newPath1, newList1, Charset.defaultCharset());
            System.out.println("");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Exercise8(){
            String newFileName2 = "four-letter-words-filtered-and-sorted.txt";
            Path newPath2 = Paths.get(newFileName2);

            try {
            List<String> newList2 = Files.lines(Paths.get(fileName))
                    .filter(l -> l.contains("A"))
                    .sorted(Comparator.naturalOrder())
                    .peek(System.out::println)
                    .collect(Collectors.toList());
            Files.write(newPath2, newList2, Charset.defaultCharset());
            System.out.println("");
            }
		    catch (IOException e) {
            e.printStackTrace();
            }
    }

    public static void Exercise9(){
        String newFileName3 = "four-letter-words-filtered-on-palindrome.txt";
        Path newPath3 = Paths.get(newFileName3);

        try {
            List<String> newList3 = Files.lines(Paths.get(fileName))
                    .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                    .peek(System.out::println)
                    .collect(Collectors.toList());
            Files.write(newPath3, newList3, Charset.defaultCharset());
            System.out.println("");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Exercise10(){
        List<City> cities = Arrays.asList(
            new City("New York",8550405, 86443),
            new City("Boston",754987, 3864),
            new City("Los Angeles",5439768, 1043),
            new City("Chicago",2720546, 87),
            new City("San Diego",1394928, 86443)
        );

        cities
                .stream()
                .filter(c -> c.getNrOfPeople() > 4000000 && c.getNrOfCrimes() < 8000)
                .map(c -> c.getName())
                .forEach(System.out::println);
        System.out.println("");
    }

}
