/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Update container configuration request details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateContainerConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateContainerConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRepositoryCreatedOnFirstPush"})
    public UpdateContainerConfigurationDetails(Boolean isRepositoryCreatedOnFirstPush) {
        super();
        this.isRepositoryCreatedOnFirstPush = isRepositoryCreatedOnFirstPush;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to create a new container repository when a container is pushed to a new
         * repository path. Repositories created in this way belong to the root compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRepositoryCreatedOnFirstPush")
        private Boolean isRepositoryCreatedOnFirstPush;

        /**
         * Whether to create a new container repository when a container is pushed to a new
         * repository path. Repositories created in this way belong to the root compartment.
         *
         * @param isRepositoryCreatedOnFirstPush the value to set
         * @return this builder
         */
        public Builder isRepositoryCreatedOnFirstPush(Boolean isRepositoryCreatedOnFirstPush) {
            this.isRepositoryCreatedOnFirstPush = isRepositoryCreatedOnFirstPush;
            this.__explicitlySet__.add("isRepositoryCreatedOnFirstPush");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateContainerConfigurationDetails build() {
            UpdateContainerConfigurationDetails model =
                    new UpdateContainerConfigurationDetails(this.isRepositoryCreatedOnFirstPush);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateContainerConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isRepositoryCreatedOnFirstPush")) {
                this.isRepositoryCreatedOnFirstPush(model.getIsRepositoryCreatedOnFirstPush());
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

    /**
     * Whether to create a new container repository when a container is pushed to a new repository
     * path. Repositories created in this way belong to the root compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRepositoryCreatedOnFirstPush")
    private final Boolean isRepositoryCreatedOnFirstPush;

    /**
     * Whether to create a new container repository when a container is pushed to a new repository
     * path. Repositories created in this way belong to the root compartment.
     *
     * @return the value
     */
    public Boolean getIsRepositoryCreatedOnFirstPush() {
        return isRepositoryCreatedOnFirstPush;
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
        sb.append("UpdateContainerConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isRepositoryCreatedOnFirstPush=")
                .append(String.valueOf(this.isRepositoryCreatedOnFirstPush));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateContainerConfigurationDetails)) {
            return false;
        }

        UpdateContainerConfigurationDetails other = (UpdateContainerConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.isRepositoryCreatedOnFirstPush, other.isRepositoryCreatedOnFirstPush)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRepositoryCreatedOnFirstPush == null
                                ? 43
                                : this.isRepositoryCreatedOnFirstPush.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
