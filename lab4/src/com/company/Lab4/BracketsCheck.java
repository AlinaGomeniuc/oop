package com.company.Lab4;

public class BracketsCheck {
    String expresion;


    public BracketsCheck(String expresion) {
        this.expresion = expresion;
    }

    Stack_expresion stack1 = new Stack_expresion();


    public void checkExpression() {

        boolean isBalanced = true;

        for (int i = 0; i < expresion.length(); i++) {
            char token = expresion.charAt(i);
            if (token == '{' || token == '[' || token == '(') {

                stack1.push(token);

            }

            if (token == '}' || token == ']' || token == ')'){

                if(!stack1.isEmpty()) {
                    char last = stack1.getLastElement();
                    if (last == '{' && token == '}' || last == '[' && token == ']' || last == '(' && token == ')') {

                        stack1.pop();

                    }else{
                        isBalanced = false;
                    }

                } else {
                    isBalanced = false;
                }


            }

        }
        if (stack1.isEmpty() && isBalanced) {
            System.out.println("The expression is balanced");
        }else{
            System.out.println("The expression is not balanced");
        }

        }
    }




