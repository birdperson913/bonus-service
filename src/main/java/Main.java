public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60L;
    boolean registered = true;

    System.out.println( service.calculate(amount, registered));
  }
}

