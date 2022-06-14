/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policies controlling the pushing of logs to OCI Public Logging.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationLoggingPolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationLoggingPolicies {
    @Deprecated
    @java.beans.ConstructorProperties({"accessLog", "executionLog"})
    public ApiSpecificationLoggingPolicies(
            AccessLogPolicy accessLog, ExecutionLogPolicy executionLog) {
        super();
        this.accessLog = accessLog;
        this.executionLog = executionLog;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("accessLog")
        private AccessLogPolicy accessLog;

        public Builder accessLog(AccessLogPolicy accessLog) {
            this.accessLog = accessLog;
            this.__explicitlySet__.add("accessLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionLog")
        private ExecutionLogPolicy executionLog;

        public Builder executionLog(ExecutionLogPolicy executionLog) {
            this.executionLog = executionLog;
            this.__explicitlySet__.add("executionLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationLoggingPolicies build() {
            ApiSpecificationLoggingPolicies __instance__ =
                    new ApiSpecificationLoggingPolicies(accessLog, executionLog);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationLoggingPolicies o) {
            Builder copiedBuilder = accessLog(o.getAccessLog()).executionLog(o.getExecutionLog());

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

    @com.fasterxml.jackson.annotation.JsonProperty("accessLog")
    private final AccessLogPolicy accessLog;

    public AccessLogPolicy getAccessLog() {
        return accessLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executionLog")
    private final ExecutionLogPolicy executionLog;

    public ExecutionLogPolicy getExecutionLog() {
        return executionLog;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiSpecificationLoggingPolicies(");
        sb.append("accessLog=").append(String.valueOf(this.accessLog));
        sb.append(", executionLog=").append(String.valueOf(this.executionLog));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationLoggingPolicies)) {
            return false;
        }

        ApiSpecificationLoggingPolicies other = (ApiSpecificationLoggingPolicies) o;
        return java.util.Objects.equals(this.accessLog, other.accessLog)
                && java.util.Objects.equals(this.executionLog, other.executionLog)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.accessLog == null ? 43 : this.accessLog.hashCode());
        result = (result * PRIME) + (this.executionLog == null ? 43 : this.executionLog.hashCode());
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
