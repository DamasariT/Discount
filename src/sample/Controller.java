package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField kotakHasil;
    @FXML
    public TextField harga;
    @FXML
    public ComboBox <Integer> diskonBox;

    public void initialize(){
        diskonBox.getItems().add(10);
        diskonBox.getItems().add(20);
        diskonBox.getItems().add(30);
        diskonBox.getItems().add(40);
        diskonBox.getItems().add(50);
        diskonBox.getItems().add(60);
        diskonBox.getItems().add(70);
        diskonBox.getItems().add(80);
        diskonBox.getItems().add(90);
    }
    public void clearItems (javafx.event.ActionEvent actionEvent){
        harga.setText(null);
        kotakHasil.setText(null);
    }
    public void lakukanDiskon (javafx.event.ActionEvent actionEvent){
        String hasil = harga.getText().trim();
        if (hasil.matches("[0-9]+")){
            Integer jawab = Integer.valueOf(hasil);
            Integer diskon = jawab * (100-diskonBox.getValue()) / 100;
            String hasilAkhir = String.valueOf(diskon);
            kotakHasil.setText(hasilAkhir);
        }
        else{
            new Alert(Alert.AlertType.ERROR, "Angka doang mas").showAndWait();
        }
    }
}
