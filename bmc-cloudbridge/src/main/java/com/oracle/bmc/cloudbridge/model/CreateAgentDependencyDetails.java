/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The information about new AgentDependency.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAgentDependencyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAgentDependencyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "dependencyName",
        "compartmentId",
        "dependencyVersion",
        "description",
        "namespace",
        "bucket",
        "objectName",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CreateAgentDependencyDetails(
            String displayName,
            String dependencyName,
            String compartmentId,
            String dependencyVersion,
            String description,
            String namespace,
            String bucket,
            String objectName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.dependencyName = dependencyName;
        this.compartmentId = compartmentId;
        this.dependencyVersion = dependencyVersion;
        this.description = description;
        this.namespace = namespace;
        this.bucket = bucket;
        this.objectName = objectName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display name of the Agent dependency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the Agent dependency.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Name of the dependency type. This should match the whitelisted enum of dependency names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependencyName")
        private String dependencyName;

        /**
         * Name of the dependency type. This should match the whitelisted enum of dependency names.
         * @param dependencyName the value to set
         * @return this builder
         **/
        public Builder dependencyName(String dependencyName) {
            this.dependencyName = dependencyName;
            this.__explicitlySet__.add("dependencyName");
            return this;
        }
        /**
         * Compartment identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment identifier.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Version of the Agent dependency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependencyVersion")
        private String dependencyVersion;

        /**
         * Version of the Agent dependency.
         * @param dependencyVersion the value to set
         * @return this builder
         **/
        public Builder dependencyVersion(String dependencyVersion) {
            this.dependencyVersion = dependencyVersion;
            this.__explicitlySet__.add("dependencyVersion");
            return this;
        }
        /**
         * Description about the Agent dependency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description about the Agent dependency.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Object storage namespace associated with the customer's tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Object storage namespace associated with the customer's tenancy.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Object storage bucket where the dependency is uploaded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Object storage bucket where the dependency is uploaded.
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * Name of the dependency object uploaded by the customer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of the dependency object uploaded by the customer.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace/scope. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace/scope. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAgentDependencyDetails build() {
            CreateAgentDependencyDetails model =
                    new CreateAgentDependencyDetails(
                            this.displayName,
                            this.dependencyName,
                            this.compartmentId,
                            this.dependencyVersion,
                            this.description,
                            this.namespace,
                            this.bucket,
                            this.objectName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentDependencyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dependencyName")) {
                this.dependencyName(model.getDependencyName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dependencyVersion")) {
                this.dependencyVersion(model.getDependencyVersion());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * Display name of the Agent dependency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the Agent dependency.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name of the dependency type. This should match the whitelisted enum of dependency names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyName")
    private final String dependencyName;

    /**
     * Name of the dependency type. This should match the whitelisted enum of dependency names.
     * @return the value
     **/
    public String getDependencyName() {
        return dependencyName;
    }

    /**
     * Compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Version of the Agent dependency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyVersion")
    private final String dependencyVersion;

    /**
     * Version of the Agent dependency.
     * @return the value
     **/
    public String getDependencyVersion() {
        return dependencyVersion;
    }

    /**
     * Description about the Agent dependency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description about the Agent dependency.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Object storage namespace associated with the customer's tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Object storage namespace associated with the customer's tenancy.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Object storage bucket where the dependency is uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Object storage bucket where the dependency is uploaded.
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    /**
     * Name of the dependency object uploaded by the customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of the dependency object uploaded by the customer.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace/scope. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace/scope. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CreateAgentDependencyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", dependencyName=").append(String.valueOf(this.dependencyName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dependencyVersion=").append(String.valueOf(this.dependencyVersion));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentDependencyDetails)) {
            return false;
        }

        CreateAgentDependencyDetails other = (CreateAgentDependencyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dependencyName, other.dependencyName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dependencyVersion, other.dependencyVersion)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.dependencyName == null ? 43 : this.dependencyName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dependencyVersion == null ? 43 : this.dependencyVersion.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
