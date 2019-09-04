/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *
 */
package beans;

import beans.Name;
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
@FacesConverter(forClass = Name.class)
public class NameConverter implements Converter {

     @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value)
        throws ConverterException
    {
        if ("john".equalsIgnoreCase(value) || "mary".equalsIgnoreCase(value))
            return new Name(value);
        else 
        {
            FacesMessage message = util.Messages.getMessage("messages.messages", 
                "badUserName", new Object[]{value});
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
