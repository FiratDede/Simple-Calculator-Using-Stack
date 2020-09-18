
public class CalcTester {									

	public static void main(String[] args) {		
		// TODO Auto-generated method stub			
       							                    
      								                
       							                    
       								               
       									          
      
       Calc c1=new Calc();
       c1.show();
       c1.showpopvalue();            //It gives error because we don't have any integers in Stack    
       c1.addStack(65);
       c1.addStack(68);	
       c1.show();
       c1.addStack(45);
       c1.show();
       c1.addStack(12);
       c1.remaind();
       c1.show();
       c1.sum();
       c1.show();
       c1.multiply();
       c1.show();
       c1.showpopvalue();
       c1.show();
       c1.subtraction();             //It gives error because we don't have any integers in Stack
       c1.addStack(10);
       c1.addStack(30);
       c1.subtraction();
       c1.show();
       c1.divide();				    //It gives error because we only have one integer in Stack
       c1.addStack(60);
       c1.addStack(30);
       c1.divide();
       c1.show();
       c1.showpopvalue();             
       	
	}
	
}
