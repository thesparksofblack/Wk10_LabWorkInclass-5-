package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {

            VBox root = new VBox(10);
            root.setPadding(new Insets(10));

            TextField txtFullName = new TextField();
            TextField txtAddress = new TextField();
            TextField txtPhone = new TextField();
            TextField txtEmail = new TextField();
            TextField txtEducation = new TextField();
            TextField txtGender = new TextField();
            TextField txtDateAvailable = new TextField();
            TextField txtPosition = new TextField();
            TextField txtSalary = new TextField();

            CheckBox chkAuthorized = new CheckBox("Authorized To Work");
            CheckBox chkRelatives = new CheckBox("Relatives Working");

            TextArea txtExplanation = new TextArea();

            Button btnSubmit = new Button("Submit");

            root.getChildren().addAll(
                    new Label("Full Name"), txtFullName,
                    new Label("Current Address"), txtAddress,
                    new Label("Contact Number"), txtPhone,
                    new Label("Email Address"), txtEmail,
                    new Label("Highest Education"), txtEducation,
                    new Label("Gender"), txtGender,
                    new Label("Date Available"), txtDateAvailable,
                    new Label("Desired Position"), txtPosition,
                    new Label("Desired Salary"), txtSalary,
                    chkAuthorized,
                    chkRelatives,
                    new Label("Explanation"),
                    txtExplanation,
                    btnSubmit
            );

            btnSubmit.setOnAction(event -> {

                try {

                    EmploymentForm employment = new EmploymentForm();

                    employment.setFullName(txtFullName.getText());
                    employment.setCurrentAddress(txtAddress.getText());
                    employment.setContactNumber(txtPhone.getText());
                    employment.setEmailAddress(txtEmail.getText());
                    employment.setHighestEducation(txtEducation.getText());
                    employment.setGender(txtGender.getText());
                    employment.setDateAvailable(txtDateAvailable.getText());
                    employment.setDesiredPosition(txtPosition.getText());

                    if (!txtSalary.getText().isEmpty()) {
                        employment.setDesiredSalary(
                                Double.parseDouble(txtSalary.getText()));
                    }

                    employment.setAuthorizedToWork(
                            chkAuthorized.isSelected());

                    employment.setRelativesWorking(
                            chkRelatives.isSelected());

                    employment.setExplanation(
                            txtExplanation.getText());

                    EmploymentFormDao dao =
                            new EmploymentFormDao();

                    dao.saveEmploymentForm(employment);

                    System.out.println("Record Saved Successfully");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            Scene scene = new Scene(root, 500, 700);

            primaryStage.setTitle("Employment Application");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}