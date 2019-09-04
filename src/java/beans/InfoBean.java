
package beans;

import beans.Password;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Named;



/**
 *
 * @author Meghan
 */
@Named(value = "infoBean")
@SessionScoped
public class InfoBean implements Serializable {

    private Name name;
    private Password password; 
   

    public InfoBean() {
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }




  
}
