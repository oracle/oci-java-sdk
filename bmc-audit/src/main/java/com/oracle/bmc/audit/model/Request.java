/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for request attributes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Request.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Request {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, java.util.List<String>> parameters;

        public Builder parameters(java.util.Map<String, java.util.List<String>> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, java.util.List<String>> headers;

        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Request build() {
            Request __instance__ = new Request(id, path, action, parameters, headers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Request o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .path(o.getPath())
                            .action(o.getAction())
                            .parameters(o.getParameters())
                            .headers(o.getHeaders());

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
     * The opc-request-id of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The full path of the API request.
     * <p>
     * Example: {@code /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The HTTP method of the request.
     * <p>
     * Example: {@code GET}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    String action;

    /**
     * The parameters supplied by the caller during this operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.Map<String, java.util.List<String>> parameters;

    /**
     * The HTTP header fields and values in the request.
     * <p>
     * Example:
     * <p>
     * -----
     *     {
     *       "opc-principal": [
     *         "{\\"tenantId\\":\\"ocid1.tenancy.oc1..<unique_ID>\\",\\"subjectId\\":\\"ocid1.user.oc1..<unique_ID>\\",\\"claims\\":[{\\"key\\":\\"pstype\\",\\"value\\":\\"natv\\",\\"issuer\\":\\"authService.oracle.com\\"},{\\"key\\":\\"h_host\\",\\"value\\":\\"iaas.r2.oracleiaas.com\\",\\"issuer\\":\\"h\\"},{\\"key\\":\\"h_opc-request-id\\",\\"value\\":\\"<unique_ID>\\",\\"issuer\\":\\"h\\"},{\\"key\\":\\"ptype\\",\\"value\\":\\"user\\",\\"issuer\\":\\"authService.oracle.com\\"},{\\"key\\":\\"h_date\\",\\"value\\":\\"Wed, 18 Sep 2019 00:10:58 UTC\\",\\"issuer\\":\\"h\\"},{\\"key\\":\\"h_accept\\",\\"value\\":\\"application/json\\",\\"issuer\\":\\"h\\"},{\\"key\\":\\"authorization\\",\\"value\\":\\"Signature headers=\\\\\\"date (request-target) host accept opc-request-id\\\\\\",keyId=\\\\\\"ocid1.tenancy.oc1..<unique_ID>/ocid1.user.oc1..<unique_ID>/8c:b4:5f:18:e7:ec:db:08:b8:fa:d2:2a:7d:11:76:ac\\\\\\",algorithm=\\\\\\"rsa-pss-sha256\\\\\\",signature=\\\\\\"<unique_ID>\\\\\\",version=\\\\\\"1\\\\\\"\\",\\"issuer\\":\\"h\\"},{\\"key\\":\\"h_(request-target)\\",\\"value\\":\\"get /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>\\",\\"issuer\\":\\"h\\"}]}"
     *       ],
     *       "Accept": [
     *         "application/json"
     *       ],
     *       "X-Oracle-Auth-Client-CN": [
     *         "splat-proxy-se-02302.node.ad2.r2"
     *       ],
     *       "X-Forwarded-Host": [
     *         "compute-api.svc.ad1.r2"
     *       ],
     *       "Connection": [
     *         "close"
     *       ],
     *       "User-Agent": [
     *         "Jersey/2.23 (HttpUrlConnection 1.8.0_212)"
     *       ],
     *       "X-Forwarded-For": [
     *         "172.24.80.88"
     *       ],
     *       "X-Real-IP": [
     *         "172.24.80.88"
     *       ],
     *       "oci-original-url": [
     *         "https://iaas.r2.oracleiaas.com/20160918/instances/ocid1.instance.oc1.phx.<unique_ID>"
     *       ],
     *       "opc-request-id": [
     *         "<unique_ID>"
     *       ],
     *       "Date": [
     *         "Wed, 18 Sep 2019 00:10:58 UTC"
     *       ]
     *     }
     *   -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    java.util.Map<String, java.util.List<String>> headers;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
