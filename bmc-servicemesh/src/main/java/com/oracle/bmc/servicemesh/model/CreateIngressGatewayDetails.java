/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * The information about a new IngressGateway.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIngressGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIngressGatewayDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "meshId",
        "hosts",
        "accessLogging",
        "mtls",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateIngressGatewayDetails(
            String name,
            String description,
            String meshId,
            java.util.List<IngressGatewayHost> hosts,
            AccessLoggingConfiguration accessLogging,
            IngressGatewayMutualTransportLayerSecurityDetails mtls,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.description = description;
        this.meshId = meshId;
        this.hosts = hosts;
        this.accessLogging = accessLogging;
        this.mtls = mtls;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. The name has to be unique within the same service mesh and cannot be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My unique resource name}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name. The name has to be unique within the same service mesh and cannot be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My unique resource name}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of the resource. It can be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code This is my new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the resource. It can be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code This is my new resource}
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the service mesh in which this ingress gateway is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meshId")
        private String meshId;

        /**
         * The OCID of the service mesh in which this ingress gateway is created.
         * @param meshId the value to set
         * @return this builder
         **/
        public Builder meshId(String meshId) {
            this.meshId = meshId;
            this.__explicitlySet__.add("meshId");
            return this;
        }
        /**
         * An array of hostnames and their listener configuration that this gateway will bind to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<IngressGatewayHost> hosts;

        /**
         * An array of hostnames and their listener configuration that this gateway will bind to.
         * @param hosts the value to set
         * @return this builder
         **/
        public Builder hosts(java.util.List<IngressGatewayHost> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessLogging")
        private AccessLoggingConfiguration accessLogging;

        public Builder accessLogging(AccessLoggingConfiguration accessLogging) {
            this.accessLogging = accessLogging;
            this.__explicitlySet__.add("accessLogging");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mtls")
        private IngressGatewayMutualTransportLayerSecurityDetails mtls;

        public Builder mtls(IngressGatewayMutualTransportLayerSecurityDetails mtls) {
            this.mtls = mtls;
            this.__explicitlySet__.add("mtls");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIngressGatewayDetails build() {
            CreateIngressGatewayDetails model =
                    new CreateIngressGatewayDetails(
                            this.name,
                            this.description,
                            this.meshId,
                            this.hosts,
                            this.accessLogging,
                            this.mtls,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIngressGatewayDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("meshId")) {
                this.meshId(model.getMeshId());
            }
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
            }
            if (model.wasPropertyExplicitlySet("accessLogging")) {
                this.accessLogging(model.getAccessLogging());
            }
            if (model.wasPropertyExplicitlySet("mtls")) {
                this.mtls(model.getMtls());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly name. The name has to be unique within the same service mesh and cannot be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My unique resource name}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name. The name has to be unique within the same service mesh and cannot be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My unique resource name}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of the resource. It can be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code This is my new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the resource. It can be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code This is my new resource}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the service mesh in which this ingress gateway is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meshId")
    private final String meshId;

    /**
     * The OCID of the service mesh in which this ingress gateway is created.
     * @return the value
     **/
    public String getMeshId() {
        return meshId;
    }

    /**
     * An array of hostnames and their listener configuration that this gateway will bind to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<IngressGatewayHost> hosts;

    /**
     * An array of hostnames and their listener configuration that this gateway will bind to.
     * @return the value
     **/
    public java.util.List<IngressGatewayHost> getHosts() {
        return hosts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("accessLogging")
    private final AccessLoggingConfiguration accessLogging;

    public AccessLoggingConfiguration getAccessLogging() {
        return accessLogging;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mtls")
    private final IngressGatewayMutualTransportLayerSecurityDetails mtls;

    public IngressGatewayMutualTransportLayerSecurityDetails getMtls() {
        return mtls;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateIngressGatewayDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", meshId=").append(String.valueOf(this.meshId));
        sb.append(", hosts=").append(String.valueOf(this.hosts));
        sb.append(", accessLogging=").append(String.valueOf(this.accessLogging));
        sb.append(", mtls=").append(String.valueOf(this.mtls));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIngressGatewayDetails)) {
            return false;
        }

        CreateIngressGatewayDetails other = (CreateIngressGatewayDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.meshId, other.meshId)
                && java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.accessLogging, other.accessLogging)
                && java.util.Objects.equals(this.mtls, other.mtls)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.meshId == null ? 43 : this.meshId.hashCode());
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result =
                (result * PRIME)
                        + (this.accessLogging == null ? 43 : this.accessLogging.hashCode());
        result = (result * PRIME) + (this.mtls == null ? 43 : this.mtls.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
