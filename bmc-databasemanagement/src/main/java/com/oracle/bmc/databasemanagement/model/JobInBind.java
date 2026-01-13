/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the job in-bind variable. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobInBind.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobInBind extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"position", "dataType", "values", "arrayTypeName"})
    public JobInBind(
            Integer position,
            DataType dataType,
            java.util.List<String> values,
            String arrayTypeName) {
        super();
        this.position = position;
        this.dataType = dataType;
        this.values = values;
        this.arrayTypeName = arrayTypeName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The position of the in-bind variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        /**
         * The position of the in-bind variable.
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /** The datatype of the in-bind variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private DataType dataType;

        /**
         * The datatype of the in-bind variable.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(DataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** The values for the in-bind variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * The values for the in-bind variable.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** The Oracle schema object name for the predefined type of array. */
        @com.fasterxml.jackson.annotation.JsonProperty("arrayTypeName")
        private String arrayTypeName;

        /**
         * The Oracle schema object name for the predefined type of array.
         *
         * @param arrayTypeName the value to set
         * @return this builder
         */
        public Builder arrayTypeName(String arrayTypeName) {
            this.arrayTypeName = arrayTypeName;
            this.__explicitlySet__.add("arrayTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobInBind build() {
            JobInBind model =
                    new JobInBind(this.position, this.dataType, this.values, this.arrayTypeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobInBind model) {
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("arrayTypeName")) {
                this.arrayTypeName(model.getArrayTypeName());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The position of the in-bind variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    /**
     * The position of the in-bind variable.
     *
     * @return the value
     */
    public Integer getPosition() {
        return position;
    }

    /** The datatype of the in-bind variable. */
    public enum DataType implements com.oracle.bmc.http.internal.BmcEnum {
        Number("NUMBER"),
        String("STRING"),
        Clob("CLOB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataType.class);

        private final String value;
        private static java.util.Map<String, DataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataType v : DataType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The datatype of the in-bind variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final DataType dataType;

    /**
     * The datatype of the in-bind variable.
     *
     * @return the value
     */
    public DataType getDataType() {
        return dataType;
    }

    /** The values for the in-bind variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * The values for the in-bind variable.
     *
     * @return the value
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /** The Oracle schema object name for the predefined type of array. */
    @com.fasterxml.jackson.annotation.JsonProperty("arrayTypeName")
    private final String arrayTypeName;

    /**
     * The Oracle schema object name for the predefined type of array.
     *
     * @return the value
     */
    public String getArrayTypeName() {
        return arrayTypeName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobInBind(");
        sb.append("super=").append(super.toString());
        sb.append("position=").append(String.valueOf(this.position));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", arrayTypeName=").append(String.valueOf(this.arrayTypeName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobInBind)) {
            return false;
        }

        JobInBind other = (JobInBind) o;
        return java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.arrayTypeName, other.arrayTypeName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.arrayTypeName == null ? 43 : this.arrayTypeName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
