/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class IndexProperties implements TBase, java.io.Serializable, Cloneable, Comparable<IndexProperties> {
  private static final TStruct STRUCT_DESC = new TStruct("IndexProperties");
  private static final TField FIELDS_FIELD_DESC = new TField("fields", TType.MAP, (short)1);

  public Map<String,List<String>> fields;
  public static final int FIELDS = 1;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(FIELDS, new FieldMetaData("fields", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.STRING)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(IndexProperties.class, metaDataMap);
  }

  public IndexProperties() {
  }

  public IndexProperties(
    Map<String,List<String>> fields)
  {
    this();
    this.fields = fields;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexProperties(IndexProperties other) {
    if (other.isSetFields()) {
      this.fields = TBaseHelper.deepCopy(other.fields);
    }
  }

  public IndexProperties deepCopy() {
    return new IndexProperties(this);
  }

  @Deprecated
  public IndexProperties clone() {
    return new IndexProperties(this);
  }

  public Map<String,List<String>>  getFields() {
    return this.fields;
  }

  public IndexProperties setFields(Map<String,List<String>> fields) {
    this.fields = fields;
    return this;
  }

  public void unsetFields() {
    this.fields = null;
  }

  // Returns true if field fields is set (has been assigned a value) and false otherwise
  public boolean isSetFields() {
    return this.fields != null;
  }

  public void setFieldsIsSet(boolean value) {
    if (!value) {
      this.fields = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case FIELDS:
      if (value == null) {
        unsetFields();
      } else {
        setFields((Map<String,List<String>>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case FIELDS:
      return getFields();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case FIELDS:
      return isSetFields();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexProperties)
      return this.equals((IndexProperties)that);
    return false;
  }

  public boolean equals(IndexProperties that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fields = true && this.isSetFields();
    boolean that_present_fields = true && that.isSetFields();
    if (this_present_fields || that_present_fields) {
      if (!(this_present_fields && that_present_fields))
        return false;
      if (!TBaseHelper.equalsNobinary(this.fields, that.fields))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_fields = true && (isSetFields());
    builder.append(present_fields);
    if (present_fields)
      builder.append(fields);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(IndexProperties other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFields()).compareTo(other.isSetFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(fields, other.fields);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case FIELDS:
          if (field.type == TType.MAP) {
            {
              TMap _map0 = iprot.readMapBegin();
              this.fields = new HashMap<String,List<String>>(Math.max(0, 2*_map0.size));
              for (int _i1 = 0; 
                   (_map0.size < 0) ? iprot.peekMap() : (_i1 < _map0.size); 
                   ++_i1)
              {
                String _key2;
                List<String> _val3;
                _key2 = iprot.readString();
                {
                  TList _list4 = iprot.readListBegin();
                  _val3 = new ArrayList<String>(Math.max(0, _list4.size));
                  for (int _i5 = 0; 
                       (_list4.size < 0) ? iprot.peekList() : (_i5 < _list4.size); 
                       ++_i5)
                  {
                    String _elem6;
                    _elem6 = iprot.readString();
                    _val3.add(_elem6);
                  }
                  iprot.readListEnd();
                }
                this.fields.put(_key2, _val3);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.fields != null) {
      oprot.writeFieldBegin(FIELDS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.fields.size()));
        for (Map.Entry<String, List<String>> _iter7 : this.fields.entrySet())        {
          oprot.writeString(_iter7.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRING, _iter7.getValue().size()));
            for (String _iter8 : _iter7.getValue())            {
              oprot.writeString(_iter8);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("IndexProperties");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("fields");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getFields() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getFields(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
