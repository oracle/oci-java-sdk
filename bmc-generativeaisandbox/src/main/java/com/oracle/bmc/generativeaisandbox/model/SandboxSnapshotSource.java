/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Source configuration for initializing a sandbox from a sandbox snapshot. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxSnapshotSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxSnapshotSource extends SandboxSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier of the sandbox snapshot to restore during sandbox creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private String snapshotId;

        /**
         * Identifier of the sandbox snapshot to restore during sandbox creation.
         *
         * @param snapshotId the value to set
         * @return this builder
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxSnapshotSource build() {
            SandboxSnapshotSource model = new SandboxSnapshotSource(this.snapshotId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxSnapshotSource model) {
            if (model.wasPropertyExplicitlySet("snapshotId")) {
                this.snapshotId(model.getSnapshotId());
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
    public SandboxSnapshotSource(String snapshotId) {
        super();
        this.snapshotId = snapshotId;
    }

    /** Identifier of the sandbox snapshot to restore during sandbox creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    private final String snapshotId;

    /**
     * Identifier of the sandbox snapshot to restore during sandbox creation.
     *
     * @return the value
     */
    public String getSnapshotId() {
        return snapshotId;
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
        sb.append("SandboxSnapshotSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxSnapshotSource)) {
            return false;
        }

        SandboxSnapshotSource other = (SandboxSnapshotSource) o;
        return java.util.Objects.equals(this.snapshotId, other.snapshotId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        return result;
    }
}
