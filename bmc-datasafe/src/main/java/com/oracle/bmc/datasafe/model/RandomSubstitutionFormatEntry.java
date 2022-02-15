/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random Substitution masking format uses the specified substitution column
 * as the source of masked values. The values in the substitution column are randomly
 * ordered before mapping them to the original column values. As a masking operation
 * renames tables temporarily, the substitution column must be in a table that has
 * no masking column. Also, you may want to ensure that the substitution column has
 * sufficient values to uniquely mask the target column.
 * <p>
 * Unlike Deterministic Substitution, Random Substitution doesn't do deterministic
 * masking, and thus, doesn't require a seed value. To learn more, check Random
 * Substitution in the Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RandomSubstitutionFormatEntry.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RandomSubstitutionFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomSubstitutionFormatEntry build() {
            RandomSubstitutionFormatEntry __instance__ =
                    new RandomSubstitutionFormatEntry(
                            description, schemaName, tableName, columnName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomSubstitutionFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .schemaName(o.getSchemaName())
                            .tableName(o.getTableName())
                            .columnName(o.getColumnName());

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

    @Deprecated
    public RandomSubstitutionFormatEntry(
            String description, String schemaName, String tableName, String columnName) {
        super(description);
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.columnName = columnName;
    }

    /**
     * The name of the schema that contains the substitution column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    /**
     * The name of the table that contains the substitution column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    /**
     * The name of the substitution column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
