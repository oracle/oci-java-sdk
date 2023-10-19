/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Helmchart image details. <br>
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
        builder = HelmChartImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HelmChartImageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceRegistryId",
        "sourceRegistryUrl",
        "supportedKubernetesVersions",
        "validationStatus",
        "validationError",
        "publicationStatus",
        "publicationError"
    })
    public HelmChartImageDetails(
            String sourceRegistryId,
            String sourceRegistryUrl,
            java.util.List<String> supportedKubernetesVersions,
            ValidationStatus validationStatus,
            String validationError,
            PublicationStatus publicationStatus,
            String publicationError) {
        super();
        this.sourceRegistryId = sourceRegistryId;
        this.sourceRegistryUrl = sourceRegistryUrl;
        this.supportedKubernetesVersions = supportedKubernetesVersions;
        this.validationStatus = validationStatus;
        this.validationError = validationError;
        this.publicationStatus = publicationStatus;
        this.publicationError = publicationError;
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
        /** source registry url of the helmchart image. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryUrl")
        private String sourceRegistryUrl;

        /**
         * source registry url of the helmchart image.
         *
         * @param sourceRegistryUrl the value to set
         * @return this builder
         */
        public Builder sourceRegistryUrl(String sourceRegistryUrl) {
            this.sourceRegistryUrl = sourceRegistryUrl;
            this.__explicitlySet__.add("sourceRegistryUrl");
            return this;
        }
        /** The supported versions of Kubernetes */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedKubernetesVersions")
        private java.util.List<String> supportedKubernetesVersions;

        /**
         * The supported versions of Kubernetes
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
        /** image validation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
        private ValidationStatus validationStatus;

        /**
         * image validation status.
         *
         * @param validationStatus the value to set
         * @return this builder
         */
        public Builder validationStatus(ValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            this.__explicitlySet__.add("validationStatus");
            return this;
        }
        /** image validation failure errors */
        @com.fasterxml.jackson.annotation.JsonProperty("validationError")
        private String validationError;

        /**
         * image validation failure errors
         *
         * @param validationError the value to set
         * @return this builder
         */
        public Builder validationError(String validationError) {
            this.validationError = validationError;
            this.__explicitlySet__.add("validationError");
            return this;
        }
        /** image publication status */
        @com.fasterxml.jackson.annotation.JsonProperty("publicationStatus")
        private PublicationStatus publicationStatus;

        /**
         * image publication status
         *
         * @param publicationStatus the value to set
         * @return this builder
         */
        public Builder publicationStatus(PublicationStatus publicationStatus) {
            this.publicationStatus = publicationStatus;
            this.__explicitlySet__.add("publicationStatus");
            return this;
        }
        /** image validation failure errors */
        @com.fasterxml.jackson.annotation.JsonProperty("publicationError")
        private String publicationError;

        /**
         * image validation failure errors
         *
         * @param publicationError the value to set
         * @return this builder
         */
        public Builder publicationError(String publicationError) {
            this.publicationError = publicationError;
            this.__explicitlySet__.add("publicationError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HelmChartImageDetails build() {
            HelmChartImageDetails model =
                    new HelmChartImageDetails(
                            this.sourceRegistryId,
                            this.sourceRegistryUrl,
                            this.supportedKubernetesVersions,
                            this.validationStatus,
                            this.validationError,
                            this.publicationStatus,
                            this.publicationError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HelmChartImageDetails model) {
            if (model.wasPropertyExplicitlySet("sourceRegistryId")) {
                this.sourceRegistryId(model.getSourceRegistryId());
            }
            if (model.wasPropertyExplicitlySet("sourceRegistryUrl")) {
                this.sourceRegistryUrl(model.getSourceRegistryUrl());
            }
            if (model.wasPropertyExplicitlySet("supportedKubernetesVersions")) {
                this.supportedKubernetesVersions(model.getSupportedKubernetesVersions());
            }
            if (model.wasPropertyExplicitlySet("validationStatus")) {
                this.validationStatus(model.getValidationStatus());
            }
            if (model.wasPropertyExplicitlySet("validationError")) {
                this.validationError(model.getValidationError());
            }
            if (model.wasPropertyExplicitlySet("publicationStatus")) {
                this.publicationStatus(model.getPublicationStatus());
            }
            if (model.wasPropertyExplicitlySet("publicationError")) {
                this.publicationError(model.getPublicationError());
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

    /** source registry url of the helmchart image. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegistryUrl")
    private final String sourceRegistryUrl;

    /**
     * source registry url of the helmchart image.
     *
     * @return the value
     */
    public String getSourceRegistryUrl() {
        return sourceRegistryUrl;
    }

    /** The supported versions of Kubernetes */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedKubernetesVersions")
    private final java.util.List<String> supportedKubernetesVersions;

    /**
     * The supported versions of Kubernetes
     *
     * @return the value
     */
    public java.util.List<String> getSupportedKubernetesVersions() {
        return supportedKubernetesVersions;
    }

    /** image validation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    private final ValidationStatus validationStatus;

    /**
     * image validation status.
     *
     * @return the value
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /** image validation failure errors */
    @com.fasterxml.jackson.annotation.JsonProperty("validationError")
    private final String validationError;

    /**
     * image validation failure errors
     *
     * @return the value
     */
    public String getValidationError() {
        return validationError;
    }

    /** image publication status */
    @com.fasterxml.jackson.annotation.JsonProperty("publicationStatus")
    private final PublicationStatus publicationStatus;

    /**
     * image publication status
     *
     * @return the value
     */
    public PublicationStatus getPublicationStatus() {
        return publicationStatus;
    }

    /** image validation failure errors */
    @com.fasterxml.jackson.annotation.JsonProperty("publicationError")
    private final String publicationError;

    /**
     * image validation failure errors
     *
     * @return the value
     */
    public String getPublicationError() {
        return publicationError;
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
        sb.append("HelmChartImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceRegistryId=").append(String.valueOf(this.sourceRegistryId));
        sb.append(", sourceRegistryUrl=").append(String.valueOf(this.sourceRegistryUrl));
        sb.append(", supportedKubernetesVersions=")
                .append(String.valueOf(this.supportedKubernetesVersions));
        sb.append(", validationStatus=").append(String.valueOf(this.validationStatus));
        sb.append(", validationError=").append(String.valueOf(this.validationError));
        sb.append(", publicationStatus=").append(String.valueOf(this.publicationStatus));
        sb.append(", publicationError=").append(String.valueOf(this.publicationError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HelmChartImageDetails)) {
            return false;
        }

        HelmChartImageDetails other = (HelmChartImageDetails) o;
        return java.util.Objects.equals(this.sourceRegistryId, other.sourceRegistryId)
                && java.util.Objects.equals(this.sourceRegistryUrl, other.sourceRegistryUrl)
                && java.util.Objects.equals(
                        this.supportedKubernetesVersions, other.supportedKubernetesVersions)
                && java.util.Objects.equals(this.validationStatus, other.validationStatus)
                && java.util.Objects.equals(this.validationError, other.validationError)
                && java.util.Objects.equals(this.publicationStatus, other.publicationStatus)
                && java.util.Objects.equals(this.publicationError, other.publicationError)
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
        result =
                (result * PRIME)
                        + (this.validationStatus == null ? 43 : this.validationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.validationError == null ? 43 : this.validationError.hashCode());
        result =
                (result * PRIME)
                        + (this.publicationStatus == null ? 43 : this.publicationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.publicationError == null ? 43 : this.publicationError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
