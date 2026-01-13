/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Configuration of Logging for ML Application Implementation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImplementationLogging.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImplementationLogging
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "implementationLog",
        "aggregatedInstanceViewLog",
        "triggerLog"
    })
    public ImplementationLogging(
            ImplementationLogDetails implementationLog,
            ImplementationLogDetails aggregatedInstanceViewLog,
            ImplementationLogDetails triggerLog) {
        super();
        this.implementationLog = implementationLog;
        this.aggregatedInstanceViewLog = aggregatedInstanceViewLog;
        this.triggerLog = triggerLog;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("implementationLog")
        private ImplementationLogDetails implementationLog;

        public Builder implementationLog(ImplementationLogDetails implementationLog) {
            this.implementationLog = implementationLog;
            this.__explicitlySet__.add("implementationLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedInstanceViewLog")
        private ImplementationLogDetails aggregatedInstanceViewLog;

        public Builder aggregatedInstanceViewLog(
                ImplementationLogDetails aggregatedInstanceViewLog) {
            this.aggregatedInstanceViewLog = aggregatedInstanceViewLog;
            this.__explicitlySet__.add("aggregatedInstanceViewLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerLog")
        private ImplementationLogDetails triggerLog;

        public Builder triggerLog(ImplementationLogDetails triggerLog) {
            this.triggerLog = triggerLog;
            this.__explicitlySet__.add("triggerLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImplementationLogging build() {
            ImplementationLogging model =
                    new ImplementationLogging(
                            this.implementationLog,
                            this.aggregatedInstanceViewLog,
                            this.triggerLog);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImplementationLogging model) {
            if (model.wasPropertyExplicitlySet("implementationLog")) {
                this.implementationLog(model.getImplementationLog());
            }
            if (model.wasPropertyExplicitlySet("aggregatedInstanceViewLog")) {
                this.aggregatedInstanceViewLog(model.getAggregatedInstanceViewLog());
            }
            if (model.wasPropertyExplicitlySet("triggerLog")) {
                this.triggerLog(model.getTriggerLog());
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

    @com.fasterxml.jackson.annotation.JsonProperty("implementationLog")
    private final ImplementationLogDetails implementationLog;

    public ImplementationLogDetails getImplementationLog() {
        return implementationLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedInstanceViewLog")
    private final ImplementationLogDetails aggregatedInstanceViewLog;

    public ImplementationLogDetails getAggregatedInstanceViewLog() {
        return aggregatedInstanceViewLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerLog")
    private final ImplementationLogDetails triggerLog;

    public ImplementationLogDetails getTriggerLog() {
        return triggerLog;
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
        sb.append("ImplementationLogging(");
        sb.append("super=").append(super.toString());
        sb.append("implementationLog=").append(String.valueOf(this.implementationLog));
        sb.append(", aggregatedInstanceViewLog=")
                .append(String.valueOf(this.aggregatedInstanceViewLog));
        sb.append(", triggerLog=").append(String.valueOf(this.triggerLog));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImplementationLogging)) {
            return false;
        }

        ImplementationLogging other = (ImplementationLogging) o;
        return java.util.Objects.equals(this.implementationLog, other.implementationLog)
                && java.util.Objects.equals(
                        this.aggregatedInstanceViewLog, other.aggregatedInstanceViewLog)
                && java.util.Objects.equals(this.triggerLog, other.triggerLog)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.implementationLog == null ? 43 : this.implementationLog.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedInstanceViewLog == null
                                ? 43
                                : this.aggregatedInstanceViewLog.hashCode());
        result = (result * PRIME) + (this.triggerLog == null ? 43 : this.triggerLog.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
