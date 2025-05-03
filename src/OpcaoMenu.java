public class OpcaoMenu {
    public String codigo(int op) {
        switch (op) {
            case 1:
                return "BRLUSD";
            case 2:
                return "BRLEUR";
            case 3:
                return "USDBRL";
            case 4:
                return "USDEUR";
            case 5:
                return "EURBRL";
            case 6:
                return "EURUSD";
            default:
                return null;
        }
    }
}
