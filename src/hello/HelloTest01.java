package hello;

import java.applet.*;
import java.awt.*;

import javax.swing.*;


public class HelloTest01 extends Applet{
	public void init(){
		JLabel lbl = new JLabel("hello world",SwingConstants.CENTER);
		add(lbl);
	}
}
