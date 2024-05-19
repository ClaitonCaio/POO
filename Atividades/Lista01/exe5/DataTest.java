public class DataTest {
    public static void main(String[] args) {
        System.out.println("\nPrimeira Data: \n");
        Data data = new Data(18, 5, 2024);
        data.exibeData();

        System.out.println("\nData Moificada: \n");
        data.setDia(30);
        data.setMes(8);
        data.setAno(2027);

        data.exibeData();
    }
}
