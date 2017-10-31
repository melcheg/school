package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    TextField nam1;
    @FXML
    TextField nam2;
    @FXML
    TextField nam3;
    @FXML
    TextField nam4;
    @FXML
    TextField nam5;
    @FXML
    TextField nam6;
    @FXML
    TextField nam7;
    @FXML
    TextField nam8;
    @FXML
    TextField nam9;
    @FXML
    TextField nam10;
    @FXML
    TextField nam11;
    @FXML
    TextField nam12;
    @FXML
    TextField nam13;
    @FXML
    TextField nam14;
    @FXML
    Button butSum;
    @FXML
    Label result;

    public void sout(){
        List<Integer> arr = new ArrayList<>();
        int n1 = Integer.parseInt(nam1.getText());
        int n2 = Integer.parseInt(nam2.getText());
        int n3 = Integer.parseInt(nam3.getText());
        int n4 = Integer.parseInt(nam4.getText());
        int n5 = Integer.parseInt(nam5.getText());
        int n6 = Integer.parseInt(nam6.getText());
        int n7 = Integer.parseInt(nam7.getText());
        int n8 = Integer.parseInt(nam8.getText());
        int n9 = Integer.parseInt(nam9.getText());
        int n10 = Integer.parseInt(nam10.getText());
        int n11 = Integer.parseInt(nam11.getText());
        int n12 = Integer.parseInt(nam12.getText());
        int n13 = Integer.parseInt(nam13.getText());
        int n14 = Integer.parseInt(nam14.getText());

        arr = null;
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);
        arr.add(n4);
        arr.add(n5);
        arr.add(n6);
        arr.add(n7);
        arr.add(n8);
        arr.add(n9);
        arr.add(n10);
        arr.add(n11);
        arr.add(n12);
        arr.add(n13);
        arr.add(n14);
        int size = arr.size();
            int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14;
            double res = sum / size;
            result.setText(String.valueOf(res));










        }

    }


