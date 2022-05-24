/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Details about an attachment owner
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OdaInstanceAttachmentOwner.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OdaInstanceAttachmentOwner {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
        private String ownerServiceName;

        public Builder ownerServiceName(String ownerServiceName) {
            this.ownerServiceName = ownerServiceName;
            this.__explicitlySet__.add("ownerServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
        private String ownerServiceTenancy;

        public Builder ownerServiceTenancy(String ownerServiceTenancy) {
            this.ownerServiceTenancy = ownerServiceTenancy;
            this.__explicitlySet__.add("ownerServiceTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaInstanceAttachmentOwner build() {
            OdaInstanceAttachmentOwner __instance__ =
                    new OdaInstanceAttachmentOwner(ownerServiceName, ownerServiceTenancy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaInstanceAttachmentOwner o) {
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

    /**
     * Name of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
    String ownerServiceName;

    /**
     * Tenancy OCID of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
    String ownerServiceTenancy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
