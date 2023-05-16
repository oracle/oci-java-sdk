/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The request of DiscoveryJob Resource details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiscoveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentId",
        "resourceType",
        "resourceName",
        "properties",
        "credentials",
        "tags"
    })
    public DiscoveryDetails(
            String agentId,
            ResourceType resourceType,
            String resourceName,
            PropertyDetails properties,
            CredentialCollection credentials,
            PropertyDetails tags) {
        super();
        this.agentId = agentId;
        this.resourceType = resourceType;
        this.resourceName = resourceName;
        this.properties = properties;
        this.credentials = credentials;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of Management Agent */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The OCID of Management Agent
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /** Resource Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * Resource Type.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The Name of resource type */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The Name of resource type
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private PropertyDetails properties;

        public Builder properties(PropertyDetails properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private CredentialCollection credentials;

        public Builder credentials(CredentialCollection credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private PropertyDetails tags;

        public Builder tags(PropertyDetails tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryDetails build() {
            DiscoveryDetails model =
                    new DiscoveryDetails(
                            this.agentId,
                            this.resourceType,
                            this.resourceName,
                            this.properties,
                            this.credentials,
                            this.tags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryDetails model) {
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
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

    /** The OCID of Management Agent */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The OCID of Management Agent
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /** Resource Type. */
    public enum ResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        WeblogicDomain("WEBLOGIC_DOMAIN"),
        EbsInstance("EBS_INSTANCE"),
        SqlServer("SQL_SERVER"),
        ApacheTomcat("APACHE_TOMCAT"),
        OracleDatabase("ORACLE_DATABASE"),
        OciOracleDb("OCI_ORACLE_DB"),
        OciOracleCdb("OCI_ORACLE_CDB"),
        OciOraclePdb("OCI_ORACLE_PDB"),
        Host("HOST"),
        OraclePsft("ORACLE_PSFT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Resource Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * Resource Type.
     *
     * @return the value
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /** The Name of resource type */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The Name of resource type
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final PropertyDetails properties;

    public PropertyDetails getProperties() {
        return properties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final CredentialCollection credentials;

    public CredentialCollection getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final PropertyDetails tags;

    public PropertyDetails getTags() {
        return tags;
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
        sb.append("DiscoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("agentId=").append(String.valueOf(this.agentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryDetails)) {
            return false;
        }

        DiscoveryDetails other = (DiscoveryDetails) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.tags, other.tags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
