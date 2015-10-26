/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strstr;

/**
 *
 * @author Ling
 */
public class Strstr {

    
    public boolean strstr(String a, String b){
        
    //    boolean result=false;
        String []arr_a=new String[a.length()];
        String []arr_b=new String[b.length()];
        arr_a=a.split("");
      // int blength=b.length();
       
      for(int i=0;i<=a.length()-b.length();i++){
          
           int n=0, j=i;
          while (a.charAt(j++) == b.charAt(n++) && n < b.length())
          if (n==b.length()){
              
              return true;
          }
        
      

      }
           return false;
          
        /*  
           if(a.charAt(i)==b.charAt(0))
    
            {
                
                for(int j=i;j<i+b.length();j++){
                    int index=0;
                  if(a.charAt(j)==b.charAt(index++)){
                     
                        result=true;
                        
                    }else{
                      
                      result=false;
                      break;
                  }
                    
                    
                }
                
            }
          
          */
          
      
       
       
  /*
        for(int i=0;i<=a.length()-b.length();i++){
     
            if(a.charAt(i)==b.charAt(0))
    
            {
                System.out.println("The i is:: "+i); 
       
                  if( a.substring(i,i+blength).equals(b.substring(0))){
                      System.out.println("The aSubstring is:: "+a.substring(i,i+blength));
                      result= true;
                      break;
                  }
                
              
                
                
            }else{
                result= false;
                
                
            }
            
            
        }
        System.out.println("the result is: "+result);
        return result;
 
        */
  //    System.out.println("the result is: "+result);
 //     return result;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Strstr s = new Strstr();
        String a="helloppppp";
        String b="llo";
        s.strstr(a, b);
    }
    
}
