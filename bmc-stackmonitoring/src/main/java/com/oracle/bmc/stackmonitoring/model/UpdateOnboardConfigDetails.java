/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Update configuration object, contains fields describing Onboarding customization: policies,
 * dynamic groups, user groups. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOnboardConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOnboardConfigDetails extends UpdateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** Assigned version to given onboard configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Assigned version to given onboard configuration.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** True if customer decides marks configuration as manually configured. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManuallyOnboarded")
        private Boolean isManuallyOnboarded;

        /**
         * True if customer decides marks configuration as manually configured.
         *
         * @param isManuallyOnboarded the value to set
         * @return this builder
         */
        public Builder isManuallyOnboarded(Boolean isManuallyOnboarded) {
            this.isManuallyOnboarded = isManuallyOnboarded;
            this.__explicitlySet__.add("isManuallyOnboarded");
            return this;
        }
        /** List of policy names assigned for onboarding */
        @com.fasterxml.jackson.annotation.JsonProperty("policyNames")
        private java.util.List<String> policyNames;

        /**
         * List of policy names assigned for onboarding
         *
         * @param policyNames the value to set
         * @return this builder
         */
        public Builder policyNames(java.util.List<String> policyNames) {
            this.policyNames = policyNames;
            this.__explicitlySet__.add("policyNames");
            return this;
        }
        /** List of dynamic groups dedicated for Stack Monitoring. */
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroups")
        private java.util.List<DynamicGroupDetails> dynamicGroups;

        /**
         * List of dynamic groups dedicated for Stack Monitoring.
         *
         * @param dynamicGroups the value to set
         * @return this builder
         */
        public Builder dynamicGroups(java.util.List<DynamicGroupDetails> dynamicGroups) {
            this.dynamicGroups = dynamicGroups;
            this.__explicitlySet__.add("dynamicGroups");
            return this;
        }
        /** List of user groups dedicated for Stack Monitoring. */
        @com.fasterxml.jackson.annotation.JsonProperty("userGroups")
        private java.util.List<GroupDetails> userGroups;

        /**
         * List of user groups dedicated for Stack Monitoring.
         *
         * @param userGroups the value to set
         * @return this builder
         */
        public Builder userGroups(java.util.List<GroupDetails> userGroups) {
            this.userGroups = userGroups;
            this.__explicitlySet__.add("userGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalConfigurations")
        private AdditionalConfigurationDetails additionalConfigurations;

        public Builder additionalConfigurations(
                AdditionalConfigurationDetails additionalConfigurations) {
            this.additionalConfigurations = additionalConfigurations;
            this.__explicitlySet__.add("additionalConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOnboardConfigDetails build() {
            UpdateOnboardConfigDetails model =
                    new UpdateOnboardConfigDetails(
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.version,
                            this.isManuallyOnboarded,
                            this.policyNames,
                            this.dynamicGroups,
                            this.userGroups,
                            this.additionalConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOnboardConfigDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isManuallyOnboarded")) {
                this.isManuallyOnboarded(model.getIsManuallyOnboarded());
            }
            if (model.wasPropertyExplicitlySet("policyNames")) {
                this.policyNames(model.getPolicyNames());
            }
            if (model.wasPropertyExplicitlySet("dynamicGroups")) {
                this.dynamicGroups(model.getDynamicGroups());
            }
            if (model.wasPropertyExplicitlySet("userGroups")) {
                this.userGroups(model.getUserGroups());
            }
            if (model.wasPropertyExplicitlySet("additionalConfigurations")) {
                this.additionalConfigurations(model.getAdditionalConfigurations());
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

    @Deprecated
    public UpdateOnboardConfigDetails(
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String version,
            Boolean isManuallyOnboarded,
            java.util.List<String> policyNames,
            java.util.List<DynamicGroupDetails> dynamicGroups,
            java.util.List<GroupDetails> userGroups,
            AdditionalConfigurationDetails additionalConfigurations) {
        super(displayName, freeformTags, definedTags);
        this.version = version;
        this.isManuallyOnboarded = isManuallyOnboarded;
        this.policyNames = policyNames;
        this.dynamicGroups = dynamicGroups;
        this.userGroups = userGroups;
        this.additionalConfigurations = additionalConfigurations;
    }

    /** Assigned version to given onboard configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Assigned version to given onboard configuration.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** True if customer decides marks configuration as manually configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManuallyOnboarded")
    private final Boolean isManuallyOnboarded;

    /**
     * True if customer decides marks configuration as manually configured.
     *
     * @return the value
     */
    public Boolean getIsManuallyOnboarded() {
        return isManuallyOnboarded;
    }

    /** List of policy names assigned for onboarding */
    @com.fasterxml.jackson.annotation.JsonProperty("policyNames")
    private final java.util.List<String> policyNames;

    /**
     * List of policy names assigned for onboarding
     *
     * @return the value
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /** List of dynamic groups dedicated for Stack Monitoring. */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroups")
    private final java.util.List<DynamicGroupDetails> dynamicGroups;

    /**
     * List of dynamic groups dedicated for Stack Monitoring.
     *
     * @return the value
     */
    public java.util.List<DynamicGroupDetails> getDynamicGroups() {
        return dynamicGroups;
    }

    /** List of user groups dedicated for Stack Monitoring. */
    @com.fasterxml.jackson.annotation.JsonProperty("userGroups")
    private final java.util.List<GroupDetails> userGroups;

    /**
     * List of user groups dedicated for Stack Monitoring.
     *
     * @return the value
     */
    public java.util.List<GroupDetails> getUserGroups() {
        return userGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalConfigurations")
    private final AdditionalConfigurationDetails additionalConfigurations;

    public AdditionalConfigurationDetails getAdditionalConfigurations() {
        return additionalConfigurations;
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
        sb.append("UpdateOnboardConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", isManuallyOnboarded=").append(String.valueOf(this.isManuallyOnboarded));
        sb.append(", policyNames=").append(String.valueOf(this.policyNames));
        sb.append(", dynamicGroups=").append(String.valueOf(this.dynamicGroups));
        sb.append(", userGroups=").append(String.valueOf(this.userGroups));
        sb.append(", additionalConfigurations=")
                .append(String.valueOf(this.additionalConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOnboardConfigDetails)) {
            return false;
        }

        UpdateOnboardConfigDetails other = (UpdateOnboardConfigDetails) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.isManuallyOnboarded, other.isManuallyOnboarded)
                && java.util.Objects.equals(this.policyNames, other.policyNames)
                && java.util.Objects.equals(this.dynamicGroups, other.dynamicGroups)
                && java.util.Objects.equals(this.userGroups, other.userGroups)
                && java.util.Objects.equals(
                        this.additionalConfigurations, other.additionalConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isManuallyOnboarded == null
                                ? 43
                                : this.isManuallyOnboarded.hashCode());
        result = (result * PRIME) + (this.policyNames == null ? 43 : this.policyNames.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicGroups == null ? 43 : this.dynamicGroups.hashCode());
        result = (result * PRIME) + (this.userGroups == null ? 43 : this.userGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalConfigurations == null
                                ? 43
                                : this.additionalConfigurations.hashCode());
        return result;
    }
}
