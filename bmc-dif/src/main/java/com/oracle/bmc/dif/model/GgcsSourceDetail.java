/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * GGCS source configuration for creating or updating existing extracts. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GgcsSourceDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsSourceDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceId",
        "action",
        "shouldStartSourceOperations",
        "targetUri",
        "targetConnectionName"
    })
    public GgcsSourceDetail(
            String sourceId,
            WorkflowAction action,
            Boolean shouldStartSourceOperations,
            String targetUri,
            String targetConnectionName) {
        super();
        this.sourceId = sourceId;
        this.action = action;
        this.shouldStartSourceOperations = shouldStartSourceOperations;
        this.targetUri = targetUri;
        this.targetConnectionName = targetConnectionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ggcs source artifact id. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * Ggcs source artifact id.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** Action to be done over the user. Allowed values are "CREATE" or "UPDATE". */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private WorkflowAction action;

        /**
         * Action to be done over the user. Allowed values are "CREATE" or "UPDATE".
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(WorkflowAction action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** Boolean value that determines source operations should start or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldStartSourceOperations")
        private Boolean shouldStartSourceOperations;

        /**
         * Boolean value that determines source operations should start or not.
         *
         * @param shouldStartSourceOperations the value to set
         * @return this builder
         */
        public Builder shouldStartSourceOperations(Boolean shouldStartSourceOperations) {
            this.shouldStartSourceOperations = shouldStartSourceOperations;
            this.__explicitlySet__.add("shouldStartSourceOperations");
            return this;
        }
        /**
         * Target uri for the GoldenGate deployment where distribution path needs to be configured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetUri")
        private String targetUri;

        /**
         * Target uri for the GoldenGate deployment where distribution path needs to be configured.
         *
         * @param targetUri the value to set
         * @return this builder
         */
        public Builder targetUri(String targetUri) {
            this.targetUri = targetUri;
            this.__explicitlySet__.add("targetUri");
            return this;
        }
        /** Name of assigned connection for the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetConnectionName")
        private String targetConnectionName;

        /**
         * Name of assigned connection for the source.
         *
         * @param targetConnectionName the value to set
         * @return this builder
         */
        public Builder targetConnectionName(String targetConnectionName) {
            this.targetConnectionName = targetConnectionName;
            this.__explicitlySet__.add("targetConnectionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsSourceDetail build() {
            GgcsSourceDetail model =
                    new GgcsSourceDetail(
                            this.sourceId,
                            this.action,
                            this.shouldStartSourceOperations,
                            this.targetUri,
                            this.targetConnectionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsSourceDetail model) {
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("shouldStartSourceOperations")) {
                this.shouldStartSourceOperations(model.getShouldStartSourceOperations());
            }
            if (model.wasPropertyExplicitlySet("targetUri")) {
                this.targetUri(model.getTargetUri());
            }
            if (model.wasPropertyExplicitlySet("targetConnectionName")) {
                this.targetConnectionName(model.getTargetConnectionName());
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

    /** Ggcs source artifact id. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * Ggcs source artifact id.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /** Action to be done over the user. Allowed values are "CREATE" or "UPDATE". */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final WorkflowAction action;

    /**
     * Action to be done over the user. Allowed values are "CREATE" or "UPDATE".
     *
     * @return the value
     */
    public WorkflowAction getAction() {
        return action;
    }

    /** Boolean value that determines source operations should start or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldStartSourceOperations")
    private final Boolean shouldStartSourceOperations;

    /**
     * Boolean value that determines source operations should start or not.
     *
     * @return the value
     */
    public Boolean getShouldStartSourceOperations() {
        return shouldStartSourceOperations;
    }

    /** Target uri for the GoldenGate deployment where distribution path needs to be configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetUri")
    private final String targetUri;

    /**
     * Target uri for the GoldenGate deployment where distribution path needs to be configured.
     *
     * @return the value
     */
    public String getTargetUri() {
        return targetUri;
    }

    /** Name of assigned connection for the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetConnectionName")
    private final String targetConnectionName;

    /**
     * Name of assigned connection for the source.
     *
     * @return the value
     */
    public String getTargetConnectionName() {
        return targetConnectionName;
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
        sb.append("GgcsSourceDetail(");
        sb.append("super=").append(super.toString());
        sb.append("sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", shouldStartSourceOperations=")
                .append(String.valueOf(this.shouldStartSourceOperations));
        sb.append(", targetUri=").append(String.valueOf(this.targetUri));
        sb.append(", targetConnectionName=").append(String.valueOf(this.targetConnectionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsSourceDetail)) {
            return false;
        }

        GgcsSourceDetail other = (GgcsSourceDetail) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(
                        this.shouldStartSourceOperations, other.shouldStartSourceOperations)
                && java.util.Objects.equals(this.targetUri, other.targetUri)
                && java.util.Objects.equals(this.targetConnectionName, other.targetConnectionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldStartSourceOperations == null
                                ? 43
                                : this.shouldStartSourceOperations.hashCode());
        result = (result * PRIME) + (this.targetUri == null ? 43 : this.targetUri.hashCode());
        result =
                (result * PRIME)
                        + (this.targetConnectionName == null
                                ? 43
                                : this.targetConnectionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
