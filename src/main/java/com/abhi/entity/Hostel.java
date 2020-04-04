package com.abhi.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hostels")
public class Hostel implements Serializable {

	private static final long serialVersionUID = 459477112449747211L;

	@Id
	@GeneratedValue
	@Column(name="hostel_name")
	private String hostelName;
	
	@Column(name="hostel_id")
	private Integer hostelId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="roll_number")
	private Integer rollNumber;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="mother_contact")
	private Integer motherContactNumber;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="father_contact")
	private Integer fatherContactnumber;
	
	@Column(name="date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="course")
	private String course;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="semester")
	private Integer semester;
	
	@Column(name="room_number")
	private Integer roomNumber;
	
	@Column(name="id_proof")
	private Integer idProof;
	
	@Column(name="guardian_name")
	private String guardianName;
	
	@Column(name="guardian_contact")
	private Integer guardianContactNumber;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="contact_number")
	private Integer contactNumber;

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public Integer getHostelId() {
		return hostelId;
	}

	public void setHostelId(Integer hostelId) {
		this.hostelId = hostelId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Integer getMotherContactNumber() {
		return motherContactNumber;
	}

	public void setMotherContactNumber(Integer motherContactNumber) {
		this.motherContactNumber = motherContactNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Integer getFatherContactnumber() {
		return fatherContactnumber;
	}

	public void setFatherContactnumber(Integer fatherContactnumber) {
		this.fatherContactnumber = fatherContactnumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Integer getIdProof() {
		return idProof;
	}

	public void setIdProof(Integer idProof) {
		this.idProof = idProof;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public Integer getGuardianContactNumber() {
		return guardianContactNumber;
	}

	public void setGuardianContactNumber(Integer guardianContactNumber) {
		this.guardianContactNumber = guardianContactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Hostels [hostelName=" + hostelName + ", hostelId=" + hostelId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", rollNumber=" + rollNumber + ", motherName=" + motherName
				+ ", motherContactNumber=" + motherContactNumber + ", fatherName=" + fatherName
				+ ", fatherContactnumber=" + fatherContactnumber + ", dateOfBirth=" + dateOfBirth + ", course=" + course
				+ ", branch=" + branch + ", year=" + year + ", semester=" + semester + ", roomNumber=" + roomNumber
				+ ", idProof=" + idProof + ", guardianName=" + guardianName + ", guardianContactNumber="
				+ guardianContactNumber + ", emailId=" + emailId + ", contactNumber=" + contactNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((fatherContactnumber == null) ? 0 : fatherContactnumber.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((guardianContactNumber == null) ? 0 : guardianContactNumber.hashCode());
		result = prime * result + ((guardianName == null) ? 0 : guardianName.hashCode());
		result = prime * result + ((hostelId == null) ? 0 : hostelId.hashCode());
		result = prime * result + ((hostelName == null) ? 0 : hostelName.hashCode());
		result = prime * result + ((idProof == null) ? 0 : idProof.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((motherContactNumber == null) ? 0 : motherContactNumber.hashCode());
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + ((rollNumber == null) ? 0 : rollNumber.hashCode());
		result = prime * result + ((roomNumber == null) ? 0 : roomNumber.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hostel other = (Hostel) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (fatherContactnumber == null) {
			if (other.fatherContactnumber != null)
				return false;
		} else if (!fatherContactnumber.equals(other.fatherContactnumber))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (guardianContactNumber == null) {
			if (other.guardianContactNumber != null)
				return false;
		} else if (!guardianContactNumber.equals(other.guardianContactNumber))
			return false;
		if (guardianName == null) {
			if (other.guardianName != null)
				return false;
		} else if (!guardianName.equals(other.guardianName))
			return false;
		if (hostelId == null) {
			if (other.hostelId != null)
				return false;
		} else if (!hostelId.equals(other.hostelId))
			return false;
		if (hostelName == null) {
			if (other.hostelName != null)
				return false;
		} else if (!hostelName.equals(other.hostelName))
			return false;
		if (idProof == null) {
			if (other.idProof != null)
				return false;
		} else if (!idProof.equals(other.idProof))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (motherContactNumber == null) {
			if (other.motherContactNumber != null)
				return false;
		} else if (!motherContactNumber.equals(other.motherContactNumber))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (rollNumber == null) {
			if (other.rollNumber != null)
				return false;
		} else if (!rollNumber.equals(other.rollNumber))
			return false;
		if (roomNumber == null) {
			if (other.roomNumber != null)
				return false;
		} else if (!roomNumber.equals(other.roomNumber))
			return false;
		if (semester == null) {
			if (other.semester != null)
				return false;
		} else if (!semester.equals(other.semester))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	
	
}
