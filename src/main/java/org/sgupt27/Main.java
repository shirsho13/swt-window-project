package org.sgupt27;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {
    public static void main(String[] args) {

        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("My SWT Window");
        shell.open();

        // Listen for IPC messages here and open a new SWT window when required.
        //more code to be added after this

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}