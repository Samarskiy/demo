package testApplication.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class GreetingPage extends Composite {

    private static GreetingUiBinder uiBinder = GWT.create(GreetingUiBinder.class);
    private String Username;

    @UiTemplate("GreetingPage.ui.xml")
    interface GreetingUiBinder extends UiBinder<Widget, GreetingPage> {
    }

    public GreetingPage(String username) {
        initWidget(uiBinder.createAndBindUi(this));
        Username = username;
    }

    @UiField
    Label textBox;

}
