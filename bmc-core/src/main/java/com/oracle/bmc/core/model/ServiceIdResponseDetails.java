/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceIdResponseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceIdResponseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceId", "serviceName"})
    public ServiceIdResponseDetails(String serviceId, String serviceName) {
        super();
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
        private String serviceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service.
         *
         * @param serviceId the value to set
         * @return this builder
         **/
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            this.__explicitlySet__.add("serviceId");
            return this;
        }
        /**
         * The name of the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the service.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceIdResponseDetails build() {
            ServiceIdResponseDetails __instance__ =
                    new ServiceIdResponseDetails(serviceId, serviceName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceIdResponseDetails o) {
            Builder copiedBuilder = serviceId(o.getServiceId()).serviceName(o.getServiceName());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
    private final String serviceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service.
     *
     * @return the value
     **/
    public String getServiceId() {
        return serviceId;
    }

    /**
     * The name of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the service.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
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
        sb.append("ServiceIdResponseDetails(");
        sb.append("serviceId=").append(String.valueOf(this.serviceId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceIdResponseDetails)) {
            return false;
        }

        ServiceIdResponseDetails other = (ServiceIdResponseDetails) o;
        return java.util.Objects.equals(this.serviceId, other.serviceId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serviceId == null ? 43 : this.serviceId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
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
