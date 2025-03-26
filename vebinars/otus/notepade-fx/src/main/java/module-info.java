module ru.otus.java.notepadefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ru.otus.java.notepadefx to javafx.fxml;
    exports ru.otus.java.notepadefx;
}