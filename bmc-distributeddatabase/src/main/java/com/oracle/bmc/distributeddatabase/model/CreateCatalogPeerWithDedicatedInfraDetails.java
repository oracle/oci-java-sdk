/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details required for creation of autonomous dedicated infrastructure based catalog peer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCatalogPeerWithDedicatedInfraDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCatalogPeerWithDedicatedInfraDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cloudAutonomousVmClusterId",
        "protectionMode",
        "fastStartFailOverLagLimitInSeconds",
        "isAutomaticFailoverEnabled",
        "standbyMaintenanceBufferInDays"
    })
    public CreateCatalogPeerWithDedicatedInfraDetails(
            String cloudAutonomousVmClusterId,
            DistributedAutonomousDbProtectionMode protectionMode,
            Integer fastStartFailOverLagLimitInSeconds,
            Boolean isAutomaticFailoverEnabled,
            Integer standbyMaintenanceBufferInDays) {
        super();
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.protectionMode = protectionMode;
        this.fastStartFailOverLagLimitInSeconds = fastStartFailOverLagLimitInSeconds;
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
        this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous VM Cluster for the peer catalog.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous VM Cluster for the peer catalog.
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }
        /** The protectionMode for the catalog peer. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedAutonomousDbProtectionMode protectionMode;

        /**
         * The protectionMode for the catalog peer.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(DistributedAutonomousDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /** The lag time preference based on data loss tolerance in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
        private Integer fastStartFailOverLagLimitInSeconds;

        /**
         * The lag time preference based on data loss tolerance in seconds.
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
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before schedlued maintenance
         * of the primary database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before schedlued maintenance
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

        public CreateCatalogPeerWithDedicatedInfraDetails build() {
            CreateCatalogPeerWithDedicatedInfraDetails model =
                    new CreateCatalogPeerWithDedicatedInfraDetails(
                            this.cloudAutonomousVmClusterId,
                            this.protectionMode,
                            this.fastStartFailOverLagLimitInSeconds,
                            this.isAutomaticFailoverEnabled,
                            this.standbyMaintenanceBufferInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCatalogPeerWithDedicatedInfraDetails model) {
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("fastStartFailOverLagLimitInSeconds")) {
                this.fastStartFailOverLagLimitInSeconds(
                        model.getFastStartFailOverLagLimitInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticFailoverEnabled")) {
                this.isAutomaticFailoverEnabled(model.getIsAutomaticFailoverEnabled());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous VM Cluster for the peer catalog.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous VM Cluster for the peer catalog.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    /** The protectionMode for the catalog peer. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedAutonomousDbProtectionMode protectionMode;

    /**
     * The protectionMode for the catalog peer.
     *
     * @return the value
     */
    public DistributedAutonomousDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /** The lag time preference based on data loss tolerance in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
    private final Integer fastStartFailOverLagLimitInSeconds;

    /**
     * The lag time preference based on data loss tolerance in seconds.
     *
     * @return the value
     */
    public Integer getFastStartFailOverLagLimitInSeconds() {
        return fastStartFailOverLagLimitInSeconds;
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
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before schedlued maintenance of
     * the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    private final Integer standbyMaintenanceBufferInDays;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before schedlued maintenance of
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
        sb.append("CreateCatalogPeerWithDedicatedInfraDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", fastStartFailOverLagLimitInSeconds=")
                .append(String.valueOf(this.fastStartFailOverLagLimitInSeconds));
        sb.append(", isAutomaticFailoverEnabled=")
                .append(String.valueOf(this.isAutomaticFailoverEnabled));
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
        if (!(o instanceof CreateCatalogPeerWithDedicatedInfraDetails)) {
            return false;
        }

        CreateCatalogPeerWithDedicatedInfraDetails other =
                (CreateCatalogPeerWithDedicatedInfraDetails) o;
        return java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(
                        this.fastStartFailOverLagLimitInSeconds,
                        other.fastStartFailOverLagLimitInSeconds)
                && java.util.Objects.equals(
                        this.isAutomaticFailoverEnabled, other.isAutomaticFailoverEnabled)
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
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
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
                        + (this.isAutomaticFailoverEnabled == null
                                ? 43
                                : this.isAutomaticFailoverEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyMaintenanceBufferInDays == null
                                ? 43
                                : this.standbyMaintenanceBufferInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
