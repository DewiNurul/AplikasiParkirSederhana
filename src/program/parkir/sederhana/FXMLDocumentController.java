/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.parkir.sederhana;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label labelprogramparkirsederhana;
    @FXML
    private Label labelnokendaraan;
    @FXML
    private Label labeljeniskendaraan;
    @FXML
    private Label labelhargaparkir;
    @FXML
    private Label labeljammasuk;
    @FXML
    private Label labellamaparkir;
    @FXML
    private TextField textfieldNoKendaraan;
    @FXML
    private TextField textfieldHargaParkir;
    @FXML
    private TextField textfieldJamMasuk;
    @FXML
    private TextField textfieldLamaParkir;
    @FXML
    private RadioButton radiobuttonMotor;
    @FXML
    private RadioButton radiobuttonMobil;
    @FXML
    private Label labelmenit;
    @FXML
    private TextArea textfieldCetak;
    @FXML
    private Button buttonOK;

    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void nokendaraan(ActionEvent event) {
    }

    @FXML
    private void hargaparkir(ActionEvent event) {

    }

    @FXML
    private void jammasuk(ActionEvent event) {
    }

    @FXML
    private void lamaparkir(ActionEvent event) {
    }

    @FXML
    private void motor(ActionEvent event) {
    }

    @FXML
    private void mobil(ActionEvent event) {
    }


    int noKendaraan;
    String jenisKendaraan = "";
    String jenisKendaraan1, jenisKendaraan2;
    int hargaParkir;
    int jmMasuk;
    int lmParkir;
    String ok;
    String ket;

    @FXML

    private void ok(ActionEvent event) {

        if (radiobuttonMotor.isSelected()) {
            ket = "Motor ";
        } else if (radiobuttonMobil.isSelected()) {
            ket = "Mobil ";
        } else {
            ket = "";
        }
        String nokend = textfieldNoKendaraan.getText();
        String jeniskendaraan = labeljeniskendaraan.getText();
        String hargaparkir = textfieldHargaParkir.getText();
        String jammasuk = textfieldJamMasuk.getText();
        String lamaparkir = textfieldLamaParkir.getText();

        textfieldCetak.setText("No Kendaraan       :  " +  nokend + "\n" + "Jenis Kendaraan    : " +   ket + "\n" + "Harga Parkir          : Rp. " +  hargaparkir + "\n" + "Jam Masuk            : "
                +   jammasuk + "\n" + "Lama Parkir           : " +  lamaparkir + " menit");
        

    }


}
