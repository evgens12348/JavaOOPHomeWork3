package com.gmail.s12348.evgen;

import javax.swing.JOptionPane;

public class ArrayIndexOutException extends Exception {
	public void ArrayIndexOut() {
		JOptionPane.showMessageDialog(null, "There are no more places in the group");
	}
}
