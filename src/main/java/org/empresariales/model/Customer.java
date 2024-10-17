package org.empresariales.model;

public class Customer {

    private int custId;
    private String companyNmae, contactName, contactTitle, address;


    public Customer(int custId, String companyNmae, String address, String contactName, String contactTitle) {
        this.custId = custId;
        this.companyNmae = companyNmae;
        this.address = address;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public void setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
