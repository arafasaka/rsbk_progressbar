package counter;

import java.awt.*;

public class Counter extends Panel {

    private long count = 0;
    private Label label;
    private long maxValue = 100;

    public void setMaxValue(long max) {
        maxValue = max;
    }

    public long getMaxValue() {
        return maxValue;
    }
    public long getCount() {
        return count;
    }
    public long getvalue() {
        return count;
    }

    public Counter() {
        setBackground(Color.blue);
        setForeground(Color.black);
        label = new Label("" + count);
        add(label);
    }

    public void increment() {
        if (count < maxValue) {
            count++;
            label.setText(count + " ");
        } else {
            label.setText("!!");
        }
    }
}
