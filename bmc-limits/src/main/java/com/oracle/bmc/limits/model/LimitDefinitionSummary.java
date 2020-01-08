/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits.model;

/**
 * The metadata specific to a resource limit definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LimitDefinitionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LimitDefinitionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
        private ScopeType scopeType;

        public Builder scopeType(ScopeType scopeType) {
            this.scopeType = scopeType;
            this.__explicitlySet__.add("scopeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("areQuotasSupported")
        private Boolean areQuotasSupported;

        public Builder areQuotasSupported(Boolean areQuotasSupported) {
            this.areQuotasSupported = areQuotasSupported;
            this.__explicitlySet__.add("areQuotasSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResourceAvailabilitySupported")
        private Boolean isResourceAvailabilitySupported;

        public Builder isResourceAvailabilitySupported(Boolean isResourceAvailabilitySupported) {
            this.isResourceAvailabilitySupported = isResourceAvailabilitySupported;
            this.__explicitlySet__.add("isResourceAvailabilitySupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitDefinitionSummary build() {
            LimitDefinitionSummary __instance__ =
                    new LimitDefinitionSummary(
                            name,
                            serviceName,
                            description,
                            scopeType,
                            areQuotasSupported,
                            isResourceAvailabilitySupported);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitDefinitionSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .serviceName(o.getServiceName())
                            .description(o.getDescription())
                            .scopeType(o.getScopeType())
                            .areQuotasSupported(o.getAreQuotasSupported())
                            .isResourceAvailabilitySupported(
                                    o.getIsResourceAvailabilitySupported());

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
     * The resource limit name. To be used for writing policies (in case of quotas) or other programmatic calls.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The service name of the limit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    /**
     * The limit description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * Reflects the scope of the resource limit: which can be Global (across all regions), regional or ad specific.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ScopeType {
        Global("GLOBAL"),
        Region("REGION"),
        Ad("AD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ScopeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScopeType v : ScopeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScopeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScopeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScopeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Reflects the scope of the resource limit: which can be Global (across all regions), regional or ad specific.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
    ScopeType scopeType;

    /**
     * If true, quota policies can be created on top of this resource limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areQuotasSupported")
    Boolean areQuotasSupported;

    /**
     * Reflects if the GetResourceAvailability API is supported for this limit or not.
     * If not, the API will return an empty JSON response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResourceAvailabilitySupported")
    Boolean isResourceAvailabilitySupported;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
