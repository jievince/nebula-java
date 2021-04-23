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
public class DropUserReq implements TBase, java.io.Serializable, Cloneable, Comparable<DropUserReq> {
  private static final TStruct STRUCT_DESC = new TStruct("DropUserReq");
  private static final TField ACCOUNT_FIELD_DESC = new TField("account", TType.STRING, (short)1);
  private static final TField IF_EXISTS_FIELD_DESC = new TField("if_exists", TType.BOOL, (short)2);

  public byte[] account;
  public boolean if_exists;
  public static final int ACCOUNT = 1;
  public static final int IF_EXISTS = 2;

  // isset id assignments
  private static final int __IF_EXISTS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ACCOUNT, new FieldMetaData("account", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(IF_EXISTS, new FieldMetaData("if_exists", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(DropUserReq.class, metaDataMap);
  }

  public DropUserReq() {
  }

  public DropUserReq(
      byte[] account,
      boolean if_exists) {
    this();
    this.account = account;
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
  }

  public static class Builder {
    private byte[] account;
    private boolean if_exists;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setAccount(final byte[] account) {
      this.account = account;
      return this;
    }

    public Builder setIf_exists(final boolean if_exists) {
      this.if_exists = if_exists;
      __optional_isset.set(__IF_EXISTS_ISSET_ID, true);
      return this;
    }

    public DropUserReq build() {
      DropUserReq result = new DropUserReq();
      result.setAccount(this.account);
      if (__optional_isset.get(__IF_EXISTS_ISSET_ID)) {
        result.setIf_exists(this.if_exists);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropUserReq(DropUserReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAccount()) {
      this.account = TBaseHelper.deepCopy(other.account);
    }
    this.if_exists = TBaseHelper.deepCopy(other.if_exists);
  }

  public DropUserReq deepCopy() {
    return new DropUserReq(this);
  }

  public byte[] getAccount() {
    return this.account;
  }

  public DropUserReq setAccount(byte[] account) {
    this.account = account;
    return this;
  }

  public void unsetAccount() {
    this.account = null;
  }

  // Returns true if field account is set (has been assigned a value) and false otherwise
  public boolean isSetAccount() {
    return this.account != null;
  }

  public void setAccountIsSet(boolean __value) {
    if (!__value) {
      this.account = null;
    }
  }

  public boolean isIf_exists() {
    return this.if_exists;
  }

  public DropUserReq setIf_exists(boolean if_exists) {
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
    return this;
  }

  public void unsetIf_exists() {
    __isset_bit_vector.clear(__IF_EXISTS_ISSET_ID);
  }

  // Returns true if field if_exists is set (has been assigned a value) and false otherwise
  public boolean isSetIf_exists() {
    return __isset_bit_vector.get(__IF_EXISTS_ISSET_ID);
  }

  public void setIf_existsIsSet(boolean __value) {
    __isset_bit_vector.set(__IF_EXISTS_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ACCOUNT:
      if (__value == null) {
        unsetAccount();
      } else {
        setAccount((byte[])__value);
      }
      break;

    case IF_EXISTS:
      if (__value == null) {
        unsetIf_exists();
      } else {
        setIf_exists((Boolean)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return getAccount();

    case IF_EXISTS:
      return new Boolean(isIf_exists());

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
    if (!(_that instanceof DropUserReq))
      return false;
    DropUserReq that = (DropUserReq)_that;

    if (!TBaseHelper.equalsSlow(this.isSetAccount(), that.isSetAccount(), this.account, that.account)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.if_exists, that.if_exists)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {account, if_exists});
  }

  @Override
  public int compareTo(DropUserReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccount()).compareTo(other.isSetAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(account, other.account);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIf_exists()).compareTo(other.isSetIf_exists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(if_exists, other.if_exists);
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
        case ACCOUNT:
          if (__field.type == TType.STRING) {
            this.account = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case IF_EXISTS:
          if (__field.type == TType.BOOL) {
            this.if_exists = iprot.readBool();
            setIf_existsIsSet(true);
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
    if (this.account != null) {
      oprot.writeFieldBegin(ACCOUNT_FIELD_DESC);
      oprot.writeBinary(this.account);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IF_EXISTS_FIELD_DESC);
    oprot.writeBool(this.if_exists);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("DropUserReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("account");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getAccount() == null) {
      sb.append("null");
    } else {
        int __account_size = Math.min(this.getAccount().length, 128);
        for (int i = 0; i < __account_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getAccount()[i]).length() > 1 ? Integer.toHexString(this.getAccount()[i]).substring(Integer.toHexString(this.getAccount()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getAccount()[i]).toUpperCase());
        }
        if (this.getAccount().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("if_exists");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isIf_exists(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

