/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Information about a member of a MySQL server group replication for high availability. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedMySqlDatabaseHighAvailabilityMemberSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseHighAvailabilityMemberSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "memberHost",
        "memberPort",
        "memberState",
        "memberRole",
        "memberUuid"
    })
    public ManagedMySqlDatabaseHighAvailabilityMemberSummary(
            String memberHost,
            Integer memberPort,
            String memberState,
            String memberRole,
            String memberUuid) {
        super();
        this.memberHost = memberHost;
        this.memberPort = memberPort;
        this.memberState = memberState;
        this.memberRole = memberRole;
        this.memberUuid = memberUuid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The host name of the group member that clients use to connect to it. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberHost")
        private String memberHost;

        /**
         * The host name of the group member that clients use to connect to it.
         *
         * @param memberHost the value to set
         * @return this builder
         */
        public Builder memberHost(String memberHost) {
            this.memberHost = memberHost;
            this.__explicitlySet__.add("memberHost");
            return this;
        }
        /** The port number of the group member that clients use to connect to it. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberPort")
        private Integer memberPort;

        /**
         * The port number of the group member that clients use to connect to it.
         *
         * @param memberPort the value to set
         * @return this builder
         */
        public Builder memberPort(Integer memberPort) {
            this.memberPort = memberPort;
            this.__explicitlySet__.add("memberPort");
            return this;
        }
        /** The current state of the group member. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberState")
        private String memberState;

        /**
         * The current state of the group member.
         *
         * @param memberState the value to set
         * @return this builder
         */
        public Builder memberState(String memberState) {
            this.memberState = memberState;
            this.__explicitlySet__.add("memberState");
            return this;
        }
        /** The current role of the group member in the group. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberRole")
        private String memberRole;

        /**
         * The current role of the group member in the group.
         *
         * @param memberRole the value to set
         * @return this builder
         */
        public Builder memberRole(String memberRole) {
            this.memberRole = memberRole;
            this.__explicitlySet__.add("memberRole");
            return this;
        }
        /** The Universally Unique Identifier (UUID) of the member server. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberUuid")
        private String memberUuid;

        /**
         * The Universally Unique Identifier (UUID) of the member server.
         *
         * @param memberUuid the value to set
         * @return this builder
         */
        public Builder memberUuid(String memberUuid) {
            this.memberUuid = memberUuid;
            this.__explicitlySet__.add("memberUuid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseHighAvailabilityMemberSummary build() {
            ManagedMySqlDatabaseHighAvailabilityMemberSummary model =
                    new ManagedMySqlDatabaseHighAvailabilityMemberSummary(
                            this.memberHost,
                            this.memberPort,
                            this.memberState,
                            this.memberRole,
                            this.memberUuid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseHighAvailabilityMemberSummary model) {
            if (model.wasPropertyExplicitlySet("memberHost")) {
                this.memberHost(model.getMemberHost());
            }
            if (model.wasPropertyExplicitlySet("memberPort")) {
                this.memberPort(model.getMemberPort());
            }
            if (model.wasPropertyExplicitlySet("memberState")) {
                this.memberState(model.getMemberState());
            }
            if (model.wasPropertyExplicitlySet("memberRole")) {
                this.memberRole(model.getMemberRole());
            }
            if (model.wasPropertyExplicitlySet("memberUuid")) {
                this.memberUuid(model.getMemberUuid());
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

    /** The host name of the group member that clients use to connect to it. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberHost")
    private final String memberHost;

    /**
     * The host name of the group member that clients use to connect to it.
     *
     * @return the value
     */
    public String getMemberHost() {
        return memberHost;
    }

    /** The port number of the group member that clients use to connect to it. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberPort")
    private final Integer memberPort;

    /**
     * The port number of the group member that clients use to connect to it.
     *
     * @return the value
     */
    public Integer getMemberPort() {
        return memberPort;
    }

    /** The current state of the group member. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberState")
    private final String memberState;

    /**
     * The current state of the group member.
     *
     * @return the value
     */
    public String getMemberState() {
        return memberState;
    }

    /** The current role of the group member in the group. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberRole")
    private final String memberRole;

    /**
     * The current role of the group member in the group.
     *
     * @return the value
     */
    public String getMemberRole() {
        return memberRole;
    }

    /** The Universally Unique Identifier (UUID) of the member server. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberUuid")
    private final String memberUuid;

    /**
     * The Universally Unique Identifier (UUID) of the member server.
     *
     * @return the value
     */
    public String getMemberUuid() {
        return memberUuid;
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
        sb.append("ManagedMySqlDatabaseHighAvailabilityMemberSummary(");
        sb.append("super=").append(super.toString());
        sb.append("memberHost=").append(String.valueOf(this.memberHost));
        sb.append(", memberPort=").append(String.valueOf(this.memberPort));
        sb.append(", memberState=").append(String.valueOf(this.memberState));
        sb.append(", memberRole=").append(String.valueOf(this.memberRole));
        sb.append(", memberUuid=").append(String.valueOf(this.memberUuid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseHighAvailabilityMemberSummary)) {
            return false;
        }

        ManagedMySqlDatabaseHighAvailabilityMemberSummary other =
                (ManagedMySqlDatabaseHighAvailabilityMemberSummary) o;
        return java.util.Objects.equals(this.memberHost, other.memberHost)
                && java.util.Objects.equals(this.memberPort, other.memberPort)
                && java.util.Objects.equals(this.memberState, other.memberState)
                && java.util.Objects.equals(this.memberRole, other.memberRole)
                && java.util.Objects.equals(this.memberUuid, other.memberUuid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.memberHost == null ? 43 : this.memberHost.hashCode());
        result = (result * PRIME) + (this.memberPort == null ? 43 : this.memberPort.hashCode());
        result = (result * PRIME) + (this.memberState == null ? 43 : this.memberState.hashCode());
        result = (result * PRIME) + (this.memberRole == null ? 43 : this.memberRole.hashCode());
        result = (result * PRIME) + (this.memberUuid == null ? 43 : this.memberUuid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
