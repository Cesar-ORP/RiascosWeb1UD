package co.edu.udistrital.pf_model;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("buttonBasicView")
@ViewScoped
public class BasicView implements Serializable {

	private static final long serialVersionUID = 1L;

	public void sleep() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }

}