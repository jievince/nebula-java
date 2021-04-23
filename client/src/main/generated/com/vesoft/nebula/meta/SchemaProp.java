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
public class SchemaProp implements TBase, java.io.Serializable, Cloneable, Comparable<SchemaProp> {
  private static final TStruct STRUCT_DESC = new TStruct("SchemaProp");
  private static final TField TTL_DURATION_FIELD_DESC = new TField("ttl_duration", TType.I64, (short)1);
  private static final TField TTL_COL_FIELD_DESC = new TField("ttl_col", TType.STRING, (short)2);

  public long ttl_duration;
  public byte[] ttl_col;
  public static final int TTL_DURATION = 1;
  public static final int TTL_COL = 2;

  // isset id assignments
  private static final int __TTL_DURATION_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(TTL_DURATION, new FieldMetaData("ttl_duration", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(TTL_COL, new FieldMetaData("ttl_col", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(SchemaProp.class, metaDataMap);
  }

  public SchemaProp() {
  }

  public SchemaProp(
      long ttl_duration,
      byte[] ttl_col) {
    this();
    this.ttl_duration = ttl_duration;
    setTtl_durationIsSet(true);
    this.ttl_col = ttl_col;
  }

  public static class Builder {
    private long ttl_duration;
    private byte[] ttl_col;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setTtl_duration(final long ttl_duration) {
      this.ttl_duration = ttl_duration;
      __optional_isset.set(__TTL_DURATION_ISSET_ID, true);
      return this;
    }

    public Builder setTtl_col(final byte[] ttl_col) {
      this.ttl_col = ttl_col;
      return this;
    }

    public SchemaProp build() {
      SchemaProp result = new SchemaProp();
      if (__optional_isset.get(__TTL_DURATION_ISSET_ID)) {
        result.setTtl_duration(this.ttl_duration);
      }
      result.setTtl_col(this.ttl_col);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SchemaProp(SchemaProp other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.ttl_duration = TBaseHelper.deepCopy(other.ttl_duration);
    if (other.isSetTtl_col()) {
      this.ttl_col = TBaseHelper.deepCopy(other.ttl_col);
    }
  }

  public SchemaProp deepCopy() {
    return new SchemaProp(this);
  }

  public long getTtl_duration() {
    return this.ttl_duration;
  }

  public SchemaProp setTtl_duration(long ttl_duration) {
    this.ttl_duration = ttl_duration;
    setTtl_durationIsSet(true);
    return this;
  }

  public void unsetTtl_duration() {
    __isset_bit_vector.clear(__TTL_DURATION_ISSET_ID);
  }

  // Returns true if field ttl_duration is set (has been assigned a value) and false otherwise
  public boolean isSetTtl_duration() {
    return __isset_bit_vector.get(__TTL_DURATION_ISSET_ID);
  }

  public void setTtl_durationIsSet(boolean __value) {
    __isset_bit_vector.set(__TTL_DURATION_ISSET_ID, __value);
  }

  public byte[] getTtl_col() {
    return this.ttl_col;
  }

  public SchemaProp setTtl_col(byte[] ttl_col) {
    this.ttl_col = ttl_col;
    return this;
  }

  public void unsetTtl_col() {
    this.ttl_col = null;
  }

  // Returns true if field ttl_col is set (has been assigned a value) and false otherwise
  public boolean isSetTtl_col() {
    return this.ttl_col != null;
  }

  public void setTtl_colIsSet(boolean __value) {
    if (!__value) {
      this.ttl_col = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case TTL_DURATION:
      if (__value == null) {
        unsetTtl_duration();
      } else {
        setTtl_duration((Long)__value);
      }
      break;

    case TTL_COL:
      if (__value == null) {
        unsetTtl_col();
      } else {
        setTtl_col((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TTL_DURATION:
      return new Long(getTtl_duration());

    case TTL_COL:
      return getTtl_col();

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
    if (!(_that instanceof SchemaProp))
      return false;
    SchemaProp that = (SchemaProp)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetTtl_duration(), that.isSetTtl_duration(), this.ttl_duration, that.ttl_duration)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetTtl_col(), that.isSetTtl_col(), this.ttl_col, that.ttl_col)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {ttl_duration, ttl_col});
  }

  @Override
  public int compareTo(SchemaProp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTtl_duration()).compareTo(other.isSetTtl_duration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ttl_duration, other.ttl_duration);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTtl_col()).compareTo(other.isSetTtl_col());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ttl_col, other.ttl_col);
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
        case TTL_DURATION:
          if (__field.type == TType.I64) {
            this.ttl_duration = iprot.readI64();
            setTtl_durationIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TTL_COL:
          if (__field.type == TType.STRING) {
            this.ttl_col = iprot.readBinary();
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
    if (isSetTtl_duration()) {
      oprot.writeFieldBegin(TTL_DURATION_FIELD_DESC);
      oprot.writeI64(this.ttl_duration);
      oprot.writeFieldEnd();
    }
    if (this.ttl_col != null) {
      if (isSetTtl_col()) {
        oprot.writeFieldBegin(TTL_COL_FIELD_DESC);
        oprot.writeBinary(this.ttl_col);
        oprot.writeFieldEnd();
      }
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
    StringBuilder sb = new StringBuilder("SchemaProp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetTtl_duration())
    {
      sb.append(indentStr);
      sb.append("ttl_duration");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getTtl_duration(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetTtl_col())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("ttl_col");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getTtl_col() == null) {
        sb.append("null");
      } else {
          int __ttl_col_size = Math.min(this.getTtl_col().length, 128);
          for (int i = 0; i < __ttl_col_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getTtl_col()[i]).length() > 1 ? Integer.toHexString(this.getTtl_col()[i]).substring(Integer.toHexString(this.getTtl_col()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getTtl_col()[i]).toUpperCase());
          }
          if (this.getTtl_col().length > 128) sb.append(" ...");
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

