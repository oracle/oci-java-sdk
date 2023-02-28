/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a cluster kubeconfig. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateClusterKubeconfigContentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateClusterKubeconfigContentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tokenVersion", "expiration", "endpoint"})
    public CreateClusterKubeconfigContentDetails(
            String tokenVersion, Integer expiration, Endpoint endpoint) {
        super();
        this.tokenVersion = tokenVersion;
        this.expiration = expiration;
        this.endpoint = endpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version of the kubeconfig token. Supported value 2.0.0 */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
        private String tokenVersion;

        /**
         * The version of the kubeconfig token. Supported value 2.0.0
         *
         * @param tokenVersion the value to set
         * @return this builder
         */
        public Builder tokenVersion(String tokenVersion) {
            this.tokenVersion = tokenVersion;
            this.__explicitlySet__.add("tokenVersion");
            return this;
        }
        /** Deprecated. This field is no longer used. */
        @com.fasterxml.jackson.annotation.JsonProperty("expiration")
        private Integer expiration;

        /**
         * Deprecated. This field is no longer used.
         *
         * @param expiration the value to set
         * @return this builder
         */
        public Builder expiration(Integer expiration) {
            this.expiration = expiration;
            this.__explicitlySet__.add("expiration");
            return this;
        }
        /**
         * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig
         * can only target one at a time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private Endpoint endpoint;

        /**
         * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig
         * can only target one at a time.
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateClusterKubeconfigContentDetails build() {
            CreateClusterKubeconfigContentDetails model =
                    new CreateClusterKubeconfigContentDetails(
                            this.tokenVersion, this.expiration, this.endpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterKubeconfigContentDetails model) {
            if (model.wasPropertyExplicitlySet("tokenVersion")) {
                this.tokenVersion(model.getTokenVersion());
            }
            if (model.wasPropertyExplicitlySet("expiration")) {
                this.expiration(model.getExpiration());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
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

    /** The version of the kubeconfig token. Supported value 2.0.0 */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
    private final String tokenVersion;

    /**
     * The version of the kubeconfig token. Supported value 2.0.0
     *
     * @return the value
     */
    public String getTokenVersion() {
        return tokenVersion;
    }

    /** Deprecated. This field is no longer used. */
    @com.fasterxml.jackson.annotation.JsonProperty("expiration")
    private final Integer expiration;

    /**
     * Deprecated. This field is no longer used.
     *
     * @return the value
     */
    public Integer getExpiration() {
        return expiration;
    }

    /**
     * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig can
     * only target one at a time.
     */
    public enum Endpoint implements com.oracle.bmc.http.internal.BmcEnum {
        LegacyKubernetes("LEGACY_KUBERNETES"),
        PublicEndpoint("PUBLIC_ENDPOINT"),
        PrivateEndpoint("PRIVATE_ENDPOINT"),
        VcnHostname("VCN_HOSTNAME"),
        ;

        private final String value;
        private static java.util.Map<String, Endpoint> map;

        static {
            map = new java.util.HashMap<>();
            for (Endpoint v : Endpoint.values()) {
                map.put(v.getValue(), v);
            }
        }

        Endpoint(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Endpoint create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Endpoint: " + key);
        }
    };
    /**
     * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig can
     * only target one at a time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final Endpoint endpoint;

    /**
     * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig can
     * only target one at a time.
     *
     * @return the value
     */
    public Endpoint getEndpoint() {
        return endpoint;
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
        sb.append("CreateClusterKubeconfigContentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tokenVersion=").append(String.valueOf(this.tokenVersion));
        sb.append(", expiration=").append(String.valueOf(this.expiration));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateClusterKubeconfigContentDetails)) {
            return false;
        }

        CreateClusterKubeconfigContentDetails other = (CreateClusterKubeconfigContentDetails) o;
        return java.util.Objects.equals(this.tokenVersion, other.tokenVersion)
                && java.util.Objects.equals(this.expiration, other.expiration)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tokenVersion == null ? 43 : this.tokenVersion.hashCode());
        result = (result * PRIME) + (this.expiration == null ? 43 : this.expiration.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
