package MVC;
/*
 ������ ������� ������� ������������ ����� ������ ����������,
 ������ ��� ���������� ������� ������ ���������� � ������� �������������� ������ � ���� ������! 
 
 */
public class Model {
	
	private double resultNumber;
	
	public double getResult(){
		return resultNumber;
	}
		
	// �� ������ ������� ������ ���������� � ��������������� ������ 
	
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
