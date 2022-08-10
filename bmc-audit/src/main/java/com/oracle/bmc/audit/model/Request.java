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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Request.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Request extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "path", "action", "parameters", "headers"})
    public Request(
            String id,
            String path,
            String action,
            java.util.Map<String, java.util.List<String>> parameters,
            java.util.Map<String, java.util.List<String>> headers) {
        super();
        this.id = id;
        this.path = path;
        this.action = action;
        this.parameters = parameters;
        this.headers = headers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The opc-request-id of the request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The opc-request-id of the request.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The full path of the API request.
         * <p>
         * Example: {@code /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The full path of the API request.
         * <p>
         * Example: {@code /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>}
         *
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The HTTP method of the request.
         * <p>
         * Example: {@code GET}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The HTTP method of the request.
         * <p>
         * Example: {@code GET}
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The parameters supplied by the caller during this operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, java.util.List<String>> parameters;

        /**
         * The parameters supplied by the caller during this operation.
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.Map<String, java.util.List<String>> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
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
        private java.util.Map<String, java.util.List<String>> headers;

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
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Request build() {
            Request model =
                    new Request(this.id, this.path, this.action, this.parameters, this.headers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Request model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
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
     * The opc-request-id of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The opc-request-id of the request.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The full path of the API request.
     * <p>
     * Example: {@code /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The full path of the API request.
     * <p>
     * Example: {@code /20160918/instances/ocid1.instance.oc1.phx.<unique_ID>}
     *
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * The HTTP method of the request.
     * <p>
     * Example: {@code GET}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The HTTP method of the request.
     * <p>
     * Example: {@code GET}
     *
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * The parameters supplied by the caller during this operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, java.util.List<String>> parameters;

    /**
     * The parameters supplied by the caller during this operation.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

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
    private final java.util.Map<String, java.util.List<String>> headers;

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
     * @return the value
     **/
    public java.util.Map<String, java.util.List<String>> getHeaders() {
        return headers;
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
        sb.append("Request(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Request)) {
            return false;
        }

        Request other = (Request) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.headers, other.headers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
