package PracticalQB;
//Question No. 10:Write a Program to Design Any Type of Form Using AWT Components
import java.awt.*;
import java.awt.event.*;
public class Pr10 extends Frame {
    Pr10() {
        setTitle("Student Form");
        setSize(400, 400);
        setLayout(null);

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 80, 30);
        add(nameLabel);

        TextField nameField = new TextField();
        nameField.setBounds(150, 50, 180, 30);
        add(nameField);

        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 100, 80, 30);
        add(genderLabel);

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        male.setBounds(150, 100, 60, 30);
        female.setBounds(220, 100, 70, 30);
        add(male);
        add(female);

        Label courseLabel = new Label("Course:");
        courseLabel.setBounds(50, 150, 80, 30);
        add(courseLabel);

        TextField course = new TextField();
        course.setBounds(150, 150, 180, 30);
        add(course);

        Button submit = new Button("Submit");
        submit.setBounds(150, 220, 80, 30);
        add(submit);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Pr10();
    }
}
