/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFusionEnvironmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFusionEnvironmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "kmsKeyId",
        "maintenancePolicy",
        "additionalLanguagePacks",
        "isIPv6DualStackEnabled",
        "rules",
        "freeformTags",
        "definedTags"
    })
    public UpdateFusionEnvironmentDetails(
            String displayName,
            String kmsKeyId,
            MaintenancePolicy maintenancePolicy,
            java.util.List<String> additionalLanguagePacks,
            Boolean isIPv6DualStackEnabled,
            java.util.List<Rule> rules,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.kmsKeyId = kmsKeyId;
        this.maintenancePolicy = maintenancePolicy;
        this.additionalLanguagePacks = additionalLanguagePacks;
        this.isIPv6DualStackEnabled = isIPv6DualStackEnabled;
        this.rules = rules;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** FusionEnvironment Identifier, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * FusionEnvironment Identifier, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** byok kms keyId */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * byok kms keyId
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
        private MaintenancePolicy maintenancePolicy;

        public Builder maintenancePolicy(MaintenancePolicy maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            this.__explicitlySet__.add("maintenancePolicy");
            return this;
        }
        /** Language packs */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
        private java.util.List<String> additionalLanguagePacks;

        /**
         * Language packs
         *
         * @param additionalLanguagePacks the value to set
         * @return this builder
         */
        public Builder additionalLanguagePacks(java.util.List<String> additionalLanguagePacks) {
            this.additionalLanguagePacks = additionalLanguagePacks;
            this.__explicitlySet__.add("additionalLanguagePacks");
            return this;
        }
        /**
         * Enable IPv4/IPv6 dual stack support for the environment. Setting to true will assign an
         * IPv6 address to the environment in addition to an IPv4 address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIPv6DualStackEnabled")
        private Boolean isIPv6DualStackEnabled;

        /**
         * Enable IPv4/IPv6 dual stack support for the environment. Setting to true will assign an
         * IPv6 address to the environment in addition to an IPv4 address.
         *
         * @param isIPv6DualStackEnabled the value to set
         * @return this builder
         */
        public Builder isIPv6DualStackEnabled(Boolean isIPv6DualStackEnabled) {
            this.isIPv6DualStackEnabled = isIPv6DualStackEnabled;
            this.__explicitlySet__.add("isIPv6DualStackEnabled");
            return this;
        }
        /**
         * Network access control rules to limit internet traffic that can access the environment.
         * For more information, see {@link #allowRule(AllowRuleRequest) allowRule}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<Rule> rules;

        /**
         * Network access control rules to limit internet traffic that can access the environment.
         * For more information, see {@link #allowRule(AllowRuleRequest) allowRule}.
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(java.util.List<Rule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFusionEnvironmentDetails build() {
            UpdateFusionEnvironmentDetails model =
                    new UpdateFusionEnvironmentDetails(
                            this.displayName,
                            this.kmsKeyId,
                            this.maintenancePolicy,
                            this.additionalLanguagePacks,
                            this.isIPv6DualStackEnabled,
                            this.rules,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFusionEnvironmentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("maintenancePolicy")) {
                this.maintenancePolicy(model.getMaintenancePolicy());
            }
            if (model.wasPropertyExplicitlySet("additionalLanguagePacks")) {
                this.additionalLanguagePacks(model.getAdditionalLanguagePacks());
            }
            if (model.wasPropertyExplicitlySet("isIPv6DualStackEnabled")) {
                this.isIPv6DualStackEnabled(model.getIsIPv6DualStackEnabled());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** FusionEnvironment Identifier, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * FusionEnvironment Identifier, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** byok kms keyId */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * byok kms keyId
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
    private final MaintenancePolicy maintenancePolicy;

    public MaintenancePolicy getMaintenancePolicy() {
        return maintenancePolicy;
    }

    /** Language packs */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
    private final java.util.List<String> additionalLanguagePacks;

    /**
     * Language packs
     *
     * @return the value
     */
    public java.util.List<String> getAdditionalLanguagePacks() {
        return additionalLanguagePacks;
    }

    /**
     * Enable IPv4/IPv6 dual stack support for the environment. Setting to true will assign an IPv6
     * address to the environment in addition to an IPv4 address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIPv6DualStackEnabled")
    private final Boolean isIPv6DualStackEnabled;

    /**
     * Enable IPv4/IPv6 dual stack support for the environment. Setting to true will assign an IPv6
     * address to the environment in addition to an IPv4 address.
     *
     * @return the value
     */
    public Boolean getIsIPv6DualStackEnabled() {
        return isIPv6DualStackEnabled;
    }

    /**
     * Network access control rules to limit internet traffic that can access the environment. For
     * more information, see {@link #allowRule(AllowRuleRequest) allowRule}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<Rule> rules;

    /**
     * Network access control rules to limit internet traffic that can access the environment. For
     * more information, see {@link #allowRule(AllowRuleRequest) allowRule}.
     *
     * @return the value
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateFusionEnvironmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", maintenancePolicy=").append(String.valueOf(this.maintenancePolicy));
        sb.append(", additionalLanguagePacks=")
                .append(String.valueOf(this.additionalLanguagePacks));
        sb.append(", isIPv6DualStackEnabled=").append(String.valueOf(this.isIPv6DualStackEnabled));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFusionEnvironmentDetails)) {
            return false;
        }

        UpdateFusionEnvironmentDetails other = (UpdateFusionEnvironmentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.maintenancePolicy, other.maintenancePolicy)
                && java.util.Objects.equals(
                        this.additionalLanguagePacks, other.additionalLanguagePacks)
                && java.util.Objects.equals(
                        this.isIPv6DualStackEnabled, other.isIPv6DualStackEnabled)
                && java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenancePolicy == null ? 43 : this.maintenancePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalLanguagePacks == null
                                ? 43
                                : this.additionalLanguagePacks.hashCode());
        result =
                (result * PRIME)
                        + (this.isIPv6DualStackEnabled == null
                                ? 43
                                : this.isIPv6DualStackEnabled.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
