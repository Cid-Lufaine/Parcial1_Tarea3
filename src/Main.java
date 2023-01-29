public class Main {
    public static void main(String[] args) {
    int index=0;
    do{
    String operation = args[index];
    int num1 = Integer.parseInt(args[index+1]);
    int num2 = Integer.parseInt(args[index+2]);
    switch (operation) {
        case "SUMA":
            System.out.println(num1 +" + "+ num2 +" = "+ (num1+num2) );
            break;
        case "RESTA":
            System.out.println(num1 +" - "+ num2 +" = "+ (num1-num2) );
            break;
        case "MULTIPLICACION":
            System.out.println(num1 +" * "+ num2 +" = "+ (num1*num2) );
            break;
        case "DIVISION":
            System.out.println(num1 +" / "+ num2 +" = "+ (num1/num2) );
            break;
    }
    index+=3;
    }while (index< args.length);




    }
}