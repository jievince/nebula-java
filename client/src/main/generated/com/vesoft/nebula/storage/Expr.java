/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

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
public class Expr implements TBase, java.io.Serializable, Cloneable, Comparable<Expr> {
  private static final TStruct STRUCT_DESC = new TStruct("Expr");
  private static final TField ALIAS_FIELD_DESC = new TField("alias", TType.STRING, (short)1);
  private static final TField EXPR_FIELD_DESC = new TField("expr", TType.STRING, (short)2);

  public byte[] alias;
  public byte[] expr;
  public static final int ALIAS = 1;
  public static final int EXPR = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ALIAS, new FieldMetaData("alias", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(EXPR, new FieldMetaData("expr", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Expr.class, metaDataMap);
  }

  public Expr() {
  }

  public Expr(
    byte[] alias,
    byte[] expr)
  {
    this();
    this.alias = alias;
    this.expr = expr;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Expr(Expr other) {
    if (other.isSetAlias()) {
      this.alias = TBaseHelper.deepCopy(other.alias);
    }
    if (other.isSetExpr()) {
      this.expr = TBaseHelper.deepCopy(other.expr);
    }
  }

  public Expr deepCopy() {
    return new Expr(this);
  }

  @Deprecated
  public Expr clone() {
    return new Expr(this);
  }

  public byte[]  getAlias() {
    return this.alias;
  }

  public Expr setAlias(byte[] alias) {
    this.alias = alias;
    return this;
  }

  public void unsetAlias() {
    this.alias = null;
  }

  // Returns true if field alias is set (has been assigned a value) and false otherwise
  public boolean isSetAlias() {
    return this.alias != null;
  }

  public void setAliasIsSet(boolean value) {
    if (!value) {
      this.alias = null;
    }
  }

  public byte[]  getExpr() {
    return this.expr;
  }

  public Expr setExpr(byte[] expr) {
    this.expr = expr;
    return this;
  }

  public void unsetExpr() {
    this.expr = null;
  }

  // Returns true if field expr is set (has been assigned a value) and false otherwise
  public boolean isSetExpr() {
    return this.expr != null;
  }

  public void setExprIsSet(boolean value) {
    if (!value) {
      this.expr = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ALIAS:
      if (value == null) {
        unsetAlias();
      } else {
        setAlias((byte[])value);
      }
      break;

    case EXPR:
      if (value == null) {
        unsetExpr();
      } else {
        setExpr((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ALIAS:
      return getAlias();

    case EXPR:
      return getExpr();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ALIAS:
      return isSetAlias();
    case EXPR:
      return isSetExpr();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Expr)
      return this.equals((Expr)that);
    return false;
  }

  public boolean equals(Expr that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_alias = true && this.isSetAlias();
    boolean that_present_alias = true && that.isSetAlias();
    if (this_present_alias || that_present_alias) {
      if (!(this_present_alias && that_present_alias))
        return false;
      if (!TBaseHelper.equalsSlow(this.alias, that.alias))
        return false;
    }

    boolean this_present_expr = true && this.isSetExpr();
    boolean that_present_expr = true && that.isSetExpr();
    if (this_present_expr || that_present_expr) {
      if (!(this_present_expr && that_present_expr))
        return false;
      if (!TBaseHelper.equalsSlow(this.expr, that.expr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_alias = true && (isSetAlias());
    builder.append(present_alias);
    if (present_alias)
      builder.append(alias);

    boolean present_expr = true && (isSetExpr());
    builder.append(present_expr);
    if (present_expr)
      builder.append(expr);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Expr other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAlias()).compareTo(other.isSetAlias());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(alias, other.alias);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetExpr()).compareTo(other.isSetExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(expr, other.expr);
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
        case ALIAS:
          if (field.type == TType.STRING) {
            this.alias = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EXPR:
          if (field.type == TType.STRING) {
            this.expr = iprot.readBinary();
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
    if (this.alias != null) {
      oprot.writeFieldBegin(ALIAS_FIELD_DESC);
      oprot.writeBinary(this.alias);
      oprot.writeFieldEnd();
    }
    if (this.expr != null) {
      oprot.writeFieldBegin(EXPR_FIELD_DESC);
      oprot.writeBinary(this.expr);
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
    StringBuilder sb = new StringBuilder("Expr");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("alias");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getAlias() == null) {
      sb.append("null");
    } else {
        int __alias_size = Math.min(this. getAlias().length, 128);
        for (int i = 0; i < __alias_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getAlias()[i]).length() > 1 ? Integer.toHexString(this. getAlias()[i]).substring(Integer.toHexString(this. getAlias()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getAlias()[i]).toUpperCase());
        }
        if (this. getAlias().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("expr");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getExpr() == null) {
      sb.append("null");
    } else {
        int __expr_size = Math.min(this. getExpr().length, 128);
        for (int i = 0; i < __expr_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getExpr()[i]).length() > 1 ? Integer.toHexString(this. getExpr()[i]).substring(Integer.toHexString(this. getExpr()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getExpr()[i]).toUpperCase());
        }
        if (this. getExpr().length > 128) sb.append(" ...");
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
