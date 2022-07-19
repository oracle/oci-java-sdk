/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VerifiedData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VerifiedData {
    @Deprecated
    @java.beans.ConstructorProperties({"isSignatureValid"})
    public VerifiedData(Boolean isSignatureValid) {
        super();
        this.isSignatureValid = isSignatureValid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A Boolean value that indicates whether the signature was verified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSignatureValid")
        private Boolean isSignatureValid;

        /**
         * A Boolean value that indicates whether the signature was verified.
         * @param isSignatureValid the value to set
         * @return this builder
         **/
        public Builder isSignatureValid(Boolean isSignatureValid) {
            this.isSignatureValid = isSignatureValid;
            this.__explicitlySet__.add("isSignatureValid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifiedData build() {
            VerifiedData __instance__ = new VerifiedData(isSignatureValid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifiedData o) {
            Builder copiedBuilder = isSignatureValid(o.getIsSignatureValid());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * A Boolean value that indicates whether the signature was verified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSignatureValid")
    private final Boolean isSignatureValid;

    /**
     * A Boolean value that indicates whether the signature was verified.
     * @return the value
     **/
    public Boolean getIsSignatureValid() {
        return isSignatureValid;
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
        sb.append("VerifiedData(");
        sb.append("isSignatureValid=").append(String.valueOf(this.isSignatureValid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifiedData)) {
            return false;
        }

        VerifiedData other = (VerifiedData) o;
        return java.util.Objects.equals(this.isSignatureValid, other.isSignatureValid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isSignatureValid == null ? 43 : this.isSignatureValid.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
