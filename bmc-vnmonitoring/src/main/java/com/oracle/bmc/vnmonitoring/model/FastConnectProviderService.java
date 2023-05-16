/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A service offering from a supported provider. For more information, see [FastConnect
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm). <br>
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
        builder = FastConnectProviderService.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FastConnectProviderService
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "id",
        "privatePeeringBgpManagement",
        "providerName",
        "providerServiceName",
        "publicPeeringBgpManagement",
        "supportedVirtualCircuitTypes",
        "type"
    })
    public FastConnectProviderService(
            String description,
            String id,
            PrivatePeeringBgpManagement privatePeeringBgpManagement,
            String providerName,
            String providerServiceName,
            PublicPeeringBgpManagement publicPeeringBgpManagement,
            java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes,
            Type type) {
        super();
        this.description = description;
        this.id = id;
        this.privatePeeringBgpManagement = privatePeeringBgpManagement;
        this.providerName = providerName;
        this.providerServiceName = providerServiceName;
        this.publicPeeringBgpManagement = publicPeeringBgpManagement;
        this.supportedVirtualCircuitTypes = supportedVirtualCircuitTypes;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The location of the provider's website or portal. This portal is where you can get
         * information about the provider service, create a virtual circuit connection from the
         * provider to Oracle Cloud Infrastructure, and retrieve your provider service key for that
         * virtual circuit connection.
         *
         * <p>Example: {@code https://example.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The location of the provider's website or portal. This portal is where you can get
         * information about the provider service, create a virtual circuit connection from the
         * provider to Oracle Cloud Infrastructure, and retrieve your provider service key for that
         * virtual circuit connection.
         *
         * <p>Example: {@code https://example.com}
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service offered by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service offered by the provider.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Who is responsible for managing the private peering BGP information. */
        @com.fasterxml.jackson.annotation.JsonProperty("privatePeeringBgpManagement")
        private PrivatePeeringBgpManagement privatePeeringBgpManagement;

        /**
         * Who is responsible for managing the private peering BGP information.
         *
         * @param privatePeeringBgpManagement the value to set
         * @return this builder
         */
        public Builder privatePeeringBgpManagement(
                PrivatePeeringBgpManagement privatePeeringBgpManagement) {
            this.privatePeeringBgpManagement = privatePeeringBgpManagement;
            this.__explicitlySet__.add("privatePeeringBgpManagement");
            return this;
        }
        /** The name of the provider. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * The name of the provider.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /** The name of the service offered by the provider. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        /**
         * The name of the service offered by the provider.
         *
         * @param providerServiceName the value to set
         * @return this builder
         */
        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }
        /** Who is responsible for managing the public peering BGP information. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicPeeringBgpManagement")
        private PublicPeeringBgpManagement publicPeeringBgpManagement;

        /**
         * Who is responsible for managing the public peering BGP information.
         *
         * @param publicPeeringBgpManagement the value to set
         * @return this builder
         */
        public Builder publicPeeringBgpManagement(
                PublicPeeringBgpManagement publicPeeringBgpManagement) {
            this.publicPeeringBgpManagement = publicPeeringBgpManagement;
            this.__explicitlySet__.add("publicPeeringBgpManagement");
            return this;
        }
        /** An array of virtual circuit types supported by this service. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedVirtualCircuitTypes")
        private java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes;

        /**
         * An array of virtual circuit types supported by this service.
         *
         * @param supportedVirtualCircuitTypes the value to set
         * @return this builder
         */
        public Builder supportedVirtualCircuitTypes(
                java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes) {
            this.supportedVirtualCircuitTypes = supportedVirtualCircuitTypes;
            this.__explicitlySet__.add("supportedVirtualCircuitTypes");
            return this;
        }
        /** Provider service type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Provider service type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FastConnectProviderService build() {
            FastConnectProviderService model =
                    new FastConnectProviderService(
                            this.description,
                            this.id,
                            this.privatePeeringBgpManagement,
                            this.providerName,
                            this.providerServiceName,
                            this.publicPeeringBgpManagement,
                            this.supportedVirtualCircuitTypes,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastConnectProviderService model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("privatePeeringBgpManagement")) {
                this.privatePeeringBgpManagement(model.getPrivatePeeringBgpManagement());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("providerServiceName")) {
                this.providerServiceName(model.getProviderServiceName());
            }
            if (model.wasPropertyExplicitlySet("publicPeeringBgpManagement")) {
                this.publicPeeringBgpManagement(model.getPublicPeeringBgpManagement());
            }
            if (model.wasPropertyExplicitlySet("supportedVirtualCircuitTypes")) {
                this.supportedVirtualCircuitTypes(model.getSupportedVirtualCircuitTypes());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * The location of the provider's website or portal. This portal is where you can get
     * information about the provider service, create a virtual circuit connection from the provider
     * to Oracle Cloud Infrastructure, and retrieve your provider service key for that virtual
     * circuit connection.
     *
     * <p>Example: {@code https://example.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The location of the provider's website or portal. This portal is where you can get
     * information about the provider service, create a virtual circuit connection from the provider
     * to Oracle Cloud Infrastructure, and retrieve your provider service key for that virtual
     * circuit connection.
     *
     * <p>Example: {@code https://example.com}
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service offered by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service offered by the provider.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Who is responsible for managing the private peering BGP information. */
    public enum PrivatePeeringBgpManagement implements com.oracle.bmc.http.internal.BmcEnum {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),
        ;

        private final String value;
        private static java.util.Map<String, PrivatePeeringBgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (PrivatePeeringBgpManagement v : PrivatePeeringBgpManagement.values()) {
                map.put(v.getValue(), v);
            }
        }

        PrivatePeeringBgpManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrivatePeeringBgpManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PrivatePeeringBgpManagement: " + key);
        }
    };
    /** Who is responsible for managing the private peering BGP information. */
    @com.fasterxml.jackson.annotation.JsonProperty("privatePeeringBgpManagement")
    private final PrivatePeeringBgpManagement privatePeeringBgpManagement;

    /**
     * Who is responsible for managing the private peering BGP information.
     *
     * @return the value
     */
    public PrivatePeeringBgpManagement getPrivatePeeringBgpManagement() {
        return privatePeeringBgpManagement;
    }

    /** The name of the provider. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * The name of the provider.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
    }

    /** The name of the service offered by the provider. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    private final String providerServiceName;

    /**
     * The name of the service offered by the provider.
     *
     * @return the value
     */
    public String getProviderServiceName() {
        return providerServiceName;
    }

    /** Who is responsible for managing the public peering BGP information. */
    public enum PublicPeeringBgpManagement implements com.oracle.bmc.http.internal.BmcEnum {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),
        ;

        private final String value;
        private static java.util.Map<String, PublicPeeringBgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicPeeringBgpManagement v : PublicPeeringBgpManagement.values()) {
                map.put(v.getValue(), v);
            }
        }

        PublicPeeringBgpManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicPeeringBgpManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PublicPeeringBgpManagement: " + key);
        }
    };
    /** Who is responsible for managing the public peering BGP information. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicPeeringBgpManagement")
    private final PublicPeeringBgpManagement publicPeeringBgpManagement;

    /**
     * Who is responsible for managing the public peering BGP information.
     *
     * @return the value
     */
    public PublicPeeringBgpManagement getPublicPeeringBgpManagement() {
        return publicPeeringBgpManagement;
    }

    /** */
    public enum SupportedVirtualCircuitTypes implements com.oracle.bmc.http.internal.BmcEnum {
        Public("PUBLIC"),
        Private("PRIVATE"),
        ;

        private final String value;
        private static java.util.Map<String, SupportedVirtualCircuitTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (SupportedVirtualCircuitTypes v : SupportedVirtualCircuitTypes.values()) {
                map.put(v.getValue(), v);
            }
        }

        SupportedVirtualCircuitTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SupportedVirtualCircuitTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SupportedVirtualCircuitTypes: " + key);
        }
    };
    /** An array of virtual circuit types supported by this service. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVirtualCircuitTypes")
    private final java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes;

    /**
     * An array of virtual circuit types supported by this service.
     *
     * @return the value
     */
    public java.util.List<SupportedVirtualCircuitTypes> getSupportedVirtualCircuitTypes() {
        return supportedVirtualCircuitTypes;
    }

    /** Provider service type. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Layer2("LAYER2"),
        Layer3("LAYER3"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /** Provider service type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Provider service type.
     *
     * @return the value
     */
    public Type getType() {
        return type;
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
        sb.append("FastConnectProviderService(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", privatePeeringBgpManagement=")
                .append(String.valueOf(this.privatePeeringBgpManagement));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerServiceName=").append(String.valueOf(this.providerServiceName));
        sb.append(", publicPeeringBgpManagement=")
                .append(String.valueOf(this.publicPeeringBgpManagement));
        sb.append(", supportedVirtualCircuitTypes=")
                .append(String.valueOf(this.supportedVirtualCircuitTypes));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FastConnectProviderService)) {
            return false;
        }

        FastConnectProviderService other = (FastConnectProviderService) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.privatePeeringBgpManagement, other.privatePeeringBgpManagement)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerServiceName, other.providerServiceName)
                && java.util.Objects.equals(
                        this.publicPeeringBgpManagement, other.publicPeeringBgpManagement)
                && java.util.Objects.equals(
                        this.supportedVirtualCircuitTypes, other.supportedVirtualCircuitTypes)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.privatePeeringBgpManagement == null
                                ? 43
                                : this.privatePeeringBgpManagement.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceName == null
                                ? 43
                                : this.providerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.publicPeeringBgpManagement == null
                                ? 43
                                : this.publicPeeringBgpManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVirtualCircuitTypes == null
                                ? 43
                                : this.supportedVirtualCircuitTypes.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
