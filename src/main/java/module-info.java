module com.example.itgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    opens com.example.itgui to javafx.fxml;
    exports com.example.itgui;
    exports com.example.itgui.basic;
    opens com.example.itgui.basic to javafx.fxml;
}