package de.mknaub.appfxdemo.ctrl;

import de.mknaub.appfx.annotations.Controller;
import de.mknaub.appfx.controller.AbstractController;
import de.mknaub.appfx.utils.Scope;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.annotation.PostConstruct;

/**
 * @author maka
 */
@Controller(scope = Scope.PROTOTYPE, url = "/de/mknaub/appfxdemo/fxml/PageOne.fxml")
public class PageOneCtrl extends AbstractController {

    private static int counter = 0;

    @FXML private Label label;

    @PostConstruct
    private void postConstruct() {
        label.setText(getClass().getSimpleName() + " - " + counter++);
    }
}
