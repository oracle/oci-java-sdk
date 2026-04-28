/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Vanity Domain resource <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VanityDomain.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VanityDomain extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "originCertRequestType",
        "cdnCertRequestType",
        "dnsManagedBy",
        "certificateInfo",
        "changeManagementLink",
        "scheduledActivityId",
        "customerDnsRecords",
        "isDnsStatusReady",
        "isOriginCertStatusReady",
        "originCertStatus",
        "timeOriginCertExpired",
        "isCdnCertStatusReady",
        "cdnCertStatus",
        "timeCdnCertExpired",
        "systemTags",
        "freeformTags",
        "definedTags"
    })
    public VanityDomain(
            String id,
            String vanityDomain,
            String prefix,
            String fusionEnvironmentId,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeEnabled,
            OriginCertRequestType originCertRequestType,
            CdnCertRequestType cdnCertRequestType,
            DnsManagedBy dnsManagedBy,
            CertificateInfo certificateInfo,
            String changeManagementLink,
            String scheduledActivityId,
            java.util.List<VanityDnsRecord> customerDnsRecords,
            Boolean isDnsStatusReady,
            Boolean isOriginCertStatusReady,
            OriginCertStatus originCertStatus,
            java.util.Date timeOriginCertExpired,
            Boolean isCdnCertStatusReady,
            CdnCertStatus cdnCertStatus,
            java.util.Date timeCdnCertExpired,
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
        this.originCertRequestType = originCertRequestType;
        this.cdnCertRequestType = cdnCertRequestType;
        this.dnsManagedBy = dnsManagedBy;
        this.certificateInfo = certificateInfo;
        this.changeManagementLink = changeManagementLink;
        this.scheduledActivityId = scheduledActivityId;
        this.customerDnsRecords = customerDnsRecords;
        this.isDnsStatusReady = isDnsStatusReady;
        this.isOriginCertStatusReady = isOriginCertStatusReady;
        this.originCertStatus = originCertStatus;
        this.timeOriginCertExpired = timeOriginCertExpired;
        this.isCdnCertStatusReady = isCdnCertStatusReady;
        this.cdnCertStatus = cdnCertStatus;
        this.timeCdnCertExpired = timeCdnCertExpired;
        this.systemTags = systemTags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier (OCID) of the VanityDomain. Can't be changed after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Vanity domain */
        @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
        private String vanityDomain;

        /**
         * Vanity domain
         *
         * @param vanityDomain the value to set
         * @return this builder
         */
        public Builder vanityDomain(String vanityDomain) {
            this.vanityDomain = vanityDomain;
            this.__explicitlySet__.add("vanityDomain");
            return this;
        }
        /** The prefix value of the DnsPrefix. Can't be changed after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The prefix value of the DnsPrefix. Can't be changed after creation
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /** The OCID of the Fusion environment that the VanityDomain is created on */
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * The OCID of the Fusion environment that the VanityDomain is created on
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /** The current lifecycleState of the VanityDomain */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycleState of the VanityDomain
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The current lifecycleDetails of the VanityDomain */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The current lifecycleDetails of the VanityDomain
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The time the VanityDomain was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the VanityDomain was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the VanityDomain was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the VanityDomain was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
         *
         * @param timeEnabled the value to set
         * @return this builder
         */
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }
        /** The origin request type for which the certificate is generated */
        @com.fasterxml.jackson.annotation.JsonProperty("originCertRequestType")
        private OriginCertRequestType originCertRequestType;

        /**
         * The origin request type for which the certificate is generated
         *
         * @param originCertRequestType the value to set
         * @return this builder
         */
        public Builder originCertRequestType(OriginCertRequestType originCertRequestType) {
            this.originCertRequestType = originCertRequestType;
            this.__explicitlySet__.add("originCertRequestType");
            return this;
        }
        /** The cdn request type for which the certificate is generated */
        @com.fasterxml.jackson.annotation.JsonProperty("cdnCertRequestType")
        private CdnCertRequestType cdnCertRequestType;

        /**
         * The cdn request type for which the certificate is generated
         *
         * @param cdnCertRequestType the value to set
         * @return this builder
         */
        public Builder cdnCertRequestType(CdnCertRequestType cdnCertRequestType) {
            this.cdnCertRequestType = cdnCertRequestType;
            this.__explicitlySet__.add("cdnCertRequestType");
            return this;
        }
        /** The dns is managed by the customer or Oracle */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsManagedBy")
        private DnsManagedBy dnsManagedBy;

        /**
         * The dns is managed by the customer or Oracle
         *
         * @param dnsManagedBy the value to set
         * @return this builder
         */
        public Builder dnsManagedBy(DnsManagedBy dnsManagedBy) {
            this.dnsManagedBy = dnsManagedBy;
            this.__explicitlySet__.add("dnsManagedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateInfo")
        private CertificateInfo certificateInfo;

        public Builder certificateInfo(CertificateInfo certificateInfo) {
            this.certificateInfo = certificateInfo;
            this.__explicitlySet__.add("certificateInfo");
            return this;
        }
        /** The cm link that was used to create the DNS prefix */
        @com.fasterxml.jackson.annotation.JsonProperty("changeManagementLink")
        private String changeManagementLink;

        /**
         * The cm link that was used to create the DNS prefix
         *
         * @param changeManagementLink the value to set
         * @return this builder
         */
        public Builder changeManagementLink(String changeManagementLink) {
            this.changeManagementLink = changeManagementLink;
            this.__explicitlySet__.add("changeManagementLink");
            return this;
        }
        /** The ID of the VanityDomainActivity is scheduled */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledActivityId")
        private String scheduledActivityId;

        /**
         * The ID of the VanityDomainActivity is scheduled
         *
         * @param scheduledActivityId the value to set
         * @return this builder
         */
        public Builder scheduledActivityId(String scheduledActivityId) {
            this.scheduledActivityId = scheduledActivityId;
            this.__explicitlySet__.add("scheduledActivityId");
            return this;
        }
        /** List of dns records, comma separated */
        @com.fasterxml.jackson.annotation.JsonProperty("customerDnsRecords")
        private java.util.List<VanityDnsRecord> customerDnsRecords;

        /**
         * List of dns records, comma separated
         *
         * @param customerDnsRecords the value to set
         * @return this builder
         */
        public Builder customerDnsRecords(java.util.List<VanityDnsRecord> customerDnsRecords) {
            this.customerDnsRecords = customerDnsRecords;
            this.__explicitlySet__.add("customerDnsRecords");
            return this;
        }
        /** Identify if this dns is inactive or active */
        @com.fasterxml.jackson.annotation.JsonProperty("isDnsStatusReady")
        private Boolean isDnsStatusReady;

        /**
         * Identify if this dns is inactive or active
         *
         * @param isDnsStatusReady the value to set
         * @return this builder
         */
        public Builder isDnsStatusReady(Boolean isDnsStatusReady) {
            this.isDnsStatusReady = isDnsStatusReady;
            this.__explicitlySet__.add("isDnsStatusReady");
            return this;
        }
        /** Identify if this origin cert is inactive or active */
        @com.fasterxml.jackson.annotation.JsonProperty("isOriginCertStatusReady")
        private Boolean isOriginCertStatusReady;

        /**
         * Identify if this origin cert is inactive or active
         *
         * @param isOriginCertStatusReady the value to set
         * @return this builder
         */
        public Builder isOriginCertStatusReady(Boolean isOriginCertStatusReady) {
            this.isOriginCertStatusReady = isOriginCertStatusReady;
            this.__explicitlySet__.add("isOriginCertStatusReady");
            return this;
        }
        /** The origin cert status */
        @com.fasterxml.jackson.annotation.JsonProperty("originCertStatus")
        private OriginCertStatus originCertStatus;

        /**
         * The origin cert status
         *
         * @param originCertStatus the value to set
         * @return this builder
         */
        public Builder originCertStatus(OriginCertStatus originCertStatus) {
            this.originCertStatus = originCertStatus;
            this.__explicitlySet__.add("originCertStatus");
            return this;
        }
        /** The origin cert expiry date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOriginCertExpired")
        private java.util.Date timeOriginCertExpired;

        /**
         * The origin cert expiry date
         *
         * @param timeOriginCertExpired the value to set
         * @return this builder
         */
        public Builder timeOriginCertExpired(java.util.Date timeOriginCertExpired) {
            this.timeOriginCertExpired = timeOriginCertExpired;
            this.__explicitlySet__.add("timeOriginCertExpired");
            return this;
        }
        /** Identify if this cdn cert is inactive or active */
        @com.fasterxml.jackson.annotation.JsonProperty("isCdnCertStatusReady")
        private Boolean isCdnCertStatusReady;

        /**
         * Identify if this cdn cert is inactive or active
         *
         * @param isCdnCertStatusReady the value to set
         * @return this builder
         */
        public Builder isCdnCertStatusReady(Boolean isCdnCertStatusReady) {
            this.isCdnCertStatusReady = isCdnCertStatusReady;
            this.__explicitlySet__.add("isCdnCertStatusReady");
            return this;
        }
        /** The cdn cert status */
        @com.fasterxml.jackson.annotation.JsonProperty("cdnCertStatus")
        private CdnCertStatus cdnCertStatus;

        /**
         * The cdn cert status
         *
         * @param cdnCertStatus the value to set
         * @return this builder
         */
        public Builder cdnCertStatus(CdnCertStatus cdnCertStatus) {
            this.cdnCertStatus = cdnCertStatus;
            this.__explicitlySet__.add("cdnCertStatus");
            return this;
        }
        /** The cdn cert expiry date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCdnCertExpired")
        private java.util.Date timeCdnCertExpired;

        /**
         * The cdn cert expiry date
         *
         * @param timeCdnCertExpired the value to set
         * @return this builder
         */
        public Builder timeCdnCertExpired(java.util.Date timeCdnCertExpired) {
            this.timeCdnCertExpired = timeCdnCertExpired;
            this.__explicitlySet__.add("timeCdnCertExpired");
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

        public VanityDomain build() {
            VanityDomain model =
                    new VanityDomain(
                            this.id,
                            this.vanityDomain,
                            this.prefix,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeEnabled,
                            this.originCertRequestType,
                            this.cdnCertRequestType,
                            this.dnsManagedBy,
                            this.certificateInfo,
                            this.changeManagementLink,
                            this.scheduledActivityId,
                            this.customerDnsRecords,
                            this.isDnsStatusReady,
                            this.isOriginCertStatusReady,
                            this.originCertStatus,
                            this.timeOriginCertExpired,
                            this.isCdnCertStatusReady,
                            this.cdnCertStatus,
                            this.timeCdnCertExpired,
                            this.systemTags,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityDomain model) {
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
            if (model.wasPropertyExplicitlySet("originCertRequestType")) {
                this.originCertRequestType(model.getOriginCertRequestType());
            }
            if (model.wasPropertyExplicitlySet("cdnCertRequestType")) {
                this.cdnCertRequestType(model.getCdnCertRequestType());
            }
            if (model.wasPropertyExplicitlySet("dnsManagedBy")) {
                this.dnsManagedBy(model.getDnsManagedBy());
            }
            if (model.wasPropertyExplicitlySet("certificateInfo")) {
                this.certificateInfo(model.getCertificateInfo());
            }
            if (model.wasPropertyExplicitlySet("changeManagementLink")) {
                this.changeManagementLink(model.getChangeManagementLink());
            }
            if (model.wasPropertyExplicitlySet("scheduledActivityId")) {
                this.scheduledActivityId(model.getScheduledActivityId());
            }
            if (model.wasPropertyExplicitlySet("customerDnsRecords")) {
                this.customerDnsRecords(model.getCustomerDnsRecords());
            }
            if (model.wasPropertyExplicitlySet("isDnsStatusReady")) {
                this.isDnsStatusReady(model.getIsDnsStatusReady());
            }
            if (model.wasPropertyExplicitlySet("isOriginCertStatusReady")) {
                this.isOriginCertStatusReady(model.getIsOriginCertStatusReady());
            }
            if (model.wasPropertyExplicitlySet("originCertStatus")) {
                this.originCertStatus(model.getOriginCertStatus());
            }
            if (model.wasPropertyExplicitlySet("timeOriginCertExpired")) {
                this.timeOriginCertExpired(model.getTimeOriginCertExpired());
            }
            if (model.wasPropertyExplicitlySet("isCdnCertStatusReady")) {
                this.isCdnCertStatusReady(model.getIsCdnCertStatusReady());
            }
            if (model.wasPropertyExplicitlySet("cdnCertStatus")) {
                this.cdnCertStatus(model.getCdnCertStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCdnCertExpired")) {
                this.timeCdnCertExpired(model.getTimeCdnCertExpired());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The unique identifier (OCID) of the VanityDomain. Can't be changed after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the VanityDomain. Can't be changed after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Vanity domain */
    @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
    private final String vanityDomain;

    /**
     * Vanity domain
     *
     * @return the value
     */
    public String getVanityDomain() {
        return vanityDomain;
    }

    /** The prefix value of the DnsPrefix. Can't be changed after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The prefix value of the DnsPrefix. Can't be changed after creation
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /** The OCID of the Fusion environment that the VanityDomain is created on */
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * The OCID of the Fusion environment that the VanityDomain is created on
     *
     * @return the value
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /** The current lifecycleState of the VanityDomain */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Inactive("INACTIVE"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycleState of the VanityDomain */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycleState of the VanityDomain
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current lifecycleDetails of the VanityDomain */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        DomainValidationInProgress("DOMAIN_VALIDATION_IN_PROGRESS"),
        DomainValidationCompleted("DOMAIN_VALIDATION_COMPLETED"),
        DomainValidationFailed("DOMAIN_VALIDATION_FAILED"),
        CertConfigInProgress("CERT_CONFIG_IN_PROGRESS"),
        CertConfigCompleted("CERT_CONFIG_COMPLETED"),
        CertConfigFailed("CERT_CONFIG_FAILED"),
        EnableScheduled("ENABLE_SCHEDULED"),
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        EnableFailed("ENABLE_FAILED"),
        EnableCancelled("ENABLE_CANCELLED"),
        DeleteFailed("DELETE_FAILED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycleDetails of the VanityDomain */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The current lifecycleDetails of the VanityDomain
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The time the VanityDomain was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the VanityDomain was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the VanityDomain was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the VanityDomain was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The time the VanityDomain is scheduled to enable. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
    }

    /** The origin request type for which the certificate is generated */
    public enum OriginCertRequestType implements com.oracle.bmc.http.internal.BmcEnum {
        RequestCsr("REQUEST_CSR"),
        RequestDv("REQUEST_DV"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OriginCertRequestType.class);

        private final String value;
        private static java.util.Map<String, OriginCertRequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (OriginCertRequestType v : OriginCertRequestType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OriginCertRequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OriginCertRequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OriginCertRequestType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The origin request type for which the certificate is generated */
    @com.fasterxml.jackson.annotation.JsonProperty("originCertRequestType")
    private final OriginCertRequestType originCertRequestType;

    /**
     * The origin request type for which the certificate is generated
     *
     * @return the value
     */
    public OriginCertRequestType getOriginCertRequestType() {
        return originCertRequestType;
    }

    /** The cdn request type for which the certificate is generated */
    public enum CdnCertRequestType implements com.oracle.bmc.http.internal.BmcEnum {
        RequestCsr("REQUEST_CSR"),
        RequestDv("REQUEST_DV"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CdnCertRequestType.class);

        private final String value;
        private static java.util.Map<String, CdnCertRequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (CdnCertRequestType v : CdnCertRequestType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CdnCertRequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CdnCertRequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CdnCertRequestType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The cdn request type for which the certificate is generated */
    @com.fasterxml.jackson.annotation.JsonProperty("cdnCertRequestType")
    private final CdnCertRequestType cdnCertRequestType;

    /**
     * The cdn request type for which the certificate is generated
     *
     * @return the value
     */
    public CdnCertRequestType getCdnCertRequestType() {
        return cdnCertRequestType;
    }

    /** The dns is managed by the customer or Oracle */
    public enum DnsManagedBy implements com.oracle.bmc.http.internal.BmcEnum {
        OracleManaged("ORACLE_MANAGED"),
        CustomerManaged("CUSTOMER_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DnsManagedBy.class);

        private final String value;
        private static java.util.Map<String, DnsManagedBy> map;

        static {
            map = new java.util.HashMap<>();
            for (DnsManagedBy v : DnsManagedBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DnsManagedBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DnsManagedBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DnsManagedBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The dns is managed by the customer or Oracle */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsManagedBy")
    private final DnsManagedBy dnsManagedBy;

    /**
     * The dns is managed by the customer or Oracle
     *
     * @return the value
     */
    public DnsManagedBy getDnsManagedBy() {
        return dnsManagedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateInfo")
    private final CertificateInfo certificateInfo;

    public CertificateInfo getCertificateInfo() {
        return certificateInfo;
    }

    /** The cm link that was used to create the DNS prefix */
    @com.fasterxml.jackson.annotation.JsonProperty("changeManagementLink")
    private final String changeManagementLink;

    /**
     * The cm link that was used to create the DNS prefix
     *
     * @return the value
     */
    public String getChangeManagementLink() {
        return changeManagementLink;
    }

    /** The ID of the VanityDomainActivity is scheduled */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledActivityId")
    private final String scheduledActivityId;

    /**
     * The ID of the VanityDomainActivity is scheduled
     *
     * @return the value
     */
    public String getScheduledActivityId() {
        return scheduledActivityId;
    }

    /** List of dns records, comma separated */
    @com.fasterxml.jackson.annotation.JsonProperty("customerDnsRecords")
    private final java.util.List<VanityDnsRecord> customerDnsRecords;

    /**
     * List of dns records, comma separated
     *
     * @return the value
     */
    public java.util.List<VanityDnsRecord> getCustomerDnsRecords() {
        return customerDnsRecords;
    }

    /** Identify if this dns is inactive or active */
    @com.fasterxml.jackson.annotation.JsonProperty("isDnsStatusReady")
    private final Boolean isDnsStatusReady;

    /**
     * Identify if this dns is inactive or active
     *
     * @return the value
     */
    public Boolean getIsDnsStatusReady() {
        return isDnsStatusReady;
    }

    /** Identify if this origin cert is inactive or active */
    @com.fasterxml.jackson.annotation.JsonProperty("isOriginCertStatusReady")
    private final Boolean isOriginCertStatusReady;

    /**
     * Identify if this origin cert is inactive or active
     *
     * @return the value
     */
    public Boolean getIsOriginCertStatusReady() {
        return isOriginCertStatusReady;
    }

    /** The origin cert status */
    public enum OriginCertStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Expiring("EXPIRING"),
        Expired("EXPIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OriginCertStatus.class);

        private final String value;
        private static java.util.Map<String, OriginCertStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OriginCertStatus v : OriginCertStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OriginCertStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OriginCertStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OriginCertStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The origin cert status */
    @com.fasterxml.jackson.annotation.JsonProperty("originCertStatus")
    private final OriginCertStatus originCertStatus;

    /**
     * The origin cert status
     *
     * @return the value
     */
    public OriginCertStatus getOriginCertStatus() {
        return originCertStatus;
    }

    /** The origin cert expiry date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOriginCertExpired")
    private final java.util.Date timeOriginCertExpired;

    /**
     * The origin cert expiry date
     *
     * @return the value
     */
    public java.util.Date getTimeOriginCertExpired() {
        return timeOriginCertExpired;
    }

    /** Identify if this cdn cert is inactive or active */
    @com.fasterxml.jackson.annotation.JsonProperty("isCdnCertStatusReady")
    private final Boolean isCdnCertStatusReady;

    /**
     * Identify if this cdn cert is inactive or active
     *
     * @return the value
     */
    public Boolean getIsCdnCertStatusReady() {
        return isCdnCertStatusReady;
    }

    /** The cdn cert status */
    public enum CdnCertStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Expiring("EXPIRING"),
        Expired("EXPIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CdnCertStatus.class);

        private final String value;
        private static java.util.Map<String, CdnCertStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (CdnCertStatus v : CdnCertStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CdnCertStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CdnCertStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CdnCertStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The cdn cert status */
    @com.fasterxml.jackson.annotation.JsonProperty("cdnCertStatus")
    private final CdnCertStatus cdnCertStatus;

    /**
     * The cdn cert status
     *
     * @return the value
     */
    public CdnCertStatus getCdnCertStatus() {
        return cdnCertStatus;
    }

    /** The cdn cert expiry date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCdnCertExpired")
    private final java.util.Date timeCdnCertExpired;

    /**
     * The cdn cert expiry date
     *
     * @return the value
     */
    public java.util.Date getTimeCdnCertExpired() {
        return timeCdnCertExpired;
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
        sb.append("VanityDomain(");
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
        sb.append(", originCertRequestType=").append(String.valueOf(this.originCertRequestType));
        sb.append(", cdnCertRequestType=").append(String.valueOf(this.cdnCertRequestType));
        sb.append(", dnsManagedBy=").append(String.valueOf(this.dnsManagedBy));
        sb.append(", certificateInfo=").append(String.valueOf(this.certificateInfo));
        sb.append(", changeManagementLink=").append(String.valueOf(this.changeManagementLink));
        sb.append(", scheduledActivityId=").append(String.valueOf(this.scheduledActivityId));
        sb.append(", customerDnsRecords=").append(String.valueOf(this.customerDnsRecords));
        sb.append(", isDnsStatusReady=").append(String.valueOf(this.isDnsStatusReady));
        sb.append(", isOriginCertStatusReady=")
                .append(String.valueOf(this.isOriginCertStatusReady));
        sb.append(", originCertStatus=").append(String.valueOf(this.originCertStatus));
        sb.append(", timeOriginCertExpired=").append(String.valueOf(this.timeOriginCertExpired));
        sb.append(", isCdnCertStatusReady=").append(String.valueOf(this.isCdnCertStatusReady));
        sb.append(", cdnCertStatus=").append(String.valueOf(this.cdnCertStatus));
        sb.append(", timeCdnCertExpired=").append(String.valueOf(this.timeCdnCertExpired));
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
        if (!(o instanceof VanityDomain)) {
            return false;
        }

        VanityDomain other = (VanityDomain) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vanityDomain, other.vanityDomain)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && java.util.Objects.equals(this.originCertRequestType, other.originCertRequestType)
                && java.util.Objects.equals(this.cdnCertRequestType, other.cdnCertRequestType)
                && java.util.Objects.equals(this.dnsManagedBy, other.dnsManagedBy)
                && java.util.Objects.equals(this.certificateInfo, other.certificateInfo)
                && java.util.Objects.equals(this.changeManagementLink, other.changeManagementLink)
                && java.util.Objects.equals(this.scheduledActivityId, other.scheduledActivityId)
                && java.util.Objects.equals(this.customerDnsRecords, other.customerDnsRecords)
                && java.util.Objects.equals(this.isDnsStatusReady, other.isDnsStatusReady)
                && java.util.Objects.equals(
                        this.isOriginCertStatusReady, other.isOriginCertStatusReady)
                && java.util.Objects.equals(this.originCertStatus, other.originCertStatus)
                && java.util.Objects.equals(this.timeOriginCertExpired, other.timeOriginCertExpired)
                && java.util.Objects.equals(this.isCdnCertStatusReady, other.isCdnCertStatusReady)
                && java.util.Objects.equals(this.cdnCertStatus, other.cdnCertStatus)
                && java.util.Objects.equals(this.timeCdnCertExpired, other.timeCdnCertExpired)
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
                        + (this.originCertRequestType == null
                                ? 43
                                : this.originCertRequestType.hashCode());
        result =
                (result * PRIME)
                        + (this.cdnCertRequestType == null
                                ? 43
                                : this.cdnCertRequestType.hashCode());
        result = (result * PRIME) + (this.dnsManagedBy == null ? 43 : this.dnsManagedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateInfo == null ? 43 : this.certificateInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.changeManagementLink == null
                                ? 43
                                : this.changeManagementLink.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledActivityId == null
                                ? 43
                                : this.scheduledActivityId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerDnsRecords == null
                                ? 43
                                : this.customerDnsRecords.hashCode());
        result =
                (result * PRIME)
                        + (this.isDnsStatusReady == null ? 43 : this.isDnsStatusReady.hashCode());
        result =
                (result * PRIME)
                        + (this.isOriginCertStatusReady == null
                                ? 43
                                : this.isOriginCertStatusReady.hashCode());
        result =
                (result * PRIME)
                        + (this.originCertStatus == null ? 43 : this.originCertStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOriginCertExpired == null
                                ? 43
                                : this.timeOriginCertExpired.hashCode());
        result =
                (result * PRIME)
                        + (this.isCdnCertStatusReady == null
                                ? 43
                                : this.isCdnCertStatusReady.hashCode());
        result =
                (result * PRIME)
                        + (this.cdnCertStatus == null ? 43 : this.cdnCertStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCdnCertExpired == null
                                ? 43
                                : this.timeCdnCertExpired.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
