package client.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AddPageGUI {

    public static final int VERTICAL_STRUT = 5;
    public static final int BIG_VERTICAL_STRUT = 10;

    public static final String ID_HINT = "id";
    public static final String NAME_HINT = "name";
    public static final String COORDINATE_X_HINT = "X";
    public static final String COORDINATE_Y_HINT = "Y";
    public static final String OSCARS_COUNT_HINT = "oscars count";
    public static final String TOTAL_BOX_OFFICE_HINT = "total box office";
    public static final String USA_BOX_OFFICE_HINT = "usa box office";
    public static final String GENRE_HINT = "genre";
    public static final String OPERATOR_NAME_HINT = "operator name";
    public static final String OPERATOR_PASSPORT_ID_HINT = "operator passport id";
    public static final String OPERATOR_LOCATION_X_HINT = "operator location X";
    public static final String OPERATOR_LOCATION_Y_HINT = "operator location Y";
    public static final String OPERATOR_LOCATION_Z_HINT = "operator location Z";

    public static final String BUTTON_TEXT = "Add";
    public static final String WINDOW_TITLE = "Adding element";

    public static final Dimension WINDOW_SIZE = new Dimension(300, 500);
    public static final Dimension BUTTON_SIZE = new Dimension(100, 50);
    public static final Dimension TEXT_FIELD_SIZE = new Dimension(150, 30);

    public static final Color HINT_COLOR = Color.GRAY;
    public static final Color TEXT_COLOR = Color.BLACK;
    public static final Color BUTTON_COLOR = new Color(0, 169, 255);

    private JTextField idTextField;
    private JTextField nameTextField;
    private JTextField coordinateX;
    private JTextField coordinateY;
    private JTextField oscarsCount;
    private JTextField totalBoxOffice;
    private JTextField usaBoxOffice;
    private JTextField genre;
    private JTextField operatorName;
    private JTextField operatorPassportID;
    private JTextField operatorLocationX;
    private JTextField operatorLocationY;
    private JTextField operatorLocationZ;
    private JButton button;
    private JDialog window;

    public AddPageGUI() {
        window = new JDialog();
        window.setModal(true);
        window.setSize(WINDOW_SIZE);
        window.setTitle(WINDOW_TITLE);

        createAddButton();
        createTextFields();
    }

    private void createAddButton() {
        button = new JButton();
        button.setPreferredSize(BUTTON_SIZE);
        button.setMaximumSize(BUTTON_SIZE);
        button.setBackground(BUTTON_COLOR);
        button.setText(BUTTON_TEXT);
    }

    private void createTextFields() {
        idTextField = new JTextField();
        idTextField.setPreferredSize(TEXT_FIELD_SIZE);
        idTextField.setMaximumSize(TEXT_FIELD_SIZE);
        idTextField.setText(ID_HINT);
        idTextField.setForeground(HINT_COLOR);
        idTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (idTextField.getText().equals(ID_HINT)) {
                    idTextField.setText("");
                    idTextField.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (idTextField.getText().isEmpty()) {
                    idTextField.setText(ID_HINT);
                    idTextField.setForeground(HINT_COLOR);
                }
            }
        });

        nameTextField = new JTextField();
        nameTextField.setPreferredSize(TEXT_FIELD_SIZE);
        nameTextField.setMaximumSize(TEXT_FIELD_SIZE);
        nameTextField.setText(NAME_HINT);
        nameTextField.setForeground(HINT_COLOR);
        nameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nameTextField.getText().equals(NAME_HINT)) {
                    nameTextField.setText("");
                    nameTextField.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nameTextField.getText().isEmpty()) {
                    nameTextField.setText(NAME_HINT);
                    nameTextField.setForeground(HINT_COLOR);
                }
            }
        });

        coordinateX = new JTextField();
        coordinateX.setPreferredSize(TEXT_FIELD_SIZE);
        coordinateX.setMaximumSize(TEXT_FIELD_SIZE);
        coordinateX.setText(COORDINATE_X_HINT);
        coordinateX.setForeground(HINT_COLOR);
        coordinateX.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (coordinateX.getText().equals(COORDINATE_X_HINT)) {
                    coordinateX.setText("");
                    coordinateX.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (coordinateX.getText().isEmpty()) {
                    coordinateX.setText(COORDINATE_X_HINT);
                    coordinateX.setForeground(HINT_COLOR);
                }
            }
        });

        coordinateY = new JTextField();
        coordinateY.setPreferredSize(TEXT_FIELD_SIZE);
        coordinateY.setMaximumSize(TEXT_FIELD_SIZE);
        coordinateY.setText(COORDINATE_Y_HINT);
        coordinateY.setForeground(HINT_COLOR);
        coordinateY.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (coordinateY.getText().equals(COORDINATE_Y_HINT)) {
                    coordinateY.setText("");
                    coordinateY.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (coordinateY.getText().isEmpty()) {
                    coordinateY.setText(COORDINATE_Y_HINT);
                    coordinateY.setForeground(HINT_COLOR);
                }
            }
        });

        oscarsCount = new JTextField();
        oscarsCount.setPreferredSize(TEXT_FIELD_SIZE);
        oscarsCount.setMaximumSize(TEXT_FIELD_SIZE);
        oscarsCount.setText(OSCARS_COUNT_HINT);
        oscarsCount.setForeground(HINT_COLOR);
        oscarsCount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (oscarsCount.getText().equals(OSCARS_COUNT_HINT)) {
                    oscarsCount.setText("");
                    oscarsCount.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (oscarsCount.getText().isEmpty()) {
                    oscarsCount.setText(OSCARS_COUNT_HINT);
                    oscarsCount.setForeground(HINT_COLOR);
                }
            }
        });

        totalBoxOffice = new JTextField();
        totalBoxOffice.setPreferredSize(TEXT_FIELD_SIZE);
        totalBoxOffice.setMaximumSize(TEXT_FIELD_SIZE);
        totalBoxOffice.setText(TOTAL_BOX_OFFICE_HINT);
        totalBoxOffice.setForeground(HINT_COLOR);
        totalBoxOffice.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (totalBoxOffice.getText().equals(TOTAL_BOX_OFFICE_HINT)) {
                    totalBoxOffice.setText("");
                    totalBoxOffice.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (totalBoxOffice.getText().isEmpty()) {
                    totalBoxOffice.setText(TOTAL_BOX_OFFICE_HINT);
                    totalBoxOffice.setForeground(HINT_COLOR);
                }
            }
        });

        usaBoxOffice = new JTextField();
        usaBoxOffice.setPreferredSize(TEXT_FIELD_SIZE);
        usaBoxOffice.setMaximumSize(TEXT_FIELD_SIZE);
        usaBoxOffice.setText(USA_BOX_OFFICE_HINT);
        usaBoxOffice.setForeground(HINT_COLOR);
        usaBoxOffice.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usaBoxOffice.getText().equals(USA_BOX_OFFICE_HINT)) {
                    usaBoxOffice.setText("");
                    usaBoxOffice.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usaBoxOffice.getText().isEmpty()) {
                    usaBoxOffice.setText(USA_BOX_OFFICE_HINT);
                    usaBoxOffice.setForeground(HINT_COLOR);
                }
            }
        });

        genre = new JTextField();
        genre.setPreferredSize(TEXT_FIELD_SIZE);
        genre.setMaximumSize(TEXT_FIELD_SIZE);
        genre.setText(GENRE_HINT);
        genre.setForeground(HINT_COLOR);
        genre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (genre.getText().equals(GENRE_HINT)) {
                    genre.setText("");
                    genre.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (genre.getText().isEmpty()) {
                    genre.setText(GENRE_HINT);
                    genre.setForeground(HINT_COLOR);
                }
            }
        });

        operatorName = new JTextField();
        operatorName.setPreferredSize(TEXT_FIELD_SIZE);
        operatorName.setMaximumSize(TEXT_FIELD_SIZE);
        operatorName.setText(OPERATOR_NAME_HINT);
        operatorName.setForeground(HINT_COLOR);
        operatorName.setAlignmentX(Component.CENTER_ALIGNMENT); // Для BoxLayout
        operatorName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (operatorName.getText().equals(OPERATOR_NAME_HINT)) {
                    operatorName.setText("");
                    operatorName.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (operatorName.getText().isEmpty()) {
                    operatorName.setText(OPERATOR_NAME_HINT);
                    operatorName.setForeground(HINT_COLOR);
                }
            }
        });

        operatorPassportID = new JTextField();
        operatorPassportID.setPreferredSize(TEXT_FIELD_SIZE);
        operatorPassportID.setMaximumSize(TEXT_FIELD_SIZE);
        operatorPassportID.setText(OPERATOR_PASSPORT_ID_HINT);
        operatorPassportID.setForeground(HINT_COLOR);
        operatorPassportID.setAlignmentX(Component.CENTER_ALIGNMENT); // Для BoxLayout
        operatorPassportID.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (operatorPassportID.getText().equals(OPERATOR_PASSPORT_ID_HINT)) {
                    operatorPassportID.setText("");
                    operatorPassportID.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (operatorPassportID.getText().isEmpty()) {
                    operatorPassportID.setText(OPERATOR_PASSPORT_ID_HINT);
                    operatorPassportID.setForeground(HINT_COLOR);
                }
            }
        });

        operatorLocationX = new JTextField();
        operatorLocationX.setPreferredSize(TEXT_FIELD_SIZE);
        operatorLocationX.setMaximumSize(TEXT_FIELD_SIZE);
        operatorLocationX.setText(OPERATOR_LOCATION_X_HINT);
        operatorLocationX.setForeground(HINT_COLOR);
        operatorLocationX.setAlignmentX(Component.CENTER_ALIGNMENT); // Для BoxLayout
        operatorLocationX.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (operatorLocationX.getText().equals(OPERATOR_LOCATION_X_HINT)) {
                    operatorLocationX.setText("");
                    operatorLocationX.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (operatorLocationX.getText().isEmpty()) {
                    operatorLocationX.setText(OPERATOR_LOCATION_X_HINT);
                    operatorLocationX.setForeground(HINT_COLOR);
                }
            }
        });

        operatorLocationY = new JTextField();
        operatorLocationY.setPreferredSize(TEXT_FIELD_SIZE);
        operatorLocationY.setMaximumSize(TEXT_FIELD_SIZE);
        operatorLocationY.setText(OPERATOR_LOCATION_Y_HINT);
        operatorLocationY.setForeground(HINT_COLOR);
        operatorLocationY.setAlignmentX(Component.CENTER_ALIGNMENT); // Для BoxLayout
        operatorLocationY.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (operatorLocationY.getText().equals(OPERATOR_LOCATION_Y_HINT)) {
                    operatorLocationY.setText("");
                    operatorLocationY.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (operatorLocationY.getText().isEmpty()) {
                    operatorLocationY.setText(OPERATOR_LOCATION_Y_HINT);
                    operatorLocationY.setForeground(HINT_COLOR);
                }
            }
        });

        operatorLocationZ = new JTextField();
        operatorLocationZ.setPreferredSize(TEXT_FIELD_SIZE);
        operatorLocationZ.setMaximumSize(TEXT_FIELD_SIZE);
        operatorLocationZ.setText(OPERATOR_LOCATION_Z_HINT);
        operatorLocationZ.setForeground(HINT_COLOR);
        operatorLocationZ.setAlignmentX(Component.CENTER_ALIGNMENT); // Для BoxLayout
        operatorLocationZ.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (operatorLocationZ.getText().equals(OPERATOR_LOCATION_Z_HINT)) {
                    operatorLocationZ.setText("");
                    operatorLocationZ.setForeground(TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (operatorLocationZ.getText().isEmpty()) {
                    operatorLocationZ.setText(OPERATOR_LOCATION_Z_HINT);
                    operatorLocationZ.setForeground(HINT_COLOR);
                }
            }
        });
    }

    public void createAndShowWindow() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        coordinateX.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(idTextField);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(nameTextField);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(coordinateX);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(coordinateY);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(oscarsCount);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(totalBoxOffice);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(usaBoxOffice);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(genre);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(operatorName);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(operatorPassportID);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(operatorLocationX);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(operatorLocationY);
        panel.add(Box.createVerticalStrut(VERTICAL_STRUT));
        panel.add(operatorLocationZ);
        panel.add(Box.createVerticalStrut(BIG_VERTICAL_STRUT));
        panel.add(button);

        window.add(panel);
        window.setVisible(true);
    }
}
