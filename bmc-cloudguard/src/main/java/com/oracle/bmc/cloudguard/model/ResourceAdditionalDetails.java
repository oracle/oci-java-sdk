/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Optional details of a resource <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceAdditionalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceAdditionalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"osInfo"})
    public ResourceAdditionalDetails(String osInfo) {
        super();
        this.osInfo = osInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of OS present in the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("osInfo")
        private String osInfo;

        /**
         * Type of OS present in the resource
         *
         * @param osInfo the value to set
         * @return this builder
         */
        public Builder osInfo(String osInfo) {
            this.osInfo = osInfo;
            this.__explicitlySet__.add("osInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAdditionalDetails build() {
            ResourceAdditionalDetails model = new ResourceAdditionalDetails(this.osInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAdditionalDetails model) {
            if (model.wasPropertyExplicitlySet("osInfo")) {
                this.osInfo(model.getOsInfo());
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

    /** Type of OS present in the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("osInfo")
    private final String osInfo;

    /**
     * Type of OS present in the resource
     *
     * @return the value
     */
    public String getOsInfo() {
        return osInfo;
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
        sb.append("ResourceAdditionalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("osInfo=").append(String.valueOf(this.osInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAdditionalDetails)) {
            return false;
        }

        ResourceAdditionalDetails other = (ResourceAdditionalDetails) o;
        return java.util.Objects.equals(this.osInfo, other.osInfo) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.osInfo == null ? 43 : this.osInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
