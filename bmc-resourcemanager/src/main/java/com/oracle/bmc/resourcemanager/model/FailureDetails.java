/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FailureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FailureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message"})
    public FailureDetails(Code code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Job failure reason. */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Code code;

        /**
         * Job failure reason.
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(Code code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** A human-readable error string. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable error string.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FailureDetails build() {
            FailureDetails model = new FailureDetails(this.code, this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FailureDetails model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /** Job failure reason. */
    public enum Code implements com.oracle.bmc.http.internal.BmcEnum {
        InternalServiceError("INTERNAL_SERVICE_ERROR"),
        TerraformExecutionError("TERRAFORM_EXECUTION_ERROR"),
        TerraformConfigUnzipFailed("TERRAFORM_CONFIG_UNZIP_FAILED"),
        InvalidWorkingDirectory("INVALID_WORKING_DIRECTORY"),
        JobTimeout("JOB_TIMEOUT"),
        TerraformConfigVirusFound("TERRAFORM_CONFIG_VIRUS_FOUND"),
        TerraformGitCloneFailure("TERRAFORM_GIT_CLONE_FAILURE"),
        TerraformGitCheckoutFailure("TERRAFORM_GIT_CHECKOUT_FAILURE"),
        TerraformObjectStorageConfigSourceEmptyBucket(
                "TERRAFORM_OBJECT_STORAGE_CONFIG_SOURCE_EMPTY_BUCKET"),
        TerraformObjectStorageConfigSourceNoTfFilePresent(
                "TERRAFORM_OBJECT_STORAGE_CONFIG_SOURCE_NO_TF_FILE_PRESENT"),
        TerraformObjectStorageConfigSourceUnsupportedObjectSize(
                "TERRAFORM_OBJECT_STORAGE_CONFIG_SOURCE_UNSUPPORTED_OBJECT_SIZE"),
        CustomTerraformProviderBucketNotFound("CUSTOM_TERRAFORM_PROVIDER_BUCKET_NOT_FOUND"),
        CustomTerraformProviderUnsupportedObjectSize(
                "CUSTOM_TERRAFORM_PROVIDER_UNSUPPORTED_OBJECT_SIZE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Code.class);

        private final String value;
        private static java.util.Map<String, Code> map;

        static {
            map = new java.util.HashMap<>();
            for (Code v : Code.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Code(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Code create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Code', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Job failure reason. */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final Code code;

    /**
     * Job failure reason.
     *
     * @return the value
     */
    public Code getCode() {
        return code;
    }

    /** A human-readable error string. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable error string.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("FailureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FailureDetails)) {
            return false;
        }

        FailureDetails other = (FailureDetails) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
