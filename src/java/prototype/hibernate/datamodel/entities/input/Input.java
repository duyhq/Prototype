package prototype.hibernate.datamodel.entities.input;
// Generated Oct 30, 2013 1:55:35 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Input generated by hbm2java
 */
public class Input  implements java.io.Serializable {


     private int inputId;
     private String inputName;
     private Date dateInput;
     private Double totalMoney;
     private String userName;
     private String comment;

    public Input() {
    }

	
    public Input(int inputId) {
        this.inputId = inputId;
    }
    public Input(int inputId, String inputName, Date dateInput, Double totalMoney, String userName, String comment) {
       this.inputId = inputId;
       this.inputName = inputName;
       this.dateInput = dateInput;
       this.totalMoney = totalMoney;
       this.userName = userName;
       this.comment = comment;
    }
   
    public int getInputId() {
        return this.inputId;
    }
    
    public void setInputId(int inputId) {
        this.inputId = inputId;
    }
    public String getInputName() {
        return this.inputName;
    }
    
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }
    public Date getDateInput() {
        return this.dateInput;
    }
    
    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }
    public Double getTotalMoney() {
        return this.totalMoney;
    }
    
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}

