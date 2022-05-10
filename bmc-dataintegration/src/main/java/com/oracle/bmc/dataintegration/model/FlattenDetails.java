/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the flatten operator.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FlattenDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FlattenDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("flattenProjectionPreferences")
        private FlattenProjectionPreferences flattenProjectionPreferences;

        public Builder flattenProjectionPreferences(
                FlattenProjectionPreferences flattenProjectionPreferences) {
            this.flattenProjectionPreferences = flattenProjectionPreferences;
            this.__explicitlySet__.add("flattenProjectionPreferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributeRoot")
        private String flattenAttributeRoot;

        public Builder flattenAttributeRoot(String flattenAttributeRoot) {
            this.flattenAttributeRoot = flattenAttributeRoot;
            this.__explicitlySet__.add("flattenAttributeRoot");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributePath")
        private String flattenAttributePath;

        public Builder flattenAttributePath(String flattenAttributePath) {
            this.flattenAttributePath = flattenAttributePath;
            this.__explicitlySet__.add("flattenAttributePath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flattenColumns")
        private java.util.List<TypedObject> flattenColumns;

        public Builder flattenColumns(java.util.List<TypedObject> flattenColumns) {
            this.flattenColumns = flattenColumns;
            this.__explicitlySet__.add("flattenColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlattenDetails build() {
            FlattenDetails __instance__ =
                    new FlattenDetails(
                            flattenProjectionPreferences,
                            flattenAttributeRoot,
                            flattenAttributePath,
                            flattenColumns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlattenDetails o) {
            Builder copiedBuilder =
                    flattenProjectionPreferences(o.getFlattenProjectionPreferences())
                            .flattenAttributeRoot(o.getFlattenAttributeRoot())
                            .flattenAttributePath(o.getFlattenAttributePath())
                            .flattenColumns(o.getFlattenColumns());

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

    @com.fasterxml.jackson.annotation.JsonProperty("flattenProjectionPreferences")
    FlattenProjectionPreferences flattenProjectionPreferences;

    /**
     * The string of flatten attribute column name where the flatten process starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributeRoot")
    String flattenAttributeRoot;

    /**
     * The string of flatten attribute path in flattenAttributeRoot from upper level to leaf/targeted level concatenated with dot(.)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributePath")
    String flattenAttributePath;

    /**
     * The array of flatten columns which are the input to flatten.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenColumns")
    java.util.List<TypedObject> flattenColumns;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
