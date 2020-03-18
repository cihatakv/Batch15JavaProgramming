package day16;

public class CodeNoteTask {
    public static void main(String[] args) {
        int littleMonkey = 5;
        String str = " little monkeys jumping on the bed, \n1 fell down and bumped his head,\n" +
                "Mama called the doctor and the doctor said,\n" +
                "No more monkeys jumping on the bed!";
        while (littleMonkey>0){
            System.out.println(littleMonkey + str);
            littleMonkey--;
        }
    }
}
/*

5 little monkeys jumping on the bed,
1 fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
4 little monkeys jumping on the bed,
1 fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
3 little monkeys jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
2 little monkeys jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
1 little monkey jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
Put those monkeys right to bed!
 */