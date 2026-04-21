/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * email subdomain details for a marketing brand <br>
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
        builder = EmailSubdomainSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmailSubdomainSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "marketingBrandId",
        "fusionEnvironmentId",
        "lifecycleState",
        "lifecycleDetails",
        "dnsManagement",
        "dnsStatus",
        "certificateManagement",
        "certificateStatus",
        "timeCertificateExpiration",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public EmailSubdomainSummary(
            String id,
            String name,
            String marketingBrandId,
            String fusionEnvironmentId,
            EmailSubdomain.LifecycleState lifecycleState,
            EmailSubdomain.LifecycleDetails lifecycleDetails,
            EmailSubdomain.DnsManagement dnsManagement,
            EmailSubdomain.DnsStatus dnsStatus,
            EmailSubdomain.CertificateManagement certificateManagement,
            EmailSubdomain.CertificateStatus certificateStatus,
            java.util.Date timeCertificateExpiration,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.marketingBrandId = marketingBrandId;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.dnsManagement = dnsManagement;
        this.dnsStatus = dnsStatus;
        this.certificateManagement = certificateManagement;
        this.certificateStatus = certificateStatus;
        this.timeCertificateExpiration = timeCertificateExpiration;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier (OCID) of emailsubdomain. Can't be changed after creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of emailsubdomain. Can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** email subdomain name for a brand */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * email subdomain name for a brand
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Marketing Brand Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("marketingBrandId")
        private String marketingBrandId;

        /**
         * Marketing Brand Identifier
         *
         * @param marketingBrandId the value to set
         * @return this builder
         */
        public Builder marketingBrandId(String marketingBrandId) {
            this.marketingBrandId = marketingBrandId;
            this.__explicitlySet__.add("marketingBrandId");
            return this;
        }
        /** Fusion Environment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * Fusion Environment Identifier
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /** email subdomain lifecyclestate */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EmailSubdomain.LifecycleState lifecycleState;

        /**
         * email subdomain lifecyclestate
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(EmailSubdomain.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Intermediate state for Email subdomain */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private EmailSubdomain.LifecycleDetails lifecycleDetails;

        /**
         * Intermediate state for Email subdomain
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(EmailSubdomain.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** dns management type for email subdomain */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsManagement")
        private EmailSubdomain.DnsManagement dnsManagement;

        /**
         * dns management type for email subdomain
         *
         * @param dnsManagement the value to set
         * @return this builder
         */
        public Builder dnsManagement(EmailSubdomain.DnsManagement dnsManagement) {
            this.dnsManagement = dnsManagement;
            this.__explicitlySet__.add("dnsManagement");
            return this;
        }
        /** dns status for email subdomain */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsStatus")
        private EmailSubdomain.DnsStatus dnsStatus;

        /**
         * dns status for email subdomain
         *
         * @param dnsStatus the value to set
         * @return this builder
         */
        public Builder dnsStatus(EmailSubdomain.DnsStatus dnsStatus) {
            this.dnsStatus = dnsStatus;
            this.__explicitlySet__.add("dnsStatus");
            return this;
        }
        /** dns management type for email subdomain */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateManagement")
        private EmailSubdomain.CertificateManagement certificateManagement;

        /**
         * dns management type for email subdomain
         *
         * @param certificateManagement the value to set
         * @return this builder
         */
        public Builder certificateManagement(
                EmailSubdomain.CertificateManagement certificateManagement) {
            this.certificateManagement = certificateManagement;
            this.__explicitlySet__.add("certificateManagement");
            return this;
        }
        /** certificate status for email subdomain */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateStatus")
        private EmailSubdomain.CertificateStatus certificateStatus;

        /**
         * certificate status for email subdomain
         *
         * @param certificateStatus the value to set
         * @return this builder
         */
        public Builder certificateStatus(EmailSubdomain.CertificateStatus certificateStatus) {
            this.certificateStatus = certificateStatus;
            this.__explicitlySet__.add("certificateStatus");
            return this;
        }
        /** certification expiration date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCertificateExpiration")
        private java.util.Date timeCertificateExpiration;

        /**
         * certification expiration date
         *
         * @param timeCertificateExpiration the value to set
         * @return this builder
         */
        public Builder timeCertificateExpiration(java.util.Date timeCertificateExpiration) {
            this.timeCertificateExpiration = timeCertificateExpiration;
            this.__explicitlySet__.add("timeCertificateExpiration");
            return this;
        }
        /** The time the Email Subdomain was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Email Subdomain was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailSubdomainSummary build() {
            EmailSubdomainSummary model =
                    new EmailSubdomainSummary(
                            this.id,
                            this.name,
                            this.marketingBrandId,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dnsManagement,
                            this.dnsStatus,
                            this.certificateManagement,
                            this.certificateStatus,
                            this.timeCertificateExpiration,
                            this.timeCreated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailSubdomainSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("marketingBrandId")) {
                this.marketingBrandId(model.getMarketingBrandId());
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
            if (model.wasPropertyExplicitlySet("dnsManagement")) {
                this.dnsManagement(model.getDnsManagement());
            }
            if (model.wasPropertyExplicitlySet("dnsStatus")) {
                this.dnsStatus(model.getDnsStatus());
            }
            if (model.wasPropertyExplicitlySet("certificateManagement")) {
                this.certificateManagement(model.getCertificateManagement());
            }
            if (model.wasPropertyExplicitlySet("certificateStatus")) {
                this.certificateStatus(model.getCertificateStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCertificateExpiration")) {
                this.timeCertificateExpiration(model.getTimeCertificateExpiration());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The unique identifier (OCID) of emailsubdomain. Can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of emailsubdomain. Can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** email subdomain name for a brand */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * email subdomain name for a brand
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Marketing Brand Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("marketingBrandId")
    private final String marketingBrandId;

    /**
     * Marketing Brand Identifier
     *
     * @return the value
     */
    public String getMarketingBrandId() {
        return marketingBrandId;
    }

    /** Fusion Environment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * Fusion Environment Identifier
     *
     * @return the value
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /** email subdomain lifecyclestate */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final EmailSubdomain.LifecycleState lifecycleState;

    /**
     * email subdomain lifecyclestate
     *
     * @return the value
     */
    public EmailSubdomain.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Intermediate state for Email subdomain */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final EmailSubdomain.LifecycleDetails lifecycleDetails;

    /**
     * Intermediate state for Email subdomain
     *
     * @return the value
     */
    public EmailSubdomain.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** dns management type for email subdomain */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsManagement")
    private final EmailSubdomain.DnsManagement dnsManagement;

    /**
     * dns management type for email subdomain
     *
     * @return the value
     */
    public EmailSubdomain.DnsManagement getDnsManagement() {
        return dnsManagement;
    }

    /** dns status for email subdomain */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsStatus")
    private final EmailSubdomain.DnsStatus dnsStatus;

    /**
     * dns status for email subdomain
     *
     * @return the value
     */
    public EmailSubdomain.DnsStatus getDnsStatus() {
        return dnsStatus;
    }

    /** dns management type for email subdomain */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateManagement")
    private final EmailSubdomain.CertificateManagement certificateManagement;

    /**
     * dns management type for email subdomain
     *
     * @return the value
     */
    public EmailSubdomain.CertificateManagement getCertificateManagement() {
        return certificateManagement;
    }

    /** certificate status for email subdomain */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateStatus")
    private final EmailSubdomain.CertificateStatus certificateStatus;

    /**
     * certificate status for email subdomain
     *
     * @return the value
     */
    public EmailSubdomain.CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }

    /** certification expiration date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCertificateExpiration")
    private final java.util.Date timeCertificateExpiration;

    /**
     * certification expiration date
     *
     * @return the value
     */
    public java.util.Date getTimeCertificateExpiration() {
        return timeCertificateExpiration;
    }

    /** The time the Email Subdomain was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Email Subdomain was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("EmailSubdomainSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", marketingBrandId=").append(String.valueOf(this.marketingBrandId));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", dnsManagement=").append(String.valueOf(this.dnsManagement));
        sb.append(", dnsStatus=").append(String.valueOf(this.dnsStatus));
        sb.append(", certificateManagement=").append(String.valueOf(this.certificateManagement));
        sb.append(", certificateStatus=").append(String.valueOf(this.certificateStatus));
        sb.append(", timeCertificateExpiration=")
                .append(String.valueOf(this.timeCertificateExpiration));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailSubdomainSummary)) {
            return false;
        }

        EmailSubdomainSummary other = (EmailSubdomainSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.marketingBrandId, other.marketingBrandId)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.dnsManagement, other.dnsManagement)
                && java.util.Objects.equals(this.dnsStatus, other.dnsStatus)
                && java.util.Objects.equals(this.certificateManagement, other.certificateManagement)
                && java.util.Objects.equals(this.certificateStatus, other.certificateStatus)
                && java.util.Objects.equals(
                        this.timeCertificateExpiration, other.timeCertificateExpiration)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.marketingBrandId == null ? 43 : this.marketingBrandId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.dnsManagement == null ? 43 : this.dnsManagement.hashCode());
        result = (result * PRIME) + (this.dnsStatus == null ? 43 : this.dnsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateManagement == null
                                ? 43
                                : this.certificateManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateStatus == null ? 43 : this.certificateStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCertificateExpiration == null
                                ? 43
                                : this.timeCertificateExpiration.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
