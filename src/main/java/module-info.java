module com.example.itgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    exports com.example.itgui.gridpane;
    exports com.example.itgui.basic;;
    opens com.example.itgui.basic to javafx.fxml;
    opens com.example.itgui.gridpane to javafx.fxml;


}