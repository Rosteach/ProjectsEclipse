package MVC;

import java.awt.event.*;

public class Controller {
	private View CalcView;
	private Model CalcModel;
	
	public Controller(View theV, Model theM){
		this.CalcView = theV;
		this.CalcModel = theM;
		this.CalcView.addButListener(new ButtonListener());
		this.CalcView.addCalcListener(new CalculateListener());
		this.CalcView.addClearListener(new ClrListener());	
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String inputBut = e.getActionCommand();
			CalcView.addOnField(inputBut);
		}
	}
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				String field = CalcView.getInputField();
				CalcModel.Function(field);
				CalcView.setResult(CalcModel.getResult());
				}
			catch (NumberFormatException ex){
				CalcView.displayErrMess("Incorrect input!");
			}
		}
	}
	
	class ClrListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String dirtyField = e.getActionCommand();
			CalcView.cleaner(dirtyField);
		}
	}

	
}
