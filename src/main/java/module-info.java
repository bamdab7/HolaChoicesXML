module com.example.hellochoicesxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellochoicesxml to javafx.fxml;
    exports com.example.hellochoicesxml;
}