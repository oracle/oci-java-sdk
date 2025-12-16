/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Instance pool based model deployment system data. <br>
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
        builder = InstancePoolModelDeploymentSystemData.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "systemInfraType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolModelDeploymentSystemData extends ModelDeploymentSystemData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelDeploymentModelType modelType;

        public Builder modelType(ModelDeploymentModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** This value is the current count of the model deployment instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentInstanceCount")
        private Integer currentInstanceCount;

        /**
         * This value is the current count of the model deployment instances.
         *
         * @param currentInstanceCount the value to set
         * @return this builder
         */
        public Builder currentInstanceCount(Integer currentInstanceCount) {
            this.currentInstanceCount = currentInstanceCount;
            this.__explicitlySet__.add("currentInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolModelDeploymentSystemData build() {
            InstancePoolModelDeploymentSystemData model =
                    new InstancePoolModelDeploymentSystemData(
                            this.modelType, this.currentInstanceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolModelDeploymentSystemData model) {
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("currentInstanceCount")) {
                this.currentInstanceCount(model.getCurrentInstanceCount());
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
    public InstancePoolModelDeploymentSystemData(
            ModelDeploymentModelType modelType, Integer currentInstanceCount) {
        super(modelType);
        this.currentInstanceCount = currentInstanceCount;
    }

    /** This value is the current count of the model deployment instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentInstanceCount")
    private final Integer currentInstanceCount;

    /**
     * This value is the current count of the model deployment instances.
     *
     * @return the value
     */
    public Integer getCurrentInstanceCount() {
        return currentInstanceCount;
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
        sb.append("InstancePoolModelDeploymentSystemData(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", currentInstanceCount=").append(String.valueOf(this.currentInstanceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolModelDeploymentSystemData)) {
            return false;
        }

        InstancePoolModelDeploymentSystemData other = (InstancePoolModelDeploymentSystemData) o;
        return java.util.Objects.equals(this.currentInstanceCount, other.currentInstanceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.currentInstanceCount == null
                                ? 43
                                : this.currentInstanceCount.hashCode());
        return result;
    }
}
