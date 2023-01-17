/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Environment used in the pipeline.
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
    builder = DeployPipelineEnvironment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeployPipelineEnvironment
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deployEnvironmentId",
        "displayName",
        "deployPipelineStages"
    })
    public DeployPipelineEnvironment(
            String deployEnvironmentId,
            String displayName,
            DeployPipelineStageCollection deployPipelineStages) {
        super();
        this.deployEnvironmentId = deployEnvironmentId;
        this.displayName = displayName;
        this.deployPipelineStages = deployPipelineStages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of an Environment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentId")
        private String deployEnvironmentId;

        /**
         * The OCID of an Environment
         * @param deployEnvironmentId the value to set
         * @return this builder
         **/
        public Builder deployEnvironmentId(String deployEnvironmentId) {
            this.deployEnvironmentId = deployEnvironmentId;
            this.__explicitlySet__.add("deployEnvironmentId");
            return this;
        }
        /**
         * Display name of the environment. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the environment. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineStages")
        private DeployPipelineStageCollection deployPipelineStages;

        public Builder deployPipelineStages(DeployPipelineStageCollection deployPipelineStages) {
            this.deployPipelineStages = deployPipelineStages;
            this.__explicitlySet__.add("deployPipelineStages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployPipelineEnvironment build() {
            DeployPipelineEnvironment model =
                    new DeployPipelineEnvironment(
                            this.deployEnvironmentId, this.displayName, this.deployPipelineStages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployPipelineEnvironment model) {
            if (model.wasPropertyExplicitlySet("deployEnvironmentId")) {
                this.deployEnvironmentId(model.getDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineStages")) {
                this.deployPipelineStages(model.getDeployPipelineStages());
            }
            return this;
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
     * The OCID of an Environment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentId")
    private final String deployEnvironmentId;

    /**
     * The OCID of an Environment
     * @return the value
     **/
    public String getDeployEnvironmentId() {
        return deployEnvironmentId;
    }

    /**
     * Display name of the environment. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the environment. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineStages")
    private final DeployPipelineStageCollection deployPipelineStages;

    public DeployPipelineStageCollection getDeployPipelineStages() {
        return deployPipelineStages;
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
        sb.append("DeployPipelineEnvironment(");
        sb.append("super=").append(super.toString());
        sb.append("deployEnvironmentId=").append(String.valueOf(this.deployEnvironmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", deployPipelineStages=").append(String.valueOf(this.deployPipelineStages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployPipelineEnvironment)) {
            return false;
        }

        DeployPipelineEnvironment other = (DeployPipelineEnvironment) o;
        return java.util.Objects.equals(this.deployEnvironmentId, other.deployEnvironmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.deployPipelineStages, other.deployPipelineStages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployEnvironmentId == null
                                ? 43
                                : this.deployEnvironmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deployPipelineStages == null
                                ? 43
                                : this.deployPipelineStages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
