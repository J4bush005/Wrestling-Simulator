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
      System.out.println("Wrestler's height is " + height + "m.");
  }

  public void assignWeight() {
      weight = (int)(Math.random() * 1000);
      System.out.println("Wrestler's weight is " + weight + "kg.");
  }

  public void assignId() {
      id = (int)(Math.random() * 12);
      System.out.println("Wrestler's ID is " + id);
  }

  public void assignStyle() {
      if(height >= 800 && weight >= 600) { //height from 800 and up and weight from 
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 800 && weight < 600 && weight >= 400) { //height between 800 and up and weight between 599-400 
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 800 && weight < 400 && weight >=200) {
          isAcrobat = true;
          System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 800 && weight < 200) {
          isLight = true;
          System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height >= 700 && height < 800 && weight >= 700) { //height between 700-799 weight between 700 and up
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 700 && height < 800 && weight < 700 && weight >= 600) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 700 && height < 800 && weight < 600 && weight >= 400) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 700 && height < 800 && weight < 400) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height >= 600 && height < 700 && height < 700 && weight >= 700) {
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 600 && height < 700 && weight < 700 && weight >=600) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 600 && height < 700 && weight < 600 && weight >=400) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 600 && height < 700 && weight <400) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height >= 500 && height < 600 && weight > 700) {
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 500 && height < 600 && weight <= 700 && weight >=600) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 500 && height < 600 && weight < 600 && weight >=400) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 500 && height < 600 && weight < 400) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height >= 400 && height < 500 && weight > 700 && weight <= 500) {
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 400 && height < 500 && weight < 500 && weight >= 400) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 400 && height < 500 && weight < 400 && weight >= 300) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 400 && height < 500 && weight < 300) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height >= 300 && height < 400 && weight > 700 ) { //start 300
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 300 && height < 400 && weight < 700 && weight >=500) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 300 && height < 400 && weight < 500 && weight >=300) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 300 && height < 400 && weight < 300) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      }else if (height >= 200 && height < 300 && weight > 700) { //start 200
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 200 && height < 300 && weight < 700 && weight >=400) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 200 && height < 300 && weight < 400 && weight >=200) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 200 && height < 300 && weight < 200) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      }else if (height >= 100 && height < 200 && weight > 700) { //start 100
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height >= 100 && height < 200 && weight < 700 && weight >=300) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height >= 100 && height < 200 && weight < 300 && weight >=200) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height >= 100 && height < 200 && weight < 200) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      } else if (height < 100 && weight > 700) {
        isHeavy = true;
        System.out.println("Wrestler " + id + " is a Heavyweight");
      } else if (height < 100 && weight < 700 && weight >=200) {
        isBruiser = true;
        System.out.println("Wrestler " + id + " is a Bruiser");
      } else if (height < 100 && weight < 200 && weight >=100) {
        isAcrobat = true;
        System.out.println("Wrestler " + id + " is an Acrobat");
      } else if (height < 100 && weight < 100) {
        isLight = true;
        System.out.println("Wrestler " + id + " is a Lightweight");
      }
}
}
   
   
