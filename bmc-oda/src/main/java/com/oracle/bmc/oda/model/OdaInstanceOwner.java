/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Details about an ODA instance owner
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OdaInstanceOwner.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OdaInstanceOwner {
    @Deprecated
    @java.beans.ConstructorProperties({"ownerServiceName", "ownerServiceTenancy"})
    public OdaInstanceOwner(String ownerServiceName, String ownerServiceTenancy) {
        super();
        this.ownerServiceName = ownerServiceName;
        this.ownerServiceTenancy = ownerServiceTenancy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the owner service principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
        private String ownerServiceName;

        /**
         * Name of the owner service principal
         * @param ownerServiceName the value to set
         * @return this builder
         **/
        public Builder ownerServiceName(String ownerServiceName) {
            this.ownerServiceName = ownerServiceName;
            this.__explicitlySet__.add("ownerServiceName");
            return this;
        }
        /**
         * Tenancy OCID of the owner service principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
        private String ownerServiceTenancy;

        /**
         * Tenancy OCID of the owner service principal
         * @param ownerServiceTenancy the value to set
         * @return this builder
         **/
        public Builder ownerServiceTenancy(String ownerServiceTenancy) {
            this.ownerServiceTenancy = ownerServiceTenancy;
            this.__explicitlySet__.add("ownerServiceTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaInstanceOwner build() {
            OdaInstanceOwner __instance__ =
                    new OdaInstanceOwner(ownerServiceName, ownerServiceTenancy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaInstanceOwner o) {
            Builder copiedBuilder =
                    ownerServiceName(o.getOwnerServiceName())
                            .ownerServiceTenancy(o.getOwnerServiceTenancy());

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

    /**
     * Name of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
    private final String ownerServiceName;

    /**
     * Name of the owner service principal
     * @return the value
     **/
    public String getOwnerServiceName() {
        return ownerServiceName;
    }

    /**
     * Tenancy OCID of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
    private final String ownerServiceTenancy;

    /**
     * Tenancy OCID of the owner service principal
     * @return the value
     **/
    public String getOwnerServiceTenancy() {
        return ownerServiceTenancy;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OdaInstanceOwner(");
        sb.append("ownerServiceName=").append(String.valueOf(this.ownerServiceName));
        sb.append(", ownerServiceTenancy=").append(String.valueOf(this.ownerServiceTenancy));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdaInstanceOwner)) {
            return false;
        }

        OdaInstanceOwner other = (OdaInstanceOwner) o;
        return java.util.Objects.equals(this.ownerServiceName, other.ownerServiceName)
                && java.util.Objects.equals(this.ownerServiceTenancy, other.ownerServiceTenancy)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ownerServiceName == null ? 43 : this.ownerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerServiceTenancy == null
                                ? 43
                                : this.ownerServiceTenancy.hashCode());
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
