/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * DiscoveryJob Credential Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CredentialDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
        private String credentialType;

        public Builder credentialType(String credentialType) {
            this.credentialType = credentialType;
            this.__explicitlySet__.add("credentialType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private PropertyDetails properties;

        public Builder properties(PropertyDetails properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialDetails build() {
            CredentialDetails __instance__ =
                    new CredentialDetails(credentialName, credentialType, properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialDetails o) {
            Builder copiedBuilder =
                    credentialName(o.getCredentialName())
                            .credentialType(o.getCredentialType())
                            .properties(o.getProperties());

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
     * Name of Credential
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    String credentialName;

    /**
     * Name of Credential Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
    String credentialType;

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    PropertyDetails properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
