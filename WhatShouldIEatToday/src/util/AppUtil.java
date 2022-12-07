package util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AppUtil {

	public static void alert(String contentText, String headerText) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Error");
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);

		alert.show();
	}
}
