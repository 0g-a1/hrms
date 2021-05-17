package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_personels")
public class SystemPersonel {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="personel_number")
	private String personelNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="birth_of_date")
	private LocalDate birthOfDate;
	
	public SystemPersonel() {
		
	}

	public SystemPersonel(int userId, String personelNumber, String firstName, String lastName, String nationalityId,
			LocalDate birthOfDate) {
		super();
		this.userId = userId;
		this.personelNumber = personelNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthOfDate = birthOfDate;
	}
}
