package com.voya.exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value "+ value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int res = 100/num;
            System.out.println(res);
            int marks[] = null;
            System.out.println(marks[0]);
        }catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
