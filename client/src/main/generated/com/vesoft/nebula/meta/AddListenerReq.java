/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AddListenerReq implements TBase, java.io.Serializable, Cloneable, Comparable<AddListenerReq> {
  private static final TStruct STRUCT_DESC = new TStruct("AddListenerReq");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)2);
  private static final TField HOSTS_FIELD_DESC = new TField("hosts", TType.LIST, (short)3);

  public int space_id;
  /**
   * 
   * @see ListenerType
   */
  public ListenerType type;
  public List<com.vesoft.nebula.HostAddr> hosts;
  public static final int SPACE_ID = 1;
  public static final int TYPE = 2;
  public static final int HOSTS = 3;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(HOSTS, new FieldMetaData("hosts", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AddListenerReq.class, metaDataMap);
  }

  public AddListenerReq() {
  }

  public AddListenerReq(
      int space_id,
      ListenerType type,
      List<com.vesoft.nebula.HostAddr> hosts) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.type = type;
    this.hosts = hosts;
  }

  public static class Builder {
    private int space_id;
    private ListenerType type;
    private List<com.vesoft.nebula.HostAddr> hosts;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setType(final ListenerType type) {
      this.type = type;
      return this;
    }

    public Builder setHosts(final List<com.vesoft.nebula.HostAddr> hosts) {
      this.hosts = hosts;
      return this;
    }

    public AddListenerReq build() {
      AddListenerReq result = new AddListenerReq();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setType(this.type);
      result.setHosts(this.hosts);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddListenerReq(AddListenerReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetType()) {
      this.type = TBaseHelper.deepCopy(other.type);
    }
    if (other.isSetHosts()) {
      this.hosts = TBaseHelper.deepCopy(other.hosts);
    }
  }

  public AddListenerReq deepCopy() {
    return new AddListenerReq(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public AddListenerReq setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  /**
   * 
   * @see ListenerType
   */
  public ListenerType getType() {
    return this.type;
  }

  /**
   * 
   * @see ListenerType
   */
  public AddListenerReq setType(ListenerType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean __value) {
    if (!__value) {
      this.type = null;
    }
  }

  public List<com.vesoft.nebula.HostAddr> getHosts() {
    return this.hosts;
  }

  public AddListenerReq setHosts(List<com.vesoft.nebula.HostAddr> hosts) {
    this.hosts = hosts;
    return this;
  }

  public void unsetHosts() {
    this.hosts = null;
  }

  // Returns true if field hosts is set (has been assigned a value) and false otherwise
  public boolean isSetHosts() {
    return this.hosts != null;
  }

  public void setHostsIsSet(boolean __value) {
    if (!__value) {
      this.hosts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case TYPE:
      if (__value == null) {
        unsetType();
      } else {
        setType((ListenerType)__value);
      }
      break;

    case HOSTS:
      if (__value == null) {
        unsetHosts();
      } else {
        setHosts((List<com.vesoft.nebula.HostAddr>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case TYPE:
      return getType();

    case HOSTS:
      return getHosts();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof AddListenerReq))
      return false;
    AddListenerReq that = (AddListenerReq)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetType(), that.isSetType(), this.type, that.type)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetHosts(), that.isSetHosts(), this.hosts, that.hosts)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, type, hosts});
  }

  @Override
  public int compareTo(AddListenerReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(type, other.type);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetHosts()).compareTo(other.isSetHosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(hosts, other.hosts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TYPE:
          if (__field.type == TType.I32) {
            this.type = ListenerType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case HOSTS:
          if (__field.type == TType.LIST) {
            {
              TList _list234 = iprot.readListBegin();
              this.hosts = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list234.size));
              for (int _i235 = 0; 
                   (_list234.size < 0) ? iprot.peekList() : (_i235 < _list234.size); 
                   ++_i235)
              {
                com.vesoft.nebula.HostAddr _elem236;
                _elem236 = new com.vesoft.nebula.HostAddr();
                _elem236.read(iprot);
                this.hosts.add(_elem236);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
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
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type == null ? 0 : this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.hosts != null) {
      oprot.writeFieldBegin(HOSTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.hosts.size()));
        for (com.vesoft.nebula.HostAddr _iter237 : this.hosts)        {
          _iter237.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AddListenerReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getType() == null) {
      sb.append("null");
    } else {
      String type_name = this.getType() == null ? "null" : this.getType().name();
      if (type_name != null) {
        sb.append(type_name);
        sb.append(" (");
      }
      sb.append(this.getType());
      if (type_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("hosts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHosts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHosts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

