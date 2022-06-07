/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * A service supported for use with Resource Discovery.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceDiscoveryServiceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceDiscoveryServiceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "discoveryScope"})
    public ResourceDiscoveryServiceSummary(String name, DiscoveryScope discoveryScope) {
        super();
        this.name = name;
        this.discoveryScope = discoveryScope;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryScope")
        private DiscoveryScope discoveryScope;

        public Builder discoveryScope(DiscoveryScope discoveryScope) {
            this.discoveryScope = discoveryScope;
            this.__explicitlySet__.add("discoveryScope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceDiscoveryServiceSummary build() {
            ResourceDiscoveryServiceSummary __instance__ =
                    new ResourceDiscoveryServiceSummary(name, discoveryScope);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceDiscoveryServiceSummary o) {
            Builder copiedBuilder = name(o.getName()).discoveryScope(o.getDiscoveryScope());

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
     * A supported service. Example: {@code core}
     * For reference on service names, see the [Terraform provider documentation](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The scope of the service as used with Resource Discovery.
     * This property determines the type of compartment OCID required: root compartment ({@code TENANCY}) or not ({@code COMPARTMENT}).
     * For example, {@code identity} is at the root compartment scope while {@code database} is at the compartment scope.
     *
     **/
    public enum DiscoveryScope {
        Tenancy("TENANCY"),
        Compartment("COMPARTMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DiscoveryScope.class);

        private final String value;
        private static java.util.Map<String, DiscoveryScope> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveryScope v : DiscoveryScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DiscoveryScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveryScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiscoveryScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The scope of the service as used with Resource Discovery.
     * This property determines the type of compartment OCID required: root compartment ({@code TENANCY}) or not ({@code COMPARTMENT}).
     * For example, {@code identity} is at the root compartment scope while {@code database} is at the compartment scope.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryScope")
    private final DiscoveryScope discoveryScope;

    public DiscoveryScope getDiscoveryScope() {
        return discoveryScope;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceDiscoveryServiceSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", discoveryScope=").append(String.valueOf(this.discoveryScope));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceDiscoveryServiceSummary)) {
            return false;
        }

        ResourceDiscoveryServiceSummary other = (ResourceDiscoveryServiceSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.discoveryScope, other.discoveryScope)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryScope == null ? 43 : this.discoveryScope.hashCode());
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
