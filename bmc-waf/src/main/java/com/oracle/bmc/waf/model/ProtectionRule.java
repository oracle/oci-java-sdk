/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Rule that represents Request/Response Protection.
 * Only actions of the following types are allowed to be referenced in this rule:
 *  * CHECK
 *  * RETURN_HTTP_RESPONSE
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProtectionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProtectionRule extends WebAppFirewallPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguage")
        private ConditionLanguage conditionLanguage;

        public Builder conditionLanguage(ConditionLanguage conditionLanguage) {
            this.conditionLanguage = conditionLanguage;
            this.__explicitlySet__.add("conditionLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionName")
        private String actionName;

        public Builder actionName(String actionName) {
            this.actionName = actionName;
            this.__explicitlySet__.add("actionName");
            return this;
        }
        /**
         * An ordered list that references OCI-managed protection capabilities.
         * Referenced protection capabilities are not necessarily executed in order of appearance. Their execution order
         * is decided at runtime for improved performance.
         * The array cannot contain entries with the same pair of capability key and version more than once.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilities")
        private java.util.List<ProtectionCapability> protectionCapabilities;

        /**
         * An ordered list that references OCI-managed protection capabilities.
         * Referenced protection capabilities are not necessarily executed in order of appearance. Their execution order
         * is decided at runtime for improved performance.
         * The array cannot contain entries with the same pair of capability key and version more than once.
         *
         * @param protectionCapabilities the value to set
         * @return this builder
         **/
        public Builder protectionCapabilities(
                java.util.List<ProtectionCapability> protectionCapabilities) {
            this.protectionCapabilities = protectionCapabilities;
            this.__explicitlySet__.add("protectionCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilitySettings")
        private ProtectionCapabilitySettings protectionCapabilitySettings;

        public Builder protectionCapabilitySettings(
                ProtectionCapabilitySettings protectionCapabilitySettings) {
            this.protectionCapabilitySettings = protectionCapabilitySettings;
            this.__explicitlySet__.add("protectionCapabilitySettings");
            return this;
        }
        /**
         * Enables/disables body inspection for this protection rule.
         * Only Protection Rules in RequestProtection can have this option enabled. Response body inspection will
         * be available at a later date.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBodyInspectionEnabled")
        private Boolean isBodyInspectionEnabled;

        /**
         * Enables/disables body inspection for this protection rule.
         * Only Protection Rules in RequestProtection can have this option enabled. Response body inspection will
         * be available at a later date.
         *
         * @param isBodyInspectionEnabled the value to set
         * @return this builder
         **/
        public Builder isBodyInspectionEnabled(Boolean isBodyInspectionEnabled) {
            this.isBodyInspectionEnabled = isBodyInspectionEnabled;
            this.__explicitlySet__.add("isBodyInspectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRule build() {
            ProtectionRule model =
                    new ProtectionRule(
                            this.name,
                            this.conditionLanguage,
                            this.condition,
                            this.actionName,
                            this.protectionCapabilities,
                            this.protectionCapabilitySettings,
                            this.isBodyInspectionEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("conditionLanguage")) {
                this.conditionLanguage(model.getConditionLanguage());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("actionName")) {
                this.actionName(model.getActionName());
            }
            if (model.wasPropertyExplicitlySet("protectionCapabilities")) {
                this.protectionCapabilities(model.getProtectionCapabilities());
            }
            if (model.wasPropertyExplicitlySet("protectionCapabilitySettings")) {
                this.protectionCapabilitySettings(model.getProtectionCapabilitySettings());
            }
            if (model.wasPropertyExplicitlySet("isBodyInspectionEnabled")) {
                this.isBodyInspectionEnabled(model.getIsBodyInspectionEnabled());
            }
            return this;
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

    @Deprecated
    public ProtectionRule(
            String name,
            ConditionLanguage conditionLanguage,
            String condition,
            String actionName,
            java.util.List<ProtectionCapability> protectionCapabilities,
            ProtectionCapabilitySettings protectionCapabilitySettings,
            Boolean isBodyInspectionEnabled) {
        super(name, conditionLanguage, condition, actionName);
        this.protectionCapabilities = protectionCapabilities;
        this.protectionCapabilitySettings = protectionCapabilitySettings;
        this.isBodyInspectionEnabled = isBodyInspectionEnabled;
    }

    /**
     * An ordered list that references OCI-managed protection capabilities.
     * Referenced protection capabilities are not necessarily executed in order of appearance. Their execution order
     * is decided at runtime for improved performance.
     * The array cannot contain entries with the same pair of capability key and version more than once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilities")
    private final java.util.List<ProtectionCapability> protectionCapabilities;

    /**
     * An ordered list that references OCI-managed protection capabilities.
     * Referenced protection capabilities are not necessarily executed in order of appearance. Their execution order
     * is decided at runtime for improved performance.
     * The array cannot contain entries with the same pair of capability key and version more than once.
     *
     * @return the value
     **/
    public java.util.List<ProtectionCapability> getProtectionCapabilities() {
        return protectionCapabilities;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilitySettings")
    private final ProtectionCapabilitySettings protectionCapabilitySettings;

    public ProtectionCapabilitySettings getProtectionCapabilitySettings() {
        return protectionCapabilitySettings;
    }

    /**
     * Enables/disables body inspection for this protection rule.
     * Only Protection Rules in RequestProtection can have this option enabled. Response body inspection will
     * be available at a later date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBodyInspectionEnabled")
    private final Boolean isBodyInspectionEnabled;

    /**
     * Enables/disables body inspection for this protection rule.
     * Only Protection Rules in RequestProtection can have this option enabled. Response body inspection will
     * be available at a later date.
     *
     * @return the value
     **/
    public Boolean getIsBodyInspectionEnabled() {
        return isBodyInspectionEnabled;
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
        sb.append("ProtectionRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", protectionCapabilities=").append(String.valueOf(this.protectionCapabilities));
        sb.append(", protectionCapabilitySettings=")
                .append(String.valueOf(this.protectionCapabilitySettings));
        sb.append(", isBodyInspectionEnabled=")
                .append(String.valueOf(this.isBodyInspectionEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionRule)) {
            return false;
        }

        ProtectionRule other = (ProtectionRule) o;
        return java.util.Objects.equals(this.protectionCapabilities, other.protectionCapabilities)
                && java.util.Objects.equals(
                        this.protectionCapabilitySettings, other.protectionCapabilitySettings)
                && java.util.Objects.equals(
                        this.isBodyInspectionEnabled, other.isBodyInspectionEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.protectionCapabilities == null
                                ? 43
                                : this.protectionCapabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionCapabilitySettings == null
                                ? 43
                                : this.protectionCapabilitySettings.hashCode());
        result =
                (result * PRIME)
                        + (this.isBodyInspectionEnabled == null
                                ? 43
                                : this.isBodyInspectionEnabled.hashCode());
        return result;
    }
}
