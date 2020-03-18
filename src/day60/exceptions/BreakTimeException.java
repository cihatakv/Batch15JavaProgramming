package day60.exceptions;

public class BreakTimeException extends RuntimeException {


}

class Main {
    public static void main(String[] args) {

        throw new BreakTimeException();

    }
}