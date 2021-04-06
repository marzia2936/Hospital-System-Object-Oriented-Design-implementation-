package Package1;
public class Nurse implements ICheck{
  @Override
  public void checkingReport(Report obj){
      System.out.println(" Report Name="+obj.name);
  }  
}
