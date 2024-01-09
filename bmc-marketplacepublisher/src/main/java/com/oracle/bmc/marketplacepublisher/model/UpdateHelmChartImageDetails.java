/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Helmchart image details required to update an helmchart artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateHelmChartImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateHelmChartImageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceRegistryId",
        "sourceRegistryUrl",
        "supportedKubernetesVersions"
    })
    public UpdateHelmChartImageDetails(
            String sourceRegistryId,
            String sourceRegistryUrl,
            java.util.List<String> supportedKubernetesVersions) {
        super();
        this.sourceRegistryId = sourceRegistryId;
        this.sourceRegistryUrl = sourceRegistryUrl;
        this.supportedKubernetesVersions = supportedKubernetesVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source registry OCID of the helmchart image. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryId")
        private String sourceRegistryId;

        /**
         * The source registry OCID of the helmchart image.
         *
         * @param sourceRegistryId the value to set
         * @return this builder
         */
        public Builder sourceRegistryId(String sourceRegistryId) {
            this.sourceRegistryId = sourceRegistryId;
            this.__explicitlySet__.add("sourceRegistryId");
            return this;
        }
        /** The source registry url of the helmchart image. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryUrl")
        private String sourceRegistryUrl;

        /**
         * The source registry url of the helmchart image.
         *
         * @param sourceRegistryUrl the value to set
         * @return this builder
         */
        public Builder sourceRegistryUrl(String sourceRegistryUrl) {
            this.sourceRegistryUrl = sourceRegistryUrl;
            this.__explicitlySet__.add("sourceRegistryUrl");
            return this;
        }
        /** The Supported Versions of Kubernetes */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedKubernetesVersions")
        private java.util.List<String> supportedKubernetesVersions;

        /**
         * The Supported Versions of Kubernetes
         *
         * @param supportedKubernetesVersions the value to set
         * @return this builder
         */
        public Builder supportedKubernetesVersions(
                java.util.List<String> supportedKubernetesVersions) {
            this.supportedKubernetesVersions = supportedKubernetesVersions;
            this.__explicitlySet__.add("supportedKubernetesVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateHelmChartImageDetails build() {
            UpdateHelmChartImageDetails model =
                    new UpdateHelmChartImageDetails(
                            this.sourceRegistryId,
                            this.sourceRegistryUrl,
                            this.supportedKubernetesVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateHelmChartImageDetails model) {
            if (model.wasPropertyExplicitlySet("sourceRegistryId")) {
                this.sourceRegistryId(model.getSourceRegistryId());
            }
            if (model.wasPropertyExplicitlySet("sourceRegistryUrl")) {
                this.sourceRegistryUrl(model.getSourceRegistryUrl());
            }
            if (model.wasPropertyExplicitlySet("supportedKubernetesVersions")) {
                this.supportedKubernetesVersions(model.getSupportedKubernetesVersions());
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

    /** The source registry OCID of the helmchart image. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryId")
    private final String sourceRegistryId;

    /**
     * The source registry OCID of the helmchart image.
     *
     * @return the value
     */
    public String getSourceRegistryId() {
        return sourceRegistryId;
    }

    /** The source registry url of the helmchart image. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryUrl")
    private final String sourceRegistryUrl;

    /**
     * The source registry url of the helmchart image.
     *
     * @return the value
     */
    public String getSourceRegistryUrl() {
        return sourceRegistryUrl;
    }

    /** The Supported Versions of Kubernetes */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedKubernetesVersions")
    private final java.util.List<String> supportedKubernetesVersions;

    /**
     * The Supported Versions of Kubernetes
     *
     * @return the value
     */
    public java.util.List<String> getSupportedKubernetesVersions() {
        return supportedKubernetesVersions;
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
        sb.append("UpdateHelmChartImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceRegistryId=").append(String.valueOf(this.sourceRegistryId));
        sb.append(", sourceRegistryUrl=").append(String.valueOf(this.sourceRegistryUrl));
        sb.append(", supportedKubernetesVersions=")
                .append(String.valueOf(this.supportedKubernetesVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateHelmChartImageDetails)) {
            return false;
        }

        UpdateHelmChartImageDetails other = (UpdateHelmChartImageDetails) o;
        return java.util.Objects.equals(this.sourceRegistryId, other.sourceRegistryId)
                && java.util.Objects.equals(this.sourceRegistryUrl, other.sourceRegistryUrl)
                && java.util.Objects.equals(
                        this.supportedKubernetesVersions, other.supportedKubernetesVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceRegistryId == null ? 43 : this.sourceRegistryId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRegistryUrl == null ? 43 : this.sourceRegistryUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedKubernetesVersions == null
                                ? 43
                                : this.supportedKubernetesVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
