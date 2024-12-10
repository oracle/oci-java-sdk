/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * **OciOpenSearchIndexConfig**
 * <p>
 * The details of customer managed OCI OpenSearch.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciOpenSearchIndexConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "indexConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciOpenSearchIndexConfig extends IndexConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OpenSearch Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OpenSearch Cluster.
         * @param clusterId the value to set
         * @return this builder
         **/
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretDetail")
        private SecretDetail secretDetail;

        public Builder secretDetail(SecretDetail secretDetail) {
            this.secretDetail = secretDetail;
            this.__explicitlySet__.add("secretDetail");
            return this;
        }
        /**
         * Index configuration for open search.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indexes")
        private java.util.List<Index> indexes;

        /**
         * Index configuration for open search.
         * @param indexes the value to set
         * @return this builder
         **/
        public Builder indexes(java.util.List<Index> indexes) {
            this.indexes = indexes;
            this.__explicitlySet__.add("indexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciOpenSearchIndexConfig build() {
            OciOpenSearchIndexConfig model =
                    new OciOpenSearchIndexConfig(this.clusterId, this.secretDetail, this.indexes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciOpenSearchIndexConfig model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("secretDetail")) {
                this.secretDetail(model.getSecretDetail());
            }
            if (model.wasPropertyExplicitlySet("indexes")) {
                this.indexes(model.getIndexes());
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

    @Deprecated
    public OciOpenSearchIndexConfig(
            String clusterId, SecretDetail secretDetail, java.util.List<Index> indexes) {
        super();
        this.clusterId = clusterId;
        this.secretDetail = secretDetail;
        this.indexes = indexes;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OpenSearch Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OpenSearch Cluster.
     * @return the value
     **/
    public String getClusterId() {
        return clusterId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretDetail")
    private final SecretDetail secretDetail;

    public SecretDetail getSecretDetail() {
        return secretDetail;
    }

    /**
     * Index configuration for open search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexes")
    private final java.util.List<Index> indexes;

    /**
     * Index configuration for open search.
     * @return the value
     **/
    public java.util.List<Index> getIndexes() {
        return indexes;
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
        sb.append("OciOpenSearchIndexConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", secretDetail=").append(String.valueOf(this.secretDetail));
        sb.append(", indexes=").append(String.valueOf(this.indexes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciOpenSearchIndexConfig)) {
            return false;
        }

        OciOpenSearchIndexConfig other = (OciOpenSearchIndexConfig) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.secretDetail, other.secretDetail)
                && java.util.Objects.equals(this.indexes, other.indexes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.secretDetail == null ? 43 : this.secretDetail.hashCode());
        result = (result * PRIME) + (this.indexes == null ? 43 : this.indexes.hashCode());
        return result;
    }
}
