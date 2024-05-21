/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the key that you want to encrypt or decrypt data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateKeyDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "associatedData",
        "includePlaintextKey",
        "keyId",
        "keyShape",
        "loggingContext"
    })
    public GenerateKeyDetails(
            java.util.Map<String, String> associatedData,
            Boolean includePlaintextKey,
            String keyId,
            KeyShape keyShape,
            java.util.Map<String, String> loggingContext) {
        super();
        this.associatedData = associatedData;
        this.includePlaintextKey = includePlaintextKey;
        this.keyId = keyId;
        this.keyShape = keyShape;
        this.loggingContext = loggingContext;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Information that can be used to provide an encryption context for the encrypted data.
         * The length of the string representation of the associated data must be fewer than 4096
         * characters.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
        private java.util.Map<String, String> associatedData;

        /**
         * Information that can be used to provide an encryption context for the encrypted data.
         * The length of the string representation of the associated data must be fewer than 4096
         * characters.
         *
         * @param associatedData the value to set
         * @return this builder
         **/
        public Builder associatedData(java.util.Map<String, String> associatedData) {
            this.associatedData = associatedData;
            this.__explicitlySet__.add("associatedData");
            return this;
        }
        /**
         * If true, the generated key is also returned unencrypted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("includePlaintextKey")
        private Boolean includePlaintextKey;

        /**
         * If true, the generated key is also returned unencrypted.
         * @param includePlaintextKey the value to set
         * @return this builder
         **/
        public Builder includePlaintextKey(Boolean includePlaintextKey) {
            this.includePlaintextKey = includePlaintextKey;
            this.__explicitlySet__.add("includePlaintextKey");
            return this;
        }
        /**
         * The OCID of the master encryption key to encrypt the generated data encryption key with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the master encryption key to encrypt the generated data encryption key with.
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
        private KeyShape keyShape;

        public Builder keyShape(KeyShape keyShape) {
            this.keyShape = keyShape;
            this.__explicitlySet__.add("keyShape");
            return this;
        }
        /**
         * Information that provides context for audit logging. You can provide this additional
         * data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
        private java.util.Map<String, String> loggingContext;

        /**
         * Information that provides context for audit logging. You can provide this additional
         * data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
         *
         * @param loggingContext the value to set
         * @return this builder
         **/
        public Builder loggingContext(java.util.Map<String, String> loggingContext) {
            this.loggingContext = loggingContext;
            this.__explicitlySet__.add("loggingContext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateKeyDetails build() {
            GenerateKeyDetails model =
                    new GenerateKeyDetails(
                            this.associatedData,
                            this.includePlaintextKey,
                            this.keyId,
                            this.keyShape,
                            this.loggingContext);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateKeyDetails model) {
            if (model.wasPropertyExplicitlySet("associatedData")) {
                this.associatedData(model.getAssociatedData());
            }
            if (model.wasPropertyExplicitlySet("includePlaintextKey")) {
                this.includePlaintextKey(model.getIncludePlaintextKey());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyShape")) {
                this.keyShape(model.getKeyShape());
            }
            if (model.wasPropertyExplicitlySet("loggingContext")) {
                this.loggingContext(model.getLoggingContext());
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
     * Information that can be used to provide an encryption context for the encrypted data.
     * The length of the string representation of the associated data must be fewer than 4096
     * characters.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
    private final java.util.Map<String, String> associatedData;

    /**
     * Information that can be used to provide an encryption context for the encrypted data.
     * The length of the string representation of the associated data must be fewer than 4096
     * characters.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getAssociatedData() {
        return associatedData;
    }

    /**
     * If true, the generated key is also returned unencrypted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includePlaintextKey")
    private final Boolean includePlaintextKey;

    /**
     * If true, the generated key is also returned unencrypted.
     * @return the value
     **/
    public Boolean getIncludePlaintextKey() {
        return includePlaintextKey;
    }

    /**
     * The OCID of the master encryption key to encrypt the generated data encryption key with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the master encryption key to encrypt the generated data encryption key with.
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
    private final KeyShape keyShape;

    public KeyShape getKeyShape() {
        return keyShape;
    }

    /**
     * Information that provides context for audit logging. You can provide this additional
     * data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
    private final java.util.Map<String, String> loggingContext;

    /**
     * Information that provides context for audit logging. You can provide this additional
     * data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getLoggingContext() {
        return loggingContext;
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
        sb.append("GenerateKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("associatedData=").append(String.valueOf(this.associatedData));
        sb.append(", includePlaintextKey=").append(String.valueOf(this.includePlaintextKey));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyShape=").append(String.valueOf(this.keyShape));
        sb.append(", loggingContext=").append(String.valueOf(this.loggingContext));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateKeyDetails)) {
            return false;
        }

        GenerateKeyDetails other = (GenerateKeyDetails) o;
        return java.util.Objects.equals(this.associatedData, other.associatedData)
                && java.util.Objects.equals(this.includePlaintextKey, other.includePlaintextKey)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyShape, other.keyShape)
                && java.util.Objects.equals(this.loggingContext, other.loggingContext)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.associatedData == null ? 43 : this.associatedData.hashCode());
        result =
                (result * PRIME)
                        + (this.includePlaintextKey == null
                                ? 43
                                : this.includePlaintextKey.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyShape == null ? 43 : this.keyShape.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingContext == null ? 43 : this.loggingContext.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
