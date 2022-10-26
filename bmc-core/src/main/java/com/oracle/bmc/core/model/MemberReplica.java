/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * OCIDs for the volume replicas in this volume group replica. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MemberReplica.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MemberReplica extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeReplicaId", "membershipState"})
    public MemberReplica(String volumeReplicaId, MembershipState membershipState) {
        super();
        this.volumeReplicaId = volumeReplicaId;
        this.membershipState = membershipState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The volume replica ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeReplicaId")
        private String volumeReplicaId;

        /**
         * The volume replica ID.
         *
         * @param volumeReplicaId the value to set
         * @return this builder
         */
        public Builder volumeReplicaId(String volumeReplicaId) {
            this.volumeReplicaId = volumeReplicaId;
            this.__explicitlySet__.add("volumeReplicaId");
            return this;
        }
        /** Membership state of the volume replica in relation to the volume group replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("membershipState")
        private MembershipState membershipState;

        /**
         * Membership state of the volume replica in relation to the volume group replica.
         *
         * @param membershipState the value to set
         * @return this builder
         */
        public Builder membershipState(MembershipState membershipState) {
            this.membershipState = membershipState;
            this.__explicitlySet__.add("membershipState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemberReplica build() {
            MemberReplica model = new MemberReplica(this.volumeReplicaId, this.membershipState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemberReplica model) {
            if (model.wasPropertyExplicitlySet("volumeReplicaId")) {
                this.volumeReplicaId(model.getVolumeReplicaId());
            }
            if (model.wasPropertyExplicitlySet("membershipState")) {
                this.membershipState(model.getMembershipState());
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

    /** The volume replica ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeReplicaId")
    private final String volumeReplicaId;

    /**
     * The volume replica ID.
     *
     * @return the value
     */
    public String getVolumeReplicaId() {
        return volumeReplicaId;
    }

    /** Membership state of the volume replica in relation to the volume group replica. */
    public enum MembershipState implements com.oracle.bmc.http.internal.BmcEnum {
        AddPending("ADD_PENDING"),
        Stable("STABLE"),
        RemovePending("REMOVE_PENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MembershipState.class);

        private final String value;
        private static java.util.Map<String, MembershipState> map;

        static {
            map = new java.util.HashMap<>();
            for (MembershipState v : MembershipState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MembershipState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MembershipState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MembershipState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Membership state of the volume replica in relation to the volume group replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("membershipState")
    private final MembershipState membershipState;

    /**
     * Membership state of the volume replica in relation to the volume group replica.
     *
     * @return the value
     */
    public MembershipState getMembershipState() {
        return membershipState;
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
        sb.append("MemberReplica(");
        sb.append("super=").append(super.toString());
        sb.append("volumeReplicaId=").append(String.valueOf(this.volumeReplicaId));
        sb.append(", membershipState=").append(String.valueOf(this.membershipState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberReplica)) {
            return false;
        }

        MemberReplica other = (MemberReplica) o;
        return java.util.Objects.equals(this.volumeReplicaId, other.volumeReplicaId)
                && java.util.Objects.equals(this.membershipState, other.membershipState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.volumeReplicaId == null ? 43 : this.volumeReplicaId.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipState == null ? 43 : this.membershipState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
