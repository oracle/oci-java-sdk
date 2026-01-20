/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Authentication configuration that uses OCI Resource Principal Auth for Generic REST invocation.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourcePrincipalAuthConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourcePrincipalAuthConfig extends AuthConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }
        /** The OCI resource type that will supply the authentication token */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalSource")
        private ResourcePrincipalSource resourcePrincipalSource;

        /**
         * The OCI resource type that will supply the authentication token
         *
         * @param resourcePrincipalSource the value to set
         * @return this builder
         */
        public Builder resourcePrincipalSource(ResourcePrincipalSource resourcePrincipalSource) {
            this.resourcePrincipalSource = resourcePrincipalSource;
            this.__explicitlySet__.add("resourcePrincipalSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcePrincipalAuthConfig build() {
            ResourcePrincipalAuthConfig model =
                    new ResourcePrincipalAuthConfig(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.resourcePrincipalSource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcePrincipalAuthConfig model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("resourcePrincipalSource")) {
                this.resourcePrincipalSource(model.getResourcePrincipalSource());
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
    public ResourcePrincipalAuthConfig(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ResourcePrincipalSource resourcePrincipalSource) {
        super(key, modelVersion, parentRef);
        this.resourcePrincipalSource = resourcePrincipalSource;
    }

    /** The OCI resource type that will supply the authentication token */
    public enum ResourcePrincipalSource implements com.oracle.bmc.http.internal.BmcEnum {
        Workspace("WORKSPACE"),
        Application("APPLICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourcePrincipalSource.class);

        private final String value;
        private static java.util.Map<String, ResourcePrincipalSource> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourcePrincipalSource v : ResourcePrincipalSource.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourcePrincipalSource(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourcePrincipalSource create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourcePrincipalSource', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The OCI resource type that will supply the authentication token */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalSource")
    private final ResourcePrincipalSource resourcePrincipalSource;

    /**
     * The OCI resource type that will supply the authentication token
     *
     * @return the value
     */
    public ResourcePrincipalSource getResourcePrincipalSource() {
        return resourcePrincipalSource;
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
        sb.append("ResourcePrincipalAuthConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourcePrincipalSource=")
                .append(String.valueOf(this.resourcePrincipalSource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcePrincipalAuthConfig)) {
            return false;
        }

        ResourcePrincipalAuthConfig other = (ResourcePrincipalAuthConfig) o;
        return java.util.Objects.equals(this.resourcePrincipalSource, other.resourcePrincipalSource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourcePrincipalSource == null
                                ? 43
                                : this.resourcePrincipalSource.hashCode());
        return result;
    }
}
