/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.raftex;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum ErrorCode implements com.facebook.thrift.TEnum {
  SUCCEEDED(0),
  E_LOG_GAP(-1),
  E_LOG_STALE(-2),
  E_MISSING_COMMIT(-3),
  E_WAITING_SNAPSHOT(-4),
  E_UNKNOWN_PART(-5),
  E_TERM_OUT_OF_DATE(-6),
  E_LAST_LOG_TERM_TOO_OLD(-7),
  E_BAD_STATE(-8),
  E_WRONG_LEADER(-9),
  E_WAL_FAIL(-10),
  E_NOT_READY(-11),
  E_HOST_STOPPED(-12),
  E_NOT_A_LEADER(-13),
  E_HOST_DISCONNECTED(-14),
  E_TOO_MANY_REQUESTS(-15),
  E_PERSIST_SNAPSHOT_FAILED(-16),
  E_BAD_ROLE(-17),
  E_EXCEPTION(-20);

  private static final Map<Integer, ErrorCode> INDEXED_VALUES = new HashMap<Integer, ErrorCode>();

  static {
    for (ErrorCode e: values()) {
      INDEXED_VALUES.put(e.getValue(), e);
    }
  }

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ErrorCode findByValue(int value) { 
    return INDEXED_VALUES.get(value);
  }
}