/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Payload to prevalidate patch sharded database operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrevalidatePatchPayload.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrevalidatePatchPayload extends PrevalidatePayload {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("prevalidatePayload")
        private PatchShardedDatabaseDetails prevalidatePayload;

        public Builder prevalidatePayload(PatchShardedDatabaseDetails prevalidatePayload) {
            this.prevalidatePayload = prevalidatePayload;
            this.__explicitlySet__.add("prevalidatePayload");
            return this;
        }
        /** Sharded database identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("shardedDatabaseId")
        private String shardedDatabaseId;

        /**
         * Sharded database identifier
         *
         * @param shardedDatabaseId the value to set
         * @return this builder
         */
        public Builder shardedDatabaseId(String shardedDatabaseId) {
            this.shardedDatabaseId = shardedDatabaseId;
            this.__explicitlySet__.add("shardedDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrevalidatePatchPayload build() {
            PrevalidatePatchPayload model =
                    new PrevalidatePatchPayload(this.prevalidatePayload, this.shardedDatabaseId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrevalidatePatchPayload model) {
            if (model.wasPropertyExplicitlySet("prevalidatePayload")) {
                this.prevalidatePayload(model.getPrevalidatePayload());
            }
            if (model.wasPropertyExplicitlySet("shardedDatabaseId")) {
                this.shardedDatabaseId(model.getShardedDatabaseId());
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
    public PrevalidatePatchPayload(
            PatchShardedDatabaseDetails prevalidatePayload, String shardedDatabaseId) {
        super();
        this.prevalidatePayload = prevalidatePayload;
        this.shardedDatabaseId = shardedDatabaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("prevalidatePayload")
    private final PatchShardedDatabaseDetails prevalidatePayload;

    public PatchShardedDatabaseDetails getPrevalidatePayload() {
        return prevalidatePayload;
    }

    /** Sharded database identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("shardedDatabaseId")
    private final String shardedDatabaseId;

    /**
     * Sharded database identifier
     *
     * @return the value
     */
    public String getShardedDatabaseId() {
        return shardedDatabaseId;
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
        sb.append("PrevalidatePatchPayload(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", prevalidatePayload=").append(String.valueOf(this.prevalidatePayload));
        sb.append(", shardedDatabaseId=").append(String.valueOf(this.shardedDatabaseId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrevalidatePatchPayload)) {
            return false;
        }

        PrevalidatePatchPayload other = (PrevalidatePatchPayload) o;
        return java.util.Objects.equals(this.prevalidatePayload, other.prevalidatePayload)
                && java.util.Objects.equals(this.shardedDatabaseId, other.shardedDatabaseId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.prevalidatePayload == null
                                ? 43
                                : this.prevalidatePayload.hashCode());
        result =
                (result * PRIME)
                        + (this.shardedDatabaseId == null ? 43 : this.shardedDatabaseId.hashCode());
        return result;
    }
}
