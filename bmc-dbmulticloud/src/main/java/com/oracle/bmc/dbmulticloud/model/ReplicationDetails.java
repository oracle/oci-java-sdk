/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Replication metadata details, targeted regions and respective replication state, time created or
 * time when it was updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "replicationState",
        "targetRegion",
        "timeCreated",
        "timeUpdated"
    })
    public ReplicationDetails(
            ReplicationState replicationState,
            String targetRegion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.replicationState = replicationState;
        this.targetRegion = targetRegion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The lifecycle state of the Oracle DB Azure Vault resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationState")
        private ReplicationState replicationState;

        /**
         * The lifecycle state of the Oracle DB Azure Vault resource.
         *
         * @param replicationState the value to set
         * @return this builder
         */
        public Builder replicationState(ReplicationState replicationState) {
            this.replicationState = replicationState;
            this.__explicitlySet__.add("replicationState");
            return this;
        }
        /** The target region, where resource is replicated. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
        private String targetRegion;

        /**
         * The target region, where resource is replicated.
         *
         * @param targetRegion the value to set
         * @return this builder
         */
        public Builder targetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            this.__explicitlySet__.add("targetRegion");
            return this;
        }
        /**
         * Time when the Replication was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, e.g. '2020-05-23T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Replication was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, e.g. '2020-05-23T21:10:29.600Z'
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time when the Replication was last modified, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-23T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Replication was last modified, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-23T21:10:29.600Z'
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationDetails build() {
            ReplicationDetails model =
                    new ReplicationDetails(
                            this.replicationState,
                            this.targetRegion,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationDetails model) {
            if (model.wasPropertyExplicitlySet("replicationState")) {
                this.replicationState(model.getReplicationState());
            }
            if (model.wasPropertyExplicitlySet("targetRegion")) {
                this.targetRegion(model.getTargetRegion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The lifecycle state of the Oracle DB Azure Vault resource. */
    public enum ReplicationState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReplicationState.class);

        private final String value;
        private static java.util.Map<String, ReplicationState> map;

        static {
            map = new java.util.HashMap<>();
            for (ReplicationState v : ReplicationState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReplicationState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReplicationState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReplicationState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The lifecycle state of the Oracle DB Azure Vault resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationState")
    private final ReplicationState replicationState;

    /**
     * The lifecycle state of the Oracle DB Azure Vault resource.
     *
     * @return the value
     */
    public ReplicationState getReplicationState() {
        return replicationState;
    }

    /** The target region, where resource is replicated. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
    private final String targetRegion;

    /**
     * The target region, where resource is replicated.
     *
     * @return the value
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    /**
     * Time when the Replication was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, e.g. '2020-05-23T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Replication was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, e.g. '2020-05-23T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Replication was last modified, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-23T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Replication was last modified, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-23T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ReplicationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("replicationState=").append(String.valueOf(this.replicationState));
        sb.append(", targetRegion=").append(String.valueOf(this.targetRegion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationDetails)) {
            return false;
        }

        ReplicationDetails other = (ReplicationDetails) o;
        return java.util.Objects.equals(this.replicationState, other.replicationState)
                && java.util.Objects.equals(this.targetRegion, other.targetRegion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicationState == null ? 43 : this.replicationState.hashCode());
        result = (result * PRIME) + (this.targetRegion == null ? 43 : this.targetRegion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
