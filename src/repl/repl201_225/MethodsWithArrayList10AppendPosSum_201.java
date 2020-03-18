package repl.repl201_225;

import java.util.ArrayList;

public class MethodsWithArrayList10AppendPosSum_201 {
    public static void main(String[] args) {

    }
    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst) {
        ArrayList<Integer> positiveLst = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > 0) {
                sum += lst.get(i);
                positiveLst.add(lst.get(i));
            }
        }
        positiveLst.add(sum);
        return positiveLst;
    }
}
