/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Status information for the channel attached to the DB System.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChannelStatusResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChannelStatusResult extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "channelId",
        "isHealthy",
        "isReceivedGtidSetApplied",
        "errors",
        "lagDuration"
    })
    public ChannelStatusResult(
            String channelId,
            Boolean isHealthy,
            Boolean isReceivedGtidSetApplied,
            java.util.List<String> errors,
            String lagDuration) {
        super();
        this.channelId = channelId;
        this.isHealthy = isHealthy;
        this.isReceivedGtidSetApplied = isReceivedGtidSetApplied;
        this.errors = errors;
        this.lagDuration = lagDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Channel for which the status is gathered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelId")
        private String channelId;

        /**
         * The OCID of the Channel for which the status is gathered.
         *
         * @param channelId the value to set
         * @return this builder
         **/
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            this.__explicitlySet__.add("channelId");
            return this;
        }
        /**
         * Specifies if the channel is healthy or not. If healthy, replication target DB System is connected to the
         * source and no replication errors are seen.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
        private Boolean isHealthy;

        /**
         * Specifies if the channel is healthy or not. If healthy, replication target DB System is connected to the
         * source and no replication errors are seen.
         *
         * @param isHealthy the value to set
         * @return this builder
         **/
        public Builder isHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            this.__explicitlySet__.add("isHealthy");
            return this;
        }
        /**
         * Specifies if all transactions received by this channel are executed and their GTIDs are part of gtid_executed
         * set.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReceivedGtidSetApplied")
        private Boolean isReceivedGtidSetApplied;

        /**
         * Specifies if all transactions received by this channel are executed and their GTIDs are part of gtid_executed
         * set.
         *
         * @param isReceivedGtidSetApplied the value to set
         * @return this builder
         **/
        public Builder isReceivedGtidSetApplied(Boolean isReceivedGtidSetApplied) {
            this.isReceivedGtidSetApplied = isReceivedGtidSetApplied;
            this.__explicitlySet__.add("isReceivedGtidSetApplied");
            return this;
        }
        /**
         * Channel errors identified, if there are any.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<String> errors;

        /**
         * Channel errors identified, if there are any.
         * @param errors the value to set
         * @return this builder
         **/
        public Builder errors(java.util.List<String> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }
        /**
         * The channel lag, with respect to the immediate source of the channel.
         * If the channel is configured with replication delay, the channel lag includes the replication delay.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lagDuration")
        private String lagDuration;

        /**
         * The channel lag, with respect to the immediate source of the channel.
         * If the channel is configured with replication delay, the channel lag includes the replication delay.
         *
         * @param lagDuration the value to set
         * @return this builder
         **/
        public Builder lagDuration(String lagDuration) {
            this.lagDuration = lagDuration;
            this.__explicitlySet__.add("lagDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChannelStatusResult build() {
            ChannelStatusResult model =
                    new ChannelStatusResult(
                            this.channelId,
                            this.isHealthy,
                            this.isReceivedGtidSetApplied,
                            this.errors,
                            this.lagDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChannelStatusResult model) {
            if (model.wasPropertyExplicitlySet("channelId")) {
                this.channelId(model.getChannelId());
            }
            if (model.wasPropertyExplicitlySet("isHealthy")) {
                this.isHealthy(model.getIsHealthy());
            }
            if (model.wasPropertyExplicitlySet("isReceivedGtidSetApplied")) {
                this.isReceivedGtidSetApplied(model.getIsReceivedGtidSetApplied());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
            }
            if (model.wasPropertyExplicitlySet("lagDuration")) {
                this.lagDuration(model.getLagDuration());
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
     * The OCID of the Channel for which the status is gathered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelId")
    private final String channelId;

    /**
     * The OCID of the Channel for which the status is gathered.
     *
     * @return the value
     **/
    public String getChannelId() {
        return channelId;
    }

    /**
     * Specifies if the channel is healthy or not. If healthy, replication target DB System is connected to the
     * source and no replication errors are seen.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
    private final Boolean isHealthy;

    /**
     * Specifies if the channel is healthy or not. If healthy, replication target DB System is connected to the
     * source and no replication errors are seen.
     *
     * @return the value
     **/
    public Boolean getIsHealthy() {
        return isHealthy;
    }

    /**
     * Specifies if all transactions received by this channel are executed and their GTIDs are part of gtid_executed
     * set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReceivedGtidSetApplied")
    private final Boolean isReceivedGtidSetApplied;

    /**
     * Specifies if all transactions received by this channel are executed and their GTIDs are part of gtid_executed
     * set.
     *
     * @return the value
     **/
    public Boolean getIsReceivedGtidSetApplied() {
        return isReceivedGtidSetApplied;
    }

    /**
     * Channel errors identified, if there are any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<String> errors;

    /**
     * Channel errors identified, if there are any.
     * @return the value
     **/
    public java.util.List<String> getErrors() {
        return errors;
    }

    /**
     * The channel lag, with respect to the immediate source of the channel.
     * If the channel is configured with replication delay, the channel lag includes the replication delay.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lagDuration")
    private final String lagDuration;

    /**
     * The channel lag, with respect to the immediate source of the channel.
     * If the channel is configured with replication delay, the channel lag includes the replication delay.
     *
     * @return the value
     **/
    public String getLagDuration() {
        return lagDuration;
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
        sb.append("ChannelStatusResult(");
        sb.append("super=").append(super.toString());
        sb.append("channelId=").append(String.valueOf(this.channelId));
        sb.append(", isHealthy=").append(String.valueOf(this.isHealthy));
        sb.append(", isReceivedGtidSetApplied=")
                .append(String.valueOf(this.isReceivedGtidSetApplied));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(", lagDuration=").append(String.valueOf(this.lagDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChannelStatusResult)) {
            return false;
        }

        ChannelStatusResult other = (ChannelStatusResult) o;
        return java.util.Objects.equals(this.channelId, other.channelId)
                && java.util.Objects.equals(this.isHealthy, other.isHealthy)
                && java.util.Objects.equals(
                        this.isReceivedGtidSetApplied, other.isReceivedGtidSetApplied)
                && java.util.Objects.equals(this.errors, other.errors)
                && java.util.Objects.equals(this.lagDuration, other.lagDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.channelId == null ? 43 : this.channelId.hashCode());
        result = (result * PRIME) + (this.isHealthy == null ? 43 : this.isHealthy.hashCode());
        result =
                (result * PRIME)
                        + (this.isReceivedGtidSetApplied == null
                                ? 43
                                : this.isReceivedGtidSetApplied.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + (this.lagDuration == null ? 43 : this.lagDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
