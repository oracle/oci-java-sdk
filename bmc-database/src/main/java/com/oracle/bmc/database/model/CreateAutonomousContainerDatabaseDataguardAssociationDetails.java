/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Create Autonomous Dataguard Association to an existing Autonomous Container Database <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutonomousContainerDatabaseDataguardAssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousContainerDatabaseDataguardAssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "peerAutonomousContainerDatabaseDisplayName",
        "peerAutonomousContainerDatabaseCompartmentId",
        "peerCloudAutonomousVmClusterId",
        "peerAutonomousContainerDatabaseBackupConfig",
        "isAutomaticFailoverEnabled",
        "protectionMode",
        "fastStartFailOverLagLimitInSeconds",
        "standbyMaintenanceBufferInDays"
    })
    public CreateAutonomousContainerDatabaseDataguardAssociationDetails(
            String peerAutonomousContainerDatabaseDisplayName,
            String peerAutonomousContainerDatabaseCompartmentId,
            String peerCloudAutonomousVmClusterId,
            PeerAutonomousContainerDatabaseBackupConfig peerAutonomousContainerDatabaseBackupConfig,
            Boolean isAutomaticFailoverEnabled,
            ProtectionMode protectionMode,
            Integer fastStartFailOverLagLimitInSeconds,
            Integer standbyMaintenanceBufferInDays) {
        super();
        this.peerAutonomousContainerDatabaseDisplayName =
                peerAutonomousContainerDatabaseDisplayName;
        this.peerAutonomousContainerDatabaseCompartmentId =
                peerAutonomousContainerDatabaseCompartmentId;
        this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
        this.peerAutonomousContainerDatabaseBackupConfig =
                peerAutonomousContainerDatabaseBackupConfig;
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
        this.protectionMode = protectionMode;
        this.fastStartFailOverLagLimitInSeconds = fastStartFailOverLagLimitInSeconds;
        this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name for the peer Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
        private String peerAutonomousContainerDatabaseDisplayName;

        /**
         * The display name for the peer Autonomous Container Database.
         *
         * @param peerAutonomousContainerDatabaseDisplayName the value to set
         * @return this builder
         */
        public Builder peerAutonomousContainerDatabaseDisplayName(
                String peerAutonomousContainerDatabaseDisplayName) {
            this.peerAutonomousContainerDatabaseDisplayName =
                    peerAutonomousContainerDatabaseDisplayName;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseDisplayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the standby Autonomous Container Database will be created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseCompartmentId")
        private String peerAutonomousContainerDatabaseCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the standby Autonomous Container Database will be created.
         *
         * @param peerAutonomousContainerDatabaseCompartmentId the value to set
         * @return this builder
         */
        public Builder peerAutonomousContainerDatabaseCompartmentId(
                String peerAutonomousContainerDatabaseCompartmentId) {
            this.peerAutonomousContainerDatabaseCompartmentId =
                    peerAutonomousContainerDatabaseCompartmentId;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseCompartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer cloud Autonomous Exadata VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
        private String peerCloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer cloud Autonomous Exadata VM Cluster.
         *
         * @param peerCloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder peerCloudAutonomousVmClusterId(String peerCloudAutonomousVmClusterId) {
            this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseBackupConfig")
        private PeerAutonomousContainerDatabaseBackupConfig
                peerAutonomousContainerDatabaseBackupConfig;

        public Builder peerAutonomousContainerDatabaseBackupConfig(
                PeerAutonomousContainerDatabaseBackupConfig
                        peerAutonomousContainerDatabaseBackupConfig) {
            this.peerAutonomousContainerDatabaseBackupConfig =
                    peerAutonomousContainerDatabaseBackupConfig;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseBackupConfig");
            return this;
        }
        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database
         * Dataguard Association
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
        private Boolean isAutomaticFailoverEnabled;

        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database
         * Dataguard Association
         *
         * @param isAutomaticFailoverEnabled the value to set
         * @return this builder
         */
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            this.__explicitlySet__.add("isAutomaticFailoverEnabled");
            return this;
        }
        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /** The lag time for my preference based on data loss tolerance in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
        private Integer fastStartFailOverLagLimitInSeconds;

        /**
         * The lag time for my preference based on data loss tolerance in seconds.
         *
         * @param fastStartFailOverLagLimitInSeconds the value to set
         * @return this builder
         */
        public Builder fastStartFailOverLagLimitInSeconds(
                Integer fastStartFailOverLagLimitInSeconds) {
            this.fastStartFailOverLagLimitInSeconds = fastStartFailOverLagLimitInSeconds;
            this.__explicitlySet__.add("fastStartFailOverLagLimitInSeconds");
            return this;
        }
        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before scheduled maintenance
         * of the primary database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before scheduled maintenance
         * of the primary database.
         *
         * @param standbyMaintenanceBufferInDays the value to set
         * @return this builder
         */
        public Builder standbyMaintenanceBufferInDays(Integer standbyMaintenanceBufferInDays) {
            this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
            this.__explicitlySet__.add("standbyMaintenanceBufferInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousContainerDatabaseDataguardAssociationDetails build() {
            CreateAutonomousContainerDatabaseDataguardAssociationDetails model =
                    new CreateAutonomousContainerDatabaseDataguardAssociationDetails(
                            this.peerAutonomousContainerDatabaseDisplayName,
                            this.peerAutonomousContainerDatabaseCompartmentId,
                            this.peerCloudAutonomousVmClusterId,
                            this.peerAutonomousContainerDatabaseBackupConfig,
                            this.isAutomaticFailoverEnabled,
                            this.protectionMode,
                            this.fastStartFailOverLagLimitInSeconds,
                            this.standbyMaintenanceBufferInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousContainerDatabaseDataguardAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseDisplayName")) {
                this.peerAutonomousContainerDatabaseDisplayName(
                        model.getPeerAutonomousContainerDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseCompartmentId")) {
                this.peerAutonomousContainerDatabaseCompartmentId(
                        model.getPeerAutonomousContainerDatabaseCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("peerCloudAutonomousVmClusterId")) {
                this.peerCloudAutonomousVmClusterId(model.getPeerCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseBackupConfig")) {
                this.peerAutonomousContainerDatabaseBackupConfig(
                        model.getPeerAutonomousContainerDatabaseBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticFailoverEnabled")) {
                this.isAutomaticFailoverEnabled(model.getIsAutomaticFailoverEnabled());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("fastStartFailOverLagLimitInSeconds")) {
                this.fastStartFailOverLagLimitInSeconds(
                        model.getFastStartFailOverLagLimitInSeconds());
            }
            if (model.wasPropertyExplicitlySet("standbyMaintenanceBufferInDays")) {
                this.standbyMaintenanceBufferInDays(model.getStandbyMaintenanceBufferInDays());
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

    /** The display name for the peer Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
    private final String peerAutonomousContainerDatabaseDisplayName;

    /**
     * The display name for the peer Autonomous Container Database.
     *
     * @return the value
     */
    public String getPeerAutonomousContainerDatabaseDisplayName() {
        return peerAutonomousContainerDatabaseDisplayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the standby Autonomous Container Database will be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseCompartmentId")
    private final String peerAutonomousContainerDatabaseCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the standby Autonomous Container Database will be created.
     *
     * @return the value
     */
    public String getPeerAutonomousContainerDatabaseCompartmentId() {
        return peerAutonomousContainerDatabaseCompartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer cloud Autonomous Exadata VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
    private final String peerCloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer cloud Autonomous Exadata VM Cluster.
     *
     * @return the value
     */
    public String getPeerCloudAutonomousVmClusterId() {
        return peerCloudAutonomousVmClusterId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseBackupConfig")
    private final PeerAutonomousContainerDatabaseBackupConfig
            peerAutonomousContainerDatabaseBackupConfig;

    public PeerAutonomousContainerDatabaseBackupConfig
            getPeerAutonomousContainerDatabaseBackupConfig() {
        return peerAutonomousContainerDatabaseBackupConfig;
    }

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
    private final Boolean isAutomaticFailoverEnabled;

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     *
     * @return the value
     */
    public Boolean getIsAutomaticFailoverEnabled() {
        return isAutomaticFailoverEnabled;
    }

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };
    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /** The lag time for my preference based on data loss tolerance in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
    private final Integer fastStartFailOverLagLimitInSeconds;

    /**
     * The lag time for my preference based on data loss tolerance in seconds.
     *
     * @return the value
     */
    public Integer getFastStartFailOverLagLimitInSeconds() {
        return fastStartFailOverLagLimitInSeconds;
    }

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    private final Integer standbyMaintenanceBufferInDays;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     *
     * @return the value
     */
    public Integer getStandbyMaintenanceBufferInDays() {
        return standbyMaintenanceBufferInDays;
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
        sb.append("CreateAutonomousContainerDatabaseDataguardAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("peerAutonomousContainerDatabaseDisplayName=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseDisplayName));
        sb.append(", peerAutonomousContainerDatabaseCompartmentId=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseCompartmentId));
        sb.append(", peerCloudAutonomousVmClusterId=")
                .append(String.valueOf(this.peerCloudAutonomousVmClusterId));
        sb.append(", peerAutonomousContainerDatabaseBackupConfig=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseBackupConfig));
        sb.append(", isAutomaticFailoverEnabled=")
                .append(String.valueOf(this.isAutomaticFailoverEnabled));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", fastStartFailOverLagLimitInSeconds=")
                .append(String.valueOf(this.fastStartFailOverLagLimitInSeconds));
        sb.append(", standbyMaintenanceBufferInDays=")
                .append(String.valueOf(this.standbyMaintenanceBufferInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousContainerDatabaseDataguardAssociationDetails)) {
            return false;
        }

        CreateAutonomousContainerDatabaseDataguardAssociationDetails other =
                (CreateAutonomousContainerDatabaseDataguardAssociationDetails) o;
        return java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseDisplayName,
                        other.peerAutonomousContainerDatabaseDisplayName)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseCompartmentId,
                        other.peerAutonomousContainerDatabaseCompartmentId)
                && java.util.Objects.equals(
                        this.peerCloudAutonomousVmClusterId, other.peerCloudAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseBackupConfig,
                        other.peerAutonomousContainerDatabaseBackupConfig)
                && java.util.Objects.equals(
                        this.isAutomaticFailoverEnabled, other.isAutomaticFailoverEnabled)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(
                        this.fastStartFailOverLagLimitInSeconds,
                        other.fastStartFailOverLagLimitInSeconds)
                && java.util.Objects.equals(
                        this.standbyMaintenanceBufferInDays, other.standbyMaintenanceBufferInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseDisplayName == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseCompartmentId == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerCloudAutonomousVmClusterId == null
                                ? 43
                                : this.peerCloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseBackupConfig == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseBackupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutomaticFailoverEnabled == null
                                ? 43
                                : this.isAutomaticFailoverEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.fastStartFailOverLagLimitInSeconds == null
                                ? 43
                                : this.fastStartFailOverLagLimitInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyMaintenanceBufferInDays == null
                                ? 43
                                : this.standbyMaintenanceBufferInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
