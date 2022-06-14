/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Represents the info needed for creating dcms artifact reference.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateReferenceArtifactDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateReferenceArtifactDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceArtifactId"})
    public CreateReferenceArtifactDetails(String serviceArtifactId) {
        super();
        this.serviceArtifactId = serviceArtifactId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * unique id of service which is referencing data asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
        private String serviceArtifactId;

        /**
         * unique id of service which is referencing data asset.
         * @param serviceArtifactId the value to set
         * @return this builder
         **/
        public Builder serviceArtifactId(String serviceArtifactId) {
            this.serviceArtifactId = serviceArtifactId;
            this.__explicitlySet__.add("serviceArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReferenceArtifactDetails build() {
            CreateReferenceArtifactDetails __instance__ =
                    new CreateReferenceArtifactDetails(serviceArtifactId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReferenceArtifactDetails o) {
            Builder copiedBuilder = serviceArtifactId(o.getServiceArtifactId());

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

    /**
     * unique id of service which is referencing data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
    private final String serviceArtifactId;

    /**
     * unique id of service which is referencing data asset.
     * @return the value
     **/
    public String getServiceArtifactId() {
        return serviceArtifactId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateReferenceArtifactDetails(");
        sb.append("serviceArtifactId=").append(String.valueOf(this.serviceArtifactId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReferenceArtifactDetails)) {
            return false;
        }

        CreateReferenceArtifactDetails other = (CreateReferenceArtifactDetails) o;
        return java.util.Objects.equals(this.serviceArtifactId, other.serviceArtifactId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceArtifactId == null ? 43 : this.serviceArtifactId.hashCode());
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
