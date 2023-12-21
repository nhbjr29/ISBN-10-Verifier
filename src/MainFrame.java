import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextField isbnField;
    private JButton validateButton;
    private JLabel resultLabel;

    public MainFrame() {
        // Set up the frame
        setTitle("ISBN-10 Verifier");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        isbnField = new JTextField();
        validateButton = new JButton("Validate");
        resultLabel = new JLabel();

        // Set layout
        setLayout(new GridLayout(4, 1));

        // Add components to the frame
        add(new JLabel("Enter ISBN-10:"));
        add(isbnField);
        add(validateButton);
        add(resultLabel);

        // Add action listener to the button
        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateISBN();
            }
        });
    }

    private void validateISBN() {
        // Get the entered ISBN-10
        String isbn = isbnField.getText();

        // Validate ISBN-10
        boolean isValid = isValidISBN(isbn);

        // Display the result
        if (isValid) {
            resultLabel.setText("Valid ISBN-10");
        } else {
            resultLabel.setText("Invalid ISBN-10");
        }
    }

    private boolean isValidISBN(String isbn) {
        // Remove dashes and check character
        String digits = isbn.replaceAll("[^\\dX]", "");

        // Check if the length is 10
        if (digits.length() != 10) {
            return false;
        }

        // Validate using the formula
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char digit = digits.charAt(i);
            if (digit == 'X') {
                sum += 10;
            } else {
                sum += Character.getNumericValue(digit) * (10 - i);
            }
        }

        // Check if the sum is divisible by 11
        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
