/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of the kubernetes secrets to be created or updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecretDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"secretName", "templateObjectStoragePath", "secretData"})
    public SecretDetail(
            String secretName,
            String templateObjectStoragePath,
            java.util.List<SecretData> secretData) {
        super();
        this.secretName = secretName;
        this.templateObjectStoragePath = templateObjectStoragePath;
        this.secretData = secretData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the kubernetes secret of max length 63 and contain only lowercase alphanumeric
         * characters or '-' and start and end with an alphabetic character.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretName")
        private String secretName;

        /**
         * Name of the kubernetes secret of max length 63 and contain only lowercase alphanumeric
         * characters or '-' and start and end with an alphabetic character.
         *
         * @param secretName the value to set
         * @return this builder
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            this.__explicitlySet__.add("secretName");
            return this;
        }
        /**
         * Object storage path for the secret template to be used for creating secret otherwise it
         * will be created with default template.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("templateObjectStoragePath")
        private String templateObjectStoragePath;

        /**
         * Object storage path for the secret template to be used for creating secret otherwise it
         * will be created with default template.
         *
         * @param templateObjectStoragePath the value to set
         * @return this builder
         */
        public Builder templateObjectStoragePath(String templateObjectStoragePath) {
            this.templateObjectStoragePath = templateObjectStoragePath;
            this.__explicitlySet__.add("templateObjectStoragePath");
            return this;
        }
        /** List of kubernetes secret data. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretData")
        private java.util.List<SecretData> secretData;

        /**
         * List of kubernetes secret data.
         *
         * @param secretData the value to set
         * @return this builder
         */
        public Builder secretData(java.util.List<SecretData> secretData) {
            this.secretData = secretData;
            this.__explicitlySet__.add("secretData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretDetail build() {
            SecretDetail model =
                    new SecretDetail(
                            this.secretName, this.templateObjectStoragePath, this.secretData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretDetail model) {
            if (model.wasPropertyExplicitlySet("secretName")) {
                this.secretName(model.getSecretName());
            }
            if (model.wasPropertyExplicitlySet("templateObjectStoragePath")) {
                this.templateObjectStoragePath(model.getTemplateObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("secretData")) {
                this.secretData(model.getSecretData());
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
     * Name of the kubernetes secret of max length 63 and contain only lowercase alphanumeric
     * characters or '-' and start and end with an alphabetic character.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    private final String secretName;

    /**
     * Name of the kubernetes secret of max length 63 and contain only lowercase alphanumeric
     * characters or '-' and start and end with an alphabetic character.
     *
     * @return the value
     */
    public String getSecretName() {
        return secretName;
    }

    /**
     * Object storage path for the secret template to be used for creating secret otherwise it will
     * be created with default template.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("templateObjectStoragePath")
    private final String templateObjectStoragePath;

    /**
     * Object storage path for the secret template to be used for creating secret otherwise it will
     * be created with default template.
     *
     * @return the value
     */
    public String getTemplateObjectStoragePath() {
        return templateObjectStoragePath;
    }

    /** List of kubernetes secret data. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretData")
    private final java.util.List<SecretData> secretData;

    /**
     * List of kubernetes secret data.
     *
     * @return the value
     */
    public java.util.List<SecretData> getSecretData() {
        return secretData;
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
        sb.append("SecretDetail(");
        sb.append("super=").append(super.toString());
        sb.append("secretName=").append(String.valueOf(this.secretName));
        sb.append(", templateObjectStoragePath=")
                .append(String.valueOf(this.templateObjectStoragePath));
        sb.append(", secretData=").append(String.valueOf(this.secretData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretDetail)) {
            return false;
        }

        SecretDetail other = (SecretDetail) o;
        return java.util.Objects.equals(this.secretName, other.secretName)
                && java.util.Objects.equals(
                        this.templateObjectStoragePath, other.templateObjectStoragePath)
                && java.util.Objects.equals(this.secretData, other.secretData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        result =
                (result * PRIME)
                        + (this.templateObjectStoragePath == null
                                ? 43
                                : this.templateObjectStoragePath.hashCode());
        result = (result * PRIME) + (this.secretData == null ? 43 : this.secretData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
