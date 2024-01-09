/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information to be updated for the artifact. <br>
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
        builder = UpdateDeployArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDeployArtifactDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "deployArtifactType",
        "deployArtifactSource",
        "argumentSubstitutionMode",
        "freeformTags",
        "definedTags"
    })
    public UpdateDeployArtifactDetails(
            String description,
            String displayName,
            DeployArtifact.DeployArtifactType deployArtifactType,
            DeployArtifactSource deployArtifactSource,
            DeployArtifact.ArgumentSubstitutionMode argumentSubstitutionMode,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.deployArtifactType = deployArtifactType;
        this.deployArtifactSource = deployArtifactSource;
        this.argumentSubstitutionMode = argumentSubstitutionMode;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Optional description about the deployment artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Optional description about the deployment artifact.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Deployment artifact display name. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Deployment artifact display name. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Type of the deployment artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactType")
        private DeployArtifact.DeployArtifactType deployArtifactType;

        /**
         * Type of the deployment artifact.
         *
         * @param deployArtifactType the value to set
         * @return this builder
         */
        public Builder deployArtifactType(DeployArtifact.DeployArtifactType deployArtifactType) {
            this.deployArtifactType = deployArtifactType;
            this.__explicitlySet__.add("deployArtifactType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactSource")
        private DeployArtifactSource deployArtifactSource;

        public Builder deployArtifactSource(DeployArtifactSource deployArtifactSource) {
            this.deployArtifactSource = deployArtifactSource;
            this.__explicitlySet__.add("deployArtifactSource");
            return this;
        }
        /** Mode for artifact parameter substitution. */
        @com.fasterxml.jackson.annotation.JsonProperty("argumentSubstitutionMode")
        private DeployArtifact.ArgumentSubstitutionMode argumentSubstitutionMode;

        /**
         * Mode for artifact parameter substitution.
         *
         * @param argumentSubstitutionMode the value to set
         * @return this builder
         */
        public Builder argumentSubstitutionMode(
                DeployArtifact.ArgumentSubstitutionMode argumentSubstitutionMode) {
            this.argumentSubstitutionMode = argumentSubstitutionMode;
            this.__explicitlySet__.add("argumentSubstitutionMode");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDeployArtifactDetails build() {
            UpdateDeployArtifactDetails model =
                    new UpdateDeployArtifactDetails(
                            this.description,
                            this.displayName,
                            this.deployArtifactType,
                            this.deployArtifactSource,
                            this.argumentSubstitutionMode,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDeployArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployArtifactType")) {
                this.deployArtifactType(model.getDeployArtifactType());
            }
            if (model.wasPropertyExplicitlySet("deployArtifactSource")) {
                this.deployArtifactSource(model.getDeployArtifactSource());
            }
            if (model.wasPropertyExplicitlySet("argumentSubstitutionMode")) {
                this.argumentSubstitutionMode(model.getArgumentSubstitutionMode());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Optional description about the deployment artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Optional description about the deployment artifact.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Deployment artifact display name. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Deployment artifact display name. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Type of the deployment artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactType")
    private final DeployArtifact.DeployArtifactType deployArtifactType;

    /**
     * Type of the deployment artifact.
     *
     * @return the value
     */
    public DeployArtifact.DeployArtifactType getDeployArtifactType() {
        return deployArtifactType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactSource")
    private final DeployArtifactSource deployArtifactSource;

    public DeployArtifactSource getDeployArtifactSource() {
        return deployArtifactSource;
    }

    /** Mode for artifact parameter substitution. */
    @com.fasterxml.jackson.annotation.JsonProperty("argumentSubstitutionMode")
    private final DeployArtifact.ArgumentSubstitutionMode argumentSubstitutionMode;

    /**
     * Mode for artifact parameter substitution.
     *
     * @return the value
     */
    public DeployArtifact.ArgumentSubstitutionMode getArgumentSubstitutionMode() {
        return argumentSubstitutionMode;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateDeployArtifactDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", deployArtifactType=").append(String.valueOf(this.deployArtifactType));
        sb.append(", deployArtifactSource=").append(String.valueOf(this.deployArtifactSource));
        sb.append(", argumentSubstitutionMode=")
                .append(String.valueOf(this.argumentSubstitutionMode));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDeployArtifactDetails)) {
            return false;
        }

        UpdateDeployArtifactDetails other = (UpdateDeployArtifactDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.deployArtifactType, other.deployArtifactType)
                && java.util.Objects.equals(this.deployArtifactSource, other.deployArtifactSource)
                && java.util.Objects.equals(
                        this.argumentSubstitutionMode, other.argumentSubstitutionMode)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactType == null
                                ? 43
                                : this.deployArtifactType.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactSource == null
                                ? 43
                                : this.deployArtifactSource.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentSubstitutionMode == null
                                ? 43
                                : this.argumentSubstitutionMode.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
