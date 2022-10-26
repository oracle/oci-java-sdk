/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Defines remapping to be applied to objects as they are processed. Refer to [METADATA_REMAP
 * Procedure
 * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetadataRemap.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MetadataRemap extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "oldValue", "newValue"})
    public MetadataRemap(Type type, String oldValue, String newValue) {
        super();
        this.type = type;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of remap. Refer to [METADATA_REMAP Procedure
         * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of remap. Refer to [METADATA_REMAP Procedure
         * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Specifies the value which needs to be reset. */
        @com.fasterxml.jackson.annotation.JsonProperty("oldValue")
        private String oldValue;

        /**
         * Specifies the value which needs to be reset.
         *
         * @param oldValue the value to set
         * @return this builder
         */
        public Builder oldValue(String oldValue) {
            this.oldValue = oldValue;
            this.__explicitlySet__.add("oldValue");
            return this;
        }
        /** Specifies the new value that oldValue should be translated into. */
        @com.fasterxml.jackson.annotation.JsonProperty("newValue")
        private String newValue;

        /**
         * Specifies the new value that oldValue should be translated into.
         *
         * @param newValue the value to set
         * @return this builder
         */
        public Builder newValue(String newValue) {
            this.newValue = newValue;
            this.__explicitlySet__.add("newValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetadataRemap build() {
            MetadataRemap model = new MetadataRemap(this.type, this.oldValue, this.newValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetadataRemap model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("oldValue")) {
                this.oldValue(model.getOldValue());
            }
            if (model.wasPropertyExplicitlySet("newValue")) {
                this.newValue(model.getNewValue());
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

    /**
     * Type of remap. Refer to [METADATA_REMAP Procedure
     * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Schema("SCHEMA"),
        Tablespace("TABLESPACE"),
        Datafile("DATAFILE"),
        Table("TABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of remap. Refer to [METADATA_REMAP Procedure
     * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of remap. Refer to [METADATA_REMAP Procedure
     * ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Specifies the value which needs to be reset. */
    @com.fasterxml.jackson.annotation.JsonProperty("oldValue")
    private final String oldValue;

    /**
     * Specifies the value which needs to be reset.
     *
     * @return the value
     */
    public String getOldValue() {
        return oldValue;
    }

    /** Specifies the new value that oldValue should be translated into. */
    @com.fasterxml.jackson.annotation.JsonProperty("newValue")
    private final String newValue;

    /**
     * Specifies the new value that oldValue should be translated into.
     *
     * @return the value
     */
    public String getNewValue() {
        return newValue;
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
        sb.append("MetadataRemap(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", oldValue=").append(String.valueOf(this.oldValue));
        sb.append(", newValue=").append(String.valueOf(this.newValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetadataRemap)) {
            return false;
        }

        MetadataRemap other = (MetadataRemap) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.oldValue, other.oldValue)
                && java.util.Objects.equals(this.newValue, other.newValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.oldValue == null ? 43 : this.oldValue.hashCode());
        result = (result * PRIME) + (this.newValue == null ? 43 : this.newValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
