package de.mknaub.appfxdemo.ctrl;

import de.mknaub.appfx.annotations.Controller;
import de.mknaub.appfx.annotations.Link;
import de.mknaub.appfx.controller.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * @author maka
 */
@Slf4j
@Controller(url = "/de/mknaub/appfxdemo/fxml/Main.fxml")
public class MainCtrl extends AbstractController {

    // AppFX injections
    @Link private SideCtrl leftCtrl;
    // FXML injections
    @FXML private BorderPane root;

    @PostConstruct
    private void postConstruct() {
        log.trace("postConstruct(" + getClass().getName() + ")");
        root.setLeft(leftCtrl.getView());
    }

    public void showPage(AbstractController controller) {
        root.setCenter(controller.getView());
    }

    public void setSideCtrlPosition(Side side) {
        if (Side.LEFT.equals(side)) {
            root.setRight(null);
            root.setLeft(leftCtrl.getView());
        } else {
            root.setLeft(null);
            root.setRight(leftCtrl.getView());
        }
    }

    public enum Side {
        LEFT, RIGHT;
    }
}
