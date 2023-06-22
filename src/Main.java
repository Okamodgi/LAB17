import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выражения: ");
        String input = in.nextLine();
        String[] splitInput = input.split(" ");

        if (input.contains("/")){
            Double num1 = Double.parseDouble(splitInput[0]);
            Double num2 = Double.parseDouble(splitInput[2]);
            calc<Double> math1 = new calc<Double>(num1,num2);
            System.out.println(math1.getDel());
        }
        else{
            Integer num1 = Integer.parseInt(splitInput[0]);
            Integer num2 = Integer.parseInt(splitInput[2]);
            calc<Integer> mat = new calc<Integer>(num1,num2);


            switch(input.charAt(input.indexOf(splitInput[1]))){
                case '+':
                    System.out.println(mat.getSlog());
                    break;
                case '-':
                    System.out.println(mat.getOtnat());
                    break;
                case '*':
                    System.out.println(mat.getUmn());
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
        }
    }
}
class calc <t extends Number>{
    private t ch1;
    private t ch2;

    public int getSlog(){return (int)ch1 + (int) ch2;}
    public int getOtnat(){return (int)ch1 - (int) ch2;}
    public int getUmn(){return (int)ch1 * (int) ch2;}
    public double getDel(){return (double)ch1 / (double) ch2;}

    calc(t CH1, t CH2){
        this.ch1 = CH1;
        this.ch2 = CH2;
    }
}