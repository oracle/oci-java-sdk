/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of Cloud Gate Mappings that map Apps to this Cloud Gate
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloudGateExtMappings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudGateExtMappings extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mappingId",
        "resourcePrefix",
        "proxyPass",
        "serverId",
        "nginxSettings",
        "appId",
        "value",
        "name",
        "ref",
        "policyName",
        "upstreamServerGroupId"
    })
    public CloudGateExtMappings(
            String mappingId,
            String resourcePrefix,
            String proxyPass,
            String serverId,
            String nginxSettings,
            String appId,
            String value,
            String name,
            String ref,
            String policyName,
            String upstreamServerGroupId) {
        super();
        this.mappingId = mappingId;
        this.resourcePrefix = resourcePrefix;
        this.proxyPass = proxyPass;
        this.serverId = serverId;
        this.nginxSettings = nginxSettings;
        this.appId = appId;
        this.value = value;
        this.name = name;
        this.ref = ref;
        this.policyName = policyName;
        this.upstreamServerGroupId = upstreamServerGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the Cloud Gate Mapping
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mappingId")
        private String mappingId;

        /**
         * The id of the Cloud Gate Mapping
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param mappingId the value to set
         * @return this builder
         **/
        public Builder mappingId(String mappingId) {
            this.mappingId = mappingId;
            this.__explicitlySet__.add("mappingId");
            return this;
        }
        /**
         * Resource prefix for this mapping.  This will be used to define the location block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrefix")
        private String resourcePrefix;

        /**
         * Resource prefix for this mapping.  This will be used to define the location block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param resourcePrefix the value to set
         * @return this builder
         **/
        public Builder resourcePrefix(String resourcePrefix) {
            this.resourcePrefix = resourcePrefix;
            this.__explicitlySet__.add("resourcePrefix");
            return this;
        }
        /**
         * NGINX ProxyPass entry for this Mapping
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("proxyPass")
        private String proxyPass;

        /**
         * NGINX ProxyPass entry for this Mapping
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param proxyPass the value to set
         * @return this builder
         **/
        public Builder proxyPass(String proxyPass) {
            this.proxyPass = proxyPass;
            this.__explicitlySet__.add("proxyPass");
            return this;
        }
        /**
         * Server Instance for the Mapping. This is one of the server IDs(server blocks) from the associated Cloud Gate list
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serverId")
        private String serverId;

        /**
         * Server Instance for the Mapping. This is one of the server IDs(server blocks) from the associated Cloud Gate list
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param serverId the value to set
         * @return this builder
         **/
        public Builder serverId(String serverId) {
            this.serverId = serverId;
            this.__explicitlySet__.add("serverId");
            return this;
        }
        /**
         * More NGINX Settings. JSON encoded key value pairs similar to WTP encoding
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
        private String nginxSettings;

        /**
         * More NGINX Settings. JSON encoded key value pairs similar to WTP encoding
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param nginxSettings the value to set
         * @return this builder
         **/
        public Builder nginxSettings(String nginxSettings) {
            this.nginxSettings = nginxSettings;
            this.__explicitlySet__.add("nginxSettings");
            return this;
        }
        /**
         * The ID of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appId")
        private String appId;

        /**
         * The ID of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param appId the value to set
         * @return this builder
         **/
        public Builder appId(String appId) {
            this.appId = appId;
            this.__explicitlySet__.add("appId");
            return this;
        }
        /**
         * The id of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The id of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The name (Client ID) of the App being mapped to
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name (Client ID) of the App being mapped to
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * URI of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * URI of the App being mapped to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * The Web Tier policy name used for the App that is mapped to this Cloud Gate
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        /**
         * The Web Tier policy name used for the App that is mapped to this Cloud Gate
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param policyName the value to set
         * @return this builder
         **/
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }
        /**
         * Upstream server group instance for the Mapping. This is one of the upstream server group IDs(upstream blocks) from the associated Cloud Gate list
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upstreamServerGroupId")
        private String upstreamServerGroupId;

        /**
         * Upstream server group instance for the Mapping. This is one of the upstream server group IDs(upstream blocks) from the associated Cloud Gate list
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param upstreamServerGroupId the value to set
         * @return this builder
         **/
        public Builder upstreamServerGroupId(String upstreamServerGroupId) {
            this.upstreamServerGroupId = upstreamServerGroupId;
            this.__explicitlySet__.add("upstreamServerGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudGateExtMappings build() {
            CloudGateExtMappings model =
                    new CloudGateExtMappings(
                            this.mappingId,
                            this.resourcePrefix,
                            this.proxyPass,
                            this.serverId,
                            this.nginxSettings,
                            this.appId,
                            this.value,
                            this.name,
                            this.ref,
                            this.policyName,
                            this.upstreamServerGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudGateExtMappings model) {
            if (model.wasPropertyExplicitlySet("mappingId")) {
                this.mappingId(model.getMappingId());
            }
            if (model.wasPropertyExplicitlySet("resourcePrefix")) {
                this.resourcePrefix(model.getResourcePrefix());
            }
            if (model.wasPropertyExplicitlySet("proxyPass")) {
                this.proxyPass(model.getProxyPass());
            }
            if (model.wasPropertyExplicitlySet("serverId")) {
                this.serverId(model.getServerId());
            }
            if (model.wasPropertyExplicitlySet("nginxSettings")) {
                this.nginxSettings(model.getNginxSettings());
            }
            if (model.wasPropertyExplicitlySet("appId")) {
                this.appId(model.getAppId());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("policyName")) {
                this.policyName(model.getPolicyName());
            }
            if (model.wasPropertyExplicitlySet("upstreamServerGroupId")) {
                this.upstreamServerGroupId(model.getUpstreamServerGroupId());
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
     * The id of the Cloud Gate Mapping
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappingId")
    private final String mappingId;

    /**
     * The id of the Cloud Gate Mapping
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getMappingId() {
        return mappingId;
    }

    /**
     * Resource prefix for this mapping.  This will be used to define the location block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrefix")
    private final String resourcePrefix;

    /**
     * Resource prefix for this mapping.  This will be used to define the location block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getResourcePrefix() {
        return resourcePrefix;
    }

    /**
     * NGINX ProxyPass entry for this Mapping
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxyPass")
    private final String proxyPass;

    /**
     * NGINX ProxyPass entry for this Mapping
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getProxyPass() {
        return proxyPass;
    }

    /**
     * Server Instance for the Mapping. This is one of the server IDs(server blocks) from the associated Cloud Gate list
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverId")
    private final String serverId;

    /**
     * Server Instance for the Mapping. This is one of the server IDs(server blocks) from the associated Cloud Gate list
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getServerId() {
        return serverId;
    }

    /**
     * More NGINX Settings. JSON encoded key value pairs similar to WTP encoding
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
    private final String nginxSettings;

    /**
     * More NGINX Settings. JSON encoded key value pairs similar to WTP encoding
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getNginxSettings() {
        return nginxSettings;
    }

    /**
     * The ID of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appId")
    private final String appId;

    /**
     * The ID of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAppId() {
        return appId;
    }

    /**
     * The id of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The id of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The name (Client ID) of the App being mapped to
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name (Client ID) of the App being mapped to
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * URI of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * URI of the App being mapped to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * The Web Tier policy name used for the App that is mapped to this Cloud Gate
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    private final String policyName;

    /**
     * The Web Tier policy name used for the App that is mapped to this Cloud Gate
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Upstream server group instance for the Mapping. This is one of the upstream server group IDs(upstream blocks) from the associated Cloud Gate list
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upstreamServerGroupId")
    private final String upstreamServerGroupId;

    /**
     * Upstream server group instance for the Mapping. This is one of the upstream server group IDs(upstream blocks) from the associated Cloud Gate list
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getUpstreamServerGroupId() {
        return upstreamServerGroupId;
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
        sb.append("CloudGateExtMappings(");
        sb.append("super=").append(super.toString());
        sb.append("mappingId=").append(String.valueOf(this.mappingId));
        sb.append(", resourcePrefix=").append(String.valueOf(this.resourcePrefix));
        sb.append(", proxyPass=").append(String.valueOf(this.proxyPass));
        sb.append(", serverId=").append(String.valueOf(this.serverId));
        sb.append(", nginxSettings=").append(String.valueOf(this.nginxSettings));
        sb.append(", appId=").append(String.valueOf(this.appId));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", policyName=").append(String.valueOf(this.policyName));
        sb.append(", upstreamServerGroupId=").append(String.valueOf(this.upstreamServerGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudGateExtMappings)) {
            return false;
        }

        CloudGateExtMappings other = (CloudGateExtMappings) o;
        return java.util.Objects.equals(this.mappingId, other.mappingId)
                && java.util.Objects.equals(this.resourcePrefix, other.resourcePrefix)
                && java.util.Objects.equals(this.proxyPass, other.proxyPass)
                && java.util.Objects.equals(this.serverId, other.serverId)
                && java.util.Objects.equals(this.nginxSettings, other.nginxSettings)
                && java.util.Objects.equals(this.appId, other.appId)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.policyName, other.policyName)
                && java.util.Objects.equals(this.upstreamServerGroupId, other.upstreamServerGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mappingId == null ? 43 : this.mappingId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePrefix == null ? 43 : this.resourcePrefix.hashCode());
        result = (result * PRIME) + (this.proxyPass == null ? 43 : this.proxyPass.hashCode());
        result = (result * PRIME) + (this.serverId == null ? 43 : this.serverId.hashCode());
        result =
                (result * PRIME)
                        + (this.nginxSettings == null ? 43 : this.nginxSettings.hashCode());
        result = (result * PRIME) + (this.appId == null ? 43 : this.appId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result =
                (result * PRIME)
                        + (this.upstreamServerGroupId == null
                                ? 43
                                : this.upstreamServerGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
