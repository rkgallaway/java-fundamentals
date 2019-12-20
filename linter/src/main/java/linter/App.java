/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        fileLinter();

    }

    public static void fileLinter () {
        String fileA = "../resources/gates.js";
        File file = new File(fileA);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error reading file");
        }

        int lineCount = 0;
        while (scanner.hasNextLine()) {
            lineCount++;
            String line = scanner.nextLine();
            if (line.length() > 0) {
                // look at the last letter and see if there's curly braces.
                char lastChar = line.charAt(line.length() - 1);
                if (lastChar != '{' && lastChar != '}' && lastChar != ';') {
                    if (!line.contains("if") && !line.contains("else")) {
                        String error = "LINE " + lineCount + ": missing semicolon " + line;
                        System.out.println(error);
                    }
                }
            }
        }

    }
}