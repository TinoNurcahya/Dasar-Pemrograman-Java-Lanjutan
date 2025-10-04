package abstraction;

public class MainAbstraction {
  public static void main(String[] args) {
    PerangkatElektronik laptop = new Laptop("Asus");
    PerangkatElektronik tv = new TV("Samsung");

    laptop.info();
    laptop.nyalakan();

    tv.info();
    tv.nyalakan();
  }
}
