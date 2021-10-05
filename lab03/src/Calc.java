public class Calc {
    private static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
        };
        return 0;
    }

    public static void main(String[] args) {

        boolean errorFlag = false;

        if (args.length != 3) {
            System.out.println("Неправильное количество аргументов!");
            errorFlag = true;
        }

        if (!errorFlag) {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            char operation = args[2].charAt(0);

            System.out.println("Ответ равен: " + calc(x, y, operation));
        }

    }
}