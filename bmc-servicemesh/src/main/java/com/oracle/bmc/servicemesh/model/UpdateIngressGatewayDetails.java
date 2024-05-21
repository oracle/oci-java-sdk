/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * The information to be updated.
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
    builder = UpdateIngressGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateIngressGatewayDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "hosts",
        "accessLogging",
        "mtls",
        "freeformTags",
        "definedTags"
    })
    public UpdateIngressGatewayDetails(
            String description,
            java.util.List<IngressGatewayHost> hosts,
            AccessLoggingConfiguration accessLogging,
            IngressGatewayMutualTransportLayerSecurityDetails mtls,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.hosts = hosts;
        this.accessLogging = accessLogging;
        this.mtls = mtls;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        public UpdateIngressGatewayDetails build() {
            UpdateIngressGatewayDetails model =
                    new UpdateIngressGatewayDetails(
                            this.description,
                            this.hosts,
                            this.accessLogging,
                            this.mtls,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIngressGatewayDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
        sb.append("UpdateIngressGatewayDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", hosts=").append(String.valueOf(this.hosts));
        sb.append(", accessLogging=").append(String.valueOf(this.accessLogging));
        sb.append(", mtls=").append(String.valueOf(this.mtls));
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
        if (!(o instanceof UpdateIngressGatewayDetails)) {
            return false;
        }

        UpdateIngressGatewayDetails other = (UpdateIngressGatewayDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.accessLogging, other.accessLogging)
                && java.util.Objects.equals(this.mtls, other.mtls)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result =
                (result * PRIME)
                        + (this.accessLogging == null ? 43 : this.accessLogging.hashCode());
        result = (result * PRIME) + (this.mtls == null ? 43 : this.mtls.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
