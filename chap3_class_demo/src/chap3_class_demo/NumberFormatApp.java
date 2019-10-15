package chap3_class_demo;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		double d1 = .253333333333333;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		pf.setMaximumFractionDigits(4);
		
		System.out.println(cf.format(d1));
		System.out.println(pf.format(d1));
		
		//BigDecimal
		BigDecimal bd = new BigDecimal("25.567");
		
		System.out.println(bd);

	}

}
