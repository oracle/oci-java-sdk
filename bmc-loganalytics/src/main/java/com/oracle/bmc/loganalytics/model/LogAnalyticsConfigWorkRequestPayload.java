/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsConfigWorkRequestPayload <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsConfigWorkRequestPayload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsConfigWorkRequestPayload
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The source name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source name.
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /** The entity unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity unique identifier.
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The lookup reference as an integer. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
        private Long lookupReference;

        /**
         * The lookup reference as an integer.
         *
         * @param lookupReference the value to set
         * @return this builder
         */
        public Builder lookupReference(Long lookupReference) {
            this.lookupReference = lookupReference;
            this.__explicitlySet__.add("lookupReference");
            return this;
        }
        /** lookupReference */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
        private String lookupReferenceString;

        /**
         * lookupReference
         *
         * @param lookupReferenceString the value to set
         * @return this builder
         */
        public Builder lookupReferenceString(String lookupReferenceString) {
            this.lookupReferenceString = lookupReferenceString;
            this.__explicitlySet__.add("lookupReferenceString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsConfigWorkRequestPayload build() {
            LogAnalyticsConfigWorkRequestPayload model =
                    new LogAnalyticsConfigWorkRequestPayload(
                            this.sourceName,
                            this.entityId,
                            this.lookupReference,
                            this.lookupReferenceString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsConfigWorkRequestPayload model) {
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("lookupReference")) {
                this.lookupReference(model.getLookupReference());
            }
            if (model.wasPropertyExplicitlySet("lookupReferenceString")) {
                this.lookupReferenceString(model.getLookupReferenceString());
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

    /** The source name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source name.
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
    }

    /** The entity unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity unique identifier.
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The lookup reference as an integer. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
    private final Long lookupReference;

    /**
     * The lookup reference as an integer.
     *
     * @return the value
     */
    public Long getLookupReference() {
        return lookupReference;
    }

    /** lookupReference */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
    private final String lookupReferenceString;

    /**
     * lookupReference
     *
     * @return the value
     */
    public String getLookupReferenceString() {
        return lookupReferenceString;
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
        sb.append("LogAnalyticsConfigWorkRequestPayload(");
        sb.append("super=").append(super.toString());
        sb.append("sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", lookupReference=").append(String.valueOf(this.lookupReference));
        sb.append(", lookupReferenceString=").append(String.valueOf(this.lookupReferenceString));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
