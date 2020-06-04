package unit10;

import java.util.Objects;

public class task01Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int cardId;
	private int accId;

	public task01Customer(int id, String surname, String name, String patronymic, String address, int cardId,
			int accId) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardId = cardId;
		this.accId = accId;
	}

	public void setId() {
		this.id = id;
	}

	public void setSurname() {
		this.surname = surname;
	}

	public void setName() {
		this.name = name;
	}

	public void setPatronymic() {
		this.patronymic = patronymic;
	}

	public void setAddress() {
		this.address = address;
	}

	public void setCardId() {
		this.cardId = cardId;
	}

	public void setAccId() {
		this.accId = accId;
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public String getAddress() {
		return address;
	}

	public int getCardId() {
		return cardId;
	}

	public int getAccId() {
		return accId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		task01Customer cust = (task01Customer) obj;
		
		if (id != cust.id) {
			return false;
		}
		if (surname != cust.surname) {
			return false;
		}
		if (name != cust.name) {
			return false;
		}
		if (patronymic != cust.patronymic) {
			return false;
		}
		if (address != cust.address) {
			return false;
		}
		if (cardId != cust.cardId) {
			return false;
		}
		if (accId != cust.accId) {
			return false;
		}
		
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, surname, name, patronymic, address, cardId, accId);
	}

}
