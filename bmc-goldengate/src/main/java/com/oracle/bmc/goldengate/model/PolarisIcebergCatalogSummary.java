/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Polaris catalog used in the Iceberg connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PolarisIcebergCatalogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "catalogType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PolarisIcebergCatalogSummary extends IcebergCatalogSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The URL endpoint for the Polaris API. e.g.:
         * 'https://<your-snowflake-account>.snowflakecomputing.com/polaris/api/catalog'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * The URL endpoint for the Polaris API. e.g.:
         * 'https://<your-snowflake-account>.snowflakecomputing.com/polaris/api/catalog'
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** The catalog name within Polaris where Iceberg tables are registered. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The catalog name within Polaris where Iceberg tables are registered.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The OAuth client ID used for authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The OAuth client ID used for authentication.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
        private String clientSecretSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
         *
         * @param clientSecretSecretId the value to set
         * @return this builder
         */
        public Builder clientSecretSecretId(String clientSecretSecretId) {
            this.clientSecretSecretId = clientSecretSecretId;
            this.__explicitlySet__.add("clientSecretSecretId");
            return this;
        }
        /** The Snowflake role used to access Polaris. */
        @com.fasterxml.jackson.annotation.JsonProperty("principalRole")
        private String principalRole;

        /**
         * The Snowflake role used to access Polaris.
         *
         * @param principalRole the value to set
         * @return this builder
         */
        public Builder principalRole(String principalRole) {
            this.principalRole = principalRole;
            this.__explicitlySet__.add("principalRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PolarisIcebergCatalogSummary build() {
            PolarisIcebergCatalogSummary model =
                    new PolarisIcebergCatalogSummary(
                            this.uri,
                            this.name,
                            this.clientId,
                            this.clientSecretSecretId,
                            this.principalRole);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PolarisIcebergCatalogSummary model) {
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecretSecretId")) {
                this.clientSecretSecretId(model.getClientSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("principalRole")) {
                this.principalRole(model.getPrincipalRole());
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

    @Deprecated
    public PolarisIcebergCatalogSummary(
            String uri,
            String name,
            String clientId,
            String clientSecretSecretId,
            String principalRole) {
        super();
        this.uri = uri;
        this.name = name;
        this.clientId = clientId;
        this.clientSecretSecretId = clientSecretSecretId;
        this.principalRole = principalRole;
    }

    /**
     * The URL endpoint for the Polaris API. e.g.:
     * 'https://<your-snowflake-account>.snowflakecomputing.com/polaris/api/catalog'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * The URL endpoint for the Polaris API. e.g.:
     * 'https://<your-snowflake-account>.snowflakecomputing.com/polaris/api/catalog'
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** The catalog name within Polaris where Iceberg tables are registered. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The catalog name within Polaris where Iceberg tables are registered.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The OAuth client ID used for authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The OAuth client ID used for authentication.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
    private final String clientSecretSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
     *
     * @return the value
     */
    public String getClientSecretSecretId() {
        return clientSecretSecretId;
    }

    /** The Snowflake role used to access Polaris. */
    @com.fasterxml.jackson.annotation.JsonProperty("principalRole")
    private final String principalRole;

    /**
     * The Snowflake role used to access Polaris.
     *
     * @return the value
     */
    public String getPrincipalRole() {
        return principalRole;
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
        sb.append("PolarisIcebergCatalogSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecretSecretId=").append(String.valueOf(this.clientSecretSecretId));
        sb.append(", principalRole=").append(String.valueOf(this.principalRole));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PolarisIcebergCatalogSummary)) {
            return false;
        }

        PolarisIcebergCatalogSummary other = (PolarisIcebergCatalogSummary) o;
        return java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecretSecretId, other.clientSecretSecretId)
                && java.util.Objects.equals(this.principalRole, other.principalRole)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretSecretId == null
                                ? 43
                                : this.clientSecretSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.principalRole == null ? 43 : this.principalRole.hashCode());
        return result;
    }
}
