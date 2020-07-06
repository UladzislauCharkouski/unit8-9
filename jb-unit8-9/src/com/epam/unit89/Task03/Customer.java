package com.epam.unit89.Task03;

public class Customer {
	private int id;
	private String surName;
	private String firstName;
	private String middleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;
	
	public Customer (int _id, String _surName, String _firstName, String _middleName, String _address, int _creditCardNumber, int _bankAccountNumber) {
		id = _id;
		surName = _surName;
		firstName = _firstName;
		middleName = _middleName;
		address = _address;
		creditCardNumber = _creditCardNumber;
		bankAccountNumber = _bankAccountNumber;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public int getId() {
		  return id;
	}
		 
	public String getSurName() {
		  return surName;
	}
		 
	public String getFirstName() {
		  return firstName;
	}
	
	public String getMiddleName() {
		  return middleName;
	}
	
	public String getAddress() {
		  return address;
	}
	
	public int getCreditCardNumber() {
		  return creditCardNumber;
	}
	
	public int getBankAccountNumber() {
		  return bankAccountNumber;
	}
	
	public String toString() {
		return "Customer (Id = " + id + ", Surname = " + surName + ", First Name = " + firstName + ", Middle Name = " + middleName + ", Address = " + address + ", Credit Card Number = "+ creditCardNumber+ "\", Bank Account Number = " + bankAccountNumber + ")";
	}
}
// по коду все хорошо
//только не нашла реализации вот этих пунктов
//Найти и вывести: 
//a) список покупателей в алфавитном порядке; 
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
