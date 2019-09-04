/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import beans.Password;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Meghan
 */
@FacesConverter(forClass=Password.class)
public class PasswordConverter implements Converter {

      
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value)
        throws ConverterException
    {
        if ("password".equalsIgnoreCase(value) || "1234".equalsIgnoreCase(value))
            return new Password(value);
        else 
        {
            FacesMessage message = util.Messages.getMessage("messages.messages", 
                "wrongPassword", new Object[]{value});
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(message);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value)
    {
        return value.toString();
    }
    
}

  

