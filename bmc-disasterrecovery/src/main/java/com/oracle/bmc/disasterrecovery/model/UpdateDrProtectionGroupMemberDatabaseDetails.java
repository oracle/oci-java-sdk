/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a Database (DBCS) member.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDrProtectionGroupMemberDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "memberType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrProtectionGroupMemberDatabaseDetails
        extends UpdateDrProtectionGroupMemberDetails {
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
         * The OCID of the vault secret where the database SYSDBA password is stored.
         * <p>
         * Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
        private String passwordVaultSecretId;

        /**
         * The OCID of the vault secret where the database SYSDBA password is stored.
         * <p>
         * Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         *
         * @param passwordVaultSecretId the value to set
         * @return this builder
         **/
        public Builder passwordVaultSecretId(String passwordVaultSecretId) {
            this.passwordVaultSecretId = passwordVaultSecretId;
            this.__explicitlySet__.add("passwordVaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupMemberDatabaseDetails build() {
            UpdateDrProtectionGroupMemberDatabaseDetails model =
                    new UpdateDrProtectionGroupMemberDatabaseDetails(
                            this.memberId, this.passwordVaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupMemberDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("passwordVaultSecretId")) {
                this.passwordVaultSecretId(model.getPasswordVaultSecretId());
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
    public UpdateDrProtectionGroupMemberDatabaseDetails(
            String memberId, String passwordVaultSecretId) {
        super(memberId);
        this.passwordVaultSecretId = passwordVaultSecretId;
    }

    /**
     * The OCID of the vault secret where the database SYSDBA password is stored.
     * <p>
     * Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
    private final String passwordVaultSecretId;

    /**
     * The OCID of the vault secret where the database SYSDBA password is stored.
     * <p>
     * Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getPasswordVaultSecretId() {
        return passwordVaultSecretId;
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
        sb.append("UpdateDrProtectionGroupMemberDatabaseDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", passwordVaultSecretId=").append(String.valueOf(this.passwordVaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberDatabaseDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberDatabaseDetails other =
                (UpdateDrProtectionGroupMemberDatabaseDetails) o;
        return java.util.Objects.equals(this.passwordVaultSecretId, other.passwordVaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.passwordVaultSecretId == null
                                ? 43
                                : this.passwordVaultSecretId.hashCode());
        return result;
    }
}
