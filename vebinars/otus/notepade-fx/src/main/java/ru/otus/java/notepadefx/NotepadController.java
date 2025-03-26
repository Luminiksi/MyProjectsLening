package ru.otus.java.notepadefx;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.controlsfx.control.StatusBar;
import org.controlsfx.dialog.FontSelectorDialog;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;

public class NotepadController implements Initializable {
    @FXML
    TextArea content;
    @FXML
    private VBox root;
    @FXML
    private StatusBar statusBar;

    private FileChooser fileChooser;
    private File currentFile;

    public void menuFileNew(ActionEvent actionEvent) {
        content.clear();
        currentFile = null;
        ((Stage) root.getScene().getWindow()).setTitle("Блокнот");
    }

    public void menuFileExit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void menuFileOpen(ActionEvent actionEvent) throws IOException {
        File filepath = fileChooser.showOpenDialog(null);
        if (filepath != null) {
            currentFile = filepath;
            content.setText(new String(Files.readAllBytes(filepath.toPath())));
            ((Stage) root.getScene().getWindow()).setTitle(String.format("Блокнот [%s]", filepath.getAbsolutePath()));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("."));
        content.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                statusBar.setText("Символов: " + t1.length());
            }
        });
    }

    public void menuFileSave(ActionEvent actionEvent) throws IOException {
        if (currentFile != null) {
            Files.write(currentFile.toPath(), content.getText().getBytes(StandardCharsets.UTF_8), StandardOpenOption.TRUNCATE_EXISTING);
        } else {
            menuFileSaveAs(actionEvent);
        }
    }

    public void menuFileSaveAs(ActionEvent actionEvent) throws IOException {
        File filepath = fileChooser.showSaveDialog(null);
        if (filepath != null) {
            currentFile = filepath;
            ((Stage) root.getScene().getWindow()).setTitle(String.format("Блокнот [%s]", filepath.getAbsolutePath()));
            Files.write(currentFile.toPath(), content.getText().getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }

    }

    public void menuFormatSelectFont(ActionEvent actionEvent) {
        FontSelectorDialog fontSelectorDialog = new FontSelectorDialog(content.getFont());
        fontSelectorDialog.showAndWait().ifPresent(font -> content.setFont(font));
    }

    public void menuEditUndo(ActionEvent actionEvent) {
        content.undo();
    }

    public void menuEditRedo(ActionEvent actionEvent) {
        content.redo();
    }

    public void menuEditCopy(ActionEvent actionEvent) {
//        Без расширенной бибилиотеки выглядело бы так
        /*Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(content.getSelectedText());
        clipboard.setContent(clipboardContent);*/
//        С библиотекой делается всё в одну строчку:
        content.copy();
    }

    public void menuEditPaste(ActionEvent actionEvent) {
        content.paste();
    }

    public void menuEditDelete(ActionEvent actionEvent) {
        content.deleteText(content.getSelection());
    }
}