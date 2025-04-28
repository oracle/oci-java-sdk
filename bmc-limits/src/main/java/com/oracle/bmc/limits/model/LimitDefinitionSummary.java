/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.model;

/**
 * The metadata specific to a resource limit definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LimitDefinitionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LimitDefinitionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "serviceName",
        "description",
        "scopeType",
        "areQuotasSupported",
        "isResourceAvailabilitySupported",
        "isDeprecated",
        "isEligibleForLimitIncrease",
        "isDynamic",
        "supportedSubscriptions",
        "supportedQuotaFamilies"
    })
    public LimitDefinitionSummary(
            String name,
            String serviceName,
            String description,
            ScopeType scopeType,
            Boolean areQuotasSupported,
            Boolean isResourceAvailabilitySupported,
            Boolean isDeprecated,
            Boolean isEligibleForLimitIncrease,
            Boolean isDynamic,
            java.util.List<String> supportedSubscriptions,
            java.util.List<String> supportedQuotaFamilies) {
        super();
        this.name = name;
        this.serviceName = serviceName;
        this.description = description;
        this.scopeType = scopeType;
        this.areQuotasSupported = areQuotasSupported;
        this.isResourceAvailabilitySupported = isResourceAvailabilitySupported;
        this.isDeprecated = isDeprecated;
        this.isEligibleForLimitIncrease = isEligibleForLimitIncrease;
        this.isDynamic = isDynamic;
        this.supportedSubscriptions = supportedSubscriptions;
        this.supportedQuotaFamilies = supportedQuotaFamilies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource limit name. To be used for writing policies (in case of quotas) or other
         * programmatic calls.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The resource limit name. To be used for writing policies (in case of quotas) or other
         * programmatic calls.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The service name of the limit. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The service name of the limit.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** The limit description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The limit description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Reflects the scope of the resource limit, whether Global (across all regions), regional,
         * or availability domain-specific.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
        private ScopeType scopeType;

        /**
         * Reflects the scope of the resource limit, whether Global (across all regions), regional,
         * or availability domain-specific.
         *
         * @param scopeType the value to set
         * @return this builder
         */
        public Builder scopeType(ScopeType scopeType) {
            this.scopeType = scopeType;
            this.__explicitlySet__.add("scopeType");
            return this;
        }
        /** If true, quota policies can be created on top of this resource limit. */
        @com.fasterxml.jackson.annotation.JsonProperty("areQuotasSupported")
        private Boolean areQuotasSupported;

        /**
         * If true, quota policies can be created on top of this resource limit.
         *
         * @param areQuotasSupported the value to set
         * @return this builder
         */
        public Builder areQuotasSupported(Boolean areQuotasSupported) {
            this.areQuotasSupported = areQuotasSupported;
            this.__explicitlySet__.add("areQuotasSupported");
            return this;
        }
        /**
         * Reflects whether or not the GetResourceAvailability API is supported for this limit. If
         * not, the API returns an empty JSON response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResourceAvailabilitySupported")
        private Boolean isResourceAvailabilitySupported;

        /**
         * Reflects whether or not the GetResourceAvailability API is supported for this limit. If
         * not, the API returns an empty JSON response.
         *
         * @param isResourceAvailabilitySupported the value to set
         * @return this builder
         */
        public Builder isResourceAvailabilitySupported(Boolean isResourceAvailabilitySupported) {
            this.isResourceAvailabilitySupported = isResourceAvailabilitySupported;
            this.__explicitlySet__.add("isResourceAvailabilitySupported");
            return this;
        }
        /** Indicates if the limit has been deprecated. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
        private Boolean isDeprecated;

        /**
         * Indicates if the limit has been deprecated.
         *
         * @param isDeprecated the value to set
         * @return this builder
         */
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            this.__explicitlySet__.add("isDeprecated");
            return this;
        }
        /** Indicates if the customer can request a limit increase for this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForLimitIncrease")
        private Boolean isEligibleForLimitIncrease;

        /**
         * Indicates if the customer can request a limit increase for this resource.
         *
         * @param isEligibleForLimitIncrease the value to set
         * @return this builder
         */
        public Builder isEligibleForLimitIncrease(Boolean isEligibleForLimitIncrease) {
            this.isEligibleForLimitIncrease = isEligibleForLimitIncrease;
            this.__explicitlySet__.add("isEligibleForLimitIncrease");
            return this;
        }
        /**
         * The limit for this resource has a dynamic value that is based on consumption across all
         * OCI services.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDynamic")
        private Boolean isDynamic;

        /**
         * The limit for this resource has a dynamic value that is based on consumption across all
         * OCI services.
         *
         * @param isDynamic the value to set
         * @return this builder
         */
        public Builder isDynamic(Boolean isDynamic) {
            this.isDynamic = isDynamic;
            this.__explicitlySet__.add("isDynamic");
            return this;
        }
        /**
         * An array of subscription types supported by the limit. e,g The type of subscription, such
         * as 'SAAS', 'ERP', 'CRM'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedSubscriptions")
        private java.util.List<String> supportedSubscriptions;

        /**
         * An array of subscription types supported by the limit. e,g The type of subscription, such
         * as 'SAAS', 'ERP', 'CRM'.
         *
         * @param supportedSubscriptions the value to set
         * @return this builder
         */
        public Builder supportedSubscriptions(java.util.List<String> supportedSubscriptions) {
            this.supportedSubscriptions = supportedSubscriptions;
            this.__explicitlySet__.add("supportedSubscriptions");
            return this;
        }
        /** Supported quota family names for creation of quota policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedQuotaFamilies")
        private java.util.List<String> supportedQuotaFamilies;

        /**
         * Supported quota family names for creation of quota policy.
         *
         * @param supportedQuotaFamilies the value to set
         * @return this builder
         */
        public Builder supportedQuotaFamilies(java.util.List<String> supportedQuotaFamilies) {
            this.supportedQuotaFamilies = supportedQuotaFamilies;
            this.__explicitlySet__.add("supportedQuotaFamilies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitDefinitionSummary build() {
            LimitDefinitionSummary model =
                    new LimitDefinitionSummary(
                            this.name,
                            this.serviceName,
                            this.description,
                            this.scopeType,
                            this.areQuotasSupported,
                            this.isResourceAvailabilitySupported,
                            this.isDeprecated,
                            this.isEligibleForLimitIncrease,
                            this.isDynamic,
                            this.supportedSubscriptions,
                            this.supportedQuotaFamilies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitDefinitionSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scopeType")) {
                this.scopeType(model.getScopeType());
            }
            if (model.wasPropertyExplicitlySet("areQuotasSupported")) {
                this.areQuotasSupported(model.getAreQuotasSupported());
            }
            if (model.wasPropertyExplicitlySet("isResourceAvailabilitySupported")) {
                this.isResourceAvailabilitySupported(model.getIsResourceAvailabilitySupported());
            }
            if (model.wasPropertyExplicitlySet("isDeprecated")) {
                this.isDeprecated(model.getIsDeprecated());
            }
            if (model.wasPropertyExplicitlySet("isEligibleForLimitIncrease")) {
                this.isEligibleForLimitIncrease(model.getIsEligibleForLimitIncrease());
            }
            if (model.wasPropertyExplicitlySet("isDynamic")) {
                this.isDynamic(model.getIsDynamic());
            }
            if (model.wasPropertyExplicitlySet("supportedSubscriptions")) {
                this.supportedSubscriptions(model.getSupportedSubscriptions());
            }
            if (model.wasPropertyExplicitlySet("supportedQuotaFamilies")) {
                this.supportedQuotaFamilies(model.getSupportedQuotaFamilies());
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
     * The resource limit name. To be used for writing policies (in case of quotas) or other
     * programmatic calls.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The resource limit name. To be used for writing policies (in case of quotas) or other
     * programmatic calls.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The service name of the limit. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The service name of the limit.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** The limit description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The limit description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Reflects the scope of the resource limit, whether Global (across all regions), regional, or
     * availability domain-specific.
     */
    public enum ScopeType implements com.oracle.bmc.http.internal.BmcEnum {
        Global("GLOBAL"),
        Region("REGION"),
        Ad("AD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScopeType.class);

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
     * Reflects the scope of the resource limit, whether Global (across all regions), regional, or
     * availability domain-specific.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
    private final ScopeType scopeType;

    /**
     * Reflects the scope of the resource limit, whether Global (across all regions), regional, or
     * availability domain-specific.
     *
     * @return the value
     */
    public ScopeType getScopeType() {
        return scopeType;
    }

    /** If true, quota policies can be created on top of this resource limit. */
    @com.fasterxml.jackson.annotation.JsonProperty("areQuotasSupported")
    private final Boolean areQuotasSupported;

    /**
     * If true, quota policies can be created on top of this resource limit.
     *
     * @return the value
     */
    public Boolean getAreQuotasSupported() {
        return areQuotasSupported;
    }

    /**
     * Reflects whether or not the GetResourceAvailability API is supported for this limit. If not,
     * the API returns an empty JSON response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isResourceAvailabilitySupported")
    private final Boolean isResourceAvailabilitySupported;

    /**
     * Reflects whether or not the GetResourceAvailability API is supported for this limit. If not,
     * the API returns an empty JSON response.
     *
     * @return the value
     */
    public Boolean getIsResourceAvailabilitySupported() {
        return isResourceAvailabilitySupported;
    }

    /** Indicates if the limit has been deprecated. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
    private final Boolean isDeprecated;

    /**
     * Indicates if the limit has been deprecated.
     *
     * @return the value
     */
    public Boolean getIsDeprecated() {
        return isDeprecated;
    }

    /** Indicates if the customer can request a limit increase for this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForLimitIncrease")
    private final Boolean isEligibleForLimitIncrease;

    /**
     * Indicates if the customer can request a limit increase for this resource.
     *
     * @return the value
     */
    public Boolean getIsEligibleForLimitIncrease() {
        return isEligibleForLimitIncrease;
    }

    /**
     * The limit for this resource has a dynamic value that is based on consumption across all OCI
     * services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDynamic")
    private final Boolean isDynamic;

    /**
     * The limit for this resource has a dynamic value that is based on consumption across all OCI
     * services.
     *
     * @return the value
     */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    /**
     * An array of subscription types supported by the limit. e,g The type of subscription, such as
     * 'SAAS', 'ERP', 'CRM'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedSubscriptions")
    private final java.util.List<String> supportedSubscriptions;

    /**
     * An array of subscription types supported by the limit. e,g The type of subscription, such as
     * 'SAAS', 'ERP', 'CRM'.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedSubscriptions() {
        return supportedSubscriptions;
    }

    /** Supported quota family names for creation of quota policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedQuotaFamilies")
    private final java.util.List<String> supportedQuotaFamilies;

    /**
     * Supported quota family names for creation of quota policy.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedQuotaFamilies() {
        return supportedQuotaFamilies;
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
        sb.append("LimitDefinitionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scopeType=").append(String.valueOf(this.scopeType));
        sb.append(", areQuotasSupported=").append(String.valueOf(this.areQuotasSupported));
        sb.append(", isResourceAvailabilitySupported=")
                .append(String.valueOf(this.isResourceAvailabilitySupported));
        sb.append(", isDeprecated=").append(String.valueOf(this.isDeprecated));
        sb.append(", isEligibleForLimitIncrease=")
                .append(String.valueOf(this.isEligibleForLimitIncrease));
        sb.append(", isDynamic=").append(String.valueOf(this.isDynamic));
        sb.append(", supportedSubscriptions=").append(String.valueOf(this.supportedSubscriptions));
        sb.append(", supportedQuotaFamilies=").append(String.valueOf(this.supportedQuotaFamilies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitDefinitionSummary)) {
            return false;
        }

        LimitDefinitionSummary other = (LimitDefinitionSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scopeType, other.scopeType)
                && java.util.Objects.equals(this.areQuotasSupported, other.areQuotasSupported)
                && java.util.Objects.equals(
                        this.isResourceAvailabilitySupported, other.isResourceAvailabilitySupported)
                && java.util.Objects.equals(this.isDeprecated, other.isDeprecated)
                && java.util.Objects.equals(
                        this.isEligibleForLimitIncrease, other.isEligibleForLimitIncrease)
                && java.util.Objects.equals(this.isDynamic, other.isDynamic)
                && java.util.Objects.equals(
                        this.supportedSubscriptions, other.supportedSubscriptions)
                && java.util.Objects.equals(
                        this.supportedQuotaFamilies, other.supportedQuotaFamilies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scopeType == null ? 43 : this.scopeType.hashCode());
        result =
                (result * PRIME)
                        + (this.areQuotasSupported == null
                                ? 43
                                : this.areQuotasSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.isResourceAvailabilitySupported == null
                                ? 43
                                : this.isResourceAvailabilitySupported.hashCode());
        result = (result * PRIME) + (this.isDeprecated == null ? 43 : this.isDeprecated.hashCode());
        result =
                (result * PRIME)
                        + (this.isEligibleForLimitIncrease == null
                                ? 43
                                : this.isEligibleForLimitIncrease.hashCode());
        result = (result * PRIME) + (this.isDynamic == null ? 43 : this.isDynamic.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedSubscriptions == null
                                ? 43
                                : this.supportedSubscriptions.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedQuotaFamilies == null
                                ? 43
                                : this.supportedQuotaFamilies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
