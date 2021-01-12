/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OacDiscoveryDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OacDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceUser")
        private String serviceInstanceUser;

        public Builder serviceInstanceUser(String serviceInstanceUser) {
            this.serviceInstanceUser = serviceInstanceUser;
            this.__explicitlySet__.add("serviceInstanceUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstancePassword")
        private String serviceInstancePassword;

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
    String serviceInstanceUser;

    /**
     * This field is currently not supported. You must enter a value, such as <code>unused</code>. However, the value that you enter is ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstancePassword")
    String serviceInstancePassword;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
