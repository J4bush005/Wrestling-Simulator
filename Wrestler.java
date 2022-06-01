public class Wrestler {
  int height;
  int weight;
  int id;
  boolean isHeavy = false;
  boolean isBruiser = false;
  boolean isAcrobat = false;
  boolean isLight = false;

  public void assignHeight() {
      height =(int)(Math.random() * 1000);
      System.out.println("Wrestler's height is " + height + " cm.");
  }

  public void assignWeight() {
      weight = (int)(Math.random() * 1000);
      System.out.println("Wrestler's weight is " + weight + " lbs.");
  }

  public void assignId() {
      id = (int)(Math.random() * 12);
      System.out.println("Wrestler's ID is " + id);
  }

  public void assignStyle() {
      if(height >= 800 && weight >= 600) {
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 800 && weight < 600 && weight >= 400) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 800 && weight < 400 && weight >=200) {
          isAcrobat = true;
          System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 800 && weight < 200) {
          isLight = true;
          System.out.println("Wrestler " + id + " is a Lightweight");
      }
  }

}
   
