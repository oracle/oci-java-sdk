/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for an Autonomous Container Database member. <br>
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
        builder = CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails
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
         * The type of connection strings used to connect to an Autonomous Container Database
         * snapshot standby created during a DR Drill operation. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html for
         * information about these service types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionStringType")
        private AutonomousContainerDatabaseSnapshotStandbyConnectionStringType connectionStringType;

        /**
         * The type of connection strings used to connect to an Autonomous Container Database
         * snapshot standby created during a DR Drill operation. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html for
         * information about these service types.
         *
         * @param connectionStringType the value to set
         * @return this builder
         */
        public Builder connectionStringType(
                AutonomousContainerDatabaseSnapshotStandbyConnectionStringType
                        connectionStringType) {
            this.connectionStringType = connectionStringType;
            this.__explicitlySet__.add("connectionStringType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails build() {
            CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails model =
                    new CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails(
                            this.memberId, this.connectionStringType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("connectionStringType")) {
                this.connectionStringType(model.getConnectionStringType());
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
    public CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails(
            String memberId,
            AutonomousContainerDatabaseSnapshotStandbyConnectionStringType connectionStringType) {
        super(memberId);
        this.connectionStringType = connectionStringType;
    }

    /**
     * The type of connection strings used to connect to an Autonomous Container Database snapshot
     * standby created during a DR Drill operation. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html for
     * information about these service types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStringType")
    private final AutonomousContainerDatabaseSnapshotStandbyConnectionStringType
            connectionStringType;

    /**
     * The type of connection strings used to connect to an Autonomous Container Database snapshot
     * standby created during a DR Drill operation. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html for
     * information about these service types.
     *
     * @return the value
     */
    public AutonomousContainerDatabaseSnapshotStandbyConnectionStringType
            getConnectionStringType() {
        return connectionStringType;
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
        sb.append("CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionStringType=").append(String.valueOf(this.connectionStringType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails other =
                (CreateDrProtectionGroupMemberAutonomousContainerDatabaseDetails) o;
        return java.util.Objects.equals(this.connectionStringType, other.connectionStringType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionStringType == null
                                ? 43
                                : this.connectionStringType.hashCode());
        return result;
    }
}
