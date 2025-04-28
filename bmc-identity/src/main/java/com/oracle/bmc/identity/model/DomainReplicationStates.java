/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) The identity domain replication log for all
 * identity domains for a given region. <br>
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
        builder = DomainReplicationStates.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DomainReplicationStates
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domainId", "state", "replicaRegion"})
    public DomainReplicationStates(String domainId, State state, String replicaRegion) {
        super();
        this.domainId = domainId;
        this.state = state;
        this.replicaRegion = replicaRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the identity domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The OCID of the identity domain.
         *
         * @param domainId the value to set
         * @return this builder
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }
        /** The IDCS-replicated region state. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The IDCS-replicated region state.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** The replica region for the identity domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
        private String replicaRegion;

        /**
         * The replica region for the identity domain.
         *
         * @param replicaRegion the value to set
         * @return this builder
         */
        public Builder replicaRegion(String replicaRegion) {
            this.replicaRegion = replicaRegion;
            this.__explicitlySet__.add("replicaRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainReplicationStates build() {
            DomainReplicationStates model =
                    new DomainReplicationStates(this.domainId, this.state, this.replicaRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainReplicationStates model) {
            if (model.wasPropertyExplicitlySet("domainId")) {
                this.domainId(model.getDomainId());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("replicaRegion")) {
                this.replicaRegion(model.getReplicaRegion());
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

    /** The OCID of the identity domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The OCID of the identity domain.
     *
     * @return the value
     */
    public String getDomainId() {
        return domainId;
    }

    /** The IDCS-replicated region state. */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        EnablingReplication("ENABLING_REPLICATION"),
        ReplicationEnabled("REPLICATION_ENABLED"),
        DisablingReplication("DISABLING_REPLICATION"),
        ReplicationDisabled("REPLICATION_DISABLED"),
        Deleted("DELETED"),
        ;

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                map.put(v.getValue(), v);
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid State: " + key);
        }
    };
    /** The IDCS-replicated region state. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The IDCS-replicated region state.
     *
     * @return the value
     */
    public State getState() {
        return state;
    }

    /** The replica region for the identity domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
    private final String replicaRegion;

    /**
     * The replica region for the identity domain.
     *
     * @return the value
     */
    public String getReplicaRegion() {
        return replicaRegion;
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
        sb.append("DomainReplicationStates(");
        sb.append("super=").append(super.toString());
        sb.append("domainId=").append(String.valueOf(this.domainId));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", replicaRegion=").append(String.valueOf(this.replicaRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DomainReplicationStates)) {
            return false;
        }

        DomainReplicationStates other = (DomainReplicationStates) o;
        return java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.replicaRegion, other.replicaRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaRegion == null ? 43 : this.replicaRegion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
