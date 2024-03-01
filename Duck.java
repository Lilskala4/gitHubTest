public class Duck{

   //attributes appear as instance variables 
   private String name;
   private int age;
   private String color;
   
   //behaviours appear as instance methods
   
   public void squeak(){
      System.out.println("Squeak! My name is " +  name);
   }
  
   
   public Duck(int duckAge, String duckName, String duckColor){
      name = duckName;
      age = duckAge;
      color = duckColor;

   
   public void setName(String s){
      name = s;
   }
   
   public String getName(){
      return name;
   
   }
   
   public void setAge(int newAge){
      if (newAge<= 0){
      } else age  = newAge;
   }
   
   
}