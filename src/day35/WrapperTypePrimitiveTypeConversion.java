package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {


        String caseNumber = "IPR2012-00001";
        int year; // get 2012 out of it

//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));
    }

    public static int getYearOutOfCaseNumber(String caseNumber) {
        // do validation on case number
        //TODO: Case number should always srat with either
        // CBM , IPR, PGR , DER
        // FOLLOWED BY 4 DIGIT NUMBER
        // FOLLOWED BY -
        // AND FOLLOWED BY 5 DIGIT
//        int year;
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;
        return Integer.parseInt(caseNumber.substring(3, 7));
    }
}
