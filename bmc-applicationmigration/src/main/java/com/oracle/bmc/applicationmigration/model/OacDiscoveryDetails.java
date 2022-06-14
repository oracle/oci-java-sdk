/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Details about the Oracle Analytics Cloud - Classic application in the source environment.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OacDiscoveryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OacDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceUser")
        private String serviceInstanceUser;

        /**
         * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
         * @param serviceInstanceUser the value to set
         * @return this builder
         **/
        public Builder serviceInstanceUser(String serviceInstanceUser) {
            this.serviceInstanceUser = serviceInstanceUser;
            this.__explicitlySet__.add("serviceInstanceUser");
            return this;
        }
        /**
         * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstancePassword")
        private String serviceInstancePassword;

        /**
         * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
         * @param serviceInstancePassword the value to set
         * @return this builder
         **/
        public Builder serviceInstancePassword(String serviceInstancePassword) {
            this.serviceInstancePassword = serviceInstancePassword;
            this.__explicitlySet__.add("serviceInstancePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OacDiscoveryDetails build() {
            OacDiscoveryDetails __instance__ =
                    new OacDiscoveryDetails(serviceInstanceUser, serviceInstancePassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacDiscoveryDetails o) {
            Builder copiedBuilder =
                    serviceInstanceUser(o.getServiceInstanceUser())
                            .serviceInstancePassword(o.getServiceInstancePassword());

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
    public OacDiscoveryDetails(String serviceInstanceUser, String serviceInstancePassword) {
        super();
        this.serviceInstanceUser = serviceInstanceUser;
        this.serviceInstancePassword = serviceInstancePassword;
    }

    /**
     * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceUser")
    private final String serviceInstanceUser;

    /**
     * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
     * @return the value
     **/
    public String getServiceInstanceUser() {
        return serviceInstanceUser;
    }

    /**
     * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstancePassword")
    private final String serviceInstancePassword;

    /**
     * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
     * @return the value
     **/
    public String getServiceInstancePassword() {
        return serviceInstancePassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OacDiscoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", serviceInstanceUser=").append(String.valueOf(this.serviceInstanceUser));
        sb.append(", serviceInstancePassword=")
                .append(String.valueOf(this.serviceInstancePassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacDiscoveryDetails)) {
            return false;
        }

        OacDiscoveryDetails other = (OacDiscoveryDetails) o;
        return java.util.Objects.equals(this.serviceInstanceUser, other.serviceInstanceUser)
                && java.util.Objects.equals(
                        this.serviceInstancePassword, other.serviceInstancePassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceInstanceUser == null
                                ? 43
                                : this.serviceInstanceUser.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceInstancePassword == null
                                ? 43
                                : this.serviceInstancePassword.hashCode());
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
