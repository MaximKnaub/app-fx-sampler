package de.mknaub.appfxdemo.ctrl;

import de.mknaub.appfx.annotations.Controller;
import de.mknaub.appfx.annotations.Link;
import de.mknaub.appfx.controller.AbstractController;
import de.mknaub.appfxdemo.ctrl.MainCtrl.Side;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javax.annotation.PostConstruct;

/**
 * @author maka
 */
@Controller(url = "/de/mknaub/appfxdemo/fxml/PageTwo.fxml")
public class PageTwoCtrl extends AbstractController {

    @Link private MainCtrl mainCtrl;
    
    @FXML private void onSideCtrlLeft(ActionEvent event) {
        mainCtrl.setSideCtrlPosition(Side.LEFT);
    }

    @FXML private void onSideCtrlRight(ActionEvent event) {
        mainCtrl.setSideCtrlPosition(Side.RIGHT);
    }
}
