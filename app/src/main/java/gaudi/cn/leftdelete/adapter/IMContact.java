package gaudi.cn.leftdelete.adapter;

public class IMContact {

    private String name;
    private String phonenumber;

    public IMContact(String name, String phoneNumber) {
        this.name = name;
        this.phonenumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
