/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Enables assignment of IDs on the target to anonymous transactions coming from the source. The
 * target server UUID is added as a prefix to the ID. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssignTargetUuidHandling.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policy")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssignTargetUuidHandling extends AnonymousTransactionsHandling {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies one of the coordinates (file) at which the replica should begin reading the
         * source's log. As this value specifies the point where replication starts from, it is only
         * used once, when it starts. It is never used again, unless a new UpdateChannel operation
         * modifies it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastConfiguredLogFilename")
        private String lastConfiguredLogFilename;

        /**
         * Specifies one of the coordinates (file) at which the replica should begin reading the
         * source's log. As this value specifies the point where replication starts from, it is only
         * used once, when it starts. It is never used again, unless a new UpdateChannel operation
         * modifies it.
         *
         * @param lastConfiguredLogFilename the value to set
         * @return this builder
         */
        public Builder lastConfiguredLogFilename(String lastConfiguredLogFilename) {
            this.lastConfiguredLogFilename = lastConfiguredLogFilename;
            this.__explicitlySet__.add("lastConfiguredLogFilename");
            return this;
        }
        /**
         * Specifies one of the coordinates (offset) at which the replica should begin reading the
         * source's log. As this value specifies the point where replication starts from, it is only
         * used once, when it starts. It is never used again, unless a new UpdateChannel operation
         * modifies it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastConfiguredLogOffset")
        private Long lastConfiguredLogOffset;

        /**
         * Specifies one of the coordinates (offset) at which the replica should begin reading the
         * source's log. As this value specifies the point where replication starts from, it is only
         * used once, when it starts. It is never used again, unless a new UpdateChannel operation
         * modifies it.
         *
         * @param lastConfiguredLogOffset the value to set
         * @return this builder
         */
        public Builder lastConfiguredLogOffset(Long lastConfiguredLogOffset) {
            this.lastConfiguredLogOffset = lastConfiguredLogOffset;
            this.__explicitlySet__.add("lastConfiguredLogOffset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssignTargetUuidHandling build() {
            AssignTargetUuidHandling model =
                    new AssignTargetUuidHandling(
                            this.lastConfiguredLogFilename, this.lastConfiguredLogOffset);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignTargetUuidHandling model) {
            if (model.wasPropertyExplicitlySet("lastConfiguredLogFilename")) {
                this.lastConfiguredLogFilename(model.getLastConfiguredLogFilename());
            }
            if (model.wasPropertyExplicitlySet("lastConfiguredLogOffset")) {
                this.lastConfiguredLogOffset(model.getLastConfiguredLogOffset());
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
    public AssignTargetUuidHandling(
            String lastConfiguredLogFilename, Long lastConfiguredLogOffset) {
        super();
        this.lastConfiguredLogFilename = lastConfiguredLogFilename;
        this.lastConfiguredLogOffset = lastConfiguredLogOffset;
    }

    /**
     * Specifies one of the coordinates (file) at which the replica should begin reading the
     * source's log. As this value specifies the point where replication starts from, it is only
     * used once, when it starts. It is never used again, unless a new UpdateChannel operation
     * modifies it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastConfiguredLogFilename")
    private final String lastConfiguredLogFilename;

    /**
     * Specifies one of the coordinates (file) at which the replica should begin reading the
     * source's log. As this value specifies the point where replication starts from, it is only
     * used once, when it starts. It is never used again, unless a new UpdateChannel operation
     * modifies it.
     *
     * @return the value
     */
    public String getLastConfiguredLogFilename() {
        return lastConfiguredLogFilename;
    }

    /**
     * Specifies one of the coordinates (offset) at which the replica should begin reading the
     * source's log. As this value specifies the point where replication starts from, it is only
     * used once, when it starts. It is never used again, unless a new UpdateChannel operation
     * modifies it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastConfiguredLogOffset")
    private final Long lastConfiguredLogOffset;

    /**
     * Specifies one of the coordinates (offset) at which the replica should begin reading the
     * source's log. As this value specifies the point where replication starts from, it is only
     * used once, when it starts. It is never used again, unless a new UpdateChannel operation
     * modifies it.
     *
     * @return the value
     */
    public Long getLastConfiguredLogOffset() {
        return lastConfiguredLogOffset;
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
        sb.append("AssignTargetUuidHandling(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", lastConfiguredLogFilename=")
                .append(String.valueOf(this.lastConfiguredLogFilename));
        sb.append(", lastConfiguredLogOffset=")
                .append(String.valueOf(this.lastConfiguredLogOffset));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignTargetUuidHandling)) {
            return false;
        }

        AssignTargetUuidHandling other = (AssignTargetUuidHandling) o;
        return java.util.Objects.equals(
                        this.lastConfiguredLogFilename, other.lastConfiguredLogFilename)
                && java.util.Objects.equals(
                        this.lastConfiguredLogOffset, other.lastConfiguredLogOffset)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lastConfiguredLogFilename == null
                                ? 43
                                : this.lastConfiguredLogFilename.hashCode());
        result =
                (result * PRIME)
                        + (this.lastConfiguredLogOffset == null
                                ? 43
                                : this.lastConfiguredLogOffset.hashCode());
        return result;
    }
}
