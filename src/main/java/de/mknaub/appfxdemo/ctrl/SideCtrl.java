package de.mknaub.appfxdemo.ctrl;

import de.mknaub.appfx.annotations.Controller;
import de.mknaub.appfx.annotations.Link;
import de.mknaub.appfx.controller.AbstractController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javax.annotation.PostConstruct;

/**
 * @author maka
 */
@Controller(url = "/de/mknaub/appfxdemo/fxml/Side.fxml")
public class SideCtrl extends AbstractController {

    @Link private MainCtrl mainCtrl;
    
    @PostConstruct
    private void postConstruct(){
        mainCtrl.showPage(getController(PageOneCtrl.class));
    }

    @FXML private void onPageOne(ActionEvent event) {
        mainCtrl.showPage(getController(PageOneCtrl.class));
    }

    @FXML private void onPageTwo(ActionEvent event) {
        mainCtrl.showPage(getController(PageTwoCtrl.class));
    }
}
