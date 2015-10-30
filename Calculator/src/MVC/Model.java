package MVC;
/*
 Модель данного шаблона представляет собой логику вычислений,
 тоесть вся математика которая должна происходит с числами обрабатывается именно в этом классе! 
 
 */
public class Model {
	
	private double resultNumber;
	
	public double getResult(){
		return resultNumber;
	}
		
	// За основу выбрана логика вычислений с преобразованием строки 
	
	public void Function(String numbers){
			for(int i = 0;i<numbers.length();i++){
				if((numbers.charAt(i))==('+')){
					resultNumber = Double.parseDouble(numbers.substring(0,i))+
							       Double.parseDouble(numbers.substring(i,numbers.length()));
				}
				else if ((numbers.charAt(i))==('-')){
					resultNumber = Double.parseDouble(numbers.substring(0,i))- 
								   Double.parseDouble(numbers.substring(i+1,numbers.length()));
				}
				else if ((numbers.charAt(i))==('*')){
					resultNumber = Double.parseDouble(numbers.substring(0,i))*
								   Double.parseDouble(numbers.substring(i+1,numbers.length()));
				}
				else if ((numbers.charAt(i))==('/')){
					resultNumber = Double.parseDouble(numbers.substring(0,i))/
							       Double.parseDouble(numbers.substring(i+1,numbers.length()));
				
		
				}			
			}
	}
}
