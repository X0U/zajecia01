import javax.swing.*;
import java.util.ArrayList;


public class SquareRootApp {

    private JLabel a_label;
    private JTextField a_field;
    private JTextField b_field;
    private JTextField c_field;
    private JLabel b_label;
    private JLabel c_label;
    private JButton calc_button;
    private JTextArea output_box;
    private JPanel square_root_panel;

    private void initGUI() {
        JFrame appFrame = new JFrame("SquareRootApp");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        appFrame.getContentPane().add(square_root_panel);

        appFrame.pack();
        appFrame.setVisible(true);
    }

    private ArrayList<Float> getRoots(float a, float b, float c){
        float delta = (float)Math.sqrt(b * b - 4 * a * c);
        float res1 = (-b + delta) / (2 * a);
        float res2 = (-b - delta) / (2 * a);
        ArrayList <Float> roots = new ArrayList<>();
        roots.add(res1);
        roots.add(res2);
        return roots;
    }

    private String getRootText(ArrayList<Float> rootArr){
        return "The square roots are: " + rootArr.get(0) + " and " + rootArr.get(1);
    }

    public static void main(String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SquareRootApp theApp = new SquareRootApp();
                theApp.initGUI();
                theApp.calc_button.addActionListener(e -> {
                    float a = Float.valueOf(theApp.a_field.getText());
                    float b = Float.valueOf(theApp.b_field.getText());
                    float c = Float.valueOf(theApp.c_field.getText());

                    ArrayList<Float> roots = theApp.getRoots(a, b, c);

                    theApp.output_box.setText(theApp.getRootText(roots));
                });
            }
        });
    }
}
