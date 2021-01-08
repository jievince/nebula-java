/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.storage.data;

import com.vesoft.nebula.client.graph.data.ValueWrapper;
import java.util.List;

public class EdgeTableRow extends BaseTableRow {

    public EdgeTableRow(List<Object> values) {
        super(values);
    }

    public EdgeTableRow(List<Object> values, String decodeType) {
        super(values, decodeType);
    }

    public Object getSrcId() {
        if (values.size() < 3) {
            throw new IllegalArgumentException("no src id is returned");
        }
        return values.get(0);
    }


    public Object getDstId() {
        if (values.size() < 3) {
            throw new IllegalArgumentException("no dst id is returned");
        }
        return values.get(1);
    }

    public long getRank() {
        if (values.size() < 3) {
            throw new IllegalArgumentException("no rank is returned");
        }
        return (long) values.get(2);
    }


    @Override
    public String toString() {
        return "EdgeTableView{"
                + "srcId=" + getSrcId()
                + ", dstId=" + getDstId()
                + ", rank=" + getRank()
                + ", values=" + getValues()
                + '}';
    }
}