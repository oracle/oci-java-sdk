/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Summary of the VanityDomain
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VanityDomainSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VanityDomainSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "vanityDomain",
        "prefix",
        "fusionEnvironmentId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "timeEnabled",
        "scheduledActivityId",
        "systemTags",
        "freeformTags",
        "definedTags"
    })
    public VanityDomainSummary(
            String id,
            String vanityDomain,
            String prefix,
            String fusionEnvironmentId,
            VanityDomain.LifecycleState lifecycleState,
            VanityDomain.LifecycleDetails lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeEnabled,
            String scheduledActivityId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.vanityDomain = vanityDomain;
        this.prefix = prefix;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEnabled = timeEnabled;
        this.scheduledActivityId = scheduledActivityId;
        this.systemTags = systemTags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Vanity domain. Can't be changed after creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
        private String vanityDomain;

        /**
         * Vanity domain. Can't be changed after creation
         * @param vanityDomain the value to set
         * @return this builder
         **/
        public Builder vanityDomain(String vanityDomain) {
            this.vanityDomain = vanityDomain;
            this.__explicitlySet__.add("vanityDomain");
            return this;
        }
        /**
         * The prefix value of the DnsPrefix. Can't be changed after creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The prefix value of the DnsPrefix. Can't be changed after creation
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The OCID of the Fusion environment that the VanityDomain is created on
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * The OCID of the Fusion environment that the VanityDomain is created on
         * @param fusionEnvironmentId the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /**
         * The current lifecycleState of the VanityDomain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private VanityDomain.LifecycleState lifecycleState;

        /**
         * The current lifecycleState of the VanityDomain
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(VanityDomain.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current lifecycleDetails of the VanityDomain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private VanityDomain.LifecycleDetails lifecycleDetails;

        /**
         * The current lifecycleDetails of the VanityDomain
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(VanityDomain.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time the VanityDomain was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the VanityDomain was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the VanityDomain was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the VanityDomain was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
         * @param timeEnabled the value to set
         * @return this builder
         **/
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }
        /**
         * The ID of the VanityDomainActivity is scheduled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledActivityId")
        private String scheduledActivityId;

        /**
         * The ID of the VanityDomainActivity is scheduled
         * @param scheduledActivityId the value to set
         * @return this builder
         **/
        public Builder scheduledActivityId(String scheduledActivityId) {
            this.scheduledActivityId = scheduledActivityId;
            this.__explicitlySet__.add("scheduledActivityId");
            return this;
        }
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanityDomainSummary build() {
            VanityDomainSummary model =
                    new VanityDomainSummary(
                            this.id,
                            this.vanityDomain,
                            this.prefix,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeEnabled,
                            this.scheduledActivityId,
                            this.systemTags,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityDomainSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("vanityDomain")) {
                this.vanityDomain(model.getVanityDomain());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentId")) {
                this.fusionEnvironmentId(model.getFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeEnabled")) {
                this.timeEnabled(model.getTimeEnabled());
            }
            if (model.wasPropertyExplicitlySet("scheduledActivityId")) {
                this.scheduledActivityId(model.getScheduledActivityId());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Vanity domain. Can't be changed after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
    private final String vanityDomain;

    /**
     * Vanity domain. Can't be changed after creation
     * @return the value
     **/
    public String getVanityDomain() {
        return vanityDomain;
    }

    /**
     * The prefix value of the DnsPrefix. Can't be changed after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The prefix value of the DnsPrefix. Can't be changed after creation
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * The OCID of the Fusion environment that the VanityDomain is created on
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * The OCID of the Fusion environment that the VanityDomain is created on
     * @return the value
     **/
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /**
     * The current lifecycleState of the VanityDomain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final VanityDomain.LifecycleState lifecycleState;

    /**
     * The current lifecycleState of the VanityDomain
     * @return the value
     **/
    public VanityDomain.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current lifecycleDetails of the VanityDomain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final VanityDomain.LifecycleDetails lifecycleDetails;

    /**
     * The current lifecycleDetails of the VanityDomain
     * @return the value
     **/
    public VanityDomain.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time the VanityDomain was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the VanityDomain was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the VanityDomain was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the VanityDomain was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
    }

    /**
     * The ID of the VanityDomainActivity is scheduled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledActivityId")
    private final String scheduledActivityId;

    /**
     * The ID of the VanityDomainActivity is scheduled
     * @return the value
     **/
    public String getScheduledActivityId() {
        return scheduledActivityId;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("VanityDomainSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", vanityDomain=").append(String.valueOf(this.vanityDomain));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeEnabled=").append(String.valueOf(this.timeEnabled));
        sb.append(", scheduledActivityId=").append(String.valueOf(this.scheduledActivityId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
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
        if (!(o instanceof VanityDomainSummary)) {
            return false;
        }

        VanityDomainSummary other = (VanityDomainSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vanityDomain, other.vanityDomain)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && java.util.Objects.equals(this.scheduledActivityId, other.scheduledActivityId)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.vanityDomain == null ? 43 : this.vanityDomain.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeEnabled == null ? 43 : this.timeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledActivityId == null
                                ? 43
                                : this.scheduledActivityId.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
