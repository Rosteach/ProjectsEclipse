package MVC;

/*
В данном классе реализовано представление нашего шаблона
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private JPanel panel;
	private JTextField field;
	private JButton zero,one,two,three,four,five,six,seven,eight,nine,plus,minus,div,mul,clr,calc;
	
	public View(){
		// настройка внешнего вида нашего приложения
		frame = new JFrame("MyCalculator");
		field = new JTextField(50);
		frame.setVisible(true);
		frame.setSize(255, 300);//(ширина,высота)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//данный метод позволяет фрейму закрываться по щелчку на закрытии
		frame.add(field,BorderLayout.NORTH);
	
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));// с помощью сеточного(матричного) представления добавляем кнопки
		
		// adding buttons on panel grid (1,4);
		zero = new JButton("0"); panel.add(zero);
		one = new JButton("1"); panel.add(one);
		two = new JButton("2"); panel.add(two);
		three = new JButton("3"); panel.add(three);
		
		// adding buttons on panel grid (2,4);
		plus = new JButton("+"); panel.add(plus);
		four = new JButton("4"); panel.add(four);
		five = new JButton("5"); panel.add(five);
		six = new JButton("6"); panel.add(six);
		
		// adding buttons on panel grid (3,4);
		mul = new JButton("*"); panel.add(mul);
		seven = new JButton("7"); panel.add(seven);
		eight = new JButton("8"); panel.add(eight);
		nine = new JButton("9"); panel.add(nine);
		
		// adding buttons on panel grid (4,4);
		clr = new JButton("clr"); panel.add(clr);
		div = new JButton("/"); panel.add(div);
		minus = new JButton("-"); panel.add(minus);
		calc = new JButton("="); panel.add(calc);
							
		frame.add(panel, BorderLayout.CENTER);
	}
	
	public String getInputField(){
		String input = field.getText();
		return input;
	}
	
	public void setResult(double res){
		field.setText(Double.toString(res));
	}
	
	// метод который давляет символ в наш field
	public void addOnField(String func){
		field.setText(field.getText()+func);
	}
	
	// метод который очищяет нашу строку
	public void cleaner(String dirty){
		field.setText(""); 
	}
	
	// Добавляем слушатели действий для кнопок
	public void addButListener(ActionListener listenerForButton){
		zero.addActionListener(listenerForButton);
		one.addActionListener(listenerForButton);
		two.addActionListener(listenerForButton);
		three.addActionListener(listenerForButton);
		four.addActionListener(listenerForButton);
		five.addActionListener(listenerForButton);
		six.addActionListener(listenerForButton);
		seven.addActionListener(listenerForButton);
		eight.addActionListener(listenerForButton);
		nine.addActionListener(listenerForButton);
		plus.addActionListener(listenerForButton);
		minus.addActionListener(listenerForButton);
		div.addActionListener(listenerForButton);
		mul.addActionListener(listenerForButton);
	}
	
	public void addClearListener(ActionListener listenerForClr){
		clr.addActionListener(listenerForClr);
	}
	
	public void addCalcListener(ActionListener listenerForCalc){
		calc.addActionListener(listenerForCalc);
	}
	
	// исключаем ошибку при нажатии кнопки calc, в случае некорректно введеного JTextField(например символы)
	public void displayErrMess(String error){
		JOptionPane.showMessageDialog(this, error);
	}
}
	