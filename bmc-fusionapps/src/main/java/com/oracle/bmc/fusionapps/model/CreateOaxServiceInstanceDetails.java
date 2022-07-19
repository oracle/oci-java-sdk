/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information about new Analytics Warehouse instance being provisioned.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOaxServiceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "serviceInstanceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOaxServiceInstanceDetails extends CreateServiceInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A unique Name for Analytics Warehouse.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique Name for Analytics Warehouse.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * This is the description for Analytics Warehouse Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * This is the description for Analytics Warehouse Service.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Admin information to provision Analytics Warehouse Servcie
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("FawAdminInfo")
        private FawAdminInfoDetails fawAdminInfo;

        /**
         * Admin information to provision Analytics Warehouse Servcie
         * @param fawAdminInfo the value to set
         * @return this builder
         **/
        public Builder fawAdminInfo(FawAdminInfoDetails fawAdminInfo) {
            this.fawAdminInfo = fawAdminInfo;
            this.__explicitlySet__.add("fawAdminInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOaxServiceInstanceDetails build() {
            CreateOaxServiceInstanceDetails __instance__ =
                    new CreateOaxServiceInstanceDetails(
                            displayName, compartmentId, name, description, fawAdminInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOaxServiceInstanceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .fawAdminInfo(o.getFawAdminInfo());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public CreateOaxServiceInstanceDetails(
            String displayName,
            String compartmentId,
            String name,
            String description,
            FawAdminInfoDetails fawAdminInfo) {
        super(displayName, compartmentId);
        this.name = name;
        this.description = description;
        this.fawAdminInfo = fawAdminInfo;
    }

    /**
     * A unique Name for Analytics Warehouse.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique Name for Analytics Warehouse.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * This is the description for Analytics Warehouse Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * This is the description for Analytics Warehouse Service.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Admin information to provision Analytics Warehouse Servcie
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("FawAdminInfo")
    private final FawAdminInfoDetails fawAdminInfo;

    /**
     * Admin information to provision Analytics Warehouse Servcie
     * @return the value
     **/
    public FawAdminInfoDetails getFawAdminInfo() {
        return fawAdminInfo;
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
        sb.append("CreateOaxServiceInstanceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", fawAdminInfo=").append(String.valueOf(this.fawAdminInfo));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOaxServiceInstanceDetails)) {
            return false;
        }

        CreateOaxServiceInstanceDetails other = (CreateOaxServiceInstanceDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.fawAdminInfo, other.fawAdminInfo)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.fawAdminInfo == null ? 43 : this.fawAdminInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
