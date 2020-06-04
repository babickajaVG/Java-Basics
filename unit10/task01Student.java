package unit10;

import java.util.Date;
import java.util.Objects;

public class task01Student {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String birthday;
	private String address;
	private int phone;
	private String faculty;
	private int year;

	public task01Student(int id, String surname, String name, String patronymic, String birthday, String address,
			int phone, String faculty, int year) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.faculty = faculty;
		this.year = year;
		;
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

	public void setBirthday() {
		this.birthday = birthday;
	}

	public void setAddress() {
		this.address = address;
	}

	public void setPhone() {
		this.phone = phone;
	}

	public void setFaculty() {
		this.faculty = faculty;
	}

	public void setYear() {
		this.year = year;
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

	public String getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}

	public int getPhone() {
		return phone;
	}

	public String getFaculty() {
		return faculty;
	}

	public int getYear() {
		return year;
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
		task01Student stud = (task01Student) obj;

		if (id != stud.id) {
			return false;
		}
		if (surname != stud.surname) {
			return false;
		}
		if (name != stud.name) {
			return false;
		}
		if (patronymic != stud.patronymic) {
			return false;
		}
		if (birthday != stud.birthday) {
			return false;
		}
		if (address != stud.address) {
			return false;
		}
		if (phone != stud.phone) {
			return false;
		}
		if (faculty != stud.faculty) {
			return false;
		}
		if (year != stud.year) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, surname, name, patronymic, birthday, address, phone, faculty, year);
	}

}
