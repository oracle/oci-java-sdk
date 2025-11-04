/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * DIF Service Dependency Details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DifDependencyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DifDependencyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceType", "serviceInstanceId"})
    public DifDependencyDetails(String serviceType, String serviceInstanceId) {
        super();
        this.serviceType = serviceType;
        this.serviceInstanceId = serviceInstanceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Supported service name. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private String serviceType;

        /**
         * Supported service name.
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** InstanceId of service which is part of the Stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceId")
        private String serviceInstanceId;

        /**
         * InstanceId of service which is part of the Stack.
         *
         * @param serviceInstanceId the value to set
         * @return this builder
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            this.__explicitlySet__.add("serviceInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DifDependencyDetails build() {
            DifDependencyDetails model =
                    new DifDependencyDetails(this.serviceType, this.serviceInstanceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DifDependencyDetails model) {
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("serviceInstanceId")) {
                this.serviceInstanceId(model.getServiceInstanceId());
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

    /** Supported service name. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final String serviceType;

    /**
     * Supported service name.
     *
     * @return the value
     */
    public String getServiceType() {
        return serviceType;
    }

    /** InstanceId of service which is part of the Stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceId")
    private final String serviceInstanceId;

    /**
     * InstanceId of service which is part of the Stack.
     *
     * @return the value
     */
    public String getServiceInstanceId() {
        return serviceInstanceId;
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
        sb.append("DifDependencyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", serviceInstanceId=").append(String.valueOf(this.serviceInstanceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DifDependencyDetails)) {
            return false;
        }

        DifDependencyDetails other = (DifDependencyDetails) o;
        return java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.serviceInstanceId, other.serviceInstanceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceInstanceId == null ? 43 : this.serviceInstanceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
