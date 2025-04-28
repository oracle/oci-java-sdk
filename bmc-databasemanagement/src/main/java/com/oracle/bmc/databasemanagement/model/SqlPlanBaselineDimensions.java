/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the SQL plan baseline dimensions. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlPlanBaselineDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlPlanBaselineDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeName", "attributeValue"})
    public SqlPlanBaselineDimensions(String attributeName, String attributeValue) {
        super();
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the SQL plan baseline attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
        private String attributeName;

        /**
         * The name of the SQL plan baseline attribute.
         *
         * @param attributeName the value to set
         * @return this builder
         */
        public Builder attributeName(String attributeName) {
            this.attributeName = attributeName;
            this.__explicitlySet__.add("attributeName");
            return this;
        }
        /** The value of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
        private String attributeValue;

        /**
         * The value of the attribute.
         *
         * @param attributeValue the value to set
         * @return this builder
         */
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            this.__explicitlySet__.add("attributeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanBaselineDimensions build() {
            SqlPlanBaselineDimensions model =
                    new SqlPlanBaselineDimensions(this.attributeName, this.attributeValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanBaselineDimensions model) {
            if (model.wasPropertyExplicitlySet("attributeName")) {
                this.attributeName(model.getAttributeName());
            }
            if (model.wasPropertyExplicitlySet("attributeValue")) {
                this.attributeValue(model.getAttributeValue());
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

    /** The name of the SQL plan baseline attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
    private final String attributeName;

    /**
     * The name of the SQL plan baseline attribute.
     *
     * @return the value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** The value of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
    private final String attributeValue;

    /**
     * The value of the attribute.
     *
     * @return the value
     */
    public String getAttributeValue() {
        return attributeValue;
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
        sb.append("SqlPlanBaselineDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("attributeName=").append(String.valueOf(this.attributeName));
        sb.append(", attributeValue=").append(String.valueOf(this.attributeValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanBaselineDimensions)) {
            return false;
        }

        SqlPlanBaselineDimensions other = (SqlPlanBaselineDimensions) o;
        return java.util.Objects.equals(this.attributeName, other.attributeName)
                && java.util.Objects.equals(this.attributeValue, other.attributeValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeName == null ? 43 : this.attributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeValue == null ? 43 : this.attributeValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
