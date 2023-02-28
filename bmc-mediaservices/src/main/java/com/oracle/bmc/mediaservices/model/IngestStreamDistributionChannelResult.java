/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The Ingest Workflow Job information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IngestStreamDistributionChannelResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IngestStreamDistributionChannelResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mediaWorkflowJobId"})
    public IngestStreamDistributionChannelResult(String mediaWorkflowJobId) {
        super();
        this.mediaWorkflowJobId = mediaWorkflowJobId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier of the Ingest Workflow Job created. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
        private String mediaWorkflowJobId;

        /**
         * Identifier of the Ingest Workflow Job created.
         *
         * @param mediaWorkflowJobId the value to set
         * @return this builder
         */
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            this.__explicitlySet__.add("mediaWorkflowJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngestStreamDistributionChannelResult build() {
            IngestStreamDistributionChannelResult model =
                    new IngestStreamDistributionChannelResult(this.mediaWorkflowJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngestStreamDistributionChannelResult model) {
            if (model.wasPropertyExplicitlySet("mediaWorkflowJobId")) {
                this.mediaWorkflowJobId(model.getMediaWorkflowJobId());
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

    /** Identifier of the Ingest Workflow Job created. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
    private final String mediaWorkflowJobId;

    /**
     * Identifier of the Ingest Workflow Job created.
     *
     * @return the value
     */
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
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
        sb.append("IngestStreamDistributionChannelResult(");
        sb.append("super=").append(super.toString());
        sb.append("mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngestStreamDistributionChannelResult)) {
            return false;
        }

        IngestStreamDistributionChannelResult other = (IngestStreamDistributionChannelResult) o;
        return java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
