/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Invoke Function stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateInvokeFunctionDeployStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateInvokeFunctionDeployStageDetails extends CreateDeployStageDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
        private String functionDeployEnvironmentId;

        public Builder functionDeployEnvironmentId(String functionDeployEnvironmentId) {
            this.functionDeployEnvironmentId = functionDeployEnvironmentId;
            this.__explicitlySet__.add("functionDeployEnvironmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAsync")
        private Boolean isAsync;

        public Builder isAsync(Boolean isAsync) {
            this.isAsync = isAsync;
            this.__explicitlySet__.add("isAsync");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isValidationEnabled")
        private Boolean isValidationEnabled;

        public Builder isValidationEnabled(Boolean isValidationEnabled) {
            this.isValidationEnabled = isValidationEnabled;
            this.__explicitlySet__.add("isValidationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateInvokeFunctionDeployStageDetails build() {
            CreateInvokeFunctionDeployStageDetails __instance__ =
                    new CreateInvokeFunctionDeployStageDetails(
                            description,
                            displayName,
                            deployPipelineId,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            functionDeployEnvironmentId,
                            deployArtifactId,
                            isAsync,
                            isValidationEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInvokeFunctionDeployStageDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .deployPipelineId(o.getDeployPipelineId())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .functionDeployEnvironmentId(o.getFunctionDeployEnvironmentId())
                            .deployArtifactId(o.getDeployArtifactId())
                            .isAsync(o.getIsAsync())
                            .isValidationEnabled(o.getIsValidationEnabled());

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

    @Deprecated
    public CreateInvokeFunctionDeployStageDetails(
            String description,
            String displayName,
            String deployPipelineId,
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
                deployPipelineId,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.functionDeployEnvironmentId = functionDeployEnvironmentId;
        this.deployArtifactId = deployArtifactId;
        this.isAsync = isAsync;
        this.isValidationEnabled = isValidationEnabled;
    }

    /**
     * Function environment OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
    private final String functionDeployEnvironmentId;

    public String getFunctionDeployEnvironmentId() {
        return functionDeployEnvironmentId;
    }

    /**
     * Optional binary artifact OCID user may provide to this stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
    private final String deployArtifactId;

    public String getDeployArtifactId() {
        return deployArtifactId;
    }

    /**
     * A boolean flag specifies whether this stage executes asynchronously.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAsync")
    private final Boolean isAsync;

    public Boolean getIsAsync() {
        return isAsync;
    }

    /**
     * A boolean flag specifies whether the invoked function should be validated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValidationEnabled")
    private final Boolean isValidationEnabled;

    public Boolean getIsValidationEnabled() {
        return isValidationEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateInvokeFunctionDeployStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", functionDeployEnvironmentId=")
                .append(String.valueOf(this.functionDeployEnvironmentId));
        sb.append(", deployArtifactId=").append(String.valueOf(this.deployArtifactId));
        sb.append(", isAsync=").append(String.valueOf(this.isAsync));
        sb.append(", isValidationEnabled=").append(String.valueOf(this.isValidationEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateInvokeFunctionDeployStageDetails)) {
            return false;
        }

        CreateInvokeFunctionDeployStageDetails other = (CreateInvokeFunctionDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.functionDeployEnvironmentId, other.functionDeployEnvironmentId)
                && java.util.Objects.equals(this.deployArtifactId, other.deployArtifactId)
                && java.util.Objects.equals(this.isAsync, other.isAsync)
                && java.util.Objects.equals(this.isValidationEnabled, other.isValidationEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
