package fr.exia.helloworldmaven;

public class Controller {
	private final IView view;
	private final IModel model;
	public Controller(final IView, final IModel model
			this.view=view;
			this.model=model;
}
public void run() {
	this.view.displayMessage(this.model.getHelloWorld());
}
}
