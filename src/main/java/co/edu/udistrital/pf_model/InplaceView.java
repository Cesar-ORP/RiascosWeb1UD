package co.edu.udistrital.pf_model;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class InplaceView implements Serializable {

	private static final long serialVersionUID = 1L;
	private String text = "PrimeFaces";
    private String password = "secret";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}