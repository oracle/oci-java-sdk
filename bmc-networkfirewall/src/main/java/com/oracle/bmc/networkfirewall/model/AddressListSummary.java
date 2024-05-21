/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Address List Summary in the network firewall policy
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddressListSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddressListSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "totalAddresses", "parentResourceId"})
    public AddressListSummary(
            String name, AddressListType type, Integer totalAddresses, String parentResourceId) {
        super();
        this.name = name;
        this.type = type;
        this.totalAddresses = totalAddresses;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of Address List
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of Address List
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Type of address List. The accepted values are - * FQDN * IP
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AddressListType type;

        /**
         * Type of address List. The accepted values are - * FQDN * IP
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(AddressListType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Count of total Addresses in the AddressList
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalAddresses")
        private Integer totalAddresses;

        /**
         * Count of total Addresses in the AddressList
         * @param totalAddresses the value to set
         * @return this builder
         **/
        public Builder totalAddresses(Integer totalAddresses) {
            this.totalAddresses = totalAddresses;
            this.__explicitlySet__.add("totalAddresses");
            return this;
        }
        /**
         * OCID of the Network Firewall Policy this address list belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this address list belongs to.
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

        public AddressListSummary build() {
            AddressListSummary model =
                    new AddressListSummary(
                            this.name, this.type, this.totalAddresses, this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressListSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("totalAddresses")) {
                this.totalAddresses(model.getTotalAddresses());
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
     * Name of Address List
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of Address List
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Type of address List. The accepted values are - * FQDN * IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AddressListType type;

    /**
     * Type of address List. The accepted values are - * FQDN * IP
     * @return the value
     **/
    public AddressListType getType() {
        return type;
    }

    /**
     * Count of total Addresses in the AddressList
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalAddresses")
    private final Integer totalAddresses;

    /**
     * Count of total Addresses in the AddressList
     * @return the value
     **/
    public Integer getTotalAddresses() {
        return totalAddresses;
    }

    /**
     * OCID of the Network Firewall Policy this address list belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this address list belongs to.
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
        sb.append("AddressListSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", totalAddresses=").append(String.valueOf(this.totalAddresses));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddressListSummary)) {
            return false;
        }

        AddressListSummary other = (AddressListSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.totalAddresses, other.totalAddresses)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAddresses == null ? 43 : this.totalAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
