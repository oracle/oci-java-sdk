/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for a Service Cloud agent channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceCloudChannel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceCloudChannel extends Channel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private ChannelCategory category;

        public Builder category(ChannelCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The domain name.
         *
         * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
         * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
         * is sitename and the domain name is exampledomain.com.
         *
         * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
         * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The domain name.
         *
         * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
         * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
         * is sitename and the domain name is exampledomain.com.
         *
         * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
         * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
         *
         * @param domainName the value to set
         * @return this builder
         **/
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /**
         * The host prefix.
         *
         * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
         * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
         * is sitename and the domain name is exampledomain.com.
         *
         * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
         * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
        private String hostNamePrefix;

        /**
         * The host prefix.
         *
         * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
         * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
         * is sitename and the domain name is exampledomain.com.
         *
         * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
         * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
         *
         * @param hostNamePrefix the value to set
         * @return this builder
         **/
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            this.__explicitlySet__.add("hostNamePrefix");
            return this;
        }
        /**
         * The user name for an Oracle B2C Service staff member who has the necessary profile permissions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name for an Oracle B2C Service staff member who has the necessary profile permissions.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The type of Service Cloud client.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientType")
        private ServiceCloudClientType clientType;

        /**
         * The type of Service Cloud client.
         * @param clientType the value to set
         * @return this builder
         **/
        public Builder clientType(ServiceCloudClientType clientType) {
            this.clientType = clientType;
            this.__explicitlySet__.add("clientType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCloudChannel build() {
            ServiceCloudChannel model =
                    new ServiceCloudChannel(
                            this.id,
                            this.name,
                            this.description,
                            this.category,
                            this.sessionExpiryDurationInMilliseconds,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.domainName,
                            this.hostNamePrefix,
                            this.userName,
                            this.clientType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCloudChannel model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("sessionExpiryDurationInMilliseconds")) {
                this.sessionExpiryDurationInMilliseconds(
                        model.getSessionExpiryDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("hostNamePrefix")) {
                this.hostNamePrefix(model.getHostNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("clientType")) {
                this.clientType(model.getClientType());
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

    @Deprecated
    public ServiceCloudChannel(
            String id,
            String name,
            String description,
            ChannelCategory category,
            Long sessionExpiryDurationInMilliseconds,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String domainName,
            String hostNamePrefix,
            String userName,
            ServiceCloudClientType clientType) {
        super(
                id,
                name,
                description,
                category,
                sessionExpiryDurationInMilliseconds,
                lifecycleState,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags);
        this.domainName = domainName;
        this.hostNamePrefix = hostNamePrefix;
        this.userName = userName;
        this.clientType = clientType;
    }

    /**
     * The domain name.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The domain name.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     * @return the value
     **/
    public String getDomainName() {
        return domainName;
    }

    /**
     * The host prefix.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
    private final String hostNamePrefix;

    /**
     * The host prefix.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     * @return the value
     **/
    public String getHostNamePrefix() {
        return hostNamePrefix;
    }

    /**
     * The user name for an Oracle B2C Service staff member who has the necessary profile permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name for an Oracle B2C Service staff member who has the necessary profile permissions.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The type of Service Cloud client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientType")
    private final ServiceCloudClientType clientType;

    /**
     * The type of Service Cloud client.
     * @return the value
     **/
    public ServiceCloudClientType getClientType() {
        return clientType;
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
        sb.append("ServiceCloudChannel(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", hostNamePrefix=").append(String.valueOf(this.hostNamePrefix));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", clientType=").append(String.valueOf(this.clientType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCloudChannel)) {
            return false;
        }

        ServiceCloudChannel other = (ServiceCloudChannel) o;
        return java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.hostNamePrefix, other.hostNamePrefix)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.clientType, other.clientType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostNamePrefix == null ? 43 : this.hostNamePrefix.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.clientType == null ? 43 : this.clientType.hashCode());
        return result;
    }
}
