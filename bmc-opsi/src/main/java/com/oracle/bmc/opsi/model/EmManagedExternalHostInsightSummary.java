/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of an EM-managed external host insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmManagedExternalHostInsightSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmManagedExternalHostInsightSummary extends HostInsightSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostDisplayName")
        private String hostDisplayName;

        public Builder hostDisplayName(String hostDisplayName) {
            this.hostDisplayName = hostDisplayName;
            this.__explicitlySet__.add("hostDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostType")
        private String hostType;

        public Builder hostType(String hostType) {
            this.hostType = hostType;
            this.__explicitlySet__.add("hostType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
        private String opsiPrivateEndpointId;

        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
            this.__explicitlySet__.add("opsiPrivateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Enterprise Manager Unique Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        /**
         * Enterprise Manager Unique Identifier
         * @param enterpriseManagerIdentifier the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }
        /**
         * Enterprise Manager Entity Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        /**
         * Enterprise Manager Entity Name
         * @param enterpriseManagerEntityName the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
            return this;
        }
        /**
         * Enterprise Manager Entity Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        /**
         * Enterprise Manager Entity Type
         * @param enterpriseManagerEntityType the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }
        /**
         * Enterprise Manager Entity Unique Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        /**
         * Enterprise Manager Entity Unique Identifier
         * @param enterpriseManagerEntityIdentifier the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }
        /**
         * Enterprise Manager Entity Display Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
        private String enterpriseManagerEntityDisplayName;

        /**
         * Enterprise Manager Entity Display Name
         * @param enterpriseManagerEntityDisplayName the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityDisplayName(
                String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
            this.__explicitlySet__.add("enterpriseManagerEntityDisplayName");
            return this;
        }
        /**
         * OPSI Enterprise Manager Bridge OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        /**
         * OPSI Enterprise Manager Bridge OCID
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }
        /**
         * Platform type.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        /**
         * Platform type.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
         *
         * @param platformType the value to set
         * @return this builder
         **/
        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * @param exadataInsightId the value to set
         * @return this builder
         **/
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalHostInsightSummary build() {
            EmManagedExternalHostInsightSummary model =
                    new EmManagedExternalHostInsightSummary(
                            this.id,
                            this.compartmentId,
                            this.hostName,
                            this.hostDisplayName,
                            this.hostType,
                            this.processorCount,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.opsiPrivateEndpointId,
                            this.status,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerEntityName,
                            this.enterpriseManagerEntityType,
                            this.enterpriseManagerEntityIdentifier,
                            this.enterpriseManagerEntityDisplayName,
                            this.enterpriseManagerBridgeId,
                            this.platformType,
                            this.exadataInsightId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalHostInsightSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("hostDisplayName")) {
                this.hostDisplayName(model.getHostDisplayName());
            }
            if (model.wasPropertyExplicitlySet("hostType")) {
                this.hostType(model.getHostType());
            }
            if (model.wasPropertyExplicitlySet("processorCount")) {
                this.processorCount(model.getProcessorCount());
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
            if (model.wasPropertyExplicitlySet("opsiPrivateEndpointId")) {
                this.opsiPrivateEndpointId(model.getOpsiPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityName")) {
                this.enterpriseManagerEntityName(model.getEnterpriseManagerEntityName());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityType")) {
                this.enterpriseManagerEntityType(model.getEnterpriseManagerEntityType());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityIdentifier")) {
                this.enterpriseManagerEntityIdentifier(
                        model.getEnterpriseManagerEntityIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityDisplayName")) {
                this.enterpriseManagerEntityDisplayName(
                        model.getEnterpriseManagerEntityDisplayName());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerBridgeId")) {
                this.enterpriseManagerBridgeId(model.getEnterpriseManagerBridgeId());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            if (model.wasPropertyExplicitlySet("exadataInsightId")) {
                this.exadataInsightId(model.getExadataInsightId());
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
    public EmManagedExternalHostInsightSummary(
            String id,
            String compartmentId,
            String hostName,
            String hostDisplayName,
            String hostType,
            Integer processorCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String opsiPrivateEndpointId,
            ResourceStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerEntityDisplayName,
            String enterpriseManagerBridgeId,
            PlatformType platformType,
            String exadataInsightId) {
        super(
                id,
                compartmentId,
                hostName,
                hostDisplayName,
                hostType,
                processorCount,
                freeformTags,
                definedTags,
                systemTags,
                opsiPrivateEndpointId,
                status,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.platformType = platformType;
        this.exadataInsightId = exadataInsightId;
    }

    /**
     * Enterprise Manager Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Unique Identifier
     * @return the value
     **/
    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /**
     * Enterprise Manager Entity Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    private final String enterpriseManagerEntityName;

    /**
     * Enterprise Manager Entity Name
     * @return the value
     **/
    public String getEnterpriseManagerEntityName() {
        return enterpriseManagerEntityName;
    }

    /**
     * Enterprise Manager Entity Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    private final String enterpriseManagerEntityType;

    /**
     * Enterprise Manager Entity Type
     * @return the value
     **/
    public String getEnterpriseManagerEntityType() {
        return enterpriseManagerEntityType;
    }

    /**
     * Enterprise Manager Entity Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    private final String enterpriseManagerEntityIdentifier;

    /**
     * Enterprise Manager Entity Unique Identifier
     * @return the value
     **/
    public String getEnterpriseManagerEntityIdentifier() {
        return enterpriseManagerEntityIdentifier;
    }

    /**
     * Enterprise Manager Entity Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
    private final String enterpriseManagerEntityDisplayName;

    /**
     * Enterprise Manager Entity Display Name
     * @return the value
     **/
    public String getEnterpriseManagerEntityDisplayName() {
        return enterpriseManagerEntityDisplayName;
    }

    /**
     * OPSI Enterprise Manager Bridge OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    private final String enterpriseManagerBridgeId;

    /**
     * OPSI Enterprise Manager Bridge OCID
     * @return the value
     **/
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }

    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     **/
    public enum PlatformType {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),
        Windows("WINDOWS"),
        Aix("AIX"),
        HpUx("HP_UX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformType.class);

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     * @return the value
     **/
    public PlatformType getPlatformType() {
        return platformType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * @return the value
     **/
    public String getExadataInsightId() {
        return exadataInsightId;
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
        sb.append("EmManagedExternalHostInsightSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerEntityName=")
                .append(String.valueOf(this.enterpriseManagerEntityName));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", enterpriseManagerEntityDisplayName=")
                .append(String.valueOf(this.enterpriseManagerEntityDisplayName));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalHostInsightSummary)) {
            return false;
        }

        EmManagedExternalHostInsightSummary other = (EmManagedExternalHostInsightSummary) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityName, other.enterpriseManagerEntityName)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityDisplayName,
                        other.enterpriseManagerEntityDisplayName)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityName == null
                                ? 43
                                : this.enterpriseManagerEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityDisplayName == null
                                ? 43
                                : this.enterpriseManagerEntityDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        return result;
    }
}
