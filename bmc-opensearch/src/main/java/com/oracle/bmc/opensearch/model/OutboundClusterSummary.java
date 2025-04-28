/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Contains details of a Outbound cluster <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OutboundClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OutboundClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "pingSchedule",
        "isSkipUnavailable",
        "seedClusterId",
        "mode"
    })
    public OutboundClusterSummary(
            String displayName,
            String pingSchedule,
            Boolean isSkipUnavailable,
            String seedClusterId,
            CccMode mode) {
        super();
        this.displayName = displayName;
        this.pingSchedule = pingSchedule;
        this.isSkipUnavailable = isSkipUnavailable;
        this.seedClusterId = seedClusterId;
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the Outbound cluster. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the Outbound cluster. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Sets the time interval between regular application-level ping messages that are sent to
         * try and keep outbound cluster connections alive. If set to -1, application-level ping
         * messages to this outbound cluster are not sent. If unset, application-level ping messages
         * are sent according to the global transport.ping_schedule setting, which defaults to -1
         * meaning that pings are not sent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pingSchedule")
        private String pingSchedule;

        /**
         * Sets the time interval between regular application-level ping messages that are sent to
         * try and keep outbound cluster connections alive. If set to -1, application-level ping
         * messages to this outbound cluster are not sent. If unset, application-level ping messages
         * are sent according to the global transport.ping_schedule setting, which defaults to -1
         * meaning that pings are not sent.
         *
         * @param pingSchedule the value to set
         * @return this builder
         */
        public Builder pingSchedule(String pingSchedule) {
            this.pingSchedule = pingSchedule;
            this.__explicitlySet__.add("pingSchedule");
            return this;
        }
        /**
         * Flag to indicate whether to skip the Outbound cluster during cross cluster search, if it
         * is unavailable
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipUnavailable")
        private Boolean isSkipUnavailable;

        /**
         * Flag to indicate whether to skip the Outbound cluster during cross cluster search, if it
         * is unavailable
         *
         * @param isSkipUnavailable the value to set
         * @return this builder
         */
        public Builder isSkipUnavailable(Boolean isSkipUnavailable) {
            this.isSkipUnavailable = isSkipUnavailable;
            this.__explicitlySet__.add("isSkipUnavailable");
            return this;
        }
        /** OCID of the Outbound cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("seedClusterId")
        private String seedClusterId;

        /**
         * OCID of the Outbound cluster
         *
         * @param seedClusterId the value to set
         * @return this builder
         */
        public Builder seedClusterId(String seedClusterId) {
            this.seedClusterId = seedClusterId;
            this.__explicitlySet__.add("seedClusterId");
            return this;
        }
        /** Mode for the cross cluster connection */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private CccMode mode;

        /**
         * Mode for the cross cluster connection
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(CccMode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutboundClusterSummary build() {
            OutboundClusterSummary model =
                    new OutboundClusterSummary(
                            this.displayName,
                            this.pingSchedule,
                            this.isSkipUnavailable,
                            this.seedClusterId,
                            this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutboundClusterSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("pingSchedule")) {
                this.pingSchedule(model.getPingSchedule());
            }
            if (model.wasPropertyExplicitlySet("isSkipUnavailable")) {
                this.isSkipUnavailable(model.getIsSkipUnavailable());
            }
            if (model.wasPropertyExplicitlySet("seedClusterId")) {
                this.seedClusterId(model.getSeedClusterId());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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

    /** Name of the Outbound cluster. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Outbound cluster. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the time interval between regular application-level ping messages that are sent to try
     * and keep outbound cluster connections alive. If set to -1, application-level ping messages to
     * this outbound cluster are not sent. If unset, application-level ping messages are sent
     * according to the global transport.ping_schedule setting, which defaults to -1 meaning that
     * pings are not sent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pingSchedule")
    private final String pingSchedule;

    /**
     * Sets the time interval between regular application-level ping messages that are sent to try
     * and keep outbound cluster connections alive. If set to -1, application-level ping messages to
     * this outbound cluster are not sent. If unset, application-level ping messages are sent
     * according to the global transport.ping_schedule setting, which defaults to -1 meaning that
     * pings are not sent.
     *
     * @return the value
     */
    public String getPingSchedule() {
        return pingSchedule;
    }

    /**
     * Flag to indicate whether to skip the Outbound cluster during cross cluster search, if it is
     * unavailable
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipUnavailable")
    private final Boolean isSkipUnavailable;

    /**
     * Flag to indicate whether to skip the Outbound cluster during cross cluster search, if it is
     * unavailable
     *
     * @return the value
     */
    public Boolean getIsSkipUnavailable() {
        return isSkipUnavailable;
    }

    /** OCID of the Outbound cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("seedClusterId")
    private final String seedClusterId;

    /**
     * OCID of the Outbound cluster
     *
     * @return the value
     */
    public String getSeedClusterId() {
        return seedClusterId;
    }

    /** Mode for the cross cluster connection */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final CccMode mode;

    /**
     * Mode for the cross cluster connection
     *
     * @return the value
     */
    public CccMode getMode() {
        return mode;
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
        sb.append("OutboundClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", pingSchedule=").append(String.valueOf(this.pingSchedule));
        sb.append(", isSkipUnavailable=").append(String.valueOf(this.isSkipUnavailable));
        sb.append(", seedClusterId=").append(String.valueOf(this.seedClusterId));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutboundClusterSummary)) {
            return false;
        }

        OutboundClusterSummary other = (OutboundClusterSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.pingSchedule, other.pingSchedule)
                && java.util.Objects.equals(this.isSkipUnavailable, other.isSkipUnavailable)
                && java.util.Objects.equals(this.seedClusterId, other.seedClusterId)
                && java.util.Objects.equals(this.mode, other.mode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.pingSchedule == null ? 43 : this.pingSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipUnavailable == null ? 43 : this.isSkipUnavailable.hashCode());
        result =
                (result * PRIME)
                        + (this.seedClusterId == null ? 43 : this.seedClusterId.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
