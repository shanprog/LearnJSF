package login.web;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {
    private String name="";
    private String password="";
    private String greeting="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGreeting() {

        if (name.length() == 0)
            return "";
        else
            return  "Welcome to JSF2 + Ajax, " + name + "!";
    }
}
