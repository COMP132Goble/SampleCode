package designPatterns.factoryDesign.factory;

import designPatterns.factoryDesign.buttons.Button;
import designPatterns.factoryDesign.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
