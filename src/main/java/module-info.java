module com.example.demoreq {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires com.almasb.fxgl.all;

    opens com.example.demoreq to javafx.fxml;
    exports com.example.demoreq;
}