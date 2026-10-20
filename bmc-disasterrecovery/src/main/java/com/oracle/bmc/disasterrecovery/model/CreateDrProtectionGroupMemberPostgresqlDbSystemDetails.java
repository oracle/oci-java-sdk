/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for an OCI Database with PostgreSQL member. <br>
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
        builder = CreateDrProtectionGroupMemberPostgresqlDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberPostgresqlDbSystemDetails
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
         * The OCID of the peer OCI Database with PostgreSQL from the peer region.
         *
         * <p>Example: {@code ocid1.postgresqldbsystem.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        /**
         * The OCID of the peer OCI Database with PostgreSQL from the peer region.
         *
         * <p>Example: {@code ocid1.postgresqldbsystem.oc1..uniqueID}
         *
         * @param peerDbSystemId the value to set
         * @return this builder
         */
        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberPostgresqlDbSystemDetails build() {
            CreateDrProtectionGroupMemberPostgresqlDbSystemDetails model =
                    new CreateDrProtectionGroupMemberPostgresqlDbSystemDetails(
                            this.memberId, this.peerDbSystemId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberPostgresqlDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("peerDbSystemId")) {
                this.peerDbSystemId(model.getPeerDbSystemId());
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
    public CreateDrProtectionGroupMemberPostgresqlDbSystemDetails(
            String memberId, String peerDbSystemId) {
        super(memberId);
        this.peerDbSystemId = peerDbSystemId;
    }

    /**
     * The OCID of the peer OCI Database with PostgreSQL from the peer region.
     *
     * <p>Example: {@code ocid1.postgresqldbsystem.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    private final String peerDbSystemId;

    /**
     * The OCID of the peer OCI Database with PostgreSQL from the peer region.
     *
     * <p>Example: {@code ocid1.postgresqldbsystem.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPeerDbSystemId() {
        return peerDbSystemId;
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
        sb.append("CreateDrProtectionGroupMemberPostgresqlDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", peerDbSystemId=").append(String.valueOf(this.peerDbSystemId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberPostgresqlDbSystemDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberPostgresqlDbSystemDetails other =
                (CreateDrProtectionGroupMemberPostgresqlDbSystemDetails) o;
        return java.util.Objects.equals(this.peerDbSystemId, other.peerDbSystemId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.peerDbSystemId == null ? 43 : this.peerDbSystemId.hashCode());
        return result;
    }
}
