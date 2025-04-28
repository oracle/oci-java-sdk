/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration parameter details object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationParameterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MigrationParameterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "name", "dataType"})
    public MigrationParameterDetails(
            String value, String name, AdvancedParameterDataTypes dataType) {
        super();
        this.value = value;
        this.name = name;
        this.dataType = dataType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If a STRING data type then the value should be an array of characters, if a INTEGER data
         * type then the value should be an integer value, if a FLOAT data type then the value
         * should be an float value, if a BOOLEAN data type then the value should be TRUE or FALSE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * If a STRING data type then the value should be an array of characters, if a INTEGER data
         * type then the value should be an integer value, if a FLOAT data type then the value
         * should be an float value, if a BOOLEAN data type then the value should be TRUE or FALSE.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Parameter name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Parameter name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Parameter data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private AdvancedParameterDataTypes dataType;

        /**
         * Parameter data type.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(AdvancedParameterDataTypes dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationParameterDetails build() {
            MigrationParameterDetails model =
                    new MigrationParameterDetails(this.value, this.name, this.dataType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationParameterDetails model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
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
     * If a STRING data type then the value should be an array of characters, if a INTEGER data type
     * then the value should be an integer value, if a FLOAT data type then the value should be an
     * float value, if a BOOLEAN data type then the value should be TRUE or FALSE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * If a STRING data type then the value should be an array of characters, if a INTEGER data type
     * then the value should be an integer value, if a FLOAT data type then the value should be an
     * float value, if a BOOLEAN data type then the value should be TRUE or FALSE.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Parameter name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Parameter name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Parameter data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final AdvancedParameterDataTypes dataType;

    /**
     * Parameter data type.
     *
     * @return the value
     */
    public AdvancedParameterDataTypes getDataType() {
        return dataType;
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
        sb.append("MigrationParameterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationParameterDetails)) {
            return false;
        }

        MigrationParameterDetails other = (MigrationParameterDetails) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
