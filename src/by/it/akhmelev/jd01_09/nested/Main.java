package by.it.akhmelev.jd01_09.nested;

/**
 * Created by Alex on 18.02.2016.
 */
public class Main {
    public static void main(String[ ] args) {
        // вызов статического метода
        ParentForNested.SubClassNested.downAll();
        // создание объекта статического класса
        ParentForNested.SubClassNested subClassNested = new ParentForNested.SubClassNested();
        // вызов обычного метода
        subClassNested.goOne();
    }
}


