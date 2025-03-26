/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Summary object for service element in the network firewall policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "name", "parentResourceId"})
    public ServiceSummary(ServiceType type, String name, String parentResourceId) {
        super();
        this.type = type;
        this.name = name;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Describes the type of Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ServiceType type;

        /**
         * Describes the type of Service.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(ServiceType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Name of the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the service.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * OCID of the Network Firewall Policy this Service belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this Service belongs to.
         * @param parentResourceId the value to set
         * @return this builder
         **/
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceSummary build() {
            ServiceSummary model = new ServiceSummary(this.type, this.name, this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceSummary model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
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
     * Describes the type of Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ServiceType type;

    /**
     * Describes the type of Service.
     * @return the value
     **/
    public ServiceType getType() {
        return type;
    }

    /**
     * Name of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the service.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * OCID of the Network Firewall Policy this Service belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this Service belongs to.
     * @return the value
     **/
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("ServiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceSummary)) {
            return false;
        }

        ServiceSummary other = (ServiceSummary) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
