/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging destination object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentLoggingDestination.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentLoggingDestination {
    @Deprecated
    @java.beans.ConstructorProperties({"logObjectId"})
    public UnifiedAgentLoggingDestination(String logObjectId) {
        super();
        this.logObjectId = logObjectId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logObjectId")
        private String logObjectId;

        /**
         * The OCID of the resource.
         * @param logObjectId the value to set
         * @return this builder
         **/
        public Builder logObjectId(String logObjectId) {
            this.logObjectId = logObjectId;
            this.__explicitlySet__.add("logObjectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentLoggingDestination build() {
            UnifiedAgentLoggingDestination __instance__ =
                    new UnifiedAgentLoggingDestination(logObjectId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentLoggingDestination o) {
            Builder copiedBuilder = logObjectId(o.getLogObjectId());

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

    /**
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logObjectId")
    private final String logObjectId;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getLogObjectId() {
        return logObjectId;
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
        sb.append("UnifiedAgentLoggingDestination(");
        sb.append("logObjectId=").append(String.valueOf(this.logObjectId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentLoggingDestination)) {
            return false;
        }

        UnifiedAgentLoggingDestination other = (UnifiedAgentLoggingDestination) o;
        return java.util.Objects.equals(this.logObjectId, other.logObjectId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logObjectId == null ? 43 : this.logObjectId.hashCode());
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
