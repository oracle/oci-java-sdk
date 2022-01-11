/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateOceInstanceDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
        private String wafPrimaryDomain;

        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            this.wafPrimaryDomain = wafPrimaryDomain;
            this.__explicitlySet__.add("wafPrimaryDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
        private LicenseType instanceLicenseType;

        public Builder instanceLicenseType(LicenseType instanceLicenseType) {
            this.instanceLicenseType = instanceLicenseType;
            this.__explicitlySet__.add("instanceLicenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
        private InstanceUsageType instanceUsageType;

        public Builder instanceUsageType(InstanceUsageType instanceUsageType) {
            this.instanceUsageType = instanceUsageType;
            this.__explicitlySet__.add("instanceUsageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOceInstanceDetails build() {
            UpdateOceInstanceDetails __instance__ =
                    new UpdateOceInstanceDetails(
                            description,
                            wafPrimaryDomain,
                            instanceLicenseType,
                            instanceUsageType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOceInstanceDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .wafPrimaryDomain(o.getWafPrimaryDomain())
                            .instanceLicenseType(o.getInstanceLicenseType())
                            .instanceUsageType(o.getInstanceUsageType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * OceInstance description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Web Application Firewall(WAF) primary domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
    String wafPrimaryDomain;

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
    LicenseType instanceLicenseType;
    /**
     * Instance type based on its usage
     **/
    public enum InstanceUsageType {
        Primary("PRIMARY"),
        Nonprimary("NONPRIMARY"),
        ;

        private final String value;
        private static java.util.Map<String, InstanceUsageType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceUsageType v : InstanceUsageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InstanceUsageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceUsageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InstanceUsageType: " + key);
        }
    };
    /**
     * Instance type based on its usage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
    InstanceUsageType instanceUsageType;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
