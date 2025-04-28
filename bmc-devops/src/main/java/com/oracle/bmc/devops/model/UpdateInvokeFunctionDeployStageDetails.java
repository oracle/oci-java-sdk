/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Invoke Function stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateInvokeFunctionDeployStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateInvokeFunctionDeployStageDetails extends UpdateDeployStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** Function environment OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
        private String functionDeployEnvironmentId;

        /**
         * Function environment OCID.
         *
         * @param functionDeployEnvironmentId the value to set
         * @return this builder
         */
        public Builder functionDeployEnvironmentId(String functionDeployEnvironmentId) {
            this.functionDeployEnvironmentId = functionDeployEnvironmentId;
            this.__explicitlySet__.add("functionDeployEnvironmentId");
            return this;
        }
        /**
         * Optional artifact OCID. The artifact will be included in the body for the function
         * invocation during the stage's execution. If the DeployArtifact.argumentSubstituitionMode
         * is set to SUBSTITUTE_PLACEHOLDERS, then the pipeline parameter values will be used to
         * replace the placeholders in the artifact content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        /**
         * Optional artifact OCID. The artifact will be included in the body for the function
         * invocation during the stage's execution. If the DeployArtifact.argumentSubstituitionMode
         * is set to SUBSTITUTE_PLACEHOLDERS, then the pipeline parameter values will be used to
         * replace the placeholders in the artifact content.
         *
         * @param deployArtifactId the value to set
         * @return this builder
         */
        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }
        /** A boolean flag specifies whether this stage executes asynchronously. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAsync")
        private Boolean isAsync;

        /**
         * A boolean flag specifies whether this stage executes asynchronously.
         *
         * @param isAsync the value to set
         * @return this builder
         */
        public Builder isAsync(Boolean isAsync) {
            this.isAsync = isAsync;
            this.__explicitlySet__.add("isAsync");
            return this;
        }
        /** A boolean flag specifies whether the invoked function must be validated. */
        @com.fasterxml.jackson.annotation.JsonProperty("isValidationEnabled")
        private Boolean isValidationEnabled;

        /**
         * A boolean flag specifies whether the invoked function must be validated.
         *
         * @param isValidationEnabled the value to set
         * @return this builder
         */
        public Builder isValidationEnabled(Boolean isValidationEnabled) {
            this.isValidationEnabled = isValidationEnabled;
            this.__explicitlySet__.add("isValidationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInvokeFunctionDeployStageDetails build() {
            UpdateInvokeFunctionDeployStageDetails model =
                    new UpdateInvokeFunctionDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.functionDeployEnvironmentId,
                            this.deployArtifactId,
                            this.isAsync,
                            this.isValidationEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInvokeFunctionDeployStageDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessorCollection")) {
                this.deployStagePredecessorCollection(model.getDeployStagePredecessorCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("functionDeployEnvironmentId")) {
                this.functionDeployEnvironmentId(model.getFunctionDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("deployArtifactId")) {
                this.deployArtifactId(model.getDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("isAsync")) {
                this.isAsync(model.getIsAsync());
            }
            if (model.wasPropertyExplicitlySet("isValidationEnabled")) {
                this.isValidationEnabled(model.getIsValidationEnabled());
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
    public UpdateInvokeFunctionDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String functionDeployEnvironmentId,
            String deployArtifactId,
            Boolean isAsync,
            Boolean isValidationEnabled) {
        super(
                description,
                displayName,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.functionDeployEnvironmentId = functionDeployEnvironmentId;
        this.deployArtifactId = deployArtifactId;
        this.isAsync = isAsync;
        this.isValidationEnabled = isValidationEnabled;
    }

    /** Function environment OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
    private final String functionDeployEnvironmentId;

    /**
     * Function environment OCID.
     *
     * @return the value
     */
    public String getFunctionDeployEnvironmentId() {
        return functionDeployEnvironmentId;
    }

    /**
     * Optional artifact OCID. The artifact will be included in the body for the function invocation
     * during the stage's execution. If the DeployArtifact.argumentSubstituitionMode is set to
     * SUBSTITUTE_PLACEHOLDERS, then the pipeline parameter values will be used to replace the
     * placeholders in the artifact content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
    private final String deployArtifactId;

    /**
     * Optional artifact OCID. The artifact will be included in the body for the function invocation
     * during the stage's execution. If the DeployArtifact.argumentSubstituitionMode is set to
     * SUBSTITUTE_PLACEHOLDERS, then the pipeline parameter values will be used to replace the
     * placeholders in the artifact content.
     *
     * @return the value
     */
    public String getDeployArtifactId() {
        return deployArtifactId;
    }

    /** A boolean flag specifies whether this stage executes asynchronously. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAsync")
    private final Boolean isAsync;

    /**
     * A boolean flag specifies whether this stage executes asynchronously.
     *
     * @return the value
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    /** A boolean flag specifies whether the invoked function must be validated. */
    @com.fasterxml.jackson.annotation.JsonProperty("isValidationEnabled")
    private final Boolean isValidationEnabled;

    /**
     * A boolean flag specifies whether the invoked function must be validated.
     *
     * @return the value
     */
    public Boolean getIsValidationEnabled() {
        return isValidationEnabled;
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
        sb.append("UpdateInvokeFunctionDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionDeployEnvironmentId=")
                .append(String.valueOf(this.functionDeployEnvironmentId));
        sb.append(", deployArtifactId=").append(String.valueOf(this.deployArtifactId));
        sb.append(", isAsync=").append(String.valueOf(this.isAsync));
        sb.append(", isValidationEnabled=").append(String.valueOf(this.isValidationEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInvokeFunctionDeployStageDetails)) {
            return false;
        }

        UpdateInvokeFunctionDeployStageDetails other = (UpdateInvokeFunctionDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.functionDeployEnvironmentId, other.functionDeployEnvironmentId)
                && java.util.Objects.equals(this.deployArtifactId, other.deployArtifactId)
                && java.util.Objects.equals(this.isAsync, other.isAsync)
                && java.util.Objects.equals(this.isValidationEnabled, other.isValidationEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.functionDeployEnvironmentId == null
                                ? 43
                                : this.functionDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactId == null ? 43 : this.deployArtifactId.hashCode());
        result = (result * PRIME) + (this.isAsync == null ? 43 : this.isAsync.hashCode());
        result =
                (result * PRIME)
                        + (this.isValidationEnabled == null
                                ? 43
                                : this.isValidationEnabled.hashCode());
        return result;
    }
}
