import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oefeningen {

    public static void main(String[] args){
        //Exercise1();
        Exercise2();
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

}
