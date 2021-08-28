public class StringPractice {
    public static void main(String[] args) {
        String stringA = "First literal string";
        String stringB = new String("First literal string");
        String stringC = "FIRST LITERAL STRING";
        String stringAA = "First literal string";

        boolean isEqual = stringA == stringB;
        System.out.println("isEqual == = " + isEqual);

        isEqual = stringA.equals(stringB);
        System.out.println("isEqual equals = " + isEqual);

        isEqual = stringA.equalsIgnoreCase(stringC);
        System.out.println("isEqual ignoreCase = " + isEqual);

        isEqual = stringA == stringAA;
        System.out.println("isEqual Same literal value= " + isEqual);

        concatenate();
        immutable();
    }

    public static void concatenate(){
        String student = "Thomas Sifuentes";
        String occupation = "Systems Engineer";

        System.out.println(student + " is a " + occupation);

        int numA = 100;
        int numB = 123;
        System.out.println("numA + numB = " + numA + numB);
        System.out.println("numA + numB = " + (numA + numB));

        System.out.println("student.concat(\" is a \").concat(occupation) = " + student.concat(" is a ").concat(occupation));
    }

    public static void immutable(){

        String student = "Thomas Sifuentes";
        String occupation = "Systems Engineer";

        String resultA = student.concat(occupation);
        System.out.println("student = " + student);
        System.out.println("result = " + resultA);

        String resultB = student.transform(s -> {
            return s + " is a " + occupation;
        });
        System.out.println("student = " + student);
        System.out.println("resultB = " + resultB);
        
        String replaced = student.replace("e", "E").replace("s", "S");
        System.out.println("student = " + student);
        System.out.println("replaced = " + replaced);

        getTimingConcat(500);
        getTimingConcat(1000);
        getTimingConcat(10000);
        getTimingConcat(100000);
        getTimingLiteral(500);
        getTimingLiteral(1000);
        getTimingLiteral(10000);
        getTimingLiteral(100000);
        getTimingBuilder(500);
        getTimingBuilder(1000);
        getTimingBuilder(10000);
        getTimingBuilder(100000);
    }

    public static void getTimingConcat(long times){
        String first = "First";
        String second = "Second";
        String third = first;

        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i ++) {
            first = first.concat(second).concat(third).concat("\n");
        }
        long end = System.currentTimeMillis();
        System.out.println("Concat Timing for " + times + " = " + (end-start));
    }

    public static void getTimingLiteral(long times){
        String first = "First";
        String second = "Second";
        String third = first;

        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i ++) {
            first += second + third + "\n";
        }
        long end = System.currentTimeMillis();
        System.out.println("Literl Timing for " + times + " = " + (end-start));
    }

    public static void getTimingBuilder(long times){
        String first = "First";
        String second = "Second";
        String third = first;

        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i ++) {
            sb.append(first).append(second).append(third).append("\n");
        }
        long end = System.currentTimeMillis();
        System.out.println("Builder Timing for " + times + " = " + (end-start));
    }

    public static void validate(){
        String stringA = null;
        String stringB = null;
        String stringC = null;
        boolean isNull = stringA == null;
        System.out.println("isNull = " + isNull);
        if(isNull) {
            stringA = "";
            stringB = " ";
            stringC = "test";
        }

        boolean isEmpty = stringA.isEmpty();
        boolean isBlank = stringB.isBlank();
        if(isEmpty){
            System.out.println("isEmpty = " + stringA.toUpperCase());
            System.out.println(" = ".concat(stringA));
        }
        
        if(isBlank) {
            System.out.println("stringB = " + stringB);
        }
    }
}
