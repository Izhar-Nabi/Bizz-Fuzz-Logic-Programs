class BizzFuzzLogic
{
	public static void main(String args[]){
	for(int i=1; i<=100; i++){
	if(i%3==0){
	System.out.println("Bizz " + i +" Because divde by 3");	} // if condition end	
	else if(i%5==0){
	System.out.println("Fuzz " +i +" Because divde by 5");	} //else if condition end
	else if(i%3==0 && i%5==0){
	System.out.println("BizzFuzz "+ i +" Because divde by both");		} //last condtion end	
		} // i loop end 
	}
}