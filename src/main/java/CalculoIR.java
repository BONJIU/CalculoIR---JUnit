public class CalculoIR {

    public static double calcularIR(double renda) {
        double desconto;
        double ir;

        if (renda < 0) {
            System.out.println(
                "Renda inválida. O valor da renda não pode ser negativo."
            );
            return -1;
        } else if (renda <= 5000) {
            desconto = 1.00;
        } else if (renda <= 5500) {
            desconto = 0.75;
        } else if (renda <= 6000) {
            desconto = 0.50;
        } else if (renda <= 6500) {
            desconto = 0.25;
        } else if (renda <= 7350) {
            desconto = 0.10;
        } else {
            desconto = 0.00;
        }

        ir = renda * 0.275 * (1 - desconto);
        return ir;
    }
}