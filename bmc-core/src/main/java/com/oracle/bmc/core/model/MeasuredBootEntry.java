/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * One Trusted Platform Module (TPM) Platform Configuration Register (PCR) entry. The entry might be
 * measured during boot, or specified in a policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MeasuredBootEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MeasuredBootEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pcrIndex", "value", "hashAlgorithm"})
    public MeasuredBootEntry(String pcrIndex, String value, String hashAlgorithm) {
        super();
        this.pcrIndex = pcrIndex;
        this.value = value;
        this.hashAlgorithm = hashAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The index of the policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("pcrIndex")
        private String pcrIndex;

        /**
         * The index of the policy.
         *
         * @param pcrIndex the value to set
         * @return this builder
         */
        public Builder pcrIndex(String pcrIndex) {
            this.pcrIndex = pcrIndex;
            this.__explicitlySet__.add("pcrIndex");
            return this;
        }
        /** The hashed PCR value. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The hashed PCR value.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The type of algorithm used to calculate the hash. */
        @com.fasterxml.jackson.annotation.JsonProperty("hashAlgorithm")
        private String hashAlgorithm;

        /**
         * The type of algorithm used to calculate the hash.
         *
         * @param hashAlgorithm the value to set
         * @return this builder
         */
        public Builder hashAlgorithm(String hashAlgorithm) {
            this.hashAlgorithm = hashAlgorithm;
            this.__explicitlySet__.add("hashAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeasuredBootEntry build() {
            MeasuredBootEntry model =
                    new MeasuredBootEntry(this.pcrIndex, this.value, this.hashAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeasuredBootEntry model) {
            if (model.wasPropertyExplicitlySet("pcrIndex")) {
                this.pcrIndex(model.getPcrIndex());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("hashAlgorithm")) {
                this.hashAlgorithm(model.getHashAlgorithm());
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

    /** The index of the policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("pcrIndex")
    private final String pcrIndex;

    /**
     * The index of the policy.
     *
     * @return the value
     */
    public String getPcrIndex() {
        return pcrIndex;
    }

    /** The hashed PCR value. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The hashed PCR value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The type of algorithm used to calculate the hash. */
    @com.fasterxml.jackson.annotation.JsonProperty("hashAlgorithm")
    private final String hashAlgorithm;

    /**
     * The type of algorithm used to calculate the hash.
     *
     * @return the value
     */
    public String getHashAlgorithm() {
        return hashAlgorithm;
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
        sb.append("MeasuredBootEntry(");
        sb.append("super=").append(super.toString());
        sb.append("pcrIndex=").append(String.valueOf(this.pcrIndex));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", hashAlgorithm=").append(String.valueOf(this.hashAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeasuredBootEntry)) {
            return false;
        }

        MeasuredBootEntry other = (MeasuredBootEntry) o;
        return java.util.Objects.equals(this.pcrIndex, other.pcrIndex)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.hashAlgorithm, other.hashAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pcrIndex == null ? 43 : this.pcrIndex.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.hashAlgorithm == null ? 43 : this.hashAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
