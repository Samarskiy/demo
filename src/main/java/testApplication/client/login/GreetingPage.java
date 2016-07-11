package testApplication.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import testApplication.client.Constants;

public class GreetingPage extends Composite {

    private static GreetingUiBinder uiBinder = GWT.create(GreetingUiBinder.class);
    final Constants constants = com.google.gwt.core.shared.GWT.create(Constants.class);

    @UiTemplate("GreetingPage.ui.xml")
    interface GreetingUiBinder extends UiBinder<Widget, GreetingPage> {
    }

    @UiField
    Label textBox;

    public GreetingPage() {
        initWidget(uiBinder.createAndBindUi(this));
        textBox.setText(constants.const1());
    }
}
