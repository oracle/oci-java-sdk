/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Connection and CA bundle trust details for a remote cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoteReindexSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoteReindexSourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endpoint", "endpointResolutionIp", "caBundleId"})
    public RemoteReindexSourceDetails(
            String endpoint, String endpointResolutionIp, String caBundleId) {
        super();
        this.endpoint = endpoint;
        this.endpointResolutionIp = endpointResolutionIp;
        this.caBundleId = caBundleId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * HTTPS endpoint of the remote Elasticsearch or OpenSearch cluster. The hostname and port
         * are used to allow remote reindexing. Use a DNS hostname, rather than an IP address, when
         * endpointResolutionIp is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * HTTPS endpoint of the remote Elasticsearch or OpenSearch cluster. The hostname and port
         * are used to allow remote reindexing. Use a DNS hostname, rather than an IP address, when
         * endpointResolutionIp is specified.
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /**
         * Optional IP address to which the endpoint hostname is resolved from within the OpenSearch
         * cluster. The original hostname remains in the connection URL and is used for TLS
         * verification.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointResolutionIp")
        private String endpointResolutionIp;

        /**
         * Optional IP address to which the endpoint hostname is resolved from within the OpenSearch
         * cluster. The original hostname remains in the connection URL and is used for TLS
         * verification.
         *
         * @param endpointResolutionIp the value to set
         * @return this builder
         */
        public Builder endpointResolutionIp(String endpointResolutionIp) {
            this.endpointResolutionIp = endpointResolutionIp;
            this.__explicitlySet__.add("endpointResolutionIp");
            return this;
        }
        /**
         * OCID of the OCI Certificates service CA bundle containing the trusted CA certificates
         * used to verify the remote cluster's HTTPS certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
        private String caBundleId;

        /**
         * OCID of the OCI Certificates service CA bundle containing the trusted CA certificates
         * used to verify the remote cluster's HTTPS certificate.
         *
         * @param caBundleId the value to set
         * @return this builder
         */
        public Builder caBundleId(String caBundleId) {
            this.caBundleId = caBundleId;
            this.__explicitlySet__.add("caBundleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoteReindexSourceDetails build() {
            RemoteReindexSourceDetails model =
                    new RemoteReindexSourceDetails(
                            this.endpoint, this.endpointResolutionIp, this.caBundleId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoteReindexSourceDetails model) {
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("endpointResolutionIp")) {
                this.endpointResolutionIp(model.getEndpointResolutionIp());
            }
            if (model.wasPropertyExplicitlySet("caBundleId")) {
                this.caBundleId(model.getCaBundleId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * HTTPS endpoint of the remote Elasticsearch or OpenSearch cluster. The hostname and port are
     * used to allow remote reindexing. Use a DNS hostname, rather than an IP address, when
     * endpointResolutionIp is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * HTTPS endpoint of the remote Elasticsearch or OpenSearch cluster. The hostname and port are
     * used to allow remote reindexing. Use a DNS hostname, rather than an IP address, when
     * endpointResolutionIp is specified.
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Optional IP address to which the endpoint hostname is resolved from within the OpenSearch
     * cluster. The original hostname remains in the connection URL and is used for TLS
     * verification.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointResolutionIp")
    private final String endpointResolutionIp;

    /**
     * Optional IP address to which the endpoint hostname is resolved from within the OpenSearch
     * cluster. The original hostname remains in the connection URL and is used for TLS
     * verification.
     *
     * @return the value
     */
    public String getEndpointResolutionIp() {
        return endpointResolutionIp;
    }

    /**
     * OCID of the OCI Certificates service CA bundle containing the trusted CA certificates used to
     * verify the remote cluster's HTTPS certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
    private final String caBundleId;

    /**
     * OCID of the OCI Certificates service CA bundle containing the trusted CA certificates used to
     * verify the remote cluster's HTTPS certificate.
     *
     * @return the value
     */
    public String getCaBundleId() {
        return caBundleId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RemoteReindexSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", endpointResolutionIp=").append(String.valueOf(this.endpointResolutionIp));
        sb.append(", caBundleId=").append(String.valueOf(this.caBundleId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoteReindexSourceDetails)) {
            return false;
        }

        RemoteReindexSourceDetails other = (RemoteReindexSourceDetails) o;
        return java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.endpointResolutionIp, other.endpointResolutionIp)
                && java.util.Objects.equals(this.caBundleId, other.caBundleId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointResolutionIp == null
                                ? 43
                                : this.endpointResolutionIp.hashCode());
        result = (result * PRIME) + (this.caBundleId == null ? 43 : this.caBundleId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
