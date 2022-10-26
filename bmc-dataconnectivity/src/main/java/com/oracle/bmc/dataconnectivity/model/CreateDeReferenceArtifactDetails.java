/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Represents the info required for de-referencing a DCMS artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDeReferenceArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDeReferenceArtifactDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceArtifactId"})
    public CreateDeReferenceArtifactDetails(String serviceArtifactId) {
        super();
        this.serviceArtifactId = serviceArtifactId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique ID of the service that is referencing a data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
        private String serviceArtifactId;

        /**
         * The unique ID of the service that is referencing a data asset.
         *
         * @param serviceArtifactId the value to set
         * @return this builder
         */
        public Builder serviceArtifactId(String serviceArtifactId) {
            this.serviceArtifactId = serviceArtifactId;
            this.__explicitlySet__.add("serviceArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDeReferenceArtifactDetails build() {
            CreateDeReferenceArtifactDetails model =
                    new CreateDeReferenceArtifactDetails(this.serviceArtifactId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDeReferenceArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("serviceArtifactId")) {
                this.serviceArtifactId(model.getServiceArtifactId());
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

    /** The unique ID of the service that is referencing a data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
    private final String serviceArtifactId;

    /**
     * The unique ID of the service that is referencing a data asset.
     *
     * @return the value
     */
    public String getServiceArtifactId() {
        return serviceArtifactId;
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
        sb.append("CreateDeReferenceArtifactDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceArtifactId=").append(String.valueOf(this.serviceArtifactId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDeReferenceArtifactDetails)) {
            return false;
        }

        CreateDeReferenceArtifactDetails other = (CreateDeReferenceArtifactDetails) o;
        return java.util.Objects.equals(this.serviceArtifactId, other.serviceArtifactId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceArtifactId == null ? 43 : this.serviceArtifactId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
