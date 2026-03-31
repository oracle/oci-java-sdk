/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Information regarding a cluster's public api endpoint decommission.
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
    builder = PublicApiEndpointDecommissionStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublicApiEndpointDecommissionStatus
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeDecommissionRollbackDeadline", "status"})
    public PublicApiEndpointDecommissionStatus(
            java.util.Date timeDecommissionRollbackDeadline, Status status) {
        super();
        this.timeDecommissionRollbackDeadline = timeDecommissionRollbackDeadline;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date and time of rollback deadline for public api endpoint decommission.
         * Once the date is passed, rollback is not able to be launched.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissionRollbackDeadline")
        private java.util.Date timeDecommissionRollbackDeadline;

        /**
         * The date and time of rollback deadline for public api endpoint decommission.
         * Once the date is passed, rollback is not able to be launched.
         *
         * @param timeDecommissionRollbackDeadline the value to set
         * @return this builder
         **/
        public Builder timeDecommissionRollbackDeadline(
                java.util.Date timeDecommissionRollbackDeadline) {
            this.timeDecommissionRollbackDeadline = timeDecommissionRollbackDeadline;
            this.__explicitlySet__.add("timeDecommissionRollbackDeadline");
            return this;
        }
        /**
         * The current public api endpoint decommission status of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current public api endpoint decommission status of the cluster.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicApiEndpointDecommissionStatus build() {
            PublicApiEndpointDecommissionStatus model =
                    new PublicApiEndpointDecommissionStatus(
                            this.timeDecommissionRollbackDeadline, this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicApiEndpointDecommissionStatus model) {
            if (model.wasPropertyExplicitlySet("timeDecommissionRollbackDeadline")) {
                this.timeDecommissionRollbackDeadline(model.getTimeDecommissionRollbackDeadline());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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

    /**
     * The date and time of rollback deadline for public api endpoint decommission.
     * Once the date is passed, rollback is not able to be launched.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissionRollbackDeadline")
    private final java.util.Date timeDecommissionRollbackDeadline;

    /**
     * The date and time of rollback deadline for public api endpoint decommission.
     * Once the date is passed, rollback is not able to be launched.
     *
     * @return the value
     **/
    public java.util.Date getTimeDecommissionRollbackDeadline() {
        return timeDecommissionRollbackDeadline;
    }

    /**
     * The current public api endpoint decommission status of the cluster.
     **/
    public enum Status {
        Pending("PENDING"),
        InProgress("IN_PROGRESS"),
        RollingBack("ROLLING_BACK"),
        Decommissioned("DECOMMISSIONED"),
        Finalized("FINALIZED"),
        DecommissionFailed("DECOMMISSION_FAILED"),
        RollbackFailed("ROLLBACK_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current public api endpoint decommission status of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current public api endpoint decommission status of the cluster.
     * @return the value
     **/
    public Status getStatus() {
        return status;
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
        sb.append("PublicApiEndpointDecommissionStatus(");
        sb.append("super=").append(super.toString());
        sb.append("timeDecommissionRollbackDeadline=")
                .append(String.valueOf(this.timeDecommissionRollbackDeadline));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublicApiEndpointDecommissionStatus)) {
            return false;
        }

        PublicApiEndpointDecommissionStatus other = (PublicApiEndpointDecommissionStatus) o;
        return java.util.Objects.equals(
                        this.timeDecommissionRollbackDeadline,
                        other.timeDecommissionRollbackDeadline)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDecommissionRollbackDeadline == null
                                ? 43
                                : this.timeDecommissionRollbackDeadline.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
