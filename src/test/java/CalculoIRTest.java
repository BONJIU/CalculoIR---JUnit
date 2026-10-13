import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoIRTest {

    @Test
    void deveRejeitarRendaNegativa() {
        double resultado = CalculoIR.calcularIR(-0.01);

        assertEquals(-1.0, resultado, 0.0001);
    }

    @Test
    void deveIsentarRendaAte5000() {
        double resultado = CalculoIR.calcularIR(5000.00);

        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    void deveCalcularFaixaDe75PorCento() {
        double resultado = CalculoIR.calcularIR(5500.00);

        assertEquals(378.125, resultado, 0.0001);
    }

    @Test
    void deveCalcularFaixaDe50PorCento() {
        double resultado = CalculoIR.calcularIR(6000.00);

        assertEquals(825.0, resultado, 0.0001);
    }

    @Test
    void deveCalcularFaixaDe25PorCento() {
        double resultado = CalculoIR.calcularIR(6500.00);

        assertEquals(1340.625, resultado, 0.0001);
    }

    @Test
    void deveCalcularFaixaDe10PorCento() {
        double resultado = CalculoIR.calcularIR(7350.00);

        assertEquals(1819.125, resultado, 0.0001);
    }

    @Test
    void deveCalcularFaixaSemDesconto() {
        double resultado = CalculoIR.calcularIR(8000.00);

        assertEquals(2200.0, resultado, 0.0001);
    }

    @Test
    void deveCalcularRendaDe5000EUmCentavo() {
        double resultado = CalculoIR.calcularIR(5000.01);

        assertEquals(343.7506875, resultado, 0.0001);
    }

    @Test
    void deveCalcularRendaAcimaDe7350() {
        double resultado = CalculoIR.calcularIR(7350.01);

        assertEquals(2021.25275, resultado, 0.0001);
    }

    @Test
    void deveAceitarRendaZero() {
        double resultado = CalculoIR.calcularIR(0.0);

        assertEquals(0.0, resultado, 0.0001);
    }
}
