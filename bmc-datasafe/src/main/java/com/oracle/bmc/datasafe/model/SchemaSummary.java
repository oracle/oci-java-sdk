/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of a schema fetched from the database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SchemaSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SchemaSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"schemaName", "isOracleMaintained"})
    public SchemaSummary(String schemaName, Boolean isOracleMaintained) {
        super();
        this.schemaName = schemaName;
        this.isOracleMaintained = isOracleMaintained;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the schema.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of the schema.
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * Indicates if the schema is oracle supplied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
        private Boolean isOracleMaintained;

        /**
         * Indicates if the schema is oracle supplied.
         * @param isOracleMaintained the value to set
         * @return this builder
         **/
        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = isOracleMaintained;
            this.__explicitlySet__.add("isOracleMaintained");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaSummary build() {
            SchemaSummary __instance__ = new SchemaSummary(schemaName, isOracleMaintained);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaSummary o) {
            Builder copiedBuilder =
                    schemaName(o.getSchemaName()).isOracleMaintained(o.getIsOracleMaintained());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Name of the schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of the schema.
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Indicates if the schema is oracle supplied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
    private final Boolean isOracleMaintained;

    /**
     * Indicates if the schema is oracle supplied.
     * @return the value
     **/
    public Boolean getIsOracleMaintained() {
        return isOracleMaintained;
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
        sb.append("SchemaSummary(");
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", isOracleMaintained=").append(String.valueOf(this.isOracleMaintained));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaSummary)) {
            return false;
        }

        SchemaSummary other = (SchemaSummary) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.isOracleMaintained, other.isOracleMaintained)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleMaintained == null
                                ? 43
                                : this.isOracleMaintained.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
