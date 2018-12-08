package application;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.Person;
import logic.Refree;

public class RefreeScreen extends VBox {
	private PersonalDetails head;
	private Text bio;
	
	public RefreeScreen(Refree rf) {
		head = new PersonalDetails(rf);
		getChildren().addAll(head);
	}

}
