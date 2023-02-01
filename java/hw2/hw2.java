import java.io.*;
import java.lang.Math;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class hw2 {
    public static void main(String[] args) {
        InputInfo();
        String a = Exponentiate(InputInfo());
        OutputRes(a);
    }

    public static String InputInfo() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("input.txt"))) {
            String fileName = "input.txt";
            String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
            return content;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "exeption";
    }

    public static String Exponentiate(String content) {
        double a = Double.valueOf(String.valueOf(
                content.substring(content.lastIndexOf("a ") + 1,
                        content.lastIndexOf("b"))));
        double b = Double.valueOf(String.valueOf(content.substring(content.lastIndexOf("b ") + 1)));
        if (a == 0 && b == 0)
            return "Не определено";
        else {
            double result = Math.pow(a, b);
            String value = String.valueOf(result);
            return value;
        }
    }

    public static void OutputRes(String result) {
        try (FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(result);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}