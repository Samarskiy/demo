package testApplication.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, testApplication.shared.User[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static testApplication.shared.User[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new testApplication.shared.User[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, testApplication.shared.User[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return testApplication.shared.User_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    testApplication.shared.User_Array_Rank_1_FieldSerializer.deserialize(reader, (testApplication.shared.User[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    testApplication.shared.User_Array_Rank_1_FieldSerializer.serialize(writer, (testApplication.shared.User[])object);
  }
  
}
