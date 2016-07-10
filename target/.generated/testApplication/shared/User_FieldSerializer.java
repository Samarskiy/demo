package testApplication.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getPassword(testApplication.shared.User instance) /*-{
    return instance.@testApplication.shared.User::password;
  }-*/;
  
  private static native void setPassword(testApplication.shared.User instance, java.lang.String value) 
  /*-{
    instance.@testApplication.shared.User::password = value;
  }-*/;
  
  private static native java.lang.String getUsername(testApplication.shared.User instance) /*-{
    return instance.@testApplication.shared.User::username;
  }-*/;
  
  private static native void setUsername(testApplication.shared.User instance, java.lang.String value) 
  /*-{
    instance.@testApplication.shared.User::username = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, testApplication.shared.User instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setPassword(instance, streamReader.readString());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static testApplication.shared.User instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new testApplication.shared.User();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, testApplication.shared.User instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return testApplication.shared.User_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    testApplication.shared.User_FieldSerializer.deserialize(reader, (testApplication.shared.User)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    testApplication.shared.User_FieldSerializer.serialize(writer, (testApplication.shared.User)object);
  }
  
}
