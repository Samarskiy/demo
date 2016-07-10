package testApplication.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LoginResources_default_InlineClientBundleGenerator implements testApplication.client.login.LoginResources {
  private static LoginResources_default_InlineClientBundleGenerator _instance0 = new LoginResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new testApplication.client.login.LoginResources.MyCss() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GAXI30VK0D{font-family:" + ("Arial"+ ","+ " " +"Sans-serif")  + ";color:" + ("#000")  + ";font-size:" + ("12px")  + ";text-align:" + ("right")  + ";}.GAXI30VN0D{font-family:" + ("Arial"+ ","+ " " +"Sans-serif")  + ";color:" + ("#f00")  + ";font-size:" + ("11px")  + ";text-align:" + ("right")  + ";}.GAXI30VM0D{border:" + ("1px"+ " " +"solid"+ " " +"#39d")  + ";color:" + ("#fff")  + ";background:") + (("#555")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"5px")  + ";padding:" + ("4px"+ " " +"10px"+ " " +"5px")  + ";text-shadow:" + ("0"+ " " +"-1px"+ " " +"0"+ " " +"#39d")  + ";}.GAXI30VL0D{border:" + ("1px"+ " " +"solid"+ " " +"#ace")  + ";display:" + ("block")  + ";font-size:" + ("12px")  + ";margin:" + ("0"+ " " +"0"+ " " +"5px")  + ";padding:" + ("3px") ) + (";width:" + ("203px")  + ";}.GAXI30VJ0D{background-color:" + ("#999")  + ";border:" + ("1px"+ " " +"none"+ " " +"transparent")  + ";color:" + ("#000")  + ";font-size:" + ("11px")  + ";margin-right:" + ("-8px")  + ";margin-top:" + ("5px")  + ";padding:" + ("6px")  + ";}")) : ((".GAXI30VK0D{font-family:" + ("Arial"+ ","+ " " +"Sans-serif")  + ";color:" + ("#000")  + ";font-size:" + ("12px")  + ";text-align:" + ("left")  + ";}.GAXI30VN0D{font-family:" + ("Arial"+ ","+ " " +"Sans-serif")  + ";color:" + ("#f00")  + ";font-size:" + ("11px")  + ";text-align:" + ("left")  + ";}.GAXI30VM0D{border:" + ("1px"+ " " +"solid"+ " " +"#39d")  + ";color:" + ("#fff")  + ";background:") + (("#555")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";margin:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";padding:" + ("4px"+ " " +"10px"+ " " +"5px")  + ";text-shadow:" + ("0"+ " " +"-1px"+ " " +"0"+ " " +"#39d")  + ";}.GAXI30VL0D{border:" + ("1px"+ " " +"solid"+ " " +"#ace")  + ";display:" + ("block")  + ";font-size:" + ("12px")  + ";margin:" + ("0"+ " " +"0"+ " " +"5px")  + ";padding:" + ("3px") ) + (";width:" + ("203px")  + ";}.GAXI30VJ0D{background-color:" + ("#999")  + ";border:" + ("1px"+ " " +"none"+ " " +"transparent")  + ";color:" + ("#000")  + ";font-size:" + ("11px")  + ";margin-left:" + ("-8px")  + ";margin-top:" + ("5px")  + ";padding:" + ("6px")  + ";}"));
      }
      public java.lang.String background() {
        return "GAXI30VJ0D";
      }
      public java.lang.String blackText() {
        return "GAXI30VK0D";
      }
      public java.lang.String box() {
        return "GAXI30VL0D";
      }
      public java.lang.String loginButton() {
        return "GAXI30VM0D";
      }
      public java.lang.String redText() {
        return "GAXI30VN0D";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static testApplication.client.login.LoginResources.MyCss get() {
      return style;
    }
  }
  public testApplication.client.login.LoginResources.MyCss style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static testApplication.client.login.LoginResources.MyCss style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@testApplication.client.login.LoginResources::style()();
    }
    return null;
  }-*/;
}
