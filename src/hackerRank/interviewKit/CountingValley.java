package hackerRank.interviewKit;

public class CountingValley {
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int valleyCnt = 0;
        int level = 0;


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'U') {
                level++;
                if (level == 0)
                    valleyCnt++;
            } else
                level--;
        }
        System.out.println("valleyCnt = " + valleyCnt);
    }
}

















/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*
Scanner input = new Scanner(System.in);
    int n = input.nextInt(); input.nextLine();
        String terrain = input.nextLine();
        int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowSea = false;

        for(int i = 0; i < n; i++)
        {
        char slope = terrain.charAt(i);
        if(slope == 'U')//Uphill
        level++;
        else//Downhill
        level--;

        //Handle transitions
        if(!belowSea && level < 0)
        {
        valleys++;
        belowSea = true;
        }

        if(level >= 0)//We are back above sea level
        belowSea = false;
        }
        System.out.println(valleys);
 */