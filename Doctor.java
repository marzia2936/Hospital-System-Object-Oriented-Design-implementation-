
package Package1;
public class Doctor implements ICheck{
 public void writePrescription(Prescription obj){
    
 }  
 @Override
 public void checkingReport(Report obj){
    System.out.println("Verified Report ID:"+obj.id);
} 
}
