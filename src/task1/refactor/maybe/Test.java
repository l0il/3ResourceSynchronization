package task1.refactor.maybe;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/dima/Documents/Java projects/job4j/Middle/Блок 1 Multithreading /3. Синхронизация ресурсов/pom.xml");
        ParseFile parseFile = new ParseFile(file);
        System.out.println(parseFile.getContent());
        parseFile.saveContent("example text");
    }
}
