/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Pre-authenticated request URL details for creating an OCI Object Storage Databricks Engine
 * artifact location. Provide exactly one of {@code parUrl} or {@code parUrlSecretId}. <br>
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
        builder = CreateDatabricksEngineParOciObjectStorageConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authenticationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabricksEngineParOciObjectStorageConfigDetails
        extends CreateDatabricksEngineOciObjectStorageConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A pre-authenticated request (PAR) URL that provides access to the artifact location.
         * Deprecated: This field is deprecated and replaced by "parUrlSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parUrl")
        private char[] parUrl;

        /**
         * A pre-authenticated request (PAR) URL that provides access to the artifact location.
         * Deprecated: This field is deprecated and replaced by "parUrlSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param parUrl the value to set
         * @return this builder
         */
        public Builder parUrl(char[] parUrl) {
            this.parUrl = parUrl;
            this.__explicitlySet__.add("parUrl");
            return this;
        }

        public Builder parUrl(String parUrl) {
            this.parUrl = parUrl != null ? parUrl.toCharArray() : null;
            this.__explicitlySet__.add("parUrl");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the pre-authenticated request (PAR) URL. Note: When provided, {@code
         * parUrl} must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parUrlSecretId")
        private String parUrlSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the pre-authenticated request (PAR) URL. Note: When provided, {@code
         * parUrl} must not be provided.
         *
         * @param parUrlSecretId the value to set
         * @return this builder
         */
        public Builder parUrlSecretId(String parUrlSecretId) {
            this.parUrlSecretId = parUrlSecretId;
            this.__explicitlySet__.add("parUrlSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabricksEngineParOciObjectStorageConfigDetails build() {
            CreateDatabricksEngineParOciObjectStorageConfigDetails model =
                    new CreateDatabricksEngineParOciObjectStorageConfigDetails(
                            this.parUrl, this.parUrlSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabricksEngineParOciObjectStorageConfigDetails model) {
            if (model.wasPropertyExplicitlySet("parUrl")) {
                this.parUrl(model.getParUrl());
            }
            if (model.wasPropertyExplicitlySet("parUrlSecretId")) {
                this.parUrlSecretId(model.getParUrlSecretId());
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
    public CreateDatabricksEngineParOciObjectStorageConfigDetails(
            String parUrl, String parUrlSecretId) {
        super();
        this.parUrl = parUrl != null ? parUrl.toCharArray() : null;
        this.parUrlSecretId = parUrlSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateDatabricksEngineParOciObjectStorageConfigDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("parUrl") char[] parUrl,
            @com.fasterxml.jackson.annotation.JsonProperty("parUrlSecretId")
                    String parUrlSecretId) {
        super();
        this.parUrl = parUrl;
        this.parUrlSecretId = parUrlSecretId;
    }

    /**
     * A pre-authenticated request (PAR) URL that provides access to the artifact location.
     * Deprecated: This field is deprecated and replaced by "parUrlSecretId". This change follows
     * the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parUrl")
    private final char[] parUrl;

    /**
     * A pre-authenticated request (PAR) URL that provides access to the artifact location.
     * Deprecated: This field is deprecated and replaced by &quot;parUrlSecretId&quot;. This change
     * follows the GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getParUrl__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getParUrl() {
        return parUrl != null ? new String(parUrl) : null;
    }

    /**
     * A pre-authenticated request (PAR) URL that provides access to the artifact location.
     * Deprecated: This field is deprecated and replaced by "parUrlSecretId". This change follows
     * the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parUrl")
    public char[] getParUrl__AsCharArray() {
        return parUrl;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the pre-authenticated request (PAR) URL. Note: When provided, {@code
     * parUrl} must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parUrlSecretId")
    private final String parUrlSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the pre-authenticated request (PAR) URL. Note: When provided, {@code
     * parUrl} must not be provided.
     *
     * @return the value
     */
    public String getParUrlSecretId() {
        return parUrlSecretId;
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
        sb.append("CreateDatabricksEngineParOciObjectStorageConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", parUrl=").append("<redacted>");
        sb.append(", parUrlSecretId=").append(String.valueOf(this.parUrlSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabricksEngineParOciObjectStorageConfigDetails)) {
            return false;
        }

        CreateDatabricksEngineParOciObjectStorageConfigDetails other =
                (CreateDatabricksEngineParOciObjectStorageConfigDetails) o;
        return java.util.Objects.equals(this.parUrl, other.parUrl)
                && java.util.Objects.equals(this.parUrlSecretId, other.parUrlSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.parUrl == null ? 43 : this.parUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.parUrlSecretId == null ? 43 : this.parUrlSecretId.hashCode());
        return result;
    }
}
