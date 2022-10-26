/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Metadata of a column in a data object query result set. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueryDataObjectResultSetColumnMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class QueryDataObjectResultSetColumnMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "dataTypeName"})
    public QueryDataObjectResultSetColumnMetadata(String name, DataTypeName dataTypeName) {
        super();
        this.name = name;
        this.dataTypeName = dataTypeName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the column in a data object query result set. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the column in a data object query result set.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Type of the column in a data object query result set. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeName")
        private DataTypeName dataTypeName;

        /**
         * Type of the column in a data object query result set.
         *
         * @param dataTypeName the value to set
         * @return this builder
         */
        public Builder dataTypeName(DataTypeName dataTypeName) {
            this.dataTypeName = dataTypeName;
            this.__explicitlySet__.add("dataTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDataObjectResultSetColumnMetadata build() {
            QueryDataObjectResultSetColumnMetadata model =
                    new QueryDataObjectResultSetColumnMetadata(this.name, this.dataTypeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDataObjectResultSetColumnMetadata model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("dataTypeName")) {
                this.dataTypeName(model.getDataTypeName());
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

    /** Name of the column in a data object query result set. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the column in a data object query result set.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Type of the column in a data object query result set. */
    public enum DataTypeName implements com.oracle.bmc.http.internal.BmcEnum {
        Number("NUMBER"),
        Timestamp("TIMESTAMP"),
        Varchar2("VARCHAR2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataTypeName.class);

        private final String value;
        private static java.util.Map<String, DataTypeName> map;

        static {
            map = new java.util.HashMap<>();
            for (DataTypeName v : DataTypeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataTypeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataTypeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataTypeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of the column in a data object query result set. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeName")
    private final DataTypeName dataTypeName;

    /**
     * Type of the column in a data object query result set.
     *
     * @return the value
     */
    public DataTypeName getDataTypeName() {
        return dataTypeName;
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
        sb.append("QueryDataObjectResultSetColumnMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", dataTypeName=").append(String.valueOf(this.dataTypeName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDataObjectResultSetColumnMetadata)) {
            return false;
        }

        QueryDataObjectResultSetColumnMetadata other = (QueryDataObjectResultSetColumnMetadata) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dataTypeName, other.dataTypeName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dataTypeName == null ? 43 : this.dataTypeName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
