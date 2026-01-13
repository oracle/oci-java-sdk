/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The Logging source. For configuration instructions, see [Creating a Connector with a Logging
 * Source](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector-logging-source.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoggingSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoggingSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The logs for this Logging source. */
        @com.fasterxml.jackson.annotation.JsonProperty("logSources")
        private java.util.List<LogSource> logSources;

        /**
         * The logs for this Logging source.
         *
         * @param logSources the value to set
         * @return this builder
         */
        public Builder logSources(java.util.List<LogSource> logSources) {
            this.logSources = logSources;
            this.__explicitlySet__.add("logSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingSourceDetails build() {
            LoggingSourceDetails model = new LoggingSourceDetails(this.logSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingSourceDetails model) {
            if (model.wasPropertyExplicitlySet("logSources")) {
                this.logSources(model.getLogSources());
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
    public LoggingSourceDetails(java.util.List<LogSource> logSources) {
        super();
        this.logSources = logSources;
    }

    /** The logs for this Logging source. */
    @com.fasterxml.jackson.annotation.JsonProperty("logSources")
    private final java.util.List<LogSource> logSources;

    /**
     * The logs for this Logging source.
     *
     * @return the value
     */
    public java.util.List<LogSource> getLogSources() {
        return logSources;
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
        sb.append("LoggingSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", logSources=").append(String.valueOf(this.logSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingSourceDetails)) {
            return false;
        }

        LoggingSourceDetails other = (LoggingSourceDetails) o;
        return java.util.Objects.equals(this.logSources, other.logSources) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logSources == null ? 43 : this.logSources.hashCode());
        return result;
    }
}
