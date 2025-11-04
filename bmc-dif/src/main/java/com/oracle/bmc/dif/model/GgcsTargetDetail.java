/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * GGCS target configuration for creating or updating existing replicats. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GgcsTargetDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsTargetDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "action",
        "shouldStartTargetOperations",
        "sourceUri",
        "sourceConnectionName"
    })
    public GgcsTargetDetail(
            String targetId,
            WorkflowAction action,
            Boolean shouldStartTargetOperations,
            String sourceUri,
            String sourceConnectionName) {
        super();
        this.targetId = targetId;
        this.action = action;
        this.shouldStartTargetOperations = shouldStartTargetOperations;
        this.sourceUri = sourceUri;
        this.sourceConnectionName = sourceConnectionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** GGCS target artifact id. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * GGCS target artifact id.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
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
        /** Boolean value that determines target operations should start or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldStartTargetOperations")
        private Boolean shouldStartTargetOperations;

        /**
         * Boolean value that determines target operations should start or not.
         *
         * @param shouldStartTargetOperations the value to set
         * @return this builder
         */
        public Builder shouldStartTargetOperations(Boolean shouldStartTargetOperations) {
            this.shouldStartTargetOperations = shouldStartTargetOperations;
            this.__explicitlySet__.add("shouldStartTargetOperations");
            return this;
        }
        /**
         * Source uri for the GoldenGate deployment from where the collector path needs to be
         * configured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
        private String sourceUri;

        /**
         * Source uri for the GoldenGate deployment from where the collector path needs to be
         * configured.
         *
         * @param sourceUri the value to set
         * @return this builder
         */
        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            this.__explicitlySet__.add("sourceUri");
            return this;
        }
        /** Name of assigned connection for the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceConnectionName")
        private String sourceConnectionName;

        /**
         * Name of assigned connection for the target.
         *
         * @param sourceConnectionName the value to set
         * @return this builder
         */
        public Builder sourceConnectionName(String sourceConnectionName) {
            this.sourceConnectionName = sourceConnectionName;
            this.__explicitlySet__.add("sourceConnectionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsTargetDetail build() {
            GgcsTargetDetail model =
                    new GgcsTargetDetail(
                            this.targetId,
                            this.action,
                            this.shouldStartTargetOperations,
                            this.sourceUri,
                            this.sourceConnectionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsTargetDetail model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("shouldStartTargetOperations")) {
                this.shouldStartTargetOperations(model.getShouldStartTargetOperations());
            }
            if (model.wasPropertyExplicitlySet("sourceUri")) {
                this.sourceUri(model.getSourceUri());
            }
            if (model.wasPropertyExplicitlySet("sourceConnectionName")) {
                this.sourceConnectionName(model.getSourceConnectionName());
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

    /** GGCS target artifact id. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * GGCS target artifact id.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
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

    /** Boolean value that determines target operations should start or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldStartTargetOperations")
    private final Boolean shouldStartTargetOperations;

    /**
     * Boolean value that determines target operations should start or not.
     *
     * @return the value
     */
    public Boolean getShouldStartTargetOperations() {
        return shouldStartTargetOperations;
    }

    /**
     * Source uri for the GoldenGate deployment from where the collector path needs to be
     * configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    private final String sourceUri;

    /**
     * Source uri for the GoldenGate deployment from where the collector path needs to be
     * configured.
     *
     * @return the value
     */
    public String getSourceUri() {
        return sourceUri;
    }

    /** Name of assigned connection for the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceConnectionName")
    private final String sourceConnectionName;

    /**
     * Name of assigned connection for the target.
     *
     * @return the value
     */
    public String getSourceConnectionName() {
        return sourceConnectionName;
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
        sb.append("GgcsTargetDetail(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", shouldStartTargetOperations=")
                .append(String.valueOf(this.shouldStartTargetOperations));
        sb.append(", sourceUri=").append(String.valueOf(this.sourceUri));
        sb.append(", sourceConnectionName=").append(String.valueOf(this.sourceConnectionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsTargetDetail)) {
            return false;
        }

        GgcsTargetDetail other = (GgcsTargetDetail) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(
                        this.shouldStartTargetOperations, other.shouldStartTargetOperations)
                && java.util.Objects.equals(this.sourceUri, other.sourceUri)
                && java.util.Objects.equals(this.sourceConnectionName, other.sourceConnectionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldStartTargetOperations == null
                                ? 43
                                : this.shouldStartTargetOperations.hashCode());
        result = (result * PRIME) + (this.sourceUri == null ? 43 : this.sourceUri.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceConnectionName == null
                                ? 43
                                : this.sourceConnectionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
