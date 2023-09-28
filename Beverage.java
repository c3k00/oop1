public class Beverage {

  private String name;
  private int volume;
  private int price;

  public Beverage(String name, int volume, int price) {
    this.name = name;
    this.volume = volume;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }

  public int getPrice() {
    return price;
  }

}