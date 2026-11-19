package application;

public class EmploymentForm {

/*
 * Creating a Class to model Entity... given
 * in the qs. 	
 */

	private String fullName;
	private String currentAddress;
	//.. do for all 12 fields. 
	

    private String contactNumber;
    private String emailAddress;
    private String highestEducation;
    private String gender;
    private String dateAvailable;
    private String desiredPosition;
    private double desiredSalary;
	
	private boolean authorizedToWork;
	private boolean relativesWorking;
	
	private String explanation;

	public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }

    public double getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public boolean isAuthorizedToWork() {
        return authorizedToWork;
    }

    public void setAuthorizedToWork(boolean authorizedToWork) {
        this.authorizedToWork = authorizedToWork;
    }

    public boolean isRelativesWorking() {
        return relativesWorking;
    }

    public void setRelativesWorking(boolean relativesWorking) {
        this.relativesWorking = relativesWorking;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
