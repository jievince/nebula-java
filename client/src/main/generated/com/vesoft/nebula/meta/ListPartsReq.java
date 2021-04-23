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
public class ListPartsReq implements TBase, java.io.Serializable, Cloneable, Comparable<ListPartsReq> {
  private static final TStruct STRUCT_DESC = new TStruct("ListPartsReq");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PART_IDS_FIELD_DESC = new TField("part_ids", TType.LIST, (short)2);

  public int space_id;
  public List<Integer> part_ids;
  public static final int SPACE_ID = 1;
  public static final int PART_IDS = 2;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PART_IDS, new FieldMetaData("part_ids", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ListPartsReq.class, metaDataMap);
  }

  public ListPartsReq() {
  }

  public ListPartsReq(
      int space_id,
      List<Integer> part_ids) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.part_ids = part_ids;
  }

  public static class Builder {
    private int space_id;
    private List<Integer> part_ids;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setPart_ids(final List<Integer> part_ids) {
      this.part_ids = part_ids;
      return this;
    }

    public ListPartsReq build() {
      ListPartsReq result = new ListPartsReq();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setPart_ids(this.part_ids);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListPartsReq(ListPartsReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetPart_ids()) {
      this.part_ids = TBaseHelper.deepCopy(other.part_ids);
    }
  }

  public ListPartsReq deepCopy() {
    return new ListPartsReq(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public ListPartsReq setSpace_id(int space_id) {
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

  public List<Integer> getPart_ids() {
    return this.part_ids;
  }

  public ListPartsReq setPart_ids(List<Integer> part_ids) {
    this.part_ids = part_ids;
    return this;
  }

  public void unsetPart_ids() {
    this.part_ids = null;
  }

  // Returns true if field part_ids is set (has been assigned a value) and false otherwise
  public boolean isSetPart_ids() {
    return this.part_ids != null;
  }

  public void setPart_idsIsSet(boolean __value) {
    if (!__value) {
      this.part_ids = null;
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

    case PART_IDS:
      if (__value == null) {
        unsetPart_ids();
      } else {
        setPart_ids((List<Integer>)__value);
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

    case PART_IDS:
      return getPart_ids();

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
    if (!(_that instanceof ListPartsReq))
      return false;
    ListPartsReq that = (ListPartsReq)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPart_ids(), that.isSetPart_ids(), this.part_ids, that.part_ids)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, part_ids});
  }

  @Override
  public int compareTo(ListPartsReq other) {
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
    lastComparison = Boolean.valueOf(isSetPart_ids()).compareTo(other.isSetPart_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(part_ids, other.part_ids);
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
        case PART_IDS:
          if (__field.type == TType.LIST) {
            {
              TList _list102 = iprot.readListBegin();
              this.part_ids = new ArrayList<Integer>(Math.max(0, _list102.size));
              for (int _i103 = 0; 
                   (_list102.size < 0) ? iprot.peekList() : (_i103 < _list102.size); 
                   ++_i103)
              {
                int _elem104;
                _elem104 = iprot.readI32();
                this.part_ids.add(_elem104);
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
    if (this.part_ids != null) {
      oprot.writeFieldBegin(PART_IDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.part_ids.size()));
        for (int _iter105 : this.part_ids)        {
          oprot.writeI32(_iter105);
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
    StringBuilder sb = new StringBuilder("ListPartsReq");
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
    sb.append("part_ids");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPart_ids() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPart_ids(), indent + 1, prettyPrint));
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

