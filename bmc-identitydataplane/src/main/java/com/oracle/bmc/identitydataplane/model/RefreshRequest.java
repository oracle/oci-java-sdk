/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RefreshRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RefreshRequest extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currentToken", "newPublicKey"})
    public RefreshRequest(String currentToken, String newPublicKey) {
        super();
        this.currentToken = currentToken;
        this.newPublicKey = newPublicKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The current security token that is to be renewed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentToken")
        private String currentToken;

        /**
         * The current security token that is to be renewed.
         * @param currentToken the value to set
         * @return this builder
         **/
        public Builder currentToken(String currentToken) {
            this.currentToken = currentToken;
            this.__explicitlySet__.add("currentToken");
            return this;
        }
        /**
         * An optional new public for the new token. If not supplied, currentToken's public key will be used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newPublicKey")
        private String newPublicKey;

        /**
         * An optional new public for the new token. If not supplied, currentToken's public key will be used.
         * @param newPublicKey the value to set
         * @return this builder
         **/
        public Builder newPublicKey(String newPublicKey) {
            this.newPublicKey = newPublicKey;
            this.__explicitlySet__.add("newPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshRequest build() {
            RefreshRequest model = new RefreshRequest(this.currentToken, this.newPublicKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshRequest model) {
            if (model.wasPropertyExplicitlySet("currentToken")) {
                this.currentToken(model.getCurrentToken());
            }
            if (model.wasPropertyExplicitlySet("newPublicKey")) {
                this.newPublicKey(model.getNewPublicKey());
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
     * The current security token that is to be renewed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentToken")
    private final String currentToken;

    /**
     * The current security token that is to be renewed.
     * @return the value
     **/
    public String getCurrentToken() {
        return currentToken;
    }

    /**
     * An optional new public for the new token. If not supplied, currentToken's public key will be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newPublicKey")
    private final String newPublicKey;

    /**
     * An optional new public for the new token. If not supplied, currentToken's public key will be used.
     * @return the value
     **/
    public String getNewPublicKey() {
        return newPublicKey;
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
        sb.append("RefreshRequest(");
        sb.append("super=").append(super.toString());
        sb.append("currentToken=").append(String.valueOf(this.currentToken));
        sb.append(", newPublicKey=").append(String.valueOf(this.newPublicKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshRequest)) {
            return false;
        }

        RefreshRequest other = (RefreshRequest) o;
        return java.util.Objects.equals(this.currentToken, other.currentToken)
                && java.util.Objects.equals(this.newPublicKey, other.newPublicKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currentToken == null ? 43 : this.currentToken.hashCode());
        result = (result * PRIME) + (this.newPublicKey == null ? 43 : this.newPublicKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
