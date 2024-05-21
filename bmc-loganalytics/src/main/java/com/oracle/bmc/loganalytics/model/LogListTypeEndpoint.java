/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The LOG_LIST type endpoint configuration. The list of logs is first fetched using the listEndpoint configuration,
 * and then the logs are subsequently fetched using the logEndpoints, which reference the list endpoint response.
 * For time based incremental collection, specify the START_TIME macro with the desired time format,
 * example: {START_TIME:yyMMddHHmmssZ}.
 * For offset based incremental collection, specify the START_OFFSET macro with offset identifier in the API response,
 * example: {START_OFFSET:$.offset}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogListTypeEndpoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "endpointType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogListTypeEndpoint extends LogAnalyticsEndpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("listEndpoint")
        private LogListEndpoint listEndpoint;

        public Builder listEndpoint(LogListEndpoint listEndpoint) {
            this.listEndpoint = listEndpoint;
            this.__explicitlySet__.add("listEndpoint");
            return this;
        }
        /**
         * Log endpoints, which reference the listEndpoint response, to fetch log data.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logEndpoints")
        private java.util.List<LogEndpoint> logEndpoints;

        /**
         * Log endpoints, which reference the listEndpoint response, to fetch log data.
         *
         * @param logEndpoints the value to set
         * @return this builder
         **/
        public Builder logEndpoints(java.util.List<LogEndpoint> logEndpoints) {
            this.logEndpoints = logEndpoints;
            this.__explicitlySet__.add("logEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogListTypeEndpoint build() {
            LogListTypeEndpoint model =
                    new LogListTypeEndpoint(this.listEndpoint, this.logEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogListTypeEndpoint model) {
            if (model.wasPropertyExplicitlySet("listEndpoint")) {
                this.listEndpoint(model.getListEndpoint());
            }
            if (model.wasPropertyExplicitlySet("logEndpoints")) {
                this.logEndpoints(model.getLogEndpoints());
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

    @Deprecated
    public LogListTypeEndpoint(
            LogListEndpoint listEndpoint, java.util.List<LogEndpoint> logEndpoints) {
        super();
        this.listEndpoint = listEndpoint;
        this.logEndpoints = logEndpoints;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("listEndpoint")
    private final LogListEndpoint listEndpoint;

    public LogListEndpoint getListEndpoint() {
        return listEndpoint;
    }

    /**
     * Log endpoints, which reference the listEndpoint response, to fetch log data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logEndpoints")
    private final java.util.List<LogEndpoint> logEndpoints;

    /**
     * Log endpoints, which reference the listEndpoint response, to fetch log data.
     *
     * @return the value
     **/
    public java.util.List<LogEndpoint> getLogEndpoints() {
        return logEndpoints;
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
        sb.append("LogListTypeEndpoint(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", listEndpoint=").append(String.valueOf(this.listEndpoint));
        sb.append(", logEndpoints=").append(String.valueOf(this.logEndpoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogListTypeEndpoint)) {
            return false;
        }

        LogListTypeEndpoint other = (LogListTypeEndpoint) o;
        return java.util.Objects.equals(this.listEndpoint, other.listEndpoint)
                && java.util.Objects.equals(this.logEndpoints, other.logEndpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.listEndpoint == null ? 43 : this.listEndpoint.hashCode());
        result = (result * PRIME) + (this.logEndpoints == null ? 43 : this.logEndpoints.hashCode());
        return result;
    }
}
