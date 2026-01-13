/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model group type deployment for update. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateModelGroupDeploymentConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deploymentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateModelGroupDeploymentConfigurationDetails
        extends UpdateModelDeploymentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of update operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateType updateType;

        /**
         * The type of update operation.
         *
         * @param updateType the value to set
         * @return this builder
         */
        public Builder updateType(UpdateType updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelGroupConfigurationDetails")
        private UpdateModelGroupConfigurationDetails modelGroupConfigurationDetails;

        public Builder modelGroupConfigurationDetails(
                UpdateModelGroupConfigurationDetails modelGroupConfigurationDetails) {
            this.modelGroupConfigurationDetails = modelGroupConfigurationDetails;
            this.__explicitlySet__.add("modelGroupConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
        private UpdateInfrastructureConfigurationDetails infrastructureConfigurationDetails;

        public Builder infrastructureConfigurationDetails(
                UpdateInfrastructureConfigurationDetails infrastructureConfigurationDetails) {
            this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
            this.__explicitlySet__.add("infrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
        private UpdateModelDeploymentEnvironmentConfigurationDetails
                environmentConfigurationDetails;

        public Builder environmentConfigurationDetails(
                UpdateModelDeploymentEnvironmentConfigurationDetails
                        environmentConfigurationDetails) {
            this.environmentConfigurationDetails = environmentConfigurationDetails;
            this.__explicitlySet__.add("environmentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModelGroupDeploymentConfigurationDetails build() {
            UpdateModelGroupDeploymentConfigurationDetails model =
                    new UpdateModelGroupDeploymentConfigurationDetails(
                            this.updateType,
                            this.modelGroupConfigurationDetails,
                            this.infrastructureConfigurationDetails,
                            this.environmentConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelGroupDeploymentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("modelGroupConfigurationDetails")) {
                this.modelGroupConfigurationDetails(model.getModelGroupConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("infrastructureConfigurationDetails")) {
                this.infrastructureConfigurationDetails(
                        model.getInfrastructureConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("environmentConfigurationDetails")) {
                this.environmentConfigurationDetails(model.getEnvironmentConfigurationDetails());
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
    public UpdateModelGroupDeploymentConfigurationDetails(
            UpdateType updateType,
            UpdateModelGroupConfigurationDetails modelGroupConfigurationDetails,
            UpdateInfrastructureConfigurationDetails infrastructureConfigurationDetails,
            UpdateModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails) {
        super();
        this.updateType = updateType;
        this.modelGroupConfigurationDetails = modelGroupConfigurationDetails;
        this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
        this.environmentConfigurationDetails = environmentConfigurationDetails;
    }

    /** The type of update operation. */
    public enum UpdateType implements com.oracle.bmc.http.internal.BmcEnum {
        Zdt("ZDT"),
        Live("LIVE"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateType: " + key);
        }
    };
    /** The type of update operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateType updateType;

    /**
     * The type of update operation.
     *
     * @return the value
     */
    public UpdateType getUpdateType() {
        return updateType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelGroupConfigurationDetails")
    private final UpdateModelGroupConfigurationDetails modelGroupConfigurationDetails;

    public UpdateModelGroupConfigurationDetails getModelGroupConfigurationDetails() {
        return modelGroupConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
    private final UpdateInfrastructureConfigurationDetails infrastructureConfigurationDetails;

    public UpdateInfrastructureConfigurationDetails getInfrastructureConfigurationDetails() {
        return infrastructureConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
    private final UpdateModelDeploymentEnvironmentConfigurationDetails
            environmentConfigurationDetails;

    public UpdateModelDeploymentEnvironmentConfigurationDetails
            getEnvironmentConfigurationDetails() {
        return environmentConfigurationDetails;
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
        sb.append("UpdateModelGroupDeploymentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", modelGroupConfigurationDetails=")
                .append(String.valueOf(this.modelGroupConfigurationDetails));
        sb.append(", infrastructureConfigurationDetails=")
                .append(String.valueOf(this.infrastructureConfigurationDetails));
        sb.append(", environmentConfigurationDetails=")
                .append(String.valueOf(this.environmentConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelGroupDeploymentConfigurationDetails)) {
            return false;
        }

        UpdateModelGroupDeploymentConfigurationDetails other =
                (UpdateModelGroupDeploymentConfigurationDetails) o;
        return java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(
                        this.modelGroupConfigurationDetails, other.modelGroupConfigurationDetails)
                && java.util.Objects.equals(
                        this.infrastructureConfigurationDetails,
                        other.infrastructureConfigurationDetails)
                && java.util.Objects.equals(
                        this.environmentConfigurationDetails, other.environmentConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result =
                (result * PRIME)
                        + (this.modelGroupConfigurationDetails == null
                                ? 43
                                : this.modelGroupConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureConfigurationDetails == null
                                ? 43
                                : this.infrastructureConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentConfigurationDetails == null
                                ? 43
                                : this.environmentConfigurationDetails.hashCode());
        return result;
    }
}
