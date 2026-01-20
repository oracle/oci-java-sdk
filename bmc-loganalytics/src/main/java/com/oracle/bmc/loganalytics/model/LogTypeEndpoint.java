/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The LOG type endpoint configuration. Logs are fetched from the specified endpoint. For time based
 * incremental collection, specify the START_TIME macro with the desired time format, example:
 * {START_TIME:yyMMddHHmmssZ}. For offset based incremental collection, specify the START_OFFSET
 * macro with offset identifier in the API response, example: {START_OFFSET:$.offset} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogTypeEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "endpointType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogTypeEndpoint extends LogAnalyticsEndpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("logEndpoint")
        private LogEndpoint logEndpoint;

        public Builder logEndpoint(LogEndpoint logEndpoint) {
            this.logEndpoint = logEndpoint;
            this.__explicitlySet__.add("logEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogTypeEndpoint build() {
            LogTypeEndpoint model = new LogTypeEndpoint(this.logEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogTypeEndpoint model) {
            if (model.wasPropertyExplicitlySet("logEndpoint")) {
                this.logEndpoint(model.getLogEndpoint());
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

    @Deprecated
    public LogTypeEndpoint(LogEndpoint logEndpoint) {
        super();
        this.logEndpoint = logEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logEndpoint")
    private final LogEndpoint logEndpoint;

    public LogEndpoint getLogEndpoint() {
        return logEndpoint;
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
        sb.append("LogTypeEndpoint(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", logEndpoint=").append(String.valueOf(this.logEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogTypeEndpoint)) {
            return false;
        }

        LogTypeEndpoint other = (LogTypeEndpoint) o;
        return java.util.Objects.equals(this.logEndpoint, other.logEndpoint) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logEndpoint == null ? 43 : this.logEndpoint.hashCode());
        return result;
    }
}
