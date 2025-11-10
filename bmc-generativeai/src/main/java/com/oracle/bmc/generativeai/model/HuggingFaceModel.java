/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Configuration for importing a model from Hugging Face. Requires the model ID and a reference to
 * the token stored in a vault for authenticated access. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HuggingFaceModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HuggingFaceModel extends ModelDataSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The full model OCID from Hugging Face, typically in the format "org/model-name" (e.g.,
         * "meta-llama/Llama-2-7b").
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The full model OCID from Hugging Face, typically in the format "org/model-name" (e.g.,
         * "meta-llama/Llama-2-7b").
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * Hugging Face access token to authenticate requests for restricted models. This token will
         * be securely stored in OCI Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * Hugging Face access token to authenticate requests for restricted models. This token will
         * be securely stored in OCI Vault.
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /**
         * The name of the branch in the Hugging Face repository to import the model from. If not
         * specified, "main" will be used by default. If you provide both a branch and a commit
         * hash, the model will be imported from the specified commit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("branch")
        private String branch;

        /**
         * The name of the branch in the Hugging Face repository to import the model from. If not
         * specified, "main" will be used by default. If you provide both a branch and a commit
         * hash, the model will be imported from the specified commit.
         *
         * @param branch the value to set
         * @return this builder
         */
        public Builder branch(String branch) {
            this.branch = branch;
            this.__explicitlySet__.add("branch");
            return this;
        }
        /**
         * The commit hash in the Hugging Face repository to import the model from. If both a branch
         * and a commit are provided, the commit hash will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commit")
        private String commit;

        /**
         * The commit hash in the Hugging Face repository to import the model from. If both a branch
         * and a commit are provided, the commit hash will be used.
         *
         * @param commit the value to set
         * @return this builder
         */
        public Builder commit(String commit) {
            this.commit = commit;
            this.__explicitlySet__.add("commit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HuggingFaceModel build() {
            HuggingFaceModel model =
                    new HuggingFaceModel(this.modelId, this.accessToken, this.branch, this.commit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HuggingFaceModel model) {
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("branch")) {
                this.branch(model.getBranch());
            }
            if (model.wasPropertyExplicitlySet("commit")) {
                this.commit(model.getCommit());
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
    public HuggingFaceModel(String modelId, String accessToken, String branch, String commit) {
        super();
        this.modelId = modelId;
        this.accessToken = accessToken;
        this.branch = branch;
        this.commit = commit;
    }

    /**
     * The full model OCID from Hugging Face, typically in the format "org/model-name" (e.g.,
     * "meta-llama/Llama-2-7b").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The full model OCID from Hugging Face, typically in the format "org/model-name" (e.g.,
     * "meta-llama/Llama-2-7b").
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Hugging Face access token to authenticate requests for restricted models. This token will be
     * securely stored in OCI Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * Hugging Face access token to authenticate requests for restricted models. This token will be
     * securely stored in OCI Vault.
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * The name of the branch in the Hugging Face repository to import the model from. If not
     * specified, "main" will be used by default. If you provide both a branch and a commit hash,
     * the model will be imported from the specified commit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    private final String branch;

    /**
     * The name of the branch in the Hugging Face repository to import the model from. If not
     * specified, "main" will be used by default. If you provide both a branch and a commit hash,
     * the model will be imported from the specified commit.
     *
     * @return the value
     */
    public String getBranch() {
        return branch;
    }

    /**
     * The commit hash in the Hugging Face repository to import the model from. If both a branch and
     * a commit are provided, the commit hash will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commit")
    private final String commit;

    /**
     * The commit hash in the Hugging Face repository to import the model from. If both a branch and
     * a commit are provided, the commit hash will be used.
     *
     * @return the value
     */
    public String getCommit() {
        return commit;
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
        sb.append("HuggingFaceModel(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", branch=").append(String.valueOf(this.branch));
        sb.append(", commit=").append(String.valueOf(this.commit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HuggingFaceModel)) {
            return false;
        }

        HuggingFaceModel other = (HuggingFaceModel) o;
        return java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.branch, other.branch)
                && java.util.Objects.equals(this.commit, other.commit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.branch == null ? 43 : this.branch.hashCode());
        result = (result * PRIME) + (this.commit == null ? 43 : this.commit.hashCode());
        return result;
    }
}
