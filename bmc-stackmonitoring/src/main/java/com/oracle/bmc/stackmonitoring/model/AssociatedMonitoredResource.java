/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about monitored resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssociatedMonitoredResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssociatedMonitoredResource
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "displayName",
        "type",
        "hostName",
        "externalId",
        "managementAgentId",
        "lifecycleState",
        "association"
    })
    public AssociatedMonitoredResource(
            String id,
            String name,
            String displayName,
            String type,
            String hostName,
            String externalId,
            String managementAgentId,
            ResourceLifecycleState lifecycleState,
            Object association) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.type = type;
        this.hostName = hostName;
        this.externalId = externalId;
        this.managementAgentId = managementAgentId;
        this.lifecycleState = lifecycleState;
        this.association = association;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of the monitored resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the monitored resource
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Monitored resource display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Monitored resource display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of the monitored resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of the monitored resource
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Resource Host Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Resource Host Name
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * External resource is any OCI resource identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * which is not a Stack Monitoring service resource.
         * Currently supports only following resource type identifiers - externalcontainerdatabase,
         * externalnoncontainerdatabase, externalpluggabledatabase and OCI compute instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * External resource is any OCI resource identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * which is not a Stack Monitoring service resource.
         * Currently supports only following resource type identifiers - externalcontainerdatabase,
         * externalnoncontainerdatabase, externalpluggabledatabase and OCI compute instance.
         *
         * @param externalId the value to set
         * @return this builder
         **/
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param managementAgentId the value to set
         * @return this builder
         **/
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The current state of the monitored resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceLifecycleState lifecycleState;

        /**
         * The current state of the monitored resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ResourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Association details of the resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("association")
        private Object association;

        /**
         * Association details of the resource
         * @param association the value to set
         * @return this builder
         **/
        public Builder association(Object association) {
            this.association = association;
            this.__explicitlySet__.add("association");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedMonitoredResource build() {
            AssociatedMonitoredResource model =
                    new AssociatedMonitoredResource(
                            this.id,
                            this.name,
                            this.displayName,
                            this.type,
                            this.hostName,
                            this.externalId,
                            this.managementAgentId,
                            this.lifecycleState,
                            this.association);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedMonitoredResource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of the monitored resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the monitored resource
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Monitored resource display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Monitored resource display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of the monitored resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of the monitored resource
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Resource Host Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Resource Host Name
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * External resource is any OCI resource identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * which is not a Stack Monitoring service resource.
     * Currently supports only following resource type identifiers - externalcontainerdatabase,
     * externalnoncontainerdatabase, externalpluggabledatabase and OCI compute instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * External resource is any OCI resource identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * which is not a Stack Monitoring service resource.
     * Currently supports only following resource type identifiers - externalcontainerdatabase,
     * externalnoncontainerdatabase, externalpluggabledatabase and OCI compute instance.
     *
     * @return the value
     **/
    public String getExternalId() {
        return externalId;
    }

    /**
     * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The current state of the monitored resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourceLifecycleState lifecycleState;

    /**
     * The current state of the monitored resource.
     * @return the value
     **/
    public ResourceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Association details of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private final Object association;

    /**
     * Association details of the resource
     * @return the value
     **/
    public Object getAssociation() {
        return association;
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
        sb.append("AssociatedMonitoredResource(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", association=").append(String.valueOf(this.association));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedMonitoredResource)) {
            return false;
        }

        AssociatedMonitoredResource other = (AssociatedMonitoredResource) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.association, other.association)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
