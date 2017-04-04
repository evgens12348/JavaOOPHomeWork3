package com.gmail.s12348.evgen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.JOptionPane;

public class Human {
	private String name;
	private String surname;
	private String sex;
	private int old;

	public Human(String name, String surname, String sex, int old) {
		super();
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.old = old;
	}

	public Human() {
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void inputName() {
		String name = "";
		for (;;) {
			name = String.valueOf(JOptionPane.showInputDialog("Введите имя"));
			System.out.println(checkString(name));
			if (name == "null") {
				JOptionPane.showMessageDialog(null, "Canseled set as default");
				name = "NoName";
				break;
			}
			if (checkString(name) != true) {
				JOptionPane.showMessageDialog(null, "Input Error");
			} else {
				JOptionPane.showMessageDialog(null, "Вы ввели имя " + name);
				break;
			}
		}
	}

	public void inputSurname() {
		String surname = "";
		for (;;) {
			surname = String.valueOf(JOptionPane.showInputDialog("Введите фамилию"));
			System.out.println(checkString(surname));
			if (surname == "null") {
				JOptionPane.showMessageDialog(null, "Canseled set as default");
				surname = "NoSurname";
				break;
			}
			if (checkString(surname) != true) {
				JOptionPane.showMessageDialog(null, "Input Error");
			} else {
				JOptionPane.showMessageDialog(null, "Вы ввели фамилию " + surname);
				break;
			}
		}
	}

	public void inputSex() {
		int s = JOptionPane.showConfirmDialog(null, surname + " " + name + " мужчина?");
		if (s == 0) {
			sex = "man";
		} else if (s == 1) {
			sex = "woman";
		}

	}

	public void inputOld() {
		int a=0;
		for (;;) {
			try {
				a = Integer.valueOf(JOptionPane.showInputDialog("Введите возраст"));
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Canseled set as default");
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Вы ввели число " + a);

	}

	public boolean checkString(String string) throws PatternSyntaxException {
		if (string.length() == 0) {
			return false;
		} else {
			Pattern p = Pattern.compile("^([a-zA-Zа-яА-Я- ]+)");
			Matcher m = p.matcher(string);

			return m.matches();
		}
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", sex=" + sex + ", old=" + old + "]";
	}

}
