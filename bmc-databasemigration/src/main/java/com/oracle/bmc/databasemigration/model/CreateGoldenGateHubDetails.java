/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate Microservices. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateGoldenGateHubDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateGoldenGateHubDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "restAdminCredentials",
        "url",
        "computeId",
        "vaultId",
        "keyId",
        "extract",
        "replicat",
        "acceptableLag"
    })
    public CreateGoldenGateHubDetails(
            CreateAdminCredentials restAdminCredentials,
            String url,
            String computeId,
            String vaultId,
            String keyId,
            CreateExtract extract,
            CreateReplicat replicat,
            Integer acceptableLag) {
        super();
        this.restAdminCredentials = restAdminCredentials;
        this.url = url;
        this.computeId = computeId;
        this.vaultId = vaultId;
        this.keyId = keyId;
        this.extract = extract;
        this.replicat = replicat;
        this.acceptableLag = acceptableLag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
        private CreateAdminCredentials restAdminCredentials;

        public Builder restAdminCredentials(CreateAdminCredentials restAdminCredentials) {
            this.restAdminCredentials = restAdminCredentials;
            this.__explicitlySet__.add("restAdminCredentials");
            return this;
        }
        /** Endpoint URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Endpoint URL.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeId")
        private String computeId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param computeId the value to set
         * @return this builder
         */
        public Builder computeId(String computeId) {
            this.computeId = computeId;
            this.__explicitlySet__.add("computeId");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private CreateExtract extract;

        public Builder extract(CreateExtract extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicat")
        private CreateReplicat replicat;

        public Builder replicat(CreateReplicat replicat) {
            this.replicat = replicat;
            this.__explicitlySet__.add("replicat");
            return this;
        }
        /**
         * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the
         * specified value in seconds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
        private Integer acceptableLag;

        /**
         * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the
         * specified value in seconds.
         *
         * @param acceptableLag the value to set
         * @return this builder
         */
        public Builder acceptableLag(Integer acceptableLag) {
            this.acceptableLag = acceptableLag;
            this.__explicitlySet__.add("acceptableLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGoldenGateHubDetails build() {
            CreateGoldenGateHubDetails model =
                    new CreateGoldenGateHubDetails(
                            this.restAdminCredentials,
                            this.url,
                            this.computeId,
                            this.vaultId,
                            this.keyId,
                            this.extract,
                            this.replicat,
                            this.acceptableLag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGoldenGateHubDetails model) {
            if (model.wasPropertyExplicitlySet("restAdminCredentials")) {
                this.restAdminCredentials(model.getRestAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("computeId")) {
                this.computeId(model.getComputeId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("extract")) {
                this.extract(model.getExtract());
            }
            if (model.wasPropertyExplicitlySet("replicat")) {
                this.replicat(model.getReplicat());
            }
            if (model.wasPropertyExplicitlySet("acceptableLag")) {
                this.acceptableLag(model.getAcceptableLag());
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

    @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
    private final CreateAdminCredentials restAdminCredentials;

    public CreateAdminCredentials getRestAdminCredentials() {
        return restAdminCredentials;
    }

    /** Endpoint URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Endpoint URL.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeId")
    private final String computeId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getComputeId() {
        return computeId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    private final CreateExtract extract;

    public CreateExtract getExtract() {
        return extract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicat")
    private final CreateReplicat replicat;

    public CreateReplicat getReplicat() {
        return replicat;
    }

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the
     * specified value in seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
    private final Integer acceptableLag;

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the
     * specified value in seconds.
     *
     * @return the value
     */
    public Integer getAcceptableLag() {
        return acceptableLag;
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
        sb.append("CreateGoldenGateHubDetails(");
        sb.append("super=").append(super.toString());
        sb.append("restAdminCredentials=").append(String.valueOf(this.restAdminCredentials));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", computeId=").append(String.valueOf(this.computeId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", extract=").append(String.valueOf(this.extract));
        sb.append(", replicat=").append(String.valueOf(this.replicat));
        sb.append(", acceptableLag=").append(String.valueOf(this.acceptableLag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGoldenGateHubDetails)) {
            return false;
        }

        CreateGoldenGateHubDetails other = (CreateGoldenGateHubDetails) o;
        return java.util.Objects.equals(this.restAdminCredentials, other.restAdminCredentials)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.computeId, other.computeId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.extract, other.extract)
                && java.util.Objects.equals(this.replicat, other.replicat)
                && java.util.Objects.equals(this.acceptableLag, other.acceptableLag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.restAdminCredentials == null
                                ? 43
                                : this.restAdminCredentials.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.computeId == null ? 43 : this.computeId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.extract == null ? 43 : this.extract.hashCode());
        result = (result * PRIME) + (this.replicat == null ? 43 : this.replicat.hashCode());
        result =
                (result * PRIME)
                        + (this.acceptableLag == null ? 43 : this.acceptableLag.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
