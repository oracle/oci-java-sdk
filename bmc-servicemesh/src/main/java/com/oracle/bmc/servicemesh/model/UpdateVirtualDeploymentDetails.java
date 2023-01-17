/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
    builder = UpdateVirtualDeploymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateVirtualDeploymentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "serviceDiscovery",
        "listeners",
        "accessLogging",
        "freeformTags",
        "definedTags"
    })
    public UpdateVirtualDeploymentDetails(
            String description,
            ServiceDiscoveryConfiguration serviceDiscovery,
            java.util.List<VirtualDeploymentListener> listeners,
            AccessLoggingConfiguration accessLogging,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.serviceDiscovery = serviceDiscovery;
        this.listeners = listeners;
        this.accessLogging = accessLogging;
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

        @com.fasterxml.jackson.annotation.JsonProperty("serviceDiscovery")
        private ServiceDiscoveryConfiguration serviceDiscovery;

        public Builder serviceDiscovery(ServiceDiscoveryConfiguration serviceDiscovery) {
            this.serviceDiscovery = serviceDiscovery;
            this.__explicitlySet__.add("serviceDiscovery");
            return this;
        }
        /**
         * The listeners for the virtual deployment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.List<VirtualDeploymentListener> listeners;

        /**
         * The listeners for the virtual deployment.
         * @param listeners the value to set
         * @return this builder
         **/
        public Builder listeners(java.util.List<VirtualDeploymentListener> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessLogging")
        private AccessLoggingConfiguration accessLogging;

        public Builder accessLogging(AccessLoggingConfiguration accessLogging) {
            this.accessLogging = accessLogging;
            this.__explicitlySet__.add("accessLogging");
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

        public UpdateVirtualDeploymentDetails build() {
            UpdateVirtualDeploymentDetails model =
                    new UpdateVirtualDeploymentDetails(
                            this.description,
                            this.serviceDiscovery,
                            this.listeners,
                            this.accessLogging,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVirtualDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("serviceDiscovery")) {
                this.serviceDiscovery(model.getServiceDiscovery());
            }
            if (model.wasPropertyExplicitlySet("listeners")) {
                this.listeners(model.getListeners());
            }
            if (model.wasPropertyExplicitlySet("accessLogging")) {
                this.accessLogging(model.getAccessLogging());
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

    @com.fasterxml.jackson.annotation.JsonProperty("serviceDiscovery")
    private final ServiceDiscoveryConfiguration serviceDiscovery;

    public ServiceDiscoveryConfiguration getServiceDiscovery() {
        return serviceDiscovery;
    }

    /**
     * The listeners for the virtual deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.List<VirtualDeploymentListener> listeners;

    /**
     * The listeners for the virtual deployment.
     * @return the value
     **/
    public java.util.List<VirtualDeploymentListener> getListeners() {
        return listeners;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("accessLogging")
    private final AccessLoggingConfiguration accessLogging;

    public AccessLoggingConfiguration getAccessLogging() {
        return accessLogging;
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
        sb.append("UpdateVirtualDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", serviceDiscovery=").append(String.valueOf(this.serviceDiscovery));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", accessLogging=").append(String.valueOf(this.accessLogging));
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
        if (!(o instanceof UpdateVirtualDeploymentDetails)) {
            return false;
        }

        UpdateVirtualDeploymentDetails other = (UpdateVirtualDeploymentDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.serviceDiscovery, other.serviceDiscovery)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.accessLogging, other.accessLogging)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceDiscovery == null ? 43 : this.serviceDiscovery.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result =
                (result * PRIME)
                        + (this.accessLogging == null ? 43 : this.accessLogging.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
