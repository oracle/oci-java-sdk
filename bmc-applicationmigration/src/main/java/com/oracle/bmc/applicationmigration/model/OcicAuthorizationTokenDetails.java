/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Auth Token and endpoint to access Oracle Cloud Infrastructure - Classic, which is the source environment from which you want to migrate the application.
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
    builder = OcicAuthorizationTokenDetails.Builder.class
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
public class OcicAuthorizationTokenDetails extends AuthorizationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("clientAppUrl")
        private String clientAppUrl;

        public Builder clientAppUrl(String clientAppUrl) {
            this.clientAppUrl = clientAppUrl;
            this.__explicitlySet__.add("clientAppUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OcicAuthorizationTokenDetails build() {
            OcicAuthorizationTokenDetails __instance__ =
                    new OcicAuthorizationTokenDetails(clientAppUrl, accessToken);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcicAuthorizationTokenDetails o) {
            Builder copiedBuilder =
                    clientAppUrl(o.getClientAppUrl()).accessToken(o.getAccessToken());

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
    public OcicAuthorizationTokenDetails(String clientAppUrl, String accessToken) {
        super();
        this.clientAppUrl = clientAppUrl;
        this.accessToken = accessToken;
    }

    /**
     * AuthClient app url resource that the accesstoken is for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientAppUrl")
    String clientAppUrl;

    /**
     * AccessToken to access the app endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    String accessToken;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
