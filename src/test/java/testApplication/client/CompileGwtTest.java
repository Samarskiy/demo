package testApplication.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "testApplication.Project";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
