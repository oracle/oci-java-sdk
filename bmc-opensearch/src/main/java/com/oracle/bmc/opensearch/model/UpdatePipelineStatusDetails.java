/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * update pipeline status. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePipelineStatusDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePipelineStatusDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pipelineId", "lifecycleState"})
    public UpdatePipelineStatusDetails(String pipelineId, String lifecycleState) {
        super();
        this.pipelineId = pipelineId;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the OpenSearch Pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
        private String pipelineId;

        /**
         * OCID of the OpenSearch Pipeline.
         *
         * @param pipelineId the value to set
         * @return this builder
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            this.__explicitlySet__.add("pipelineId");
            return this;
        }
        /** the new status of the OpenSearch Pipeline */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private String lifecycleState;

        /**
         * the new status of the OpenSearch Pipeline
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePipelineStatusDetails build() {
            UpdatePipelineStatusDetails model =
                    new UpdatePipelineStatusDetails(this.pipelineId, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePipelineStatusDetails model) {
            if (model.wasPropertyExplicitlySet("pipelineId")) {
                this.pipelineId(model.getPipelineId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** OCID of the OpenSearch Pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
    private final String pipelineId;

    /**
     * OCID of the OpenSearch Pipeline.
     *
     * @return the value
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /** the new status of the OpenSearch Pipeline */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final String lifecycleState;

    /**
     * the new status of the OpenSearch Pipeline
     *
     * @return the value
     */
    public String getLifecycleState() {
        return lifecycleState;
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
        sb.append("UpdatePipelineStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePipelineStatusDetails)) {
            return false;
        }

        UpdatePipelineStatusDetails other = (UpdatePipelineStatusDetails) o;
        return java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
