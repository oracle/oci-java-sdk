/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of an UpdateRow operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateRowResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateRowResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
        private String existingVersion;

        public Builder existingVersion(String existingVersion) {
            this.existingVersion = existingVersion;
            this.__explicitlySet__.add("existingVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("existingValue")
        private java.util.Map<String, Object> existingValue;

        public Builder existingValue(java.util.Map<String, Object> existingValue) {
            this.existingValue = existingValue;
            this.__explicitlySet__.add("existingValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("generatedValue")
        private String generatedValue;

        public Builder generatedValue(String generatedValue) {
            this.generatedValue = generatedValue;
            this.__explicitlySet__.add("generatedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRowResult build() {
            UpdateRowResult __instance__ =
                    new UpdateRowResult(
                            version, existingVersion, existingValue, generatedValue, usage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRowResult o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .existingVersion(o.getExistingVersion())
                            .existingValue(o.getExistingValue())
                            .generatedValue(o.getGeneratedValue())
                            .usage(o.getUsage());

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

    /**
     * An opaque version string associated with the row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * The version string associated with the existing row.
     * Returned if the put fails due to options setting in the
     * request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
    String existingVersion;

    /**
     * The map of values from a row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("existingValue")
    java.util.Map<String, Object> existingValue;

    /**
     * The value generated if the operation created a new value for
     * an identity column. If the table has no identity column, this value
     * is null. If it has an identity column, and a value was generated for
     * that column, it is non-null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generatedValue")
    String generatedValue;

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    RequestUsage usage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
