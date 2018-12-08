package application;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.Manager;
import logic.Person;

public class ManagerScreen extends VBox{
	private PersonalDetails head;
	private Text bio;
	
	public ManagerScreen(Manager mng) {
		head = new PersonalDetails(mng);
		getChildren().addAll(head);
	}
}
