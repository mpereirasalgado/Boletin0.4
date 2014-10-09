
package boletin0.pkg4;

/**@author mpereirasalgado*/
public class Boletin04 
{
    public static void main(String[] args) 
    {
        //instancio obxeto tipo Semaforo
        Semaforo sema1=new Semaforo();
        String valor=sema1.dameCor();
        System.out.println("cor antes darlle un valor " + valor);
        sema1.ponCor("verde");
        valor=sema1.dameCor();
        System.out.println("cor despois de darlle un valor " + valor);
        //outro xeito:
        System.out.println("cor despois de darlle un valor " + sema1.dameCor());
        
    }
    
}
