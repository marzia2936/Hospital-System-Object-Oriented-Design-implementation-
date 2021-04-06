package Package1;
public class Patient implements ICheck{
  @Override
  public void checkingReport(Report obj){
      System.out.println("Patience Verified Report Status="+obj.status);
      
  }  
}
