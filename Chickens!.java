class Main {
  public static void main(String[] args) {
    int totalEggs = 0;
     int eggsPerChicken = 4;
     int chickenCount = 8;
     totalEggs= eggsPerChicken*chickenCount;
     //monday
     System.out.println("Monday:"+totalEggs);
     //tuesday
     chickenCount++;
     totalEggs+= eggsPerChicken*chickenCount;
     System.out.println("Tuesday:"+totalEggs);
     //wednesday
     totalEggs+= eggsPerChicken*chickenCount;
     System.out.println("Wednesday:"+totalEggs);
     //day until sunday
     chickenCount=chickenCount/2;
      totalEggs+= eggsPerChicken*chickenCount;
      System.out.println("Thursday:"+totalEggs);
      totalEggs+= eggsPerChicken*chickenCount;
      System.out.println("Friday:"+totalEggs);
     totalEggs+= eggsPerChicken*chickenCount;
      System.out.println("Saturday:"+totalEggs);
     totalEggs+= eggsPerChicken*chickenCount;
      System.out.println("Sunday:"+totalEggs);
  }
}
