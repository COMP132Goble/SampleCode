package designPatterns.factoryDesign.factory;

import designPatterns.factoryDesign.buttons.Button;
import designPatterns.factoryDesign.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
