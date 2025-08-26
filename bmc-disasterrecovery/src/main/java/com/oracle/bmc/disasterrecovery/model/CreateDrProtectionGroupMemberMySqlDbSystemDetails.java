/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for a HeatWave MySQL DB System member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDrProtectionGroupMemberMySqlDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberMySqlDbSystemDetails
        extends CreateDrProtectionGroupMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The OCID of the peer HeatWave MySQL DB System from the peer region.
         *
         * <p>Example: {@code ocid1.mysqldbsystem.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        /**
         * The OCID of the peer HeatWave MySQL DB System from the peer region.
         *
         * <p>Example: {@code ocid1.mysqldbsystem.oc1..uniqueID}
         *
         * @param peerDbSystemId the value to set
         * @return this builder
         */
        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }
        /**
         * The maximum time (in seconds) to wait for the Global Transaction Identifier (GTID)
         * synchronization process to complete before timing out.
         *
         * <p>Example: {@code 600}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gtidReconciliationTimeout")
        private Integer gtidReconciliationTimeout;

        /**
         * The maximum time (in seconds) to wait for the Global Transaction Identifier (GTID)
         * synchronization process to complete before timing out.
         *
         * <p>Example: {@code 600}
         *
         * @param gtidReconciliationTimeout the value to set
         * @return this builder
         */
        public Builder gtidReconciliationTimeout(Integer gtidReconciliationTimeout) {
            this.gtidReconciliationTimeout = gtidReconciliationTimeout;
            this.__explicitlySet__.add("gtidReconciliationTimeout");
            return this;
        }
        /**
         * A flag indicating whether to continue with DR operation if the Global Transaction
         * Identifier (GTID) reconciliation operation times out.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isContinueOnGtidReconciliationTimeout")
        private Boolean isContinueOnGtidReconciliationTimeout;

        /**
         * A flag indicating whether to continue with DR operation if the Global Transaction
         * Identifier (GTID) reconciliation operation times out.
         *
         * <p>Example: {@code false}
         *
         * @param isContinueOnGtidReconciliationTimeout the value to set
         * @return this builder
         */
        public Builder isContinueOnGtidReconciliationTimeout(
                Boolean isContinueOnGtidReconciliationTimeout) {
            this.isContinueOnGtidReconciliationTimeout = isContinueOnGtidReconciliationTimeout;
            this.__explicitlySet__.add("isContinueOnGtidReconciliationTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemAdminUserDetails")
        private CreateMySqlDbSystemAdminUserDetails dbSystemAdminUserDetails;

        public Builder dbSystemAdminUserDetails(
                CreateMySqlDbSystemAdminUserDetails dbSystemAdminUserDetails) {
            this.dbSystemAdminUserDetails = dbSystemAdminUserDetails;
            this.__explicitlySet__.add("dbSystemAdminUserDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemReplicationUserDetails")
        private CreateMySqlDbSystemReplicationUserDetails dbSystemReplicationUserDetails;

        public Builder dbSystemReplicationUserDetails(
                CreateMySqlDbSystemReplicationUserDetails dbSystemReplicationUserDetails) {
            this.dbSystemReplicationUserDetails = dbSystemReplicationUserDetails;
            this.__explicitlySet__.add("dbSystemReplicationUserDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberMySqlDbSystemDetails build() {
            CreateDrProtectionGroupMemberMySqlDbSystemDetails model =
                    new CreateDrProtectionGroupMemberMySqlDbSystemDetails(
                            this.memberId,
                            this.peerDbSystemId,
                            this.gtidReconciliationTimeout,
                            this.isContinueOnGtidReconciliationTimeout,
                            this.dbSystemAdminUserDetails,
                            this.dbSystemReplicationUserDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberMySqlDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("peerDbSystemId")) {
                this.peerDbSystemId(model.getPeerDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("gtidReconciliationTimeout")) {
                this.gtidReconciliationTimeout(model.getGtidReconciliationTimeout());
            }
            if (model.wasPropertyExplicitlySet("isContinueOnGtidReconciliationTimeout")) {
                this.isContinueOnGtidReconciliationTimeout(
                        model.getIsContinueOnGtidReconciliationTimeout());
            }
            if (model.wasPropertyExplicitlySet("dbSystemAdminUserDetails")) {
                this.dbSystemAdminUserDetails(model.getDbSystemAdminUserDetails());
            }
            if (model.wasPropertyExplicitlySet("dbSystemReplicationUserDetails")) {
                this.dbSystemReplicationUserDetails(model.getDbSystemReplicationUserDetails());
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
    public CreateDrProtectionGroupMemberMySqlDbSystemDetails(
            String memberId,
            String peerDbSystemId,
            Integer gtidReconciliationTimeout,
            Boolean isContinueOnGtidReconciliationTimeout,
            CreateMySqlDbSystemAdminUserDetails dbSystemAdminUserDetails,
            CreateMySqlDbSystemReplicationUserDetails dbSystemReplicationUserDetails) {
        super(memberId);
        this.peerDbSystemId = peerDbSystemId;
        this.gtidReconciliationTimeout = gtidReconciliationTimeout;
        this.isContinueOnGtidReconciliationTimeout = isContinueOnGtidReconciliationTimeout;
        this.dbSystemAdminUserDetails = dbSystemAdminUserDetails;
        this.dbSystemReplicationUserDetails = dbSystemReplicationUserDetails;
    }

    /**
     * The OCID of the peer HeatWave MySQL DB System from the peer region.
     *
     * <p>Example: {@code ocid1.mysqldbsystem.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    private final String peerDbSystemId;

    /**
     * The OCID of the peer HeatWave MySQL DB System from the peer region.
     *
     * <p>Example: {@code ocid1.mysqldbsystem.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPeerDbSystemId() {
        return peerDbSystemId;
    }

    /**
     * The maximum time (in seconds) to wait for the Global Transaction Identifier (GTID)
     * synchronization process to complete before timing out.
     *
     * <p>Example: {@code 600}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gtidReconciliationTimeout")
    private final Integer gtidReconciliationTimeout;

    /**
     * The maximum time (in seconds) to wait for the Global Transaction Identifier (GTID)
     * synchronization process to complete before timing out.
     *
     * <p>Example: {@code 600}
     *
     * @return the value
     */
    public Integer getGtidReconciliationTimeout() {
        return gtidReconciliationTimeout;
    }

    /**
     * A flag indicating whether to continue with DR operation if the Global Transaction Identifier
     * (GTID) reconciliation operation times out.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isContinueOnGtidReconciliationTimeout")
    private final Boolean isContinueOnGtidReconciliationTimeout;

    /**
     * A flag indicating whether to continue with DR operation if the Global Transaction Identifier
     * (GTID) reconciliation operation times out.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsContinueOnGtidReconciliationTimeout() {
        return isContinueOnGtidReconciliationTimeout;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemAdminUserDetails")
    private final CreateMySqlDbSystemAdminUserDetails dbSystemAdminUserDetails;

    public CreateMySqlDbSystemAdminUserDetails getDbSystemAdminUserDetails() {
        return dbSystemAdminUserDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemReplicationUserDetails")
    private final CreateMySqlDbSystemReplicationUserDetails dbSystemReplicationUserDetails;

    public CreateMySqlDbSystemReplicationUserDetails getDbSystemReplicationUserDetails() {
        return dbSystemReplicationUserDetails;
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
        sb.append("CreateDrProtectionGroupMemberMySqlDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", peerDbSystemId=").append(String.valueOf(this.peerDbSystemId));
        sb.append(", gtidReconciliationTimeout=")
                .append(String.valueOf(this.gtidReconciliationTimeout));
        sb.append(", isContinueOnGtidReconciliationTimeout=")
                .append(String.valueOf(this.isContinueOnGtidReconciliationTimeout));
        sb.append(", dbSystemAdminUserDetails=")
                .append(String.valueOf(this.dbSystemAdminUserDetails));
        sb.append(", dbSystemReplicationUserDetails=")
                .append(String.valueOf(this.dbSystemReplicationUserDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberMySqlDbSystemDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberMySqlDbSystemDetails other =
                (CreateDrProtectionGroupMemberMySqlDbSystemDetails) o;
        return java.util.Objects.equals(this.peerDbSystemId, other.peerDbSystemId)
                && java.util.Objects.equals(
                        this.gtidReconciliationTimeout, other.gtidReconciliationTimeout)
                && java.util.Objects.equals(
                        this.isContinueOnGtidReconciliationTimeout,
                        other.isContinueOnGtidReconciliationTimeout)
                && java.util.Objects.equals(
                        this.dbSystemAdminUserDetails, other.dbSystemAdminUserDetails)
                && java.util.Objects.equals(
                        this.dbSystemReplicationUserDetails, other.dbSystemReplicationUserDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.peerDbSystemId == null ? 43 : this.peerDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.gtidReconciliationTimeout == null
                                ? 43
                                : this.gtidReconciliationTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.isContinueOnGtidReconciliationTimeout == null
                                ? 43
                                : this.isContinueOnGtidReconciliationTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemAdminUserDetails == null
                                ? 43
                                : this.dbSystemAdminUserDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemReplicationUserDetails == null
                                ? 43
                                : this.dbSystemReplicationUserDetails.hashCode());
        return result;
    }
}
