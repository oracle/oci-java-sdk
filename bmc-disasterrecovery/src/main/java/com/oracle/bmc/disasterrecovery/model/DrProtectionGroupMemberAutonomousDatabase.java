/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The properties for an Autonomous Database Serverless member of a DR protection group. <br>
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
        builder = DrProtectionGroupMemberAutonomousDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrProtectionGroupMemberAutonomousDatabase extends DrProtectionGroupMember {
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
         * This specifies the mechanism used to create a temporary Autonomous Database instance for
         * DR Drills. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-clone-about.html
         * for information about these clone types. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-data-guard-snapshot-standby.html
         * for information about snapshot standby.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseStandbyTypeForDrDrills")
        private AutonomousDatabaseStandbyTypeForDrDrills autonomousDatabaseStandbyTypeForDrDrills;

        /**
         * This specifies the mechanism used to create a temporary Autonomous Database instance for
         * DR Drills. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-clone-about.html
         * for information about these clone types. See
         * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-data-guard-snapshot-standby.html
         * for information about snapshot standby.
         *
         * @param autonomousDatabaseStandbyTypeForDrDrills the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseStandbyTypeForDrDrills(
                AutonomousDatabaseStandbyTypeForDrDrills autonomousDatabaseStandbyTypeForDrDrills) {
            this.autonomousDatabaseStandbyTypeForDrDrills =
                    autonomousDatabaseStandbyTypeForDrDrills;
            this.__explicitlySet__.add("autonomousDatabaseStandbyTypeForDrDrills");
            return this;
        }
        /**
         * The OCID of the vault secret where the database SYSDBA password is stored. This password
         * is required and used for performing database DR Drill operations when using full clone.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
        private String passwordVaultSecretId;

        /**
         * The OCID of the vault secret where the database SYSDBA password is stored. This password
         * is required and used for performing database DR Drill operations when using full clone.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         *
         * @param passwordVaultSecretId the value to set
         * @return this builder
         */
        public Builder passwordVaultSecretId(String passwordVaultSecretId) {
            this.passwordVaultSecretId = passwordVaultSecretId;
            this.__explicitlySet__.add("passwordVaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrProtectionGroupMemberAutonomousDatabase build() {
            DrProtectionGroupMemberAutonomousDatabase model =
                    new DrProtectionGroupMemberAutonomousDatabase(
                            this.memberId,
                            this.autonomousDatabaseStandbyTypeForDrDrills,
                            this.passwordVaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrProtectionGroupMemberAutonomousDatabase model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseStandbyTypeForDrDrills")) {
                this.autonomousDatabaseStandbyTypeForDrDrills(
                        model.getAutonomousDatabaseStandbyTypeForDrDrills());
            }
            if (model.wasPropertyExplicitlySet("passwordVaultSecretId")) {
                this.passwordVaultSecretId(model.getPasswordVaultSecretId());
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
    public DrProtectionGroupMemberAutonomousDatabase(
            String memberId,
            AutonomousDatabaseStandbyTypeForDrDrills autonomousDatabaseStandbyTypeForDrDrills,
            String passwordVaultSecretId) {
        super(memberId);
        this.autonomousDatabaseStandbyTypeForDrDrills = autonomousDatabaseStandbyTypeForDrDrills;
        this.passwordVaultSecretId = passwordVaultSecretId;
    }

    /**
     * This specifies the mechanism used to create a temporary Autonomous Database instance for DR
     * Drills. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-clone-about.html
     * for information about these clone types. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-data-guard-snapshot-standby.html
     * for information about snapshot standby.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseStandbyTypeForDrDrills")
    private final AutonomousDatabaseStandbyTypeForDrDrills autonomousDatabaseStandbyTypeForDrDrills;

    /**
     * This specifies the mechanism used to create a temporary Autonomous Database instance for DR
     * Drills. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-clone-about.html
     * for information about these clone types. See
     * https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-data-guard-snapshot-standby.html
     * for information about snapshot standby.
     *
     * @return the value
     */
    public AutonomousDatabaseStandbyTypeForDrDrills getAutonomousDatabaseStandbyTypeForDrDrills() {
        return autonomousDatabaseStandbyTypeForDrDrills;
    }

    /**
     * The OCID of the vault secret where the database SYSDBA password is stored. This password is
     * required and used for performing database DR Drill operations when using full clone.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
    private final String passwordVaultSecretId;

    /**
     * The OCID of the vault secret where the database SYSDBA password is stored. This password is
     * required and used for performing database DR Drill operations when using full clone.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPasswordVaultSecretId() {
        return passwordVaultSecretId;
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
        sb.append("DrProtectionGroupMemberAutonomousDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", autonomousDatabaseStandbyTypeForDrDrills=")
                .append(String.valueOf(this.autonomousDatabaseStandbyTypeForDrDrills));
        sb.append(", passwordVaultSecretId=").append(String.valueOf(this.passwordVaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrProtectionGroupMemberAutonomousDatabase)) {
            return false;
        }

        DrProtectionGroupMemberAutonomousDatabase other =
                (DrProtectionGroupMemberAutonomousDatabase) o;
        return java.util.Objects.equals(
                        this.autonomousDatabaseStandbyTypeForDrDrills,
                        other.autonomousDatabaseStandbyTypeForDrDrills)
                && java.util.Objects.equals(this.passwordVaultSecretId, other.passwordVaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseStandbyTypeForDrDrills == null
                                ? 43
                                : this.autonomousDatabaseStandbyTypeForDrDrills.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVaultSecretId == null
                                ? 43
                                : this.passwordVaultSecretId.hashCode());
        return result;
    }
}
