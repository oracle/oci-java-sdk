/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Details of the proxy such as version of the proxy image.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProxyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProxyDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"proxyImage"})
    public ProxyDetails(String proxyImage) {
        super();
        this.proxyImage = proxyImage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Proxy container image version to be deployed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("proxyImage")
        private String proxyImage;

        /**
         * Proxy container image version to be deployed.
         * @param proxyImage the value to set
         * @return this builder
         **/
        public Builder proxyImage(String proxyImage) {
            this.proxyImage = proxyImage;
            this.__explicitlySet__.add("proxyImage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxyDetails build() {
            ProxyDetails model = new ProxyDetails(this.proxyImage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxyDetails model) {
            if (model.wasPropertyExplicitlySet("proxyImage")) {
                this.proxyImage(model.getProxyImage());
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
     * Proxy container image version to be deployed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxyImage")
    private final String proxyImage;

    /**
     * Proxy container image version to be deployed.
     * @return the value
     **/
    public String getProxyImage() {
        return proxyImage;
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
        sb.append("ProxyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("proxyImage=").append(String.valueOf(this.proxyImage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProxyDetails)) {
            return false;
        }

        ProxyDetails other = (ProxyDetails) o;
        return java.util.Objects.equals(this.proxyImage, other.proxyImage) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.proxyImage == null ? 43 : this.proxyImage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
