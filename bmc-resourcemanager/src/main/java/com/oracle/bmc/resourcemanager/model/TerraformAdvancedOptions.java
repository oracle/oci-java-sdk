/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Specifies advanced options for Terraform commands. These options are not necessary for normal usage of Terraform.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TerraformAdvancedOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TerraformAdvancedOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshRequired")
        private Boolean isRefreshRequired;

        public Builder isRefreshRequired(Boolean isRefreshRequired) {
            this.isRefreshRequired = isRefreshRequired;
            this.__explicitlySet__.add("isRefreshRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parallelism")
        private Integer parallelism;

        public Builder parallelism(Integer parallelism) {
            this.parallelism = parallelism;
            this.__explicitlySet__.add("parallelism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detailedLogLevel")
        private DetailedLogLevel detailedLogLevel;

        public Builder detailedLogLevel(DetailedLogLevel detailedLogLevel) {
            this.detailedLogLevel = detailedLogLevel;
            this.__explicitlySet__.add("detailedLogLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TerraformAdvancedOptions build() {
            TerraformAdvancedOptions __instance__ =
                    new TerraformAdvancedOptions(isRefreshRequired, parallelism, detailedLogLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TerraformAdvancedOptions o) {
            Builder copiedBuilder =
                    isRefreshRequired(o.getIsRefreshRequired())
                            .parallelism(o.getParallelism())
                            .detailedLogLevel(o.getDetailedLogLevel());

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
     * Specifies whether to refresh the state for each resource before running the job (operation).
     * Refreshing the state can affect performance. Consider setting to {@code false} if the configuration includes several resources.
     * Used with the following operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshRequired")
    Boolean isRefreshRequired;

    /**
     * Limits the number of concurrent Terraform operations when [walking the graph](https://www.terraform.io/docs/internals/graph.html#walking-the-graph).
     * Use this parameter to help debug Terraform issues or to accomplish certain special use cases.
     * A higher value might cause resources to be throttled.
     * Used with the following operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parallelism")
    Integer parallelism;
    /**
     * Enables detailed logs at the specified verbosity for running the job (operation).
     * Used with the following operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DetailedLogLevel {
        Error("ERROR"),
        Warn("WARN"),
        Info("INFO"),
        Debug("DEBUG"),
        Trace("TRACE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DetailedLogLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (DetailedLogLevel v : DetailedLogLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DetailedLogLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DetailedLogLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DetailedLogLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Enables detailed logs at the specified verbosity for running the job (operation).
     * Used with the following operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detailedLogLevel")
    DetailedLogLevel detailedLogLevel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
