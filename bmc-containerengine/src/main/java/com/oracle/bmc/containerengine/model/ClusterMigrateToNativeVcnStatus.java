/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Information regarding a cluster's move to Native VCN.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterMigrateToNativeVcnStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterMigrateToNativeVcnStatus {
    @Deprecated
    @java.beans.ConstructorProperties({"timeDecommissionScheduled", "state"})
    public ClusterMigrateToNativeVcnStatus(java.util.Date timeDecommissionScheduled, State state) {
        super();
        this.timeDecommissionScheduled = timeDecommissionScheduled;
        this.state = state;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissionScheduled")
        private java.util.Date timeDecommissionScheduled;

        public Builder timeDecommissionScheduled(java.util.Date timeDecommissionScheduled) {
            this.timeDecommissionScheduled = timeDecommissionScheduled;
            this.__explicitlySet__.add("timeDecommissionScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterMigrateToNativeVcnStatus build() {
            ClusterMigrateToNativeVcnStatus __instance__ =
                    new ClusterMigrateToNativeVcnStatus(timeDecommissionScheduled, state);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterMigrateToNativeVcnStatus o) {
            Builder copiedBuilder =
                    timeDecommissionScheduled(o.getTimeDecommissionScheduled()).state(o.getState());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    /**
     * The date and time the non-native VCN is due to be decommissioned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissionScheduled")
    private final java.util.Date timeDecommissionScheduled;

    public java.util.Date getTimeDecommissionScheduled() {
        return timeDecommissionScheduled;
    }

    /**
     * The current migration status of the cluster.
     **/
    public enum State {
        NotStarted("NOT_STARTED"),
        Requested("REQUESTED"),
        InProgress("IN_PROGRESS"),
        PendingDecommission("PENDING_DECOMMISSION"),
        Completed("COMPLETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current migration status of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterMigrateToNativeVcnStatus(");
        sb.append("timeDecommissionScheduled=")
                .append(String.valueOf(this.timeDecommissionScheduled));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterMigrateToNativeVcnStatus)) {
            return false;
        }

        ClusterMigrateToNativeVcnStatus other = (ClusterMigrateToNativeVcnStatus) o;
        return java.util.Objects.equals(
                        this.timeDecommissionScheduled, other.timeDecommissionScheduled)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDecommissionScheduled == null
                                ? 43
                                : this.timeDecommissionScheduled.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
