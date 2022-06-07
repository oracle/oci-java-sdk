/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * One Trusted Platform Module (TPM) Platform Configuration Register (PCR) entry. The entry might be measured during boot,
 * or specified in a policy.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MeasuredBootEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MeasuredBootEntry {
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
        @com.fasterxml.jackson.annotation.JsonProperty("pcrIndex")
        private String pcrIndex;

        public Builder pcrIndex(String pcrIndex) {
            this.pcrIndex = pcrIndex;
            this.__explicitlySet__.add("pcrIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hashAlgorithm")
        private String hashAlgorithm;

        public Builder hashAlgorithm(String hashAlgorithm) {
            this.hashAlgorithm = hashAlgorithm;
            this.__explicitlySet__.add("hashAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeasuredBootEntry build() {
            MeasuredBootEntry __instance__ = new MeasuredBootEntry(pcrIndex, value, hashAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeasuredBootEntry o) {
            Builder copiedBuilder =
                    pcrIndex(o.getPcrIndex())
                            .value(o.getValue())
                            .hashAlgorithm(o.getHashAlgorithm());

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
     * The index of the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pcrIndex")
    private final String pcrIndex;

    public String getPcrIndex() {
        return pcrIndex;
    }

    /**
     * The hashed PCR value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    public String getValue() {
        return value;
    }

    /**
     * The type of algorithm used to calculate the hash.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hashAlgorithm")
    private final String hashAlgorithm;

    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MeasuredBootEntry(");
        sb.append("pcrIndex=").append(String.valueOf(this.pcrIndex));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", hashAlgorithm=").append(String.valueOf(this.hashAlgorithm));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
