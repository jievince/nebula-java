/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

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
public class Edge implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Edge");
  private static final TField SRC_FIELD_DESC = new TField("src", TType.STRUCT, (short)1);
  private static final TField DST_FIELD_DESC = new TField("dst", TType.STRUCT, (short)2);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)3);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)4);
  private static final TField RANKING_FIELD_DESC = new TField("ranking", TType.I64, (short)5);
  private static final TField PROPS_FIELD_DESC = new TField("props", TType.MAP, (short)6);

  public Value src;
  public Value dst;
  public int type;
  public byte[] name;
  public long ranking;
  public Map<byte[],Value> props;
  public static final int SRC = 1;
  public static final int DST = 2;
  public static final int TYPE = 3;
  public static final int NAME = 4;
  public static final int RANKING = 5;
  public static final int PROPS = 6;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __RANKING_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SRC, new FieldMetaData("src", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Value.class)));
    tmpMetaDataMap.put(DST, new FieldMetaData("dst", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Value.class)));
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(RANKING, new FieldMetaData("ranking", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(PROPS, new FieldMetaData("props", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new StructMetaData(TType.STRUCT, Value.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Edge.class, metaDataMap);
  }

  public Edge() {
  }

  public Edge(
    Value src,
    Value dst,
    int type,
    byte[] name,
    long ranking,
    Map<byte[],Value> props)
  {
    this();
    this.src = src;
    this.dst = dst;
    this.type = type;
    setTypeIsSet(true);
    this.name = name;
    this.ranking = ranking;
    setRankingIsSet(true);
    this.props = props;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edge(Edge other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSrc()) {
      this.src = TBaseHelper.deepCopy(other.src);
    }
    if (other.isSetDst()) {
      this.dst = TBaseHelper.deepCopy(other.dst);
    }
    this.type = TBaseHelper.deepCopy(other.type);
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    this.ranking = TBaseHelper.deepCopy(other.ranking);
    if (other.isSetProps()) {
      this.props = TBaseHelper.deepCopy(other.props);
    }
  }

  public Edge deepCopy() {
    return new Edge(this);
  }

  @Deprecated
  public Edge clone() {
    return new Edge(this);
  }

  public Value  getSrc() {
    return this.src;
  }

  public Edge setSrc(Value src) {
    this.src = src;
    return this;
  }

  public void unsetSrc() {
    this.src = null;
  }

  // Returns true if field src is set (has been assigned a value) and false otherwise
  public boolean isSetSrc() {
    return this.src != null;
  }

  public void setSrcIsSet(boolean value) {
    if (!value) {
      this.src = null;
    }
  }

  public Value  getDst() {
    return this.dst;
  }

  public Edge setDst(Value dst) {
    this.dst = dst;
    return this;
  }

  public void unsetDst() {
    this.dst = null;
  }

  // Returns true if field dst is set (has been assigned a value) and false otherwise
  public boolean isSetDst() {
    return this.dst != null;
  }

  public void setDstIsSet(boolean value) {
    if (!value) {
      this.dst = null;
    }
  }

  public int  getType() {
    return this.type;
  }

  public Edge setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bit_vector.clear(__TYPE_ISSET_ID);
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return __isset_bit_vector.get(__TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_ISSET_ID, value);
  }

  public byte[]  getName() {
    return this.name;
  }

  public Edge setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long  getRanking() {
    return this.ranking;
  }

  public Edge setRanking(long ranking) {
    this.ranking = ranking;
    setRankingIsSet(true);
    return this;
  }

  public void unsetRanking() {
    __isset_bit_vector.clear(__RANKING_ISSET_ID);
  }

  // Returns true if field ranking is set (has been assigned a value) and false otherwise
  public boolean isSetRanking() {
    return __isset_bit_vector.get(__RANKING_ISSET_ID);
  }

  public void setRankingIsSet(boolean value) {
    __isset_bit_vector.set(__RANKING_ISSET_ID, value);
  }

  public Map<byte[],Value>  getProps() {
    return this.props;
  }

  public Edge setProps(Map<byte[],Value> props) {
    this.props = props;
    return this;
  }

  public void unsetProps() {
    this.props = null;
  }

  // Returns true if field props is set (has been assigned a value) and false otherwise
  public boolean isSetProps() {
    return this.props != null;
  }

  public void setPropsIsSet(boolean value) {
    if (!value) {
      this.props = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((Value)value);
      }
      break;

    case DST:
      if (value == null) {
        unsetDst();
      } else {
        setDst((Value)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case RANKING:
      if (value == null) {
        unsetRanking();
      } else {
        setRanking((Long)value);
      }
      break;

    case PROPS:
      if (value == null) {
        unsetProps();
      } else {
        setProps((Map<byte[],Value>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SRC:
      return getSrc();

    case DST:
      return getDst();

    case TYPE:
      return new Integer(getType());

    case NAME:
      return getName();

    case RANKING:
      return new Long(getRanking());

    case PROPS:
      return getProps();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SRC:
      return isSetSrc();
    case DST:
      return isSetDst();
    case TYPE:
      return isSetType();
    case NAME:
      return isSetName();
    case RANKING:
      return isSetRanking();
    case PROPS:
      return isSetProps();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Edge)
      return this.equals((Edge)that);
    return false;
  }

  public boolean equals(Edge that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_src = true && this.isSetSrc();
    boolean that_present_src = true && that.isSetSrc();
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!TBaseHelper.equalsNobinary(this.src, that.src))
        return false;
    }

    boolean this_present_dst = true && this.isSetDst();
    boolean that_present_dst = true && that.isSetDst();
    if (this_present_dst || that_present_dst) {
      if (!(this_present_dst && that_present_dst))
        return false;
      if (!TBaseHelper.equalsNobinary(this.dst, that.dst))
        return false;
    }

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type, that.type))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.name, that.name))
        return false;
    }

    boolean this_present_ranking = true;
    boolean that_present_ranking = true;
    if (this_present_ranking || that_present_ranking) {
      if (!(this_present_ranking && that_present_ranking))
        return false;
      if (!TBaseHelper.equalsNobinary(this.ranking, that.ranking))
        return false;
    }

    boolean this_present_props = true && this.isSetProps();
    boolean that_present_props = true && that.isSetProps();
    if (this_present_props || that_present_props) {
      if (!(this_present_props && that_present_props))
        return false;
      if (!TBaseHelper.equalsSlow(this.props, that.props))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_src = true && (isSetSrc());
    builder.append(present_src);
    if (present_src)
      builder.append(src);

    boolean present_dst = true && (isSetDst());
    builder.append(present_dst);
    if (present_dst)
      builder.append(dst);

    boolean present_type = true;
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_ranking = true;
    builder.append(present_ranking);
    if (present_ranking)
      builder.append(ranking);

    boolean present_props = true && (isSetProps());
    builder.append(present_props);
    if (present_props)
      builder.append(props);

    return builder.toHashCode();
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
        case SRC:
          if (field.type == TType.STRUCT) {
            this.src = new Value();
            this.src.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DST:
          if (field.type == TType.STRUCT) {
            this.dst = new Value();
            this.dst.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            setTypeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RANKING:
          if (field.type == TType.I64) {
            this.ranking = iprot.readI64();
            setRankingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PROPS:
          if (field.type == TType.MAP) {
            {
              TMap _map34 = iprot.readMapBegin();
              this.props = new HashMap<byte[],Value>(Math.max(0, 2*_map34.size));
              for (int _i35 = 0; 
                   (_map34.size < 0) ? iprot.peekMap() : (_i35 < _map34.size); 
                   ++_i35)
              {
                byte[] _key36;
                Value _val37;
                _key36 = iprot.readBinary();
                _val37 = new Value();
                _val37.read(iprot);
                this.props.put(_key36, _val37);
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
    if (this.src != null) {
      oprot.writeFieldBegin(SRC_FIELD_DESC);
      this.src.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.dst != null) {
      oprot.writeFieldBegin(DST_FIELD_DESC);
      this.dst.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RANKING_FIELD_DESC);
    oprot.writeI64(this.ranking);
    oprot.writeFieldEnd();
    if (this.props != null) {
      oprot.writeFieldBegin(PROPS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.props.size()));
        for (Map.Entry<byte[], Value> _iter38 : this.props.entrySet())        {
          oprot.writeBinary(_iter38.getKey());
          _iter38.getValue().write(oprot);
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
    StringBuilder sb = new StringBuilder("Edge");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("src");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSrc() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSrc(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dst");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getDst() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getDst(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getType(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this. getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getName()[i]).length() > 1 ? Integer.toHexString(this. getName()[i]).substring(Integer.toHexString(this. getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getName()[i]).toUpperCase());
        }
        if (this. getName().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("ranking");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getRanking(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("props");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getProps() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getProps(), indent + 1, prettyPrint));
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

