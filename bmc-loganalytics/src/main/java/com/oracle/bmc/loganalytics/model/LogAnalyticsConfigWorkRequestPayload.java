/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsConfigWorkRequestPayload
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
    builder = LogAnalyticsConfigWorkRequestPayload.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsConfigWorkRequestPayload {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceName",
        "entityId",
        "lookupReference",
        "lookupReferenceString"
    })
    public LogAnalyticsConfigWorkRequestPayload(
            String sourceName,
            String entityId,
            Long lookupReference,
            String lookupReferenceString) {
        super();
        this.sourceName = sourceName;
        this.entityId = entityId;
        this.lookupReference = lookupReference;
        this.lookupReferenceString = lookupReferenceString;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
        private Long lookupReference;

        public Builder lookupReference(Long lookupReference) {
            this.lookupReference = lookupReference;
            this.__explicitlySet__.add("lookupReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
        private String lookupReferenceString;

        public Builder lookupReferenceString(String lookupReferenceString) {
            this.lookupReferenceString = lookupReferenceString;
            this.__explicitlySet__.add("lookupReferenceString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsConfigWorkRequestPayload build() {
            LogAnalyticsConfigWorkRequestPayload __instance__ =
                    new LogAnalyticsConfigWorkRequestPayload(
                            sourceName, entityId, lookupReference, lookupReferenceString);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsConfigWorkRequestPayload o) {
            Builder copiedBuilder =
                    sourceName(o.getSourceName())
                            .entityId(o.getEntityId())
                            .lookupReference(o.getLookupReference())
                            .lookupReferenceString(o.getLookupReferenceString());

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
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    public String getSourceName() {
        return sourceName;
    }

    /**
     * The entity unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    public String getEntityId() {
        return entityId;
    }

    /**
     * The lookup reference as an integer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
    private final Long lookupReference;

    public Long getLookupReference() {
        return lookupReference;
    }

    /**
     * lookupReference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
    private final String lookupReferenceString;

    public String getLookupReferenceString() {
        return lookupReferenceString;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsConfigWorkRequestPayload(");
        sb.append("sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", lookupReference=").append(String.valueOf(this.lookupReference));
        sb.append(", lookupReferenceString=").append(String.valueOf(this.lookupReferenceString));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsConfigWorkRequestPayload)) {
            return false;
        }

        LogAnalyticsConfigWorkRequestPayload other = (LogAnalyticsConfigWorkRequestPayload) o;
        return java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.lookupReference, other.lookupReference)
                && java.util.Objects.equals(this.lookupReferenceString, other.lookupReferenceString)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupReference == null ? 43 : this.lookupReference.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupReferenceString == null
                                ? 43
                                : this.lookupReferenceString.hashCode());
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
