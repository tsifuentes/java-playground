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
    }
}
