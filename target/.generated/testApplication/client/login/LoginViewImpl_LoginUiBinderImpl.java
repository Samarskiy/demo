package testApplication.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LoginViewImpl_LoginUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, testApplication.client.login.LoginViewImpl>, testApplication.client.login.LoginViewImpl.LoginUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div align='center'> <span id='{0}'></span> </div>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final testApplication.client.login.LoginViewImpl owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final testApplication.client.login.LoginViewImpl owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.doClickSubmit((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.logical.shared.ValueChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.logical.shared.ValueChangeHandler() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent event) {
        owner.handleLoginChange((com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String>) event);
      }
    };

    final com.google.gwt.event.dom.client.KeyDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.KeyDownHandler() {
      public void onKeyDown(com.google.gwt.event.dom.client.KeyDownEvent event) {
        owner.handleLoginKeyboardKey((com.google.gwt.event.dom.client.KeyDownEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.KeyDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.KeyDownHandler() {
      public void onKeyDown(com.google.gwt.event.dom.client.KeyDownEvent event) {
        owner.handlePasswordKeyboardKey((com.google.gwt.event.dom.client.KeyDownEvent) event);
      }
    };

    final com.google.gwt.event.logical.shared.ValueChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.logical.shared.ValueChangeHandler() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent event) {
        owner.handlePasswordChange((com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String>) event);
      }
    };

    public Widgets(final testApplication.client.login.LoginViewImpl owner) {
      this.owner = owner;
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private testApplication.client.login.LoginViewImpl_LoginUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private testApplication.client.login.LoginViewImpl_LoginUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final testApplication.client.login.LoginViewImpl_LoginUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (testApplication.client.login.LoginViewImpl_LoginUiBinderImpl_GenBundle) GWT.create(testApplication.client.login.LoginViewImpl_LoginUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 9 times. Type: IMPORTED. Build precedence: 1.
     */
    private testApplication.client.login.LoginResources res;
    private testApplication.client.login.LoginResources get_res() {
      return res;
    }
    private testApplication.client.login.LoginResources build_res() {
      // Creation section.
      res = owner.res;
      assert res != null : "UiField res with 'provided = true' was null";
      // Setup section.


      return res;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_VerticalPanel2(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.add(get_f_Label3());
      f_VerticalPanel2.add(get_loginBox());
      f_VerticalPanel2.add(get_f_Label4());
      f_VerticalPanel2.add(get_passwordBox());
      f_VerticalPanel2.add(get_f_HorizontalPanel5());
      f_VerticalPanel2.add(get_completionLabel1());
      f_VerticalPanel2.add(get_completionLabel2());
      f_VerticalPanel2.setStyleName("" + get_res().style().blackText() + "");


      return f_VerticalPanel2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setStyleName("" + get_res().style().blackText() + "");
      f_Label3.setText("Login");


      return f_Label3;
    }

    /**
     * Getter for loginBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_loginBox() {
      return build_loginBox();
    }
    private com.google.gwt.user.client.ui.TextBox build_loginBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox loginBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      loginBox.setStyleName("" + get_res().style().box() + "");
      loginBox.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);
      loginBox.addKeyDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


      this.owner.loginBox = loginBox;

      return loginBox;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setStyleName("" + get_res().style().blackText() + "");
      f_Label4.setText("Password");


      return f_Label4;
    }

    /**
     * Getter for passwordBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_passwordBox() {
      return build_passwordBox();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_passwordBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox passwordBox = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      passwordBox.setStyleName("" + get_res().style().box() + "");
      passwordBox.addKeyDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);
      passwordBox.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);


      this.owner.passwordBox = passwordBox;

      return passwordBox;
    }

    /**
     * Getter for f_HorizontalPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return build_f_HorizontalPanel5();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel5.add(get_buttonSubmit());
      f_HorizontalPanel5.add(get_myCheckBox());
      f_HorizontalPanel5.add(get_myLabel());


      return f_HorizontalPanel5;
    }

    /**
     * Getter for buttonSubmit called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_buttonSubmit() {
      return build_buttonSubmit();
    }
    private com.google.gwt.user.client.ui.Button build_buttonSubmit() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button buttonSubmit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      buttonSubmit.setStyleName("" + get_res().style().loginButton() + "");
      buttonSubmit.setText("Submit");
      buttonSubmit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.buttonSubmit = buttonSubmit;

      return buttonSubmit;
    }

    /**
     * Getter for myCheckBox called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.CheckBox get_myCheckBox() {
      return build_myCheckBox();
    }
    private com.google.gwt.user.client.ui.CheckBox build_myCheckBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox myCheckBox = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.


      return myCheckBox;
    }

    /**
     * Getter for myLabel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_myLabel() {
      return build_myLabel();
    }
    private com.google.gwt.user.client.ui.Label build_myLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label myLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      myLabel.setStyleName("" + get_res().style().blackText() + "");
      myLabel.setText("Remember me");


      return myLabel;
    }

    /**
     * Getter for completionLabel1 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_completionLabel1() {
      return build_completionLabel1();
    }
    private com.google.gwt.user.client.ui.Label build_completionLabel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label completionLabel1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      completionLabel1.setStyleName("" + get_res().style().blackText() + "");


      this.owner.completionLabel1 = completionLabel1;

      return completionLabel1;
    }

    /**
     * Getter for completionLabel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_completionLabel2() {
      return build_completionLabel2();
    }
    private com.google.gwt.user.client.ui.Label build_completionLabel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label completionLabel2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      completionLabel2.setStyleName("" + get_res().style().blackText() + "");


      this.owner.completionLabel2 = completionLabel2;

      return completionLabel2;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
