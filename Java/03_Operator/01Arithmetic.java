class A
{
    public static void main(String[] args){
        System.out.println(10+20); // 30
        System.out.println("ab"+"cd"); // "abcd" string
        System.out.println("10"+20); // "1020" string
        System.out.println('A'+1); // 66 here ACSII value 'A' will added to 1
        //in above it not concatination because concatination will occure when both will string 
        // and any one is string with '+' operator other wise it add
        System.out.println('A'+"1"); // "A1" string

        
         
    }
}