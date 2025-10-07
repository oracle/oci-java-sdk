/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Custom certificate config for customer provided certs. <br>
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
        builder = CertificateConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterCertificateMode",
        "dashboardCertificateMode",
        "openSearchApiCertificateId",
        "openSearchDashboardCertificateId"
    })
    public CertificateConfig(
            CertificateMode clusterCertificateMode,
            CertificateMode dashboardCertificateMode,
            String openSearchApiCertificateId,
            String openSearchDashboardCertificateId) {
        super();
        this.clusterCertificateMode = clusterCertificateMode;
        this.dashboardCertificateMode = dashboardCertificateMode;
        this.openSearchApiCertificateId = openSearchApiCertificateId;
        this.openSearchDashboardCertificateId = openSearchDashboardCertificateId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether the certificate to be used in cluster is managed by OpenSearch or OCI
         * Certificates service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterCertificateMode")
        private CertificateMode clusterCertificateMode;

        /**
         * Specifies whether the certificate to be used in cluster is managed by OpenSearch or OCI
         * Certificates service.
         *
         * @param clusterCertificateMode the value to set
         * @return this builder
         */
        public Builder clusterCertificateMode(CertificateMode clusterCertificateMode) {
            this.clusterCertificateMode = clusterCertificateMode;
            this.__explicitlySet__.add("clusterCertificateMode");
            return this;
        }
        /**
         * Specifies whether the certificate to be used in dashboard is managed by OpenSearch or OCI
         * Certificates service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardCertificateMode")
        private CertificateMode dashboardCertificateMode;

        /**
         * Specifies whether the certificate to be used in dashboard is managed by OpenSearch or OCI
         * Certificates service.
         *
         * @param dashboardCertificateMode the value to set
         * @return this builder
         */
        public Builder dashboardCertificateMode(CertificateMode dashboardCertificateMode) {
            this.dashboardCertificateMode = dashboardCertificateMode;
            this.__explicitlySet__.add("dashboardCertificateMode");
            return this;
        }
        /** certificate to be used for OpenSearch cluster api communication */
        @com.fasterxml.jackson.annotation.JsonProperty("openSearchApiCertificateId")
        private String openSearchApiCertificateId;

        /**
         * certificate to be used for OpenSearch cluster api communication
         *
         * @param openSearchApiCertificateId the value to set
         * @return this builder
         */
        public Builder openSearchApiCertificateId(String openSearchApiCertificateId) {
            this.openSearchApiCertificateId = openSearchApiCertificateId;
            this.__explicitlySet__.add("openSearchApiCertificateId");
            return this;
        }
        /** certificate to be used for OpenSearch dashboard api communication */
        @com.fasterxml.jackson.annotation.JsonProperty("openSearchDashboardCertificateId")
        private String openSearchDashboardCertificateId;

        /**
         * certificate to be used for OpenSearch dashboard api communication
         *
         * @param openSearchDashboardCertificateId the value to set
         * @return this builder
         */
        public Builder openSearchDashboardCertificateId(String openSearchDashboardCertificateId) {
            this.openSearchDashboardCertificateId = openSearchDashboardCertificateId;
            this.__explicitlySet__.add("openSearchDashboardCertificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateConfig build() {
            CertificateConfig model =
                    new CertificateConfig(
                            this.clusterCertificateMode,
                            this.dashboardCertificateMode,
                            this.openSearchApiCertificateId,
                            this.openSearchDashboardCertificateId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateConfig model) {
            if (model.wasPropertyExplicitlySet("clusterCertificateMode")) {
                this.clusterCertificateMode(model.getClusterCertificateMode());
            }
            if (model.wasPropertyExplicitlySet("dashboardCertificateMode")) {
                this.dashboardCertificateMode(model.getDashboardCertificateMode());
            }
            if (model.wasPropertyExplicitlySet("openSearchApiCertificateId")) {
                this.openSearchApiCertificateId(model.getOpenSearchApiCertificateId());
            }
            if (model.wasPropertyExplicitlySet("openSearchDashboardCertificateId")) {
                this.openSearchDashboardCertificateId(model.getOpenSearchDashboardCertificateId());
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
     * Specifies whether the certificate to be used in cluster is managed by OpenSearch or OCI
     * Certificates service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCertificateMode")
    private final CertificateMode clusterCertificateMode;

    /**
     * Specifies whether the certificate to be used in cluster is managed by OpenSearch or OCI
     * Certificates service.
     *
     * @return the value
     */
    public CertificateMode getClusterCertificateMode() {
        return clusterCertificateMode;
    }

    /**
     * Specifies whether the certificate to be used in dashboard is managed by OpenSearch or OCI
     * Certificates service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardCertificateMode")
    private final CertificateMode dashboardCertificateMode;

    /**
     * Specifies whether the certificate to be used in dashboard is managed by OpenSearch or OCI
     * Certificates service.
     *
     * @return the value
     */
    public CertificateMode getDashboardCertificateMode() {
        return dashboardCertificateMode;
    }

    /** certificate to be used for OpenSearch cluster api communication */
    @com.fasterxml.jackson.annotation.JsonProperty("openSearchApiCertificateId")
    private final String openSearchApiCertificateId;

    /**
     * certificate to be used for OpenSearch cluster api communication
     *
     * @return the value
     */
    public String getOpenSearchApiCertificateId() {
        return openSearchApiCertificateId;
    }

    /** certificate to be used for OpenSearch dashboard api communication */
    @com.fasterxml.jackson.annotation.JsonProperty("openSearchDashboardCertificateId")
    private final String openSearchDashboardCertificateId;

    /**
     * certificate to be used for OpenSearch dashboard api communication
     *
     * @return the value
     */
    public String getOpenSearchDashboardCertificateId() {
        return openSearchDashboardCertificateId;
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
        sb.append("CertificateConfig(");
        sb.append("super=").append(super.toString());
        sb.append("clusterCertificateMode=").append(String.valueOf(this.clusterCertificateMode));
        sb.append(", dashboardCertificateMode=")
                .append(String.valueOf(this.dashboardCertificateMode));
        sb.append(", openSearchApiCertificateId=")
                .append(String.valueOf(this.openSearchApiCertificateId));
        sb.append(", openSearchDashboardCertificateId=")
                .append(String.valueOf(this.openSearchDashboardCertificateId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateConfig)) {
            return false;
        }

        CertificateConfig other = (CertificateConfig) o;
        return java.util.Objects.equals(this.clusterCertificateMode, other.clusterCertificateMode)
                && java.util.Objects.equals(
                        this.dashboardCertificateMode, other.dashboardCertificateMode)
                && java.util.Objects.equals(
                        this.openSearchApiCertificateId, other.openSearchApiCertificateId)
                && java.util.Objects.equals(
                        this.openSearchDashboardCertificateId,
                        other.openSearchDashboardCertificateId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterCertificateMode == null
                                ? 43
                                : this.clusterCertificateMode.hashCode());
        result =
                (result * PRIME)
                        + (this.dashboardCertificateMode == null
                                ? 43
                                : this.dashboardCertificateMode.hashCode());
        result =
                (result * PRIME)
                        + (this.openSearchApiCertificateId == null
                                ? 43
                                : this.openSearchApiCertificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.openSearchDashboardCertificateId == null
                                ? 43
                                : this.openSearchDashboardCertificateId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
