/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of returning a specified response code when the requested HTTP method is not in
 * the list of allowed methods for the listener. The load balancer does not forward a disallowed request to the back end
 * servers. The default response code is `405 Method Not Allowed`.
 * <p>
 * If you set the response code to `405` or leave it blank, the system adds an \"allow\" response header that contains a
 * list of the allowed methods for the listener. If you set the response code to anything other than `405` (or blank),
 * the system does not add the \"allow\" response header with a list of allowed methods.
 * <p>
 * This rule applies only to HTTP listeners. No more than one `ControlAccessUsingHttpMethodsRule` object can be present in
 * a given listener.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ControlAccessUsingHttpMethodsRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ControlAccessUsingHttpMethodsRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
        private java.util.List<String> allowedMethods;

        public Builder allowedMethods(java.util.List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            this.__explicitlySet__.add("allowedMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
        private Integer statusCode;

        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            this.__explicitlySet__.add("statusCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ControlAccessUsingHttpMethodsRule build() {
            ControlAccessUsingHttpMethodsRule __instance__ =
                    new ControlAccessUsingHttpMethodsRule(allowedMethods, statusCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ControlAccessUsingHttpMethodsRule o) {
            Builder copiedBuilder =
                    allowedMethods(o.getAllowedMethods()).statusCode(o.getStatusCode());

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
    public ControlAccessUsingHttpMethodsRule(
            java.util.List<String> allowedMethods, Integer statusCode) {
        super();
        this.allowedMethods = allowedMethods;
        this.statusCode = statusCode;
    }

    /**
     * The list of HTTP methods allowed for this listener.
     * <p>
     * By default, you can specify only the standard HTTP methods defined in the
     * [HTTP Method Registry](http://www.iana.org/assignments/http-methods/http-methods.xhtml). You can also
     * see a list of supported standard HTTP methods in the Load Balancing service documentation at
     * [Managing Rule Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrulesets.htm).
     * <p>
     * Your backend application must be able to handle the methods specified in this list.
     * <p>
     * The list of HTTP methods is extensible. If you need to configure custom HTTP methods, contact
     * [My Oracle Support](http://support.oracle.com/) to remove the restriction for your tenancy.
     * <p>
     * Example: [\"GET\", \"PUT\", \"POST\", \"PROPFIND\"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
    java.util.List<String> allowedMethods;

    /**
     * The HTTP status code to return when the requested HTTP method is not in the list of allowed methods.
     * The associated status line returned with the code is mapped from the standard HTTP specification. The
     * default value is `405 (Method Not Allowed)`.
     * <p>
     * Example: 403
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
    Integer statusCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
