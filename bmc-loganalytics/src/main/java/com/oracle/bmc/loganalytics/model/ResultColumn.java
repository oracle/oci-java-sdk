/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Querylanguage result column. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResultColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResultColumn extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"internalName", "displayName", "valueType"})
    public ResultColumn(String internalName, String displayName, ValueType valueType) {
        super();
        this.internalName = internalName;
        this.displayName = displayName;
        this.valueType = valueType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Internal identifier for the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        /**
         * Internal identifier for the column.
         *
         * @param internalName the value to set
         * @return this builder
         */
        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }
        /** Display name - will be alias if result column is renamed by queryString. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name - will be alias if result column is renamed by queryString.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Field denoting column data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        /**
         * Field denoting column data type.
         *
         * @param valueType the value to set
         * @return this builder
         */
        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResultColumn build() {
            ResultColumn model =
                    new ResultColumn(this.internalName, this.displayName, this.valueType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResultColumn model) {
            if (model.wasPropertyExplicitlySet("internalName")) {
                this.internalName(model.getInternalName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
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

    /** Internal identifier for the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    private final String internalName;

    /**
     * Internal identifier for the column.
     *
     * @return the value
     */
    public String getInternalName() {
        return internalName;
    }

    /** Display name - will be alias if result column is renamed by queryString. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name - will be alias if result column is renamed by queryString.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Field denoting column data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * Field denoting column data type.
     *
     * @return the value
     */
    public ValueType getValueType() {
        return valueType;
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
        sb.append("ResultColumn(");
        sb.append("super=").append(super.toString());
        sb.append("internalName=").append(String.valueOf(this.internalName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResultColumn)) {
            return false;
        }

        ResultColumn other = (ResultColumn) o;
        return java.util.Objects.equals(this.internalName, other.internalName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.internalName == null ? 43 : this.internalName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
