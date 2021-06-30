/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

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
public class NodeInfo implements TBase, java.io.Serializable, Cloneable, Comparable<NodeInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("NodeInfo");
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)1);
  private static final TField DIR_FIELD_DESC = new TField("dir", TType.STRUCT, (short)2);

  public HostAddr host;
  public DirInfo dir;
  public static final int HOST = 1;
  public static final int DIR = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOST, new FieldMetaData("host", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, HostAddr.class)));
    tmpMetaDataMap.put(DIR, new FieldMetaData("dir", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DirInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(NodeInfo.class, metaDataMap);
  }

  public NodeInfo() {
  }

  public NodeInfo(
      HostAddr host,
      DirInfo dir) {
    this();
    this.host = host;
    this.dir = dir;
  }

  public static class Builder {
    private HostAddr host;
    private DirInfo dir;

    public Builder() {
    }

    public Builder setHost(final HostAddr host) {
      this.host = host;
      return this;
    }

    public Builder setDir(final DirInfo dir) {
      this.dir = dir;
      return this;
    }

    public NodeInfo build() {
      NodeInfo result = new NodeInfo();
      result.setHost(this.host);
      result.setDir(this.dir);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NodeInfo(NodeInfo other) {
    if (other.isSetHost()) {
      this.host = TBaseHelper.deepCopy(other.host);
    }
    if (other.isSetDir()) {
      this.dir = TBaseHelper.deepCopy(other.dir);
    }
  }

  public NodeInfo deepCopy() {
    return new NodeInfo(this);
  }

  public HostAddr getHost() {
    return this.host;
  }

  public NodeInfo setHost(HostAddr host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  // Returns true if field host is set (has been assigned a value) and false otherwise
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean __value) {
    if (!__value) {
      this.host = null;
    }
  }

  public DirInfo getDir() {
    return this.dir;
  }

  public NodeInfo setDir(DirInfo dir) {
    this.dir = dir;
    return this;
  }

  public void unsetDir() {
    this.dir = null;
  }

  // Returns true if field dir is set (has been assigned a value) and false otherwise
  public boolean isSetDir() {
    return this.dir != null;
  }

  public void setDirIsSet(boolean __value) {
    if (!__value) {
      this.dir = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOST:
      if (__value == null) {
        unsetHost();
      } else {
        setHost((HostAddr)__value);
      }
      break;

    case DIR:
      if (__value == null) {
        unsetDir();
      } else {
        setDir((DirInfo)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOST:
      return getHost();

    case DIR:
      return getDir();

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
    if (!(_that instanceof NodeInfo))
      return false;
    NodeInfo that = (NodeInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHost(), that.isSetHost(), this.host, that.host)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDir(), that.isSetDir(), this.dir, that.dir)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {host, dir});
  }

  @Override
  public int compareTo(NodeInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host, other.host);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDir()).compareTo(other.isSetDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dir, other.dir);
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
        case HOST:
          if (__field.type == TType.STRUCT) {
            this.host = new HostAddr();
            this.host.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DIR:
          if (__field.type == TType.STRUCT) {
            this.dir = new DirInfo();
            this.dir.read(iprot);
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
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      this.host.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.dir != null) {
      oprot.writeFieldBegin(DIR_FIELD_DESC);
      this.dir.write(oprot);
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
    StringBuilder sb = new StringBuilder("NodeInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("host");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dir");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getDir() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getDir(), indent + 1, prettyPrint));
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
