/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Change record for AWR database parameter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddmDbParameterChangeAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddmDbParameterChangeAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeBegin",
        "timeEnd",
        "instNum",
        "previousValue",
        "value",
        "snapshotId"
    })
    public AddmDbParameterChangeAggregation(
            String id,
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Integer instNum,
            String previousValue,
            String value,
            Integer snapshotId) {
        super();
        this.id = id;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.instNum = instNum;
        this.previousValue = previousValue;
        this.value = value;
        this.snapshotId = snapshotId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Begin time of interval which includes change
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * Begin time of interval which includes change
         * @param timeBegin the value to set
         * @return this builder
         **/
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /**
         * End time of interval which includes change
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * End time of interval which includes change
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Instance number
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instNum")
        private Integer instNum;

        /**
         * Instance number
         * @param instNum the value to set
         * @return this builder
         **/
        public Builder instNum(Integer instNum) {
            this.instNum = instNum;
            this.__explicitlySet__.add("instNum");
            return this;
        }
        /**
         * Previous value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
        private String previousValue;

        /**
         * Previous value
         * @param previousValue the value to set
         * @return this builder
         **/
        public Builder previousValue(String previousValue) {
            this.previousValue = previousValue;
            this.__explicitlySet__.add("previousValue");
            return this;
        }
        /**
         * Current value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Current value
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * AWR snapshot id which includes the parameter value change
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        /**
         * AWR snapshot id which includes the parameter value change
         * @param snapshotId the value to set
         * @return this builder
         **/
        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbParameterChangeAggregation build() {
            AddmDbParameterChangeAggregation model =
                    new AddmDbParameterChangeAggregation(
                            this.id,
                            this.timeBegin,
                            this.timeEnd,
                            this.instNum,
                            this.previousValue,
                            this.value,
                            this.snapshotId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbParameterChangeAggregation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeBegin")) {
                this.timeBegin(model.getTimeBegin());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("instNum")) {
                this.instNum(model.getInstNum());
            }
            if (model.wasPropertyExplicitlySet("previousValue")) {
                this.previousValue(model.getPreviousValue());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("snapshotId")) {
                this.snapshotId(model.getSnapshotId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Begin time of interval which includes change
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * Begin time of interval which includes change
     * @return the value
     **/
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /**
     * End time of interval which includes change
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * End time of interval which includes change
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Instance number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instNum")
    private final Integer instNum;

    /**
     * Instance number
     * @return the value
     **/
    public Integer getInstNum() {
        return instNum;
    }

    /**
     * Previous value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
    private final String previousValue;

    /**
     * Previous value
     * @return the value
     **/
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Current value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Current value
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * AWR snapshot id which includes the parameter value change
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    private final Integer snapshotId;

    /**
     * AWR snapshot id which includes the parameter value change
     * @return the value
     **/
    public Integer getSnapshotId() {
        return snapshotId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddmDbParameterChangeAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", instNum=").append(String.valueOf(this.instNum));
        sb.append(", previousValue=").append(String.valueOf(this.previousValue));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbParameterChangeAggregation)) {
            return false;
        }

        AddmDbParameterChangeAggregation other = (AddmDbParameterChangeAggregation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.instNum, other.instNum)
                && java.util.Objects.equals(this.previousValue, other.previousValue)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.snapshotId, other.snapshotId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.instNum == null ? 43 : this.instNum.hashCode());
        result =
                (result * PRIME)
                        + (this.previousValue == null ? 43 : this.previousValue.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
