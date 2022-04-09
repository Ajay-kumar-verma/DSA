public class abstraction {
    public static void main(String args[]){

         new cow();

    }
    
}




abstract class animal
{
  protected abstract void AnimalSound();
  protected void run()
  {
      System.out.println("Running....!");
  }

}


class cow extends animal
{
 
 public void AnimalSound() 
  {
    System.out.println("COW SOUND LIKE : KHEE KHEEE  ...!");
  }  
 
  cow()
  {
     AnimalSound();
     run();
   }

}

