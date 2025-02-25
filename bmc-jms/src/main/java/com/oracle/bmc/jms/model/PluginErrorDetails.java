/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Details of a plugin error.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PluginErrorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PluginErrorDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reason", "details", "timeLastSeen"})
    public PluginErrorDetails(
            PluginErrorReason reason, String details, java.util.Date timeLastSeen) {
        super();
        this.reason = reason;
        this.details = details;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The plugin error reason.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private PluginErrorReason reason;

        /**
         * The plugin error reason.
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(PluginErrorReason reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /**
         * Optional string containing additional details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * Optional string containing additional details.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         **/
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluginErrorDetails build() {
            PluginErrorDetails model =
                    new PluginErrorDetails(this.reason, this.details, this.timeLastSeen);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluginErrorDetails model) {
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
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
     * The plugin error reason.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final PluginErrorReason reason;

    /**
     * The plugin error reason.
     * @return the value
     **/
    public PluginErrorReason getReason() {
        return reason;
    }

    /**
     * Optional string containing additional details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * Optional string containing additional details.
     * @return the value
     **/
    public String getDetails() {
        return details;
    }

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
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
        sb.append("PluginErrorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reason=").append(String.valueOf(this.reason));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginErrorDetails)) {
            return false;
        }

        PluginErrorDetails other = (PluginErrorDetails) o;
        return java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
