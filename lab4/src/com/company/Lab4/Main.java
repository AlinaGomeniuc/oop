package com.company.Lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("src/com/company/Lab4/one_expression.txt")));
        String[] arrayOfStrings = content.split("\n");

//
//        BracketsCheck bracketsCheck1 = new BracketsCheck(arrayOfStrings[0]);
//        bracketsCheck1.checkExpression();
//
//        BracketsCheck bracketsCheck2 = new BracketsCheck(arrayOfStrings[1]);
//        bracketsCheck2.checkExpression();

        BracketsCheck bracketsCheck3 = new BracketsCheck(arrayOfStrings[2]);
        bracketsCheck3.checkExpression();

//        BracketsCheck bracketsCheck4 = new BracketsCheck(arrayOfStrings[3]);
//        bracketsCheck4.checkExpression();








    }
}
