
public class ConditionaL_Programs {

	public static void main(String[] args) {
      int i=5;
      int j=5;
 //W A Print * S
//      for(i=1;i<=5;i++) {
//    	  for(j=1;j<5;j++) {
//    		  System.out.print("*");//j=1,2,3,4,5
//      }
//    	  System.out.println("*");//i=1
//	}
//      System.out.println("Star");
      
//    for(i=1;i<=5;i++) {
//	  for(j=1;j<5;j++) {
//		  System.out.print("*");//j=1,2,3,4,5
//  }
//	  System.out.println("*");//i=1
//}
//  System.out.println("Star");      
 //Print * s In
	for (i = 1; i <= 5; i++) {
		for (j = 1; j <= 5; j++) {
			if (i == 1 && j == 1) {
				System.out.print("@");
			} else if(i == 5 && j == 5){
				
				System.out.print("@");
			}else
			System.out.print("*");
		}
		System.out.println("");// i=1

	}
}
}